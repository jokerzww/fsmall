package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HostsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    public static final Hosts hosts = new Hosts();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.HOST")
    public static final SqlColumn<String> host = hosts.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.CURRENT_CONNECTIONS")
    public static final SqlColumn<Long> currentConnections = hosts.currentConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.TOTAL_CONNECTIONS")
    public static final SqlColumn<Long> totalConnections = hosts.totalConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    public static final class Hosts extends SqlTable {
        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<Long> currentConnections = column("CURRENT_CONNECTIONS", JDBCType.BIGINT);

        public final SqlColumn<Long> totalConnections = column("TOTAL_CONNECTIONS", JDBCType.BIGINT);

        public Hosts() {
            super("hosts");
        }
    }
}