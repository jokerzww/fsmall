package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XSchemaTableLockWaitsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source Table: x$schema_table_lock_waits")
    public static final XSchemaTableLockWaits XSchemaTableLockWaits = new XSchemaTableLockWaits();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.object_schema")
    public static final SqlColumn<String> objectSchema = XSchemaTableLockWaits.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.object_name")
    public static final SqlColumn<String> objectName = XSchemaTableLockWaits.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_thread_id")
    public static final SqlColumn<Long> waitingThreadId = XSchemaTableLockWaits.waitingThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_pid")
    public static final SqlColumn<Long> waitingPid = XSchemaTableLockWaits.waitingPid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_lock_type")
    public static final SqlColumn<String> waitingLockType = XSchemaTableLockWaits.waitingLockType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_lock_duration")
    public static final SqlColumn<String> waitingLockDuration = XSchemaTableLockWaits.waitingLockDuration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_secs")
    public static final SqlColumn<Long> waitingQuerySecs = XSchemaTableLockWaits.waitingQuerySecs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_rows_affected")
    public static final SqlColumn<Long> waitingQueryRowsAffected = XSchemaTableLockWaits.waitingQueryRowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_rows_examined")
    public static final SqlColumn<Long> waitingQueryRowsExamined = XSchemaTableLockWaits.waitingQueryRowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source field: x$schema_table_lock_waits.blocking_thread_id")
    public static final SqlColumn<Long> blockingThreadId = XSchemaTableLockWaits.blockingThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source field: x$schema_table_lock_waits.blocking_pid")
    public static final SqlColumn<Long> blockingPid = XSchemaTableLockWaits.blockingPid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source field: x$schema_table_lock_waits.blocking_lock_type")
    public static final SqlColumn<String> blockingLockType = XSchemaTableLockWaits.blockingLockType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source field: x$schema_table_lock_waits.blocking_lock_duration")
    public static final SqlColumn<String> blockingLockDuration = XSchemaTableLockWaits.blockingLockDuration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source field: x$schema_table_lock_waits.sql_kill_blocking_query")
    public static final SqlColumn<String> sqlKillBlockingQuery = XSchemaTableLockWaits.sqlKillBlockingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source field: x$schema_table_lock_waits.sql_kill_blocking_connection")
    public static final SqlColumn<String> sqlKillBlockingConnection = XSchemaTableLockWaits.sqlKillBlockingConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source field: x$schema_table_lock_waits.waiting_account")
    public static final SqlColumn<String> waitingAccount = XSchemaTableLockWaits.waitingAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query")
    public static final SqlColumn<String> waitingQuery = XSchemaTableLockWaits.waitingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source field: x$schema_table_lock_waits.blocking_account")
    public static final SqlColumn<String> blockingAccount = XSchemaTableLockWaits.blockingAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source Table: x$schema_table_lock_waits")
    public static final class XSchemaTableLockWaits extends SqlTable {
        public final SqlColumn<String> objectSchema = column("object_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("object_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> waitingThreadId = column("waiting_thread_id", JDBCType.BIGINT);

        public final SqlColumn<Long> waitingPid = column("waiting_pid", JDBCType.BIGINT);

        public final SqlColumn<String> waitingLockType = column("waiting_lock_type", JDBCType.VARCHAR);

        public final SqlColumn<String> waitingLockDuration = column("waiting_lock_duration", JDBCType.VARCHAR);

        public final SqlColumn<Long> waitingQuerySecs = column("waiting_query_secs", JDBCType.BIGINT);

        public final SqlColumn<Long> waitingQueryRowsAffected = column("waiting_query_rows_affected", JDBCType.BIGINT);

        public final SqlColumn<Long> waitingQueryRowsExamined = column("waiting_query_rows_examined", JDBCType.BIGINT);

        public final SqlColumn<Long> blockingThreadId = column("blocking_thread_id", JDBCType.BIGINT);

        public final SqlColumn<Long> blockingPid = column("blocking_pid", JDBCType.BIGINT);

        public final SqlColumn<String> blockingLockType = column("blocking_lock_type", JDBCType.VARCHAR);

        public final SqlColumn<String> blockingLockDuration = column("blocking_lock_duration", JDBCType.VARCHAR);

        public final SqlColumn<String> sqlKillBlockingQuery = column("sql_kill_blocking_query", JDBCType.VARCHAR);

        public final SqlColumn<String> sqlKillBlockingConnection = column("sql_kill_blocking_connection", JDBCType.VARCHAR);

        public final SqlColumn<String> waitingAccount = column("waiting_account", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> waitingQuery = column("waiting_query", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> blockingAccount = column("blocking_account", JDBCType.LONGVARCHAR);

        public XSchemaTableLockWaits() {
            super("x$schema_table_lock_waits");
        }
    }
}