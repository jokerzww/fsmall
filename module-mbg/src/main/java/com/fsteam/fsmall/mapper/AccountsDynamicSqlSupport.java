package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AccountsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: accounts")
    public static final Accounts accounts = new Accounts();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source field: accounts.USER")
    public static final SqlColumn<String> user = accounts.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source field: accounts.HOST")
    public static final SqlColumn<String> host = accounts.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source field: accounts.CURRENT_CONNECTIONS")
    public static final SqlColumn<Long> currentConnections = accounts.currentConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source field: accounts.TOTAL_CONNECTIONS")
    public static final SqlColumn<Long> totalConnections = accounts.totalConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: accounts")
    public static final class Accounts extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<Long> currentConnections = column("CURRENT_CONNECTIONS", JDBCType.BIGINT);

        public final SqlColumn<Long> totalConnections = column("TOTAL_CONNECTIONS", JDBCType.BIGINT);

        public Accounts() {
            super("accounts");
        }
    }
}