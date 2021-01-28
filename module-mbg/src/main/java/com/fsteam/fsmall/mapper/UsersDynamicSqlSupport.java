package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    public static final Users users = new Users();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.USER")
    public static final SqlColumn<String> user = users.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.CURRENT_CONNECTIONS")
    public static final SqlColumn<Long> currentConnections = users.currentConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.TOTAL_CONNECTIONS")
    public static final SqlColumn<Long> totalConnections = users.totalConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    public static final class Users extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<Long> currentConnections = column("CURRENT_CONNECTIONS", JDBCType.BIGINT);

        public final SqlColumn<Long> totalConnections = column("TOTAL_CONNECTIONS", JDBCType.BIGINT);

        public Users() {
            super("users");
        }
    }
}