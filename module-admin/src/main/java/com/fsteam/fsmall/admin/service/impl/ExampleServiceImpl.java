package com.fsteam.fsmall.admin.service.impl;

import com.fsteam.fsmall.admin.service.ExampleService;
import com.fsteam.fsmall.mapper.MallDynamicSqlSupport;
import com.fsteam.fsmall.mapper.MallMapper;
import com.fsteam.fsmall.model.Mall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
@Service
public class ExampleServiceImpl implements ExampleService {
    @Autowired
    MallMapper mallMapper;



    public String getMallName(String mallID){

        //对应sql 为 select id where name=${mallID} 只选一个的
        Optional<Mall> mall = mallMapper.selectOne(c ->
                c.where(MallDynamicSqlSupport.id, isEqualTo(mallID))
        );
        if (mall.isPresent()){
        return mall.get().getName();
        }else{
            return "null";
        }

    }

}
