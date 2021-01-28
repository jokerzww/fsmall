package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VariablesInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    public static final VariablesInfo variablesInfo = new VariablesInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source field: variables_info.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = variablesInfo.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source field: variables_info.VARIABLE_SOURCE")
    public static final SqlColumn<String> variableSource = variablesInfo.variableSource;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source field: variables_info.VARIABLE_PATH")
    public static final SqlColumn<String> variablePath = variablesInfo.variablePath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source field: variables_info.MIN_VALUE")
    public static final SqlColumn<String> minValue = variablesInfo.minValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source field: variables_info.MAX_VALUE")
    public static final SqlColumn<String> maxValue = variablesInfo.maxValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source field: variables_info.SET_TIME")
    public static final SqlColumn<Date> setTime = variablesInfo.setTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source field: variables_info.SET_USER")
    public static final SqlColumn<String> setUser = variablesInfo.setUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source field: variables_info.SET_HOST")
    public static final SqlColumn<String> setHost = variablesInfo.setHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    public static final class VariablesInfo extends SqlTable {
        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableSource = column("VARIABLE_SOURCE", JDBCType.CHAR);

        public final SqlColumn<String> variablePath = column("VARIABLE_PATH", JDBCType.VARCHAR);

        public final SqlColumn<String> minValue = column("MIN_VALUE", JDBCType.VARCHAR);

        public final SqlColumn<String> maxValue = column("MAX_VALUE", JDBCType.VARCHAR);

        public final SqlColumn<Date> setTime = column("SET_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<String> setUser = column("SET_USER", JDBCType.CHAR);

        public final SqlColumn<String> setHost = column("SET_HOST", JDBCType.CHAR);

        public VariablesInfo() {
            super("variables_info");
        }
    }
}