package com.fsteam.fsmall.admin.service.impl;

import com.alibaba.druid.support.hibernate.DruidConnectionProvider;
import com.fsteam.fsmall.admin.service.ExampleService;
import com.fsteam.fsmall.common.util.DBUtil;
import com.fsteam.fsmall.mapper.MallTbDynamicSqlSupport;
import com.fsteam.fsmall.mapper.MallTbMapper;
import com.fsteam.fsmall.model.MallTb;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.dynamic.sql.BindableColumn;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.util.Buildable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
@Service
public class ExampleServiceImpl implements ExampleService {
    @Autowired
    MallTbMapper mallTbMapper;



    public String getMallName(String mallID){

        //对应sql 为 select id where name=${mallID} 只选一个的
        Optional<MallTb> mallTb = mallTbMapper.selectOne(c ->
                c.where(MallTbDynamicSqlSupport.id, isEqualTo(mallID))
        );
        if (mallTb.isPresent()){
        return mallTb.get().getName();
        }else{
            return "null";
        }

    }

}
