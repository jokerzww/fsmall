package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReplicationApplierStatusByWorkerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source Table: replication_applier_status_by_worker")
    public static final ReplicationApplierStatusByWorker replicationApplierStatusByWorker = new ReplicationApplierStatusByWorker();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.CHANNEL_NAME")
    public static final SqlColumn<String> channelName = replicationApplierStatusByWorker.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.WORKER_ID")
    public static final SqlColumn<Long> workerId = replicationApplierStatusByWorker.workerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.THREAD_ID")
    public static final SqlColumn<Long> threadId = replicationApplierStatusByWorker.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.SERVICE_STATE")
    public static final SqlColumn<String> serviceState = replicationApplierStatusByWorker.serviceState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_NUMBER")
    public static final SqlColumn<Integer> lastErrorNumber = replicationApplierStatusByWorker.lastErrorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_MESSAGE")
    public static final SqlColumn<String> lastErrorMessage = replicationApplierStatusByWorker.lastErrorMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_TIMESTAMP")
    public static final SqlColumn<Date> lastErrorTimestamp = replicationApplierStatusByWorker.lastErrorTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION")
    public static final SqlColumn<String> lastAppliedTransaction = replicationApplierStatusByWorker.lastAppliedTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> lastAppliedTransactionOriginalCommitTimestamp = replicationApplierStatusByWorker.lastAppliedTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> lastAppliedTransactionImmediateCommitTimestamp = replicationApplierStatusByWorker.lastAppliedTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP")
    public static final SqlColumn<Date> lastAppliedTransactionStartApplyTimestamp = replicationApplierStatusByWorker.lastAppliedTransactionStartApplyTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP")
    public static final SqlColumn<Date> lastAppliedTransactionEndApplyTimestamp = replicationApplierStatusByWorker.lastAppliedTransactionEndApplyTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION")
    public static final SqlColumn<String> applyingTransaction = replicationApplierStatusByWorker.applyingTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> applyingTransactionOriginalCommitTimestamp = replicationApplierStatusByWorker.applyingTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> applyingTransactionImmediateCommitTimestamp = replicationApplierStatusByWorker.applyingTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_START_APPLY_TIMESTAMP")
    public static final SqlColumn<Date> applyingTransactionStartApplyTimestamp = replicationApplierStatusByWorker.applyingTransactionStartApplyTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_RETRIES_COUNT")
    public static final SqlColumn<Long> lastAppliedTransactionRetriesCount = replicationApplierStatusByWorker.lastAppliedTransactionRetriesCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER")
    public static final SqlColumn<Integer> lastAppliedTransactionLastTransientErrorNumber = replicationApplierStatusByWorker.lastAppliedTransactionLastTransientErrorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE")
    public static final SqlColumn<String> lastAppliedTransactionLastTransientErrorMessage = replicationApplierStatusByWorker.lastAppliedTransactionLastTransientErrorMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP")
    public static final SqlColumn<Date> lastAppliedTransactionLastTransientErrorTimestamp = replicationApplierStatusByWorker.lastAppliedTransactionLastTransientErrorTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_RETRIES_COUNT")
    public static final SqlColumn<Long> applyingTransactionRetriesCount = replicationApplierStatusByWorker.applyingTransactionRetriesCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER")
    public static final SqlColumn<Integer> applyingTransactionLastTransientErrorNumber = replicationApplierStatusByWorker.applyingTransactionLastTransientErrorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE")
    public static final SqlColumn<String> applyingTransactionLastTransientErrorMessage = replicationApplierStatusByWorker.applyingTransactionLastTransientErrorMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP")
    public static final SqlColumn<Date> applyingTransactionLastTransientErrorTimestamp = replicationApplierStatusByWorker.applyingTransactionLastTransientErrorTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source Table: replication_applier_status_by_worker")
    public static final class ReplicationApplierStatusByWorker extends SqlTable {
        public final SqlColumn<String> channelName = column("CHANNEL_NAME", JDBCType.CHAR);

        public final SqlColumn<Long> workerId = column("WORKER_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<String> serviceState = column("SERVICE_STATE", JDBCType.CHAR);

        public final SqlColumn<Integer> lastErrorNumber = column("LAST_ERROR_NUMBER", JDBCType.INTEGER);

        public final SqlColumn<String> lastErrorMessage = column("LAST_ERROR_MESSAGE", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastErrorTimestamp = column("LAST_ERROR_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastAppliedTransaction = column("LAST_APPLIED_TRANSACTION", JDBCType.CHAR);

        public final SqlColumn<Date> lastAppliedTransactionOriginalCommitTimestamp = column("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastAppliedTransactionImmediateCommitTimestamp = column("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastAppliedTransactionStartApplyTimestamp = column("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastAppliedTransactionEndApplyTimestamp = column("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<String> applyingTransaction = column("APPLYING_TRANSACTION", JDBCType.CHAR);

        public final SqlColumn<Date> applyingTransactionOriginalCommitTimestamp = column("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> applyingTransactionImmediateCommitTimestamp = column("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> applyingTransactionStartApplyTimestamp = column("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> lastAppliedTransactionRetriesCount = column("LAST_APPLIED_TRANSACTION_RETRIES_COUNT", JDBCType.BIGINT);

        public final SqlColumn<Integer> lastAppliedTransactionLastTransientErrorNumber = column("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER", JDBCType.INTEGER);

        public final SqlColumn<String> lastAppliedTransactionLastTransientErrorMessage = column("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastAppliedTransactionLastTransientErrorTimestamp = column("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> applyingTransactionRetriesCount = column("APPLYING_TRANSACTION_RETRIES_COUNT", JDBCType.BIGINT);

        public final SqlColumn<Integer> applyingTransactionLastTransientErrorNumber = column("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER", JDBCType.INTEGER);

        public final SqlColumn<String> applyingTransactionLastTransientErrorMessage = column("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE", JDBCType.VARCHAR);

        public final SqlColumn<Date> applyingTransactionLastTransientErrorTimestamp = column("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP", JDBCType.TIMESTAMP);

        public ReplicationApplierStatusByWorker() {
            super("replication_applier_status_by_worker");
        }
    }
}