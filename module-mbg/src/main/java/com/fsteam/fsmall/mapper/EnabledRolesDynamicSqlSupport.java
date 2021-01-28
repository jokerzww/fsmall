package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EnabledRolesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
    public static final EnabledRoles enabledRoles = new EnabledRoles();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.ROLE_NAME")
    public static final SqlColumn<String> roleName = enabledRoles.roleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.ROLE_HOST")
    public static final SqlColumn<String> roleHost = enabledRoles.roleHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.IS_DEFAULT")
    public static final SqlColumn<String> isDefault = enabledRoles.isDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.IS_MANDATORY")
    public static final SqlColumn<String> isMandatory = enabledRoles.isMandatory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
    public static final class EnabledRoles extends SqlTable {
        public final SqlColumn<String> roleName = column("ROLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> roleHost = column("ROLE_HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> isDefault = column("IS_DEFAULT", JDBCType.VARCHAR);

        public final SqlColumn<String> isMandatory = column("IS_MANDATORY", JDBCType.VARCHAR);

        public EnabledRoles() {
            super("ENABLED_ROLES");
        }
    }
}