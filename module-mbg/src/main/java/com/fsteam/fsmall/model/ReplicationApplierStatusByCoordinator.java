package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class ReplicationApplierStatusByCoordinator implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.CHANNEL_NAME")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.SERVICE_STATE")
    private String serviceState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_NUMBER")
    private Integer lastErrorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE")
    private String lastErrorMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP")
    private Date lastErrorTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION")
    private String lastProcessedTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date lastProcessedTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date lastProcessedTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP")
    private Date lastProcessedTransactionStartBufferTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP")
    private Date lastProcessedTransactionEndBufferTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION")
    private String processingTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date processingTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date processingTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP")
    private Date processingTransactionStartBufferTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.CHANNEL_NAME")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.CHANNEL_NAME")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.SERVICE_STATE")
    public String getServiceState() {
        return serviceState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.SERVICE_STATE")
    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_NUMBER")
    public Integer getLastErrorNumber() {
        return lastErrorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_NUMBER")
    public void setLastErrorNumber(Integer lastErrorNumber) {
        this.lastErrorNumber = lastErrorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE")
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE")
    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP")
    public Date getLastErrorTimestamp() {
        return lastErrorTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP")
    public void setLastErrorTimestamp(Date lastErrorTimestamp) {
        this.lastErrorTimestamp = lastErrorTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION")
    public String getLastProcessedTransaction() {
        return lastProcessedTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION")
    public void setLastProcessedTransaction(String lastProcessedTransaction) {
        this.lastProcessedTransaction = lastProcessedTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public Date getLastProcessedTransactionOriginalCommitTimestamp() {
        return lastProcessedTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public void setLastProcessedTransactionOriginalCommitTimestamp(Date lastProcessedTransactionOriginalCommitTimestamp) {
        this.lastProcessedTransactionOriginalCommitTimestamp = lastProcessedTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public Date getLastProcessedTransactionImmediateCommitTimestamp() {
        return lastProcessedTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public void setLastProcessedTransactionImmediateCommitTimestamp(Date lastProcessedTransactionImmediateCommitTimestamp) {
        this.lastProcessedTransactionImmediateCommitTimestamp = lastProcessedTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP")
    public Date getLastProcessedTransactionStartBufferTimestamp() {
        return lastProcessedTransactionStartBufferTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP")
    public void setLastProcessedTransactionStartBufferTimestamp(Date lastProcessedTransactionStartBufferTimestamp) {
        this.lastProcessedTransactionStartBufferTimestamp = lastProcessedTransactionStartBufferTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP")
    public Date getLastProcessedTransactionEndBufferTimestamp() {
        return lastProcessedTransactionEndBufferTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP")
    public void setLastProcessedTransactionEndBufferTimestamp(Date lastProcessedTransactionEndBufferTimestamp) {
        this.lastProcessedTransactionEndBufferTimestamp = lastProcessedTransactionEndBufferTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION")
    public String getProcessingTransaction() {
        return processingTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION")
    public void setProcessingTransaction(String processingTransaction) {
        this.processingTransaction = processingTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public Date getProcessingTransactionOriginalCommitTimestamp() {
        return processingTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public void setProcessingTransactionOriginalCommitTimestamp(Date processingTransactionOriginalCommitTimestamp) {
        this.processingTransactionOriginalCommitTimestamp = processingTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public Date getProcessingTransactionImmediateCommitTimestamp() {
        return processingTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public void setProcessingTransactionImmediateCommitTimestamp(Date processingTransactionImmediateCommitTimestamp) {
        this.processingTransactionImmediateCommitTimestamp = processingTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP")
    public Date getProcessingTransactionStartBufferTimestamp() {
        return processingTransactionStartBufferTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source field: replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP")
    public void setProcessingTransactionStartBufferTimestamp(Date processingTransactionStartBufferTimestamp) {
        this.processingTransactionStartBufferTimestamp = processingTransactionStartBufferTimestamp;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", threadId=").append(threadId);
        sb.append(", serviceState=").append(serviceState);
        sb.append(", lastErrorNumber=").append(lastErrorNumber);
        sb.append(", lastErrorMessage=").append(lastErrorMessage);
        sb.append(", lastErrorTimestamp=").append(lastErrorTimestamp);
        sb.append(", lastProcessedTransaction=").append(lastProcessedTransaction);
        sb.append(", lastProcessedTransactionOriginalCommitTimestamp=").append(lastProcessedTransactionOriginalCommitTimestamp);
        sb.append(", lastProcessedTransactionImmediateCommitTimestamp=").append(lastProcessedTransactionImmediateCommitTimestamp);
        sb.append(", lastProcessedTransactionStartBufferTimestamp=").append(lastProcessedTransactionStartBufferTimestamp);
        sb.append(", lastProcessedTransactionEndBufferTimestamp=").append(lastProcessedTransactionEndBufferTimestamp);
        sb.append(", processingTransaction=").append(processingTransaction);
        sb.append(", processingTransactionOriginalCommitTimestamp=").append(processingTransactionOriginalCommitTimestamp);
        sb.append(", processingTransactionImmediateCommitTimestamp=").append(processingTransactionImmediateCommitTimestamp);
        sb.append(", processingTransactionStartBufferTimestamp=").append(processingTransactionStartBufferTimestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: replication_applier_status_by_coordinator")
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
        ReplicationApplierStatusByCoordinator other = (ReplicationApplierStatusByCoordinator) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getServiceState() == null ? other.getServiceState() == null : this.getServiceState().equals(other.getServiceState()))
            && (this.getLastErrorNumber() == null ? other.getLastErrorNumber() == null : this.getLastErrorNumber().equals(other.getLastErrorNumber()))
            && (this.getLastErrorMessage() == null ? other.getLastErrorMessage() == null : this.getLastErrorMessage().equals(other.getLastErrorMessage()))
            && (this.getLastErrorTimestamp() == null ? other.getLastErrorTimestamp() == null : this.getLastErrorTimestamp().equals(other.getLastErrorTimestamp()))
            && (this.getLastProcessedTransaction() == null ? other.getLastProcessedTransaction() == null : this.getLastProcessedTransaction().equals(other.getLastProcessedTransaction()))
            && (this.getLastProcessedTransactionOriginalCommitTimestamp() == null ? other.getLastProcessedTransactionOriginalCommitTimestamp() == null : this.getLastProcessedTransactionOriginalCommitTimestamp().equals(other.getLastProcessedTransactionOriginalCommitTimestamp()))
            && (this.getLastProcessedTransactionImmediateCommitTimestamp() == null ? other.getLastProcessedTransactionImmediateCommitTimestamp() == null : this.getLastProcessedTransactionImmediateCommitTimestamp().equals(other.getLastProcessedTransactionImmediateCommitTimestamp()))
            && (this.getLastProcessedTransactionStartBufferTimestamp() == null ? other.getLastProcessedTransactionStartBufferTimestamp() == null : this.getLastProcessedTransactionStartBufferTimestamp().equals(other.getLastProcessedTransactionStartBufferTimestamp()))
            && (this.getLastProcessedTransactionEndBufferTimestamp() == null ? other.getLastProcessedTransactionEndBufferTimestamp() == null : this.getLastProcessedTransactionEndBufferTimestamp().equals(other.getLastProcessedTransactionEndBufferTimestamp()))
            && (this.getProcessingTransaction() == null ? other.getProcessingTransaction() == null : this.getProcessingTransaction().equals(other.getProcessingTransaction()))
            && (this.getProcessingTransactionOriginalCommitTimestamp() == null ? other.getProcessingTransactionOriginalCommitTimestamp() == null : this.getProcessingTransactionOriginalCommitTimestamp().equals(other.getProcessingTransactionOriginalCommitTimestamp()))
            && (this.getProcessingTransactionImmediateCommitTimestamp() == null ? other.getProcessingTransactionImmediateCommitTimestamp() == null : this.getProcessingTransactionImmediateCommitTimestamp().equals(other.getProcessingTransactionImmediateCommitTimestamp()))
            && (this.getProcessingTransactionStartBufferTimestamp() == null ? other.getProcessingTransactionStartBufferTimestamp() == null : this.getProcessingTransactionStartBufferTimestamp().equals(other.getProcessingTransactionStartBufferTimestamp()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getServiceState() == null) ? 0 : getServiceState().hashCode());
        result = prime * result + ((getLastErrorNumber() == null) ? 0 : getLastErrorNumber().hashCode());
        result = prime * result + ((getLastErrorMessage() == null) ? 0 : getLastErrorMessage().hashCode());
        result = prime * result + ((getLastErrorTimestamp() == null) ? 0 : getLastErrorTimestamp().hashCode());
        result = prime * result + ((getLastProcessedTransaction() == null) ? 0 : getLastProcessedTransaction().hashCode());
        result = prime * result + ((getLastProcessedTransactionOriginalCommitTimestamp() == null) ? 0 : getLastProcessedTransactionOriginalCommitTimestamp().hashCode());
        result = prime * result + ((getLastProcessedTransactionImmediateCommitTimestamp() == null) ? 0 : getLastProcessedTransactionImmediateCommitTimestamp().hashCode());
        result = prime * result + ((getLastProcessedTransactionStartBufferTimestamp() == null) ? 0 : getLastProcessedTransactionStartBufferTimestamp().hashCode());
        result = prime * result + ((getLastProcessedTransactionEndBufferTimestamp() == null) ? 0 : getLastProcessedTransactionEndBufferTimestamp().hashCode());
        result = prime * result + ((getProcessingTransaction() == null) ? 0 : getProcessingTransaction().hashCode());
        result = prime * result + ((getProcessingTransactionOriginalCommitTimestamp() == null) ? 0 : getProcessingTransactionOriginalCommitTimestamp().hashCode());
        result = prime * result + ((getProcessingTransactionImmediateCommitTimestamp() == null) ? 0 : getProcessingTransactionImmediateCommitTimestamp().hashCode());
        result = prime * result + ((getProcessingTransactionStartBufferTimestamp() == null) ? 0 : getProcessingTransactionStartBufferTimestamp().hashCode());
        return result;
    }
}