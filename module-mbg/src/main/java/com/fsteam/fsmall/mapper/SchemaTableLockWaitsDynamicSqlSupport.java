package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemaTableLockWaitsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source Table: schema_table_lock_waits")
    public static final SchemaTableLockWaits schemaTableLockWaits = new SchemaTableLockWaits();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.object_schema")
    public static final SqlColumn<String> objectSchema = schemaTableLockWaits.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.object_name")
    public static final SqlColumn<String> objectName = schemaTableLockWaits.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.waiting_thread_id")
    public static final SqlColumn<Long> waitingThreadId = schemaTableLockWaits.waitingThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.waiting_pid")
    public static final SqlColumn<Long> waitingPid = schemaTableLockWaits.waitingPid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.waiting_lock_type")
    public static final SqlColumn<String> waitingLockType = schemaTableLockWaits.waitingLockType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.waiting_lock_duration")
    public static final SqlColumn<String> waitingLockDuration = schemaTableLockWaits.waitingLockDuration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.waiting_query_secs")
    public static final SqlColumn<Long> waitingQuerySecs = schemaTableLockWaits.waitingQuerySecs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.waiting_query_rows_affected")
    public static final SqlColumn<Long> waitingQueryRowsAffected = schemaTableLockWaits.waitingQueryRowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.waiting_query_rows_examined")
    public static final SqlColumn<Long> waitingQueryRowsExamined = schemaTableLockWaits.waitingQueryRowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.blocking_thread_id")
    public static final SqlColumn<Long> blockingThreadId = schemaTableLockWaits.blockingThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.blocking_pid")
    public static final SqlColumn<Long> blockingPid = schemaTableLockWaits.blockingPid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.blocking_lock_type")
    public static final SqlColumn<String> blockingLockType = schemaTableLockWaits.blockingLockType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.blocking_lock_duration")
    public static final SqlColumn<String> blockingLockDuration = schemaTableLockWaits.blockingLockDuration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.sql_kill_blocking_query")
    public static final SqlColumn<String> sqlKillBlockingQuery = schemaTableLockWaits.sqlKillBlockingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source field: schema_table_lock_waits.sql_kill_blocking_connection")
    public static final SqlColumn<String> sqlKillBlockingConnection = schemaTableLockWaits.sqlKillBlockingConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1578586+08:00", comments="Source field: schema_table_lock_waits.waiting_account")
    public static final SqlColumn<String> waitingAccount = schemaTableLockWaits.waitingAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1578586+08:00", comments="Source field: schema_table_lock_waits.waiting_query")
    public static final SqlColumn<String> waitingQuery = schemaTableLockWaits.waitingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1578586+08:00", comments="Source field: schema_table_lock_waits.blocking_account")
    public static final SqlColumn<String> blockingAccount = schemaTableLockWaits.blockingAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1568584+08:00", comments="Source Table: schema_table_lock_waits")
    public static final class SchemaTableLockWaits extends SqlTable {
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

        public SchemaTableLockWaits() {
            super("schema_table_lock_waits");
        }
    }
}