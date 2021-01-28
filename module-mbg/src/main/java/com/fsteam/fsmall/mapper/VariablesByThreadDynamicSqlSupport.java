package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VariablesByThreadDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    public static final VariablesByThread variablesByThread = new VariablesByThread();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source field: variables_by_thread.THREAD_ID")
    public static final SqlColumn<Long> threadId = variablesByThread.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source field: variables_by_thread.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = variablesByThread.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source field: variables_by_thread.VARIABLE_VALUE")
    public static final SqlColumn<String> variableValue = variablesByThread.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    public static final class VariablesByThread extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("VARIABLE_VALUE", JDBCType.VARCHAR);

        public VariablesByThread() {
            super("variables_by_thread");
        }
    }
}