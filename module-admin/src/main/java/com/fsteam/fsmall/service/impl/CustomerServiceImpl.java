package com.fsteam.fsmall.service.impl;

import com.fsteam.fsmall.mapper.CustomerMapper;
import com.fsteam.fsmall.model.Customer;
import com.fsteam.fsmall.service.CustomerService;
import com.fsteam.fsmall.utils.MyBatisUtils;
import org.mybatis.dynamic.sql.insert.render.GeneralInsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.stereotype.Service;


import static com.fsteam.fsmall.mapper.CustomerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerMapper customerMapper;

    @Override
    public Customer getCustomerById(String cusId) {
        MyBatisUtils.startSqlSession();
        customerMapper = MyBatisUtils.getMapper(CustomerMapper.class);
        Customer record = null;
        try {
            record = customerMapper.selectByPrimaryKey(cusId).orElse(null);
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return record;
    }

    @Override
    public int addCustomer(Customer record) {
        MyBatisUtils.startSqlSession();
        customerMapper = MyBatisUtils.getMapper(CustomerMapper.class);
        int rows = -1;

        try {
            GeneralInsertStatementProvider insertStatement = insertInto(customer)
                    .set(id).toValue(record::getId)
                    .set(name).toValueWhenPresent(record::getName)
                    .set(address).toValueWhenPresent(record::getAddress)
                    .set(phone).toValueWhenPresent(record::getPhone)
                    .build()
                    .render(RenderingStrategies.MYBATIS3);

            rows = customerMapper.generalInsert(insertStatement);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return rows;
    }

    @Override
    public int deleteCustomer(String cusId) {
        MyBatisUtils.startSqlSession();
        customerMapper = MyBatisUtils.getMapper(CustomerMapper.class);
        int rows = -1;
        try {
            rows = customerMapper.deleteByPrimaryKey(cusId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return rows;
    }

    @Override
    public int updateCustomer(Customer record) {
        MyBatisUtils.startSqlSession();
        customerMapper = MyBatisUtils.getMapper(CustomerMapper.class);
        int rows = -1;
        try {
            rows = customerMapper.updateByPrimaryKeySelective(record);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyBatisUtils.close();
        }
        return rows;
    }
}
