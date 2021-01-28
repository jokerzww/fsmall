package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbLockWaitsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source Table: innodb_lock_waits")
    public static final InnodbLockWaits innodbLockWaits = new InnodbLockWaits();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.wait_started")
    public static final SqlColumn<Date> waitStarted = innodbLockWaits.waitStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.wait_age")
    public static final SqlColumn<Date> waitAge = innodbLockWaits.waitAge;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.wait_age_secs")
    public static final SqlColumn<Long> waitAgeSecs = innodbLockWaits.waitAgeSecs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.locked_table_schema")
    public static final SqlColumn<String> lockedTableSchema = innodbLockWaits.lockedTableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.locked_table_name")
    public static final SqlColumn<String> lockedTableName = innodbLockWaits.lockedTableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.locked_table_partition")
    public static final SqlColumn<String> lockedTablePartition = innodbLockWaits.lockedTablePartition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.locked_table_subpartition")
    public static final SqlColumn<String> lockedTableSubpartition = innodbLockWaits.lockedTableSubpartition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.locked_index")
    public static final SqlColumn<String> lockedIndex = innodbLockWaits.lockedIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.locked_type")
    public static final SqlColumn<String> lockedType = innodbLockWaits.lockedType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.waiting_trx_id")
    public static final SqlColumn<Long> waitingTrxId = innodbLockWaits.waitingTrxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.waiting_trx_started")
    public static final SqlColumn<Date> waitingTrxStarted = innodbLockWaits.waitingTrxStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.waiting_trx_age")
    public static final SqlColumn<Date> waitingTrxAge = innodbLockWaits.waitingTrxAge;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.waiting_trx_rows_locked")
    public static final SqlColumn<Long> waitingTrxRowsLocked = innodbLockWaits.waitingTrxRowsLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.waiting_trx_rows_modified")
    public static final SqlColumn<Long> waitingTrxRowsModified = innodbLockWaits.waitingTrxRowsModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.waiting_pid")
    public static final SqlColumn<Long> waitingPid = innodbLockWaits.waitingPid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.waiting_lock_id")
    public static final SqlColumn<String> waitingLockId = innodbLockWaits.waitingLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.waiting_lock_mode")
    public static final SqlColumn<String> waitingLockMode = innodbLockWaits.waitingLockMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.blocking_trx_id")
    public static final SqlColumn<Long> blockingTrxId = innodbLockWaits.blockingTrxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.blocking_pid")
    public static final SqlColumn<Long> blockingPid = innodbLockWaits.blockingPid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source field: innodb_lock_waits.blocking_lock_id")
    public static final SqlColumn<String> blockingLockId = innodbLockWaits.blockingLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source field: innodb_lock_waits.blocking_lock_mode")
    public static final SqlColumn<String> blockingLockMode = innodbLockWaits.blockingLockMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source field: innodb_lock_waits.blocking_trx_started")
    public static final SqlColumn<Date> blockingTrxStarted = innodbLockWaits.blockingTrxStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source field: innodb_lock_waits.blocking_trx_age")
    public static final SqlColumn<Date> blockingTrxAge = innodbLockWaits.blockingTrxAge;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source field: innodb_lock_waits.blocking_trx_rows_locked")
    public static final SqlColumn<Long> blockingTrxRowsLocked = innodbLockWaits.blockingTrxRowsLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source field: innodb_lock_waits.blocking_trx_rows_modified")
    public static final SqlColumn<Long> blockingTrxRowsModified = innodbLockWaits.blockingTrxRowsModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source field: innodb_lock_waits.sql_kill_blocking_query")
    public static final SqlColumn<String> sqlKillBlockingQuery = innodbLockWaits.sqlKillBlockingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source field: innodb_lock_waits.sql_kill_blocking_connection")
    public static final SqlColumn<String> sqlKillBlockingConnection = innodbLockWaits.sqlKillBlockingConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source field: innodb_lock_waits.locked_table")
    public static final SqlColumn<String> lockedTable = innodbLockWaits.lockedTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source field: innodb_lock_waits.waiting_query")
    public static final SqlColumn<String> waitingQuery = innodbLockWaits.waitingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source field: innodb_lock_waits.blocking_query")
    public static final SqlColumn<String> blockingQuery = innodbLockWaits.blockingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.260952+08:00", comments="Source Table: innodb_lock_waits")
    public static final class InnodbLockWaits extends SqlTable {
        public final SqlColumn<Date> waitStarted = column("wait_started", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> waitAge = column("wait_age", JDBCType.TIME);

        public final SqlColumn<Long> waitAgeSecs = column("wait_age_secs", JDBCType.BIGINT);

        public final SqlColumn<String> lockedTableSchema = column("locked_table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> lockedTableName = column("locked_table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> lockedTablePartition = column("locked_table_partition", JDBCType.VARCHAR);

        public final SqlColumn<String> lockedTableSubpartition = column("locked_table_subpartition", JDBCType.VARCHAR);

        public final SqlColumn<String> lockedIndex = column("locked_index", JDBCType.VARCHAR);

        public final SqlColumn<String> lockedType = column("locked_type", JDBCType.VARCHAR);

        public final SqlColumn<Long> waitingTrxId = column("waiting_trx_id", JDBCType.BIGINT);

        public final SqlColumn<Date> waitingTrxStarted = column("waiting_trx_started", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> waitingTrxAge = column("waiting_trx_age", JDBCType.TIME);

        public final SqlColumn<Long> waitingTrxRowsLocked = column("waiting_trx_rows_locked", JDBCType.BIGINT);

        public final SqlColumn<Long> waitingTrxRowsModified = column("waiting_trx_rows_modified", JDBCType.BIGINT);

        public final SqlColumn<Long> waitingPid = column("waiting_pid", JDBCType.BIGINT);

        public final SqlColumn<String> waitingLockId = column("waiting_lock_id", JDBCType.VARCHAR);

        public final SqlColumn<String> waitingLockMode = column("waiting_lock_mode", JDBCType.VARCHAR);

        public final SqlColumn<Long> blockingTrxId = column("blocking_trx_id", JDBCType.BIGINT);

        public final SqlColumn<Long> blockingPid = column("blocking_pid", JDBCType.BIGINT);

        public final SqlColumn<String> blockingLockId = column("blocking_lock_id", JDBCType.VARCHAR);

        public final SqlColumn<String> blockingLockMode = column("blocking_lock_mode", JDBCType.VARCHAR);

        public final SqlColumn<Date> blockingTrxStarted = column("blocking_trx_started", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> blockingTrxAge = column("blocking_trx_age", JDBCType.TIME);

        public final SqlColumn<Long> blockingTrxRowsLocked = column("blocking_trx_rows_locked", JDBCType.BIGINT);

        public final SqlColumn<Long> blockingTrxRowsModified = column("blocking_trx_rows_modified", JDBCType.BIGINT);

        public final SqlColumn<String> sqlKillBlockingQuery = column("sql_kill_blocking_query", JDBCType.VARCHAR);

        public final SqlColumn<String> sqlKillBlockingConnection = column("sql_kill_blocking_connection", JDBCType.VARCHAR);

        public final SqlColumn<String> lockedTable = column("locked_table", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> waitingQuery = column("waiting_query", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> blockingQuery = column("blocking_query", JDBCType.LONGVARCHAR);

        public InnodbLockWaits() {
            super("innodb_lock_waits");
        }
    }
}