package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SessionStatusDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    public static final SessionStatus sessionStatus = new SessionStatus();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source field: session_status.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = sessionStatus.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source field: session_status.VARIABLE_VALUE")
    public static final SqlColumn<String> variableValue = sessionStatus.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    public static final class SessionStatus extends SqlTable {
        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("VARIABLE_VALUE", JDBCType.VARCHAR);

        public SessionStatus() {
            super("session_status");
        }
    }
}