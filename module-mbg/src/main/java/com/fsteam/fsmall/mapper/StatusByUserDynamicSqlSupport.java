package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatusByUserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3250106+08:00", comments="Source Table: status_by_user")
    public static final StatusByUser statusByUser = new StatusByUser();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3250106+08:00", comments="Source field: status_by_user.USER")
    public static final SqlColumn<String> user = statusByUser.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3250106+08:00", comments="Source field: status_by_user.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = statusByUser.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3250106+08:00", comments="Source field: status_by_user.VARIABLE_VALUE")
    public static final SqlColumn<String> variableValue = statusByUser.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3250106+08:00", comments="Source Table: status_by_user")
    public static final class StatusByUser extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("VARIABLE_VALUE", JDBCType.VARCHAR);

        public StatusByUser() {
            super("status_by_user");
        }
    }
}