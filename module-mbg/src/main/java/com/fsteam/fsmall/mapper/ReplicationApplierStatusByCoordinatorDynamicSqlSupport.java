package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReplicationApplierStatusByCoordinatorDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    public static final ReplicationApplierStatusByCoordinator replicationApplierStatusByCoordinator = new ReplicationApplierStatusByCoordinator();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.CHANNEL_NAME")
    public static final SqlColumn<String> channelName = replicationApplierStatusByCoordinator.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.THREAD_ID")
    public static final SqlColumn<Long> threadId = replicationApplierStatusByCoordinator.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.SERVICE_STATE")
    public static final SqlColumn<String> serviceState = replicationApplierStatusByCoordinator.serviceState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_NUMBER")
    public static final SqlColumn<Integer> lastErrorNumber = replicationApplierStatusByCoordinator.lastErrorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE")
    public static final SqlColumn<String> lastErrorMessage = replicationApplierStatusByCoordinator.lastErrorMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP")
    public static final SqlColumn<Date> lastErrorTimestamp = replicationApplierStatusByCoordinator.lastErrorTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION")
    public static final SqlColumn<String> lastProcessedTransaction = replicationApplierStatusByCoordinator.lastProcessedTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> lastProcessedTransactionOriginalCommitTimestamp = replicationApplierStatusByCoordinator.lastProcessedTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> lastProcessedTransactionImmediateCommitTimestamp = replicationApplierStatusByCoordinator.lastProcessedTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP")
    public static final SqlColumn<Date> lastProcessedTransactionStartBufferTimestamp = replicationApplierStatusByCoordinator.lastProcessedTransactionStartBufferTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP")
    public static final SqlColumn<Date> lastProcessedTransactionEndBufferTimestamp = replicationApplierStatusByCoordinator.lastProcessedTransactionEndBufferTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION")
    public static final SqlColumn<String> processingTransaction = replicationApplierStatusByCoordinator.processingTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> processingTransactionOriginalCommitTimestamp = replicationApplierStatusByCoordinator.processingTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> processingTransactionImmediateCommitTimestamp = replicationApplierStatusByCoordinator.processingTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP")
    public static final SqlColumn<Date> processingTransactionStartBufferTimestamp = replicationApplierStatusByCoordinator.processingTransactionStartBufferTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    public static final class ReplicationApplierStatusByCoordinator extends SqlTable {
        public final SqlColumn<String> channelName = column("CHANNEL_NAME", JDBCType.CHAR);

        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<String> serviceState = column("SERVICE_STATE", JDBCType.CHAR);

        public final SqlColumn<Integer> lastErrorNumber = column("LAST_ERROR_NUMBER", JDBCType.INTEGER);

        public final SqlColumn<String> lastErrorMessage = column("LAST_ERROR_MESSAGE", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastErrorTimestamp = column("LAST_ERROR_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastProcessedTransaction = column("LAST_PROCESSED_TRANSACTION", JDBCType.CHAR);

        public final SqlColumn<Date> lastProcessedTransactionOriginalCommitTimestamp = column("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastProcessedTransactionImmediateCommitTimestamp = column("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastProcessedTransactionStartBufferTimestamp = column("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastProcessedTransactionEndBufferTimestamp = column("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<String> processingTransaction = column("PROCESSING_TRANSACTION", JDBCType.CHAR);

        public final SqlColumn<Date> processingTransactionOriginalCommitTimestamp = column("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> processingTransactionImmediateCommitTimestamp = column("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> processingTransactionStartBufferTimestamp = column("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP", JDBCType.TIMESTAMP);

        public ReplicationApplierStatusByCoordinator() {
            super("replication_applier_status_by_coordinator");
        }
    }
}