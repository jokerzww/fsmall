package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleRoutineGrantsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    public static final RoleRoutineGrants roleRoutineGrants = new RoleRoutineGrants();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTOR")
    public static final SqlColumn<String> grantor = roleRoutineGrants.grantor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTOR_HOST")
    public static final SqlColumn<String> grantorHost = roleRoutineGrants.grantorHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTEE")
    public static final SqlColumn<String> grantee = roleRoutineGrants.grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTEE_HOST")
    public static final SqlColumn<String> granteeHost = roleRoutineGrants.granteeHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG")
    public static final SqlColumn<String> specificCatalog = roleRoutineGrants.specificCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA")
    public static final SqlColumn<String> specificSchema = roleRoutineGrants.specificSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_NAME")
    public static final SqlColumn<String> specificName = roleRoutineGrants.specificName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG")
    public static final SqlColumn<String> routineCatalog = roleRoutineGrants.routineCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA")
    public static final SqlColumn<String> routineSchema = roleRoutineGrants.routineSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_NAME")
    public static final SqlColumn<String> routineName = roleRoutineGrants.routineName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE")
    public static final SqlColumn<String> privilegeType = roleRoutineGrants.privilegeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.IS_GRANTABLE")
    public static final SqlColumn<String> isGrantable = roleRoutineGrants.isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    public static final class RoleRoutineGrants extends SqlTable {
        public final SqlColumn<String> grantor = column("GRANTOR", JDBCType.VARCHAR);

        public final SqlColumn<String> grantorHost = column("GRANTOR_HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> grantee = column("GRANTEE", JDBCType.CHAR);

        public final SqlColumn<String> granteeHost = column("GRANTEE_HOST", JDBCType.CHAR);

        public final SqlColumn<String> specificCatalog = column("SPECIFIC_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> specificSchema = column("SPECIFIC_SCHEMA", JDBCType.CHAR);

        public final SqlColumn<String> specificName = column("SPECIFIC_NAME", JDBCType.CHAR);

        public final SqlColumn<String> routineCatalog = column("ROUTINE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> routineSchema = column("ROUTINE_SCHEMA", JDBCType.CHAR);

        public final SqlColumn<String> routineName = column("ROUTINE_NAME", JDBCType.CHAR);

        public final SqlColumn<String> privilegeType = column("PRIVILEGE_TYPE", JDBCType.CHAR);

        public final SqlColumn<String> isGrantable = column("IS_GRANTABLE", JDBCType.VARCHAR);

        public RoleRoutineGrants() {
            super("ROLE_ROUTINE_GRANTS");
        }
    }
}