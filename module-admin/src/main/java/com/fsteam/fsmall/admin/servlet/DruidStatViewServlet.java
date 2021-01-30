package com.fsteam.fsmall.admin.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * druid数据源状态监控.
 * @author Joker
 */
@WebServlet(urlPatterns="/druid/*",
        name = "druid_servlet"
)

public class DruidStatViewServlet  extends StatViewServlet {
    private static final long serialVersionUID = 1L;
}
