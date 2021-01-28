package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ThreadsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source Table: threads")
    public static final Threads threads = new Threads();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.THREAD_ID")
    public static final SqlColumn<Long> threadId = threads.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.NAME")
    public static final SqlColumn<String> name = threads.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.TYPE")
    public static final SqlColumn<String> type = threads.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.PROCESSLIST_ID")
    public static final SqlColumn<Long> processlistId = threads.processlistId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.PROCESSLIST_USER")
    public static final SqlColumn<String> processlistUser = threads.processlistUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.PROCESSLIST_HOST")
    public static final SqlColumn<String> processlistHost = threads.processlistHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.PROCESSLIST_DB")
    public static final SqlColumn<String> processlistDb = threads.processlistDb;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.PROCESSLIST_COMMAND")
    public static final SqlColumn<String> processlistCommand = threads.processlistCommand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.PROCESSLIST_TIME")
    public static final SqlColumn<Long> processlistTime = threads.processlistTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source field: threads.PROCESSLIST_STATE")
    public static final SqlColumn<String> processlistState = threads.processlistState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source field: threads.PARENT_THREAD_ID")
    public static final SqlColumn<Long> parentThreadId = threads.parentThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source field: threads.ROLE")
    public static final SqlColumn<String> role = threads.role;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source field: threads.INSTRUMENTED")
    public static final SqlColumn<String> instrumented = threads.instrumented;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source field: threads.HISTORY")
    public static final SqlColumn<String> history = threads.history;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source field: threads.CONNECTION_TYPE")
    public static final SqlColumn<String> connectionType = threads.connectionType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source field: threads.THREAD_OS_ID")
    public static final SqlColumn<Long> threadOsId = threads.threadOsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source field: threads.RESOURCE_GROUP")
    public static final SqlColumn<String> resourceGroup = threads.resourceGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source field: threads.PROCESSLIST_INFO")
    public static final SqlColumn<String> processlistInfo = threads.processlistInfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source Table: threads")
    public static final class Threads extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("TYPE", JDBCType.VARCHAR);

        public final SqlColumn<Long> processlistId = column("PROCESSLIST_ID", JDBCType.BIGINT);

        public final SqlColumn<String> processlistUser = column("PROCESSLIST_USER", JDBCType.VARCHAR);

        public final SqlColumn<String> processlistHost = column("PROCESSLIST_HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> processlistDb = column("PROCESSLIST_DB", JDBCType.VARCHAR);

        public final SqlColumn<String> processlistCommand = column("PROCESSLIST_COMMAND", JDBCType.VARCHAR);

        public final SqlColumn<Long> processlistTime = column("PROCESSLIST_TIME", JDBCType.BIGINT);

        public final SqlColumn<String> processlistState = column("PROCESSLIST_STATE", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentThreadId = column("PARENT_THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<String> role = column("ROLE", JDBCType.VARCHAR);

        public final SqlColumn<String> instrumented = column("INSTRUMENTED", JDBCType.CHAR);

        public final SqlColumn<String> history = column("HISTORY", JDBCType.CHAR);

        public final SqlColumn<String> connectionType = column("CONNECTION_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<Long> threadOsId = column("THREAD_OS_ID", JDBCType.BIGINT);

        public final SqlColumn<String> resourceGroup = column("RESOURCE_GROUP", JDBCType.VARCHAR);

        public final SqlColumn<String> processlistInfo = column("PROCESSLIST_INFO", JDBCType.LONGVARCHAR);

        public Threads() {
            super("threads");
        }
    }
}