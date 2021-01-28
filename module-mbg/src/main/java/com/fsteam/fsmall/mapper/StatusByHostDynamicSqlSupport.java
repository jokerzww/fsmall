package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatusByHostDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: status_by_host")
    public static final StatusByHost statusByHost = new StatusByHost();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source field: status_by_host.HOST")
    public static final SqlColumn<String> host = statusByHost.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source field: status_by_host.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = statusByHost.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source field: status_by_host.VARIABLE_VALUE")
    public static final SqlColumn<String> variableValue = statusByHost.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: status_by_host")
    public static final class StatusByHost extends SqlTable {
        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("VARIABLE_VALUE", JDBCType.VARCHAR);

        public StatusByHost() {
            super("status_by_host");
        }
    }
}