package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatusByThreadDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: status_by_thread")
    public static final StatusByThread statusByThread = new StatusByThread();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: status_by_thread.THREAD_ID")
    public static final SqlColumn<Long> threadId = statusByThread.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: status_by_thread.VARIABLE_NAME")
    public static final SqlColumn<String> variableName = statusByThread.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: status_by_thread.VARIABLE_VALUE")
    public static final SqlColumn<String> variableValue = statusByThread.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: status_by_thread")
    public static final class StatusByThread extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<String> variableName = column("VARIABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("VARIABLE_VALUE", JDBCType.VARCHAR);

        public StatusByThread() {
            super("status_by_thread");
        }
    }
}