package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReplicationConnectionStatusDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source Table: replication_connection_status")
    public static final ReplicationConnectionStatus replicationConnectionStatus = new ReplicationConnectionStatus();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.CHANNEL_NAME")
    public static final SqlColumn<String> channelName = replicationConnectionStatus.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.GROUP_NAME")
    public static final SqlColumn<String> groupName = replicationConnectionStatus.groupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.SOURCE_UUID")
    public static final SqlColumn<String> sourceUuid = replicationConnectionStatus.sourceUuid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.THREAD_ID")
    public static final SqlColumn<Long> threadId = replicationConnectionStatus.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.SERVICE_STATE")
    public static final SqlColumn<String> serviceState = replicationConnectionStatus.serviceState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.COUNT_RECEIVED_HEARTBEATS")
    public static final SqlColumn<Long> countReceivedHeartbeats = replicationConnectionStatus.countReceivedHeartbeats;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_HEARTBEAT_TIMESTAMP")
    public static final SqlColumn<Date> lastHeartbeatTimestamp = replicationConnectionStatus.lastHeartbeatTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_ERROR_NUMBER")
    public static final SqlColumn<Integer> lastErrorNumber = replicationConnectionStatus.lastErrorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.LAST_ERROR_MESSAGE")
    public static final SqlColumn<String> lastErrorMessage = replicationConnectionStatus.lastErrorMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.LAST_ERROR_TIMESTAMP")
    public static final SqlColumn<Date> lastErrorTimestamp = replicationConnectionStatus.lastErrorTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION")
    public static final SqlColumn<String> lastQueuedTransaction = replicationConnectionStatus.lastQueuedTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> lastQueuedTransactionOriginalCommitTimestamp = replicationConnectionStatus.lastQueuedTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> lastQueuedTransactionImmediateCommitTimestamp = replicationConnectionStatus.lastQueuedTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP")
    public static final SqlColumn<Date> lastQueuedTransactionStartQueueTimestamp = replicationConnectionStatus.lastQueuedTransactionStartQueueTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP")
    public static final SqlColumn<Date> lastQueuedTransactionEndQueueTimestamp = replicationConnectionStatus.lastQueuedTransactionEndQueueTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION")
    public static final SqlColumn<String> queueingTransaction = replicationConnectionStatus.queueingTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> queueingTransactionOriginalCommitTimestamp = replicationConnectionStatus.queueingTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public static final SqlColumn<Date> queueingTransactionImmediateCommitTimestamp = replicationConnectionStatus.queueingTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP")
    public static final SqlColumn<Date> queueingTransactionStartQueueTimestamp = replicationConnectionStatus.queueingTransactionStartQueueTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source field: replication_connection_status.RECEIVED_TRANSACTION_SET")
    public static final SqlColumn<String> receivedTransactionSet = replicationConnectionStatus.receivedTransactionSet;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source Table: replication_connection_status")
    public static final class ReplicationConnectionStatus extends SqlTable {
        public final SqlColumn<String> channelName = column("CHANNEL_NAME", JDBCType.CHAR);

        public final SqlColumn<String> groupName = column("GROUP_NAME", JDBCType.CHAR);

        public final SqlColumn<String> sourceUuid = column("SOURCE_UUID", JDBCType.CHAR);

        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<String> serviceState = column("SERVICE_STATE", JDBCType.CHAR);

        public final SqlColumn<Long> countReceivedHeartbeats = column("COUNT_RECEIVED_HEARTBEATS", JDBCType.BIGINT);

        public final SqlColumn<Date> lastHeartbeatTimestamp = column("LAST_HEARTBEAT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> lastErrorNumber = column("LAST_ERROR_NUMBER", JDBCType.INTEGER);

        public final SqlColumn<String> lastErrorMessage = column("LAST_ERROR_MESSAGE", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastErrorTimestamp = column("LAST_ERROR_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastQueuedTransaction = column("LAST_QUEUED_TRANSACTION", JDBCType.CHAR);

        public final SqlColumn<Date> lastQueuedTransactionOriginalCommitTimestamp = column("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastQueuedTransactionImmediateCommitTimestamp = column("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastQueuedTransactionStartQueueTimestamp = column("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastQueuedTransactionEndQueueTimestamp = column("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<String> queueingTransaction = column("QUEUEING_TRANSACTION", JDBCType.CHAR);

        public final SqlColumn<Date> queueingTransactionOriginalCommitTimestamp = column("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> queueingTransactionImmediateCommitTimestamp = column("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> queueingTransactionStartQueueTimestamp = column("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<String> receivedTransactionSet = column("RECEIVED_TRANSACTION_SET", JDBCType.LONGVARCHAR);

        public ReplicationConnectionStatus() {
            super("replication_connection_status");
        }
    }
}