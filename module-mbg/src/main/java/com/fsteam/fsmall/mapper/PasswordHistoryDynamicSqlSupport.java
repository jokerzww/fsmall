package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PasswordHistoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    public static final PasswordHistory passwordHistory = new PasswordHistory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Host")
    public static final SqlColumn<String> host = passwordHistory.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.User")
    public static final SqlColumn<String> user = passwordHistory.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Password_timestamp")
    public static final SqlColumn<Date> passwordTimestamp = passwordHistory.passwordTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Password")
    public static final SqlColumn<String> password = passwordHistory.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    public static final class PasswordHistory extends SqlTable {
        public final SqlColumn<String> host = column("Host", JDBCType.CHAR);

        public final SqlColumn<String> user = column("User", JDBCType.CHAR);

        public final SqlColumn<Date> passwordTimestamp = column("Password_timestamp", JDBCType.TIMESTAMP);

        public final SqlColumn<String> password = column("Password", JDBCType.LONGVARCHAR);

        public PasswordHistory() {
            super("password_history");
        }
    }
}