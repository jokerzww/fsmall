package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DefaultRolesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source Table: default_roles")
    public static final DefaultRoles defaultRoles = new DefaultRoles();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.HOST")
    public static final SqlColumn<String> host = defaultRoles.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.USER")
    public static final SqlColumn<String> user = defaultRoles.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.DEFAULT_ROLE_HOST")
    public static final SqlColumn<String> defaultRoleHost = defaultRoles.defaultRoleHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.DEFAULT_ROLE_USER")
    public static final SqlColumn<String> defaultRoleUser = defaultRoles.defaultRoleUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source Table: default_roles")
    public static final class DefaultRoles extends SqlTable {
        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> defaultRoleHost = column("DEFAULT_ROLE_HOST", JDBCType.CHAR);

        public final SqlColumn<String> defaultRoleUser = column("DEFAULT_ROLE_USER", JDBCType.CHAR);

        public DefaultRoles() {
            super("default_roles");
        }
    }
}