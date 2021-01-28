package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SessionVariablesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    public static final SessionVariables sessionVariables = new SessionVariables();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source field: session_variables.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = sessionVariables.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source field: session_variables.VARIABLE_VALUE")
    public static final SqlColumn<String> variableValue = sessionVariables.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    public static final class SessionVariables extends SqlTable {
        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("VARIABLE_VALUE", JDBCType.VARCHAR);

        public SessionVariables() {
            super("session_variables");
        }
    }
}