package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserVariablesByThreadDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1168227+08:00", comments="Source Table: user_variables_by_thread")
    public static final UserVariablesByThread userVariablesByThread = new UserVariablesByThread();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1168227+08:00", comments="Source field: user_variables_by_thread.THREAD_ID")
    public static final SqlColumn<Long> threadId = userVariablesByThread.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1168227+08:00", comments="Source field: user_variables_by_thread.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = userVariablesByThread.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1168227+08:00", comments="Source field: user_variables_by_thread.VARIABLE_VALUE")
    public static final SqlColumn<byte[]> variableValue = userVariablesByThread.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1168227+08:00", comments="Source Table: user_variables_by_thread")
    public static final class UserVariablesByThread extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> variableValue = column("VARIABLE_VALUE", JDBCType.LONGVARBINARY);

        public UserVariablesByThread() {
            super("user_variables_by_thread");
        }
    }
}