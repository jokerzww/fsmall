package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AdministrableRoleAuthorizationsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    public static final AdministrableRoleAuthorizations administrableRoleAuthorizations = new AdministrableRoleAuthorizations();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source field: ADMINISTRABLE_ROLE_AUTHORIZATIONS.USER")
    public static final SqlColumn<String> user = administrableRoleAuthorizations.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source field: ADMINISTRABLE_ROLE_AUTHORIZATIONS.HOST")
    public static final SqlColumn<String> host = administrableRoleAuthorizations.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source field: ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE")
    public static final SqlColumn<String> grantee = administrableRoleAuthorizations.grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source field: ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE_HOST")
    public static final SqlColumn<String> granteeHost = administrableRoleAuthorizations.granteeHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source field: ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_NAME")
    public static final SqlColumn<String> roleName = administrableRoleAuthorizations.roleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source field: ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_HOST")
    public static final SqlColumn<String> roleHost = administrableRoleAuthorizations.roleHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source field: ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_GRANTABLE")
    public static final SqlColumn<String> isGrantable = administrableRoleAuthorizations.isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source field: ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_DEFAULT")
    public static final SqlColumn<String> isDefault = administrableRoleAuthorizations.isDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source field: ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_MANDATORY")
    public static final SqlColumn<String> isMandatory = administrableRoleAuthorizations.isMandatory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    public static final class AdministrableRoleAuthorizations extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.VARCHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> grantee = column("GRANTEE", JDBCType.VARCHAR);

        public final SqlColumn<String> granteeHost = column("GRANTEE_HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> roleName = column("ROLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> roleHost = column("ROLE_HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> isGrantable = column("IS_GRANTABLE", JDBCType.VARCHAR);

        public final SqlColumn<String> isDefault = column("IS_DEFAULT", JDBCType.VARCHAR);

        public final SqlColumn<String> isMandatory = column("IS_MANDATORY", JDBCType.VARCHAR);

        public AdministrableRoleAuthorizations() {
            super("ADMINISTRABLE_ROLE_AUTHORIZATIONS");
        }
    }
}