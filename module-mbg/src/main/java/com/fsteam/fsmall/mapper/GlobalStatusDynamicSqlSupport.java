package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GlobalStatusDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2269212+08:00", comments="Source Table: global_status")
    public static final GlobalStatus globalStatus = new GlobalStatus();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2269212+08:00", comments="Source field: global_status.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = globalStatus.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2269212+08:00", comments="Source field: global_status.VARIABLE_VALUE")
    public static final SqlColumn<String> variableValue = globalStatus.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2269212+08:00", comments="Source Table: global_status")
    public static final class GlobalStatus extends SqlTable {
        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("VARIABLE_VALUE", JDBCType.VARCHAR);

        public GlobalStatus() {
            super("global_status");
        }
    }
}