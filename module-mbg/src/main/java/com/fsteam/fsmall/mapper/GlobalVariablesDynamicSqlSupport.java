package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GlobalVariablesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source Table: global_variables")
    public static final GlobalVariables globalVariables = new GlobalVariables();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: global_variables.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = globalVariables.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: global_variables.VARIABLE_VALUE")
    public static final SqlColumn<String> variableValue = globalVariables.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source Table: global_variables")
    public static final class GlobalVariables extends SqlTable {
        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("VARIABLE_VALUE", JDBCType.VARCHAR);

        public GlobalVariables() {
            super("global_variables");
        }
    }
}