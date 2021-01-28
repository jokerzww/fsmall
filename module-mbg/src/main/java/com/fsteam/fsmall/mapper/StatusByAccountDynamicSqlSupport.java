package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatusByAccountDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source Table: status_by_account")
    public static final StatusByAccount statusByAccount = new StatusByAccount();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: status_by_account.USER")
    public static final SqlColumn<String> user = statusByAccount.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: status_by_account.HOST")
    public static final SqlColumn<String> host = statusByAccount.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: status_by_account.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = statusByAccount.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: status_by_account.VARIABLE_VALUE")
    public static final SqlColumn<String> variableValue = statusByAccount.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    public static final class StatusByAccount extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("VARIABLE_VALUE", JDBCType.VARCHAR);

        public StatusByAccount() {
            super("status_by_account");
        }
    }
}