package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleTableGrantsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    public static final RoleTableGrants roleTableGrants = new RoleTableGrants();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source field: ROLE_TABLE_GRANTS.GRANTOR")
    public static final SqlColumn<String> grantor = roleTableGrants.grantor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source field: ROLE_TABLE_GRANTS.GRANTOR_HOST")
    public static final SqlColumn<String> grantorHost = roleTableGrants.grantorHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source field: ROLE_TABLE_GRANTS.GRANTEE")
    public static final SqlColumn<String> grantee = roleTableGrants.grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source field: ROLE_TABLE_GRANTS.GRANTEE_HOST")
    public static final SqlColumn<String> granteeHost = roleTableGrants.granteeHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source field: ROLE_TABLE_GRANTS.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = roleTableGrants.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source field: ROLE_TABLE_GRANTS.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = roleTableGrants.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source field: ROLE_TABLE_GRANTS.TABLE_NAME")
    public static final SqlColumn<String> tableName = roleTableGrants.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source field: ROLE_TABLE_GRANTS.PRIVILEGE_TYPE")
    public static final SqlColumn<String> privilegeType = roleTableGrants.privilegeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source field: ROLE_TABLE_GRANTS.IS_GRANTABLE")
    public static final SqlColumn<String> isGrantable = roleTableGrants.isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    public static final class RoleTableGrants extends SqlTable {
        public final SqlColumn<String> grantor = column("GRANTOR", JDBCType.VARCHAR);

        public final SqlColumn<String> grantorHost = column("GRANTOR_HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> grantee = column("GRANTEE", JDBCType.CHAR);

        public final SqlColumn<String> granteeHost = column("GRANTEE_HOST", JDBCType.CHAR);

        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.CHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.CHAR);

        public final SqlColumn<String> privilegeType = column("PRIVILEGE_TYPE", JDBCType.CHAR);

        public final SqlColumn<String> isGrantable = column("IS_GRANTABLE", JDBCType.VARCHAR);

        public RoleTableGrants() {
            super("ROLE_TABLE_GRANTS");
        }
    }
}