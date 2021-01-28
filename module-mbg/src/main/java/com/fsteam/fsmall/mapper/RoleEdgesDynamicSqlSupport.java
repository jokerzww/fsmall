package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleEdgesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    public static final RoleEdges roleEdges = new RoleEdges();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.FROM_HOST")
    public static final SqlColumn<String> fromHost = roleEdges.fromHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.FROM_USER")
    public static final SqlColumn<String> fromUser = roleEdges.fromUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.TO_HOST")
    public static final SqlColumn<String> toHost = roleEdges.toHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.TO_USER")
    public static final SqlColumn<String> toUser = roleEdges.toUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.WITH_ADMIN_OPTION")
    public static final SqlColumn<String> withAdminOption = roleEdges.withAdminOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    public static final class RoleEdges extends SqlTable {
        public final SqlColumn<String> fromHost = column("FROM_HOST", JDBCType.CHAR);

        public final SqlColumn<String> fromUser = column("FROM_USER", JDBCType.CHAR);

        public final SqlColumn<String> toHost = column("TO_HOST", JDBCType.CHAR);

        public final SqlColumn<String> toUser = column("TO_USER", JDBCType.CHAR);

        public final SqlColumn<String> withAdminOption = column("WITH_ADMIN_OPTION", JDBCType.CHAR);

        public RoleEdges() {
            super("role_edges");
        }
    }
}