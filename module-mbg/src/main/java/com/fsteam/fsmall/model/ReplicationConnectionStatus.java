package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class ReplicationConnectionStatus implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.CHANNEL_NAME")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.GROUP_NAME")
    private String groupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.SOURCE_UUID")
    private String sourceUuid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.SERVICE_STATE")
    private String serviceState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.COUNT_RECEIVED_HEARTBEATS")
    private Long countReceivedHeartbeats;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_HEARTBEAT_TIMESTAMP")
    private Date lastHeartbeatTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_ERROR_NUMBER")
    private Integer lastErrorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_ERROR_MESSAGE")
    private String lastErrorMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_ERROR_TIMESTAMP")
    private Date lastErrorTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION")
    private String lastQueuedTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date lastQueuedTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date lastQueuedTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP")
    private Date lastQueuedTransactionStartQueueTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP")
    private Date lastQueuedTransactionEndQueueTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION")
    private String queueingTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date queueingTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date queueingTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP")
    private Date queueingTransactionStartQueueTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.RECEIVED_TRANSACTION_SET")
    private String receivedTransactionSet;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source Table: replication_connection_status")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.CHANNEL_NAME")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.CHANNEL_NAME")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.GROUP_NAME")
    public String getGroupName() {
        return groupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.GROUP_NAME")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.SOURCE_UUID")
    public String getSourceUuid() {
        return sourceUuid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.SOURCE_UUID")
    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.SERVICE_STATE")
    public String getServiceState() {
        return serviceState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.SERVICE_STATE")
    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.COUNT_RECEIVED_HEARTBEATS")
    public Long getCountReceivedHeartbeats() {
        return countReceivedHeartbeats;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.COUNT_RECEIVED_HEARTBEATS")
    public void setCountReceivedHeartbeats(Long countReceivedHeartbeats) {
        this.countReceivedHeartbeats = countReceivedHeartbeats;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_HEARTBEAT_TIMESTAMP")
    public Date getLastHeartbeatTimestamp() {
        return lastHeartbeatTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_HEARTBEAT_TIMESTAMP")
    public void setLastHeartbeatTimestamp(Date lastHeartbeatTimestamp) {
        this.lastHeartbeatTimestamp = lastHeartbeatTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_ERROR_NUMBER")
    public Integer getLastErrorNumber() {
        return lastErrorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_ERROR_NUMBER")
    public void setLastErrorNumber(Integer lastErrorNumber) {
        this.lastErrorNumber = lastErrorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_ERROR_MESSAGE")
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_ERROR_MESSAGE")
    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_ERROR_TIMESTAMP")
    public Date getLastErrorTimestamp() {
        return lastErrorTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_ERROR_TIMESTAMP")
    public void setLastErrorTimestamp(Date lastErrorTimestamp) {
        this.lastErrorTimestamp = lastErrorTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION")
    public String getLastQueuedTransaction() {
        return lastQueuedTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION")
    public void setLastQueuedTransaction(String lastQueuedTransaction) {
        this.lastQueuedTransaction = lastQueuedTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public Date getLastQueuedTransactionOriginalCommitTimestamp() {
        return lastQueuedTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public void setLastQueuedTransactionOriginalCommitTimestamp(Date lastQueuedTransactionOriginalCommitTimestamp) {
        this.lastQueuedTransactionOriginalCommitTimestamp = lastQueuedTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public Date getLastQueuedTransactionImmediateCommitTimestamp() {
        return lastQueuedTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public void setLastQueuedTransactionImmediateCommitTimestamp(Date lastQueuedTransactionImmediateCommitTimestamp) {
        this.lastQueuedTransactionImmediateCommitTimestamp = lastQueuedTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP")
    public Date getLastQueuedTransactionStartQueueTimestamp() {
        return lastQueuedTransactionStartQueueTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP")
    public void setLastQueuedTransactionStartQueueTimestamp(Date lastQueuedTransactionStartQueueTimestamp) {
        this.lastQueuedTransactionStartQueueTimestamp = lastQueuedTransactionStartQueueTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP")
    public Date getLastQueuedTransactionEndQueueTimestamp() {
        return lastQueuedTransactionEndQueueTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP")
    public void setLastQueuedTransactionEndQueueTimestamp(Date lastQueuedTransactionEndQueueTimestamp) {
        this.lastQueuedTransactionEndQueueTimestamp = lastQueuedTransactionEndQueueTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION")
    public String getQueueingTransaction() {
        return queueingTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION")
    public void setQueueingTransaction(String queueingTransaction) {
        this.queueingTransaction = queueingTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public Date getQueueingTransactionOriginalCommitTimestamp() {
        return queueingTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public void setQueueingTransactionOriginalCommitTimestamp(Date queueingTransactionOriginalCommitTimestamp) {
        this.queueingTransactionOriginalCommitTimestamp = queueingTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public Date getQueueingTransactionImmediateCommitTimestamp() {
        return queueingTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public void setQueueingTransactionImmediateCommitTimestamp(Date queueingTransactionImmediateCommitTimestamp) {
        this.queueingTransactionImmediateCommitTimestamp = queueingTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP")
    public Date getQueueingTransactionStartQueueTimestamp() {
        return queueingTransactionStartQueueTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP")
    public void setQueueingTransactionStartQueueTimestamp(Date queueingTransactionStartQueueTimestamp) {
        this.queueingTransactionStartQueueTimestamp = queueingTransactionStartQueueTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.RECEIVED_TRANSACTION_SET")
    public String getReceivedTransactionSet() {
        return receivedTransactionSet;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source field: replication_connection_status.RECEIVED_TRANSACTION_SET")
    public void setReceivedTransactionSet(String receivedTransactionSet) {
        this.receivedTransactionSet = receivedTransactionSet;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source Table: replication_connection_status")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", groupName=").append(groupName);
        sb.append(", sourceUuid=").append(sourceUuid);
        sb.append(", threadId=").append(threadId);
        sb.append(", serviceState=").append(serviceState);
        sb.append(", countReceivedHeartbeats=").append(countReceivedHeartbeats);
        sb.append(", lastHeartbeatTimestamp=").append(lastHeartbeatTimestamp);
        sb.append(", lastErrorNumber=").append(lastErrorNumber);
        sb.append(", lastErrorMessage=").append(lastErrorMessage);
        sb.append(", lastErrorTimestamp=").append(lastErrorTimestamp);
        sb.append(", lastQueuedTransaction=").append(lastQueuedTransaction);
        sb.append(", lastQueuedTransactionOriginalCommitTimestamp=").append(lastQueuedTransactionOriginalCommitTimestamp);
        sb.append(", lastQueuedTransactionImmediateCommitTimestamp=").append(lastQueuedTransactionImmediateCommitTimestamp);
        sb.append(", lastQueuedTransactionStartQueueTimestamp=").append(lastQueuedTransactionStartQueueTimestamp);
        sb.append(", lastQueuedTransactionEndQueueTimestamp=").append(lastQueuedTransactionEndQueueTimestamp);
        sb.append(", queueingTransaction=").append(queueingTransaction);
        sb.append(", queueingTransactionOriginalCommitTimestamp=").append(queueingTransactionOriginalCommitTimestamp);
        sb.append(", queueingTransactionImmediateCommitTimestamp=").append(queueingTransactionImmediateCommitTimestamp);
        sb.append(", queueingTransactionStartQueueTimestamp=").append(queueingTransactionStartQueueTimestamp);
        sb.append(", receivedTransactionSet=").append(receivedTransactionSet);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source Table: replication_connection_status")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ReplicationConnectionStatus other = (ReplicationConnectionStatus) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getSourceUuid() == null ? other.getSourceUuid() == null : this.getSourceUuid().equals(other.getSourceUuid()))
            && (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getServiceState() == null ? other.getServiceState() == null : this.getServiceState().equals(other.getServiceState()))
            && (this.getCountReceivedHeartbeats() == null ? other.getCountReceivedHeartbeats() == null : this.getCountReceivedHeartbeats().equals(other.getCountReceivedHeartbeats()))
            && (this.getLastHeartbeatTimestamp() == null ? other.getLastHeartbeatTimestamp() == null : this.getLastHeartbeatTimestamp().equals(other.getLastHeartbeatTimestamp()))
            && (this.getLastErrorNumber() == null ? other.getLastErrorNumber() == null : this.getLastErrorNumber().equals(other.getLastErrorNumber()))
            && (this.getLastErrorMessage() == null ? other.getLastErrorMessage() == null : this.getLastErrorMessage().equals(other.getLastErrorMessage()))
            && (this.getLastErrorTimestamp() == null ? other.getLastErrorTimestamp() == null : this.getLastErrorTimestamp().equals(other.getLastErrorTimestamp()))
            && (this.getLastQueuedTransaction() == null ? other.getLastQueuedTransaction() == null : this.getLastQueuedTransaction().equals(other.getLastQueuedTransaction()))
            && (this.getLastQueuedTransactionOriginalCommitTimestamp() == null ? other.getLastQueuedTransactionOriginalCommitTimestamp() == null : this.getLastQueuedTransactionOriginalCommitTimestamp().equals(other.getLastQueuedTransactionOriginalCommitTimestamp()))
            && (this.getLastQueuedTransactionImmediateCommitTimestamp() == null ? other.getLastQueuedTransactionImmediateCommitTimestamp() == null : this.getLastQueuedTransactionImmediateCommitTimestamp().equals(other.getLastQueuedTransactionImmediateCommitTimestamp()))
            && (this.getLastQueuedTransactionStartQueueTimestamp() == null ? other.getLastQueuedTransactionStartQueueTimestamp() == null : this.getLastQueuedTransactionStartQueueTimestamp().equals(other.getLastQueuedTransactionStartQueueTimestamp()))
            && (this.getLastQueuedTransactionEndQueueTimestamp() == null ? other.getLastQueuedTransactionEndQueueTimestamp() == null : this.getLastQueuedTransactionEndQueueTimestamp().equals(other.getLastQueuedTransactionEndQueueTimestamp()))
            && (this.getQueueingTransaction() == null ? other.getQueueingTransaction() == null : this.getQueueingTransaction().equals(other.getQueueingTransaction()))
            && (this.getQueueingTransactionOriginalCommitTimestamp() == null ? other.getQueueingTransactionOriginalCommitTimestamp() == null : this.getQueueingTransactionOriginalCommitTimestamp().equals(other.getQueueingTransactionOriginalCommitTimestamp()))
            && (this.getQueueingTransactionImmediateCommitTimestamp() == null ? other.getQueueingTransactionImmediateCommitTimestamp() == null : this.getQueueingTransactionImmediateCommitTimestamp().equals(other.getQueueingTransactionImmediateCommitTimestamp()))
            && (this.getQueueingTransactionStartQueueTimestamp() == null ? other.getQueueingTransactionStartQueueTimestamp() == null : this.getQueueingTransactionStartQueueTimestamp().equals(other.getQueueingTransactionStartQueueTimestamp()))
            && (this.getReceivedTransactionSet() == null ? other.getReceivedTransactionSet() == null : this.getReceivedTransactionSet().equals(other.getReceivedTransactionSet()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2429363+08:00", comments="Source Table: replication_connection_status")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getSourceUuid() == null) ? 0 : getSourceUuid().hashCode());
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getServiceState() == null) ? 0 : getServiceState().hashCode());
        result = prime * result + ((getCountReceivedHeartbeats() == null) ? 0 : getCountReceivedHeartbeats().hashCode());
        result = prime * result + ((getLastHeartbeatTimestamp() == null) ? 0 : getLastHeartbeatTimestamp().hashCode());
        result = prime * result + ((getLastErrorNumber() == null) ? 0 : getLastErrorNumber().hashCode());
        result = prime * result + ((getLastErrorMessage() == null) ? 0 : getLastErrorMessage().hashCode());
        result = prime * result + ((getLastErrorTimestamp() == null) ? 0 : getLastErrorTimestamp().hashCode());
        result = prime * result + ((getLastQueuedTransaction() == null) ? 0 : getLastQueuedTransaction().hashCode());
        result = prime * result + ((getLastQueuedTransactionOriginalCommitTimestamp() == null) ? 0 : getLastQueuedTransactionOriginalCommitTimestamp().hashCode());
        result = prime * result + ((getLastQueuedTransactionImmediateCommitTimestamp() == null) ? 0 : getLastQueuedTransactionImmediateCommitTimestamp().hashCode());
        result = prime * result + ((getLastQueuedTransactionStartQueueTimestamp() == null) ? 0 : getLastQueuedTransactionStartQueueTimestamp().hashCode());
        result = prime * result + ((getLastQueuedTransactionEndQueueTimestamp() == null) ? 0 : getLastQueuedTransactionEndQueueTimestamp().hashCode());
        result = prime * result + ((getQueueingTransaction() == null) ? 0 : getQueueingTransaction().hashCode());
        result = prime * result + ((getQueueingTransactionOriginalCommitTimestamp() == null) ? 0 : getQueueingTransactionOriginalCommitTimestamp().hashCode());
        result = prime * result + ((getQueueingTransactionImmediateCommitTimestamp() == null) ? 0 : getQueueingTransactionImmediateCommitTimestamp().hashCode());
        result = prime * result + ((getQueueingTransactionStartQueueTimestamp() == null) ? 0 : getQueueingTransactionStartQueueTimestamp().hashCode());
        result = prime * result + ((getReceivedTransactionSet() == null) ? 0 : getReceivedTransactionSet().hashCode());
        return result;
    }
}