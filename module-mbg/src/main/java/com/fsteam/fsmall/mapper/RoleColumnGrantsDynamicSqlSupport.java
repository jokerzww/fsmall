package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleColumnGrantsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    public static final RoleColumnGrants roleColumnGrants = new RoleColumnGrants();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: ROLE_COLUMN_GRANTS.GRANTOR")
    public static final SqlColumn<String> grantor = roleColumnGrants.grantor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: ROLE_COLUMN_GRANTS.GRANTOR_HOST")
    public static final SqlColumn<String> grantorHost = roleColumnGrants.grantorHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: ROLE_COLUMN_GRANTS.GRANTEE")
    public static final SqlColumn<String> grantee = roleColumnGrants.grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: ROLE_COLUMN_GRANTS.GRANTEE_HOST")
    public static final SqlColumn<String> granteeHost = roleColumnGrants.granteeHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: ROLE_COLUMN_GRANTS.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = roleColumnGrants.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: ROLE_COLUMN_GRANTS.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = roleColumnGrants.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: ROLE_COLUMN_GRANTS.TABLE_NAME")
    public static final SqlColumn<String> tableName = roleColumnGrants.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: ROLE_COLUMN_GRANTS.COLUMN_NAME")
    public static final SqlColumn<String> columnName = roleColumnGrants.columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: ROLE_COLUMN_GRANTS.PRIVILEGE_TYPE")
    public static final SqlColumn<String> privilegeType = roleColumnGrants.privilegeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: ROLE_COLUMN_GRANTS.IS_GRANTABLE")
    public static final SqlColumn<String> isGrantable = roleColumnGrants.isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    public static final class RoleColumnGrants extends SqlTable {
        public final SqlColumn<String> grantor = column("GRANTOR", JDBCType.VARCHAR);

        public final SqlColumn<String> grantorHost = column("GRANTOR_HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> grantee = column("GRANTEE", JDBCType.CHAR);

        public final SqlColumn<String> granteeHost = column("GRANTEE_HOST", JDBCType.CHAR);

        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.CHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.CHAR);

        public final SqlColumn<String> columnName = column("COLUMN_NAME", JDBCType.CHAR);

        public final SqlColumn<String> privilegeType = column("PRIVILEGE_TYPE", JDBCType.CHAR);

        public final SqlColumn<String> isGrantable = column("IS_GRANTABLE", JDBCType.VARCHAR);

        public RoleColumnGrants() {
            super("ROLE_COLUMN_GRANTS");
        }
    }
}