package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PersistedVariablesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source Table: persisted_variables")
    public static final PersistedVariables persistedVariables = new PersistedVariables();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: persisted_variables.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = persistedVariables.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: persisted_variables.VARIABLE_VALUE")
    public static final SqlColumn<String> variableValue = persistedVariables.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source Table: persisted_variables")
    public static final class PersistedVariables extends SqlTable {
        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("VARIABLE_VALUE", JDBCType.VARCHAR);

        public PersistedVariables() {
            super("persisted_variables");
        }
    }
}