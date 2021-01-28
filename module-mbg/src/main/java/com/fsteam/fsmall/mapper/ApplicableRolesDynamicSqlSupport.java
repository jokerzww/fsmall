package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ApplicableRolesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
    public static final ApplicableRoles applicableRoles = new ApplicableRoles();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.USER")
    public static final SqlColumn<String> user = applicableRoles.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.HOST")
    public static final SqlColumn<String> host = applicableRoles.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.GRANTEE")
    public static final SqlColumn<String> grantee = applicableRoles.grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.GRANTEE_HOST")
    public static final SqlColumn<String> granteeHost = applicableRoles.granteeHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.ROLE_NAME")
    public static final SqlColumn<String> roleName = applicableRoles.roleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.ROLE_HOST")
    public static final SqlColumn<String> roleHost = applicableRoles.roleHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_GRANTABLE")
    public static final SqlColumn<String> isGrantable = applicableRoles.isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_DEFAULT")
    public static final SqlColumn<String> isDefault = applicableRoles.isDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_MANDATORY")
    public static final SqlColumn<String> isMandatory = applicableRoles.isMandatory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
    public static final class ApplicableRoles extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.VARCHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> grantee = column("GRANTEE", JDBCType.VARCHAR);

        public final SqlColumn<String> granteeHost = column("GRANTEE_HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> roleName = column("ROLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> roleHost = column("ROLE_HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> isGrantable = column("IS_GRANTABLE", JDBCType.VARCHAR);

        public final SqlColumn<String> isDefault = column("IS_DEFAULT", JDBCType.VARCHAR);

        public final SqlColumn<String> isMandatory = column("IS_MANDATORY", JDBCType.VARCHAR);

        public ApplicableRoles() {
            super("APPLICABLE_ROLES");
        }
    }
}