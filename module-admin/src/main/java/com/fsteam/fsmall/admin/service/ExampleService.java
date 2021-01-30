package com.fsteam.fsmall.admin.service;



import com.alibaba.druid.support.ibatis.DruidDataSourceFactory;
import org.springframework.stereotype.Service;

@Service
public interface ExampleService {

    public String getMallName(String mallID);
}
