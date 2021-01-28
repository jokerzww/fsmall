package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class ReplicationApplierStatusByWorker implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.CHANNEL_NAME")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.WORKER_ID")
    private Long workerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.SERVICE_STATE")
    private String serviceState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_NUMBER")
    private Integer lastErrorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_MESSAGE")
    private String lastErrorMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_TIMESTAMP")
    private Date lastErrorTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION")
    private String lastAppliedTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date lastAppliedTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date lastAppliedTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP")
    private Date lastAppliedTransactionStartApplyTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP")
    private Date lastAppliedTransactionEndApplyTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION")
    private String applyingTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    private Date applyingTransactionOriginalCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    private Date applyingTransactionImmediateCommitTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_START_APPLY_TIMESTAMP")
    private Date applyingTransactionStartApplyTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_RETRIES_COUNT")
    private Long lastAppliedTransactionRetriesCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER")
    private Integer lastAppliedTransactionLastTransientErrorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE")
    private String lastAppliedTransactionLastTransientErrorMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP")
    private Date lastAppliedTransactionLastTransientErrorTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_RETRIES_COUNT")
    private Long applyingTransactionRetriesCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER")
    private Integer applyingTransactionLastTransientErrorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE")
    private String applyingTransactionLastTransientErrorMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP")
    private Date applyingTransactionLastTransientErrorTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source Table: replication_applier_status_by_worker")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.CHANNEL_NAME")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.CHANNEL_NAME")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.WORKER_ID")
    public Long getWorkerId() {
        return workerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.WORKER_ID")
    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.SERVICE_STATE")
    public String getServiceState() {
        return serviceState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.SERVICE_STATE")
    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_NUMBER")
    public Integer getLastErrorNumber() {
        return lastErrorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_NUMBER")
    public void setLastErrorNumber(Integer lastErrorNumber) {
        this.lastErrorNumber = lastErrorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_MESSAGE")
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_MESSAGE")
    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_TIMESTAMP")
    public Date getLastErrorTimestamp() {
        return lastErrorTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_ERROR_TIMESTAMP")
    public void setLastErrorTimestamp(Date lastErrorTimestamp) {
        this.lastErrorTimestamp = lastErrorTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION")
    public String getLastAppliedTransaction() {
        return lastAppliedTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION")
    public void setLastAppliedTransaction(String lastAppliedTransaction) {
        this.lastAppliedTransaction = lastAppliedTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public Date getLastAppliedTransactionOriginalCommitTimestamp() {
        return lastAppliedTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public void setLastAppliedTransactionOriginalCommitTimestamp(Date lastAppliedTransactionOriginalCommitTimestamp) {
        this.lastAppliedTransactionOriginalCommitTimestamp = lastAppliedTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public Date getLastAppliedTransactionImmediateCommitTimestamp() {
        return lastAppliedTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public void setLastAppliedTransactionImmediateCommitTimestamp(Date lastAppliedTransactionImmediateCommitTimestamp) {
        this.lastAppliedTransactionImmediateCommitTimestamp = lastAppliedTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP")
    public Date getLastAppliedTransactionStartApplyTimestamp() {
        return lastAppliedTransactionStartApplyTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP")
    public void setLastAppliedTransactionStartApplyTimestamp(Date lastAppliedTransactionStartApplyTimestamp) {
        this.lastAppliedTransactionStartApplyTimestamp = lastAppliedTransactionStartApplyTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP")
    public Date getLastAppliedTransactionEndApplyTimestamp() {
        return lastAppliedTransactionEndApplyTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP")
    public void setLastAppliedTransactionEndApplyTimestamp(Date lastAppliedTransactionEndApplyTimestamp) {
        this.lastAppliedTransactionEndApplyTimestamp = lastAppliedTransactionEndApplyTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION")
    public String getApplyingTransaction() {
        return applyingTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION")
    public void setApplyingTransaction(String applyingTransaction) {
        this.applyingTransaction = applyingTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public Date getApplyingTransactionOriginalCommitTimestamp() {
        return applyingTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP")
    public void setApplyingTransactionOriginalCommitTimestamp(Date applyingTransactionOriginalCommitTimestamp) {
        this.applyingTransactionOriginalCommitTimestamp = applyingTransactionOriginalCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public Date getApplyingTransactionImmediateCommitTimestamp() {
        return applyingTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP")
    public void setApplyingTransactionImmediateCommitTimestamp(Date applyingTransactionImmediateCommitTimestamp) {
        this.applyingTransactionImmediateCommitTimestamp = applyingTransactionImmediateCommitTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2719625+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_START_APPLY_TIMESTAMP")
    public Date getApplyingTransactionStartApplyTimestamp() {
        return applyingTransactionStartApplyTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_START_APPLY_TIMESTAMP")
    public void setApplyingTransactionStartApplyTimestamp(Date applyingTransactionStartApplyTimestamp) {
        this.applyingTransactionStartApplyTimestamp = applyingTransactionStartApplyTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_RETRIES_COUNT")
    public Long getLastAppliedTransactionRetriesCount() {
        return lastAppliedTransactionRetriesCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_RETRIES_COUNT")
    public void setLastAppliedTransactionRetriesCount(Long lastAppliedTransactionRetriesCount) {
        this.lastAppliedTransactionRetriesCount = lastAppliedTransactionRetriesCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER")
    public Integer getLastAppliedTransactionLastTransientErrorNumber() {
        return lastAppliedTransactionLastTransientErrorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER")
    public void setLastAppliedTransactionLastTransientErrorNumber(Integer lastAppliedTransactionLastTransientErrorNumber) {
        this.lastAppliedTransactionLastTransientErrorNumber = lastAppliedTransactionLastTransientErrorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE")
    public String getLastAppliedTransactionLastTransientErrorMessage() {
        return lastAppliedTransactionLastTransientErrorMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE")
    public void setLastAppliedTransactionLastTransientErrorMessage(String lastAppliedTransactionLastTransientErrorMessage) {
        this.lastAppliedTransactionLastTransientErrorMessage = lastAppliedTransactionLastTransientErrorMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP")
    public Date getLastAppliedTransactionLastTransientErrorTimestamp() {
        return lastAppliedTransactionLastTransientErrorTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP")
    public void setLastAppliedTransactionLastTransientErrorTimestamp(Date lastAppliedTransactionLastTransientErrorTimestamp) {
        this.lastAppliedTransactionLastTransientErrorTimestamp = lastAppliedTransactionLastTransientErrorTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_RETRIES_COUNT")
    public Long getApplyingTransactionRetriesCount() {
        return applyingTransactionRetriesCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_RETRIES_COUNT")
    public void setApplyingTransactionRetriesCount(Long applyingTransactionRetriesCount) {
        this.applyingTransactionRetriesCount = applyingTransactionRetriesCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER")
    public Integer getApplyingTransactionLastTransientErrorNumber() {
        return applyingTransactionLastTransientErrorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER")
    public void setApplyingTransactionLastTransientErrorNumber(Integer applyingTransactionLastTransientErrorNumber) {
        this.applyingTransactionLastTransientErrorNumber = applyingTransactionLastTransientErrorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE")
    public String getApplyingTransactionLastTransientErrorMessage() {
        return applyingTransactionLastTransientErrorMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE")
    public void setApplyingTransactionLastTransientErrorMessage(String applyingTransactionLastTransientErrorMessage) {
        this.applyingTransactionLastTransientErrorMessage = applyingTransactionLastTransientErrorMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP")
    public Date getApplyingTransactionLastTransientErrorTimestamp() {
        return applyingTransactionLastTransientErrorTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source field: replication_applier_status_by_worker.APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP")
    public void setApplyingTransactionLastTransientErrorTimestamp(Date applyingTransactionLastTransientErrorTimestamp) {
        this.applyingTransactionLastTransientErrorTimestamp = applyingTransactionLastTransientErrorTimestamp;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source Table: replication_applier_status_by_worker")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", workerId=").append(workerId);
        sb.append(", threadId=").append(threadId);
        sb.append(", serviceState=").append(serviceState);
        sb.append(", lastErrorNumber=").append(lastErrorNumber);
        sb.append(", lastErrorMessage=").append(lastErrorMessage);
        sb.append(", lastErrorTimestamp=").append(lastErrorTimestamp);
        sb.append(", lastAppliedTransaction=").append(lastAppliedTransaction);
        sb.append(", lastAppliedTransactionOriginalCommitTimestamp=").append(lastAppliedTransactionOriginalCommitTimestamp);
        sb.append(", lastAppliedTransactionImmediateCommitTimestamp=").append(lastAppliedTransactionImmediateCommitTimestamp);
        sb.append(", lastAppliedTransactionStartApplyTimestamp=").append(lastAppliedTransactionStartApplyTimestamp);
        sb.append(", lastAppliedTransactionEndApplyTimestamp=").append(lastAppliedTransactionEndApplyTimestamp);
        sb.append(", applyingTransaction=").append(applyingTransaction);
        sb.append(", applyingTransactionOriginalCommitTimestamp=").append(applyingTransactionOriginalCommitTimestamp);
        sb.append(", applyingTransactionImmediateCommitTimestamp=").append(applyingTransactionImmediateCommitTimestamp);
        sb.append(", applyingTransactionStartApplyTimestamp=").append(applyingTransactionStartApplyTimestamp);
        sb.append(", lastAppliedTransactionRetriesCount=").append(lastAppliedTransactionRetriesCount);
        sb.append(", lastAppliedTransactionLastTransientErrorNumber=").append(lastAppliedTransactionLastTransientErrorNumber);
        sb.append(", lastAppliedTransactionLastTransientErrorMessage=").append(lastAppliedTransactionLastTransientErrorMessage);
        sb.append(", lastAppliedTransactionLastTransientErrorTimestamp=").append(lastAppliedTransactionLastTransientErrorTimestamp);
        sb.append(", applyingTransactionRetriesCount=").append(applyingTransactionRetriesCount);
        sb.append(", applyingTransactionLastTransientErrorNumber=").append(applyingTransactionLastTransientErrorNumber);
        sb.append(", applyingTransactionLastTransientErrorMessage=").append(applyingTransactionLastTransientErrorMessage);
        sb.append(", applyingTransactionLastTransientErrorTimestamp=").append(applyingTransactionLastTransientErrorTimestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source Table: replication_applier_status_by_worker")
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
        ReplicationApplierStatusByWorker other = (ReplicationApplierStatusByWorker) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getWorkerId() == null ? other.getWorkerId() == null : this.getWorkerId().equals(other.getWorkerId()))
            && (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getServiceState() == null ? other.getServiceState() == null : this.getServiceState().equals(other.getServiceState()))
            && (this.getLastErrorNumber() == null ? other.getLastErrorNumber() == null : this.getLastErrorNumber().equals(other.getLastErrorNumber()))
            && (this.getLastErrorMessage() == null ? other.getLastErrorMessage() == null : this.getLastErrorMessage().equals(other.getLastErrorMessage()))
            && (this.getLastErrorTimestamp() == null ? other.getLastErrorTimestamp() == null : this.getLastErrorTimestamp().equals(other.getLastErrorTimestamp()))
            && (this.getLastAppliedTransaction() == null ? other.getLastAppliedTransaction() == null : this.getLastAppliedTransaction().equals(other.getLastAppliedTransaction()))
            && (this.getLastAppliedTransactionOriginalCommitTimestamp() == null ? other.getLastAppliedTransactionOriginalCommitTimestamp() == null : this.getLastAppliedTransactionOriginalCommitTimestamp().equals(other.getLastAppliedTransactionOriginalCommitTimestamp()))
            && (this.getLastAppliedTransactionImmediateCommitTimestamp() == null ? other.getLastAppliedTransactionImmediateCommitTimestamp() == null : this.getLastAppliedTransactionImmediateCommitTimestamp().equals(other.getLastAppliedTransactionImmediateCommitTimestamp()))
            && (this.getLastAppliedTransactionStartApplyTimestamp() == null ? other.getLastAppliedTransactionStartApplyTimestamp() == null : this.getLastAppliedTransactionStartApplyTimestamp().equals(other.getLastAppliedTransactionStartApplyTimestamp()))
            && (this.getLastAppliedTransactionEndApplyTimestamp() == null ? other.getLastAppliedTransactionEndApplyTimestamp() == null : this.getLastAppliedTransactionEndApplyTimestamp().equals(other.getLastAppliedTransactionEndApplyTimestamp()))
            && (this.getApplyingTransaction() == null ? other.getApplyingTransaction() == null : this.getApplyingTransaction().equals(other.getApplyingTransaction()))
            && (this.getApplyingTransactionOriginalCommitTimestamp() == null ? other.getApplyingTransactionOriginalCommitTimestamp() == null : this.getApplyingTransactionOriginalCommitTimestamp().equals(other.getApplyingTransactionOriginalCommitTimestamp()))
            && (this.getApplyingTransactionImmediateCommitTimestamp() == null ? other.getApplyingTransactionImmediateCommitTimestamp() == null : this.getApplyingTransactionImmediateCommitTimestamp().equals(other.getApplyingTransactionImmediateCommitTimestamp()))
            && (this.getApplyingTransactionStartApplyTimestamp() == null ? other.getApplyingTransactionStartApplyTimestamp() == null : this.getApplyingTransactionStartApplyTimestamp().equals(other.getApplyingTransactionStartApplyTimestamp()))
            && (this.getLastAppliedTransactionRetriesCount() == null ? other.getLastAppliedTransactionRetriesCount() == null : this.getLastAppliedTransactionRetriesCount().equals(other.getLastAppliedTransactionRetriesCount()))
            && (this.getLastAppliedTransactionLastTransientErrorNumber() == null ? other.getLastAppliedTransactionLastTransientErrorNumber() == null : this.getLastAppliedTransactionLastTransientErrorNumber().equals(other.getLastAppliedTransactionLastTransientErrorNumber()))
            && (this.getLastAppliedTransactionLastTransientErrorMessage() == null ? other.getLastAppliedTransactionLastTransientErrorMessage() == null : this.getLastAppliedTransactionLastTransientErrorMessage().equals(other.getLastAppliedTransactionLastTransientErrorMessage()))
            && (this.getLastAppliedTransactionLastTransientErrorTimestamp() == null ? other.getLastAppliedTransactionLastTransientErrorTimestamp() == null : this.getLastAppliedTransactionLastTransientErrorTimestamp().equals(other.getLastAppliedTransactionLastTransientErrorTimestamp()))
            && (this.getApplyingTransactionRetriesCount() == null ? other.getApplyingTransactionRetriesCount() == null : this.getApplyingTransactionRetriesCount().equals(other.getApplyingTransactionRetriesCount()))
            && (this.getApplyingTransactionLastTransientErrorNumber() == null ? other.getApplyingTransactionLastTransientErrorNumber() == null : this.getApplyingTransactionLastTransientErrorNumber().equals(other.getApplyingTransactionLastTransientErrorNumber()))
            && (this.getApplyingTransactionLastTransientErrorMessage() == null ? other.getApplyingTransactionLastTransientErrorMessage() == null : this.getApplyingTransactionLastTransientErrorMessage().equals(other.getApplyingTransactionLastTransientErrorMessage()))
            && (this.getApplyingTransactionLastTransientErrorTimestamp() == null ? other.getApplyingTransactionLastTransientErrorTimestamp() == null : this.getApplyingTransactionLastTransientErrorTimestamp().equals(other.getApplyingTransactionLastTransientErrorTimestamp()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2729636+08:00", comments="Source Table: replication_applier_status_by_worker")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getServiceState() == null) ? 0 : getServiceState().hashCode());
        result = prime * result + ((getLastErrorNumber() == null) ? 0 : getLastErrorNumber().hashCode());
        result = prime * result + ((getLastErrorMessage() == null) ? 0 : getLastErrorMessage().hashCode());
        result = prime * result + ((getLastErrorTimestamp() == null) ? 0 : getLastErrorTimestamp().hashCode());
        result = prime * result + ((getLastAppliedTransaction() == null) ? 0 : getLastAppliedTransaction().hashCode());
        result = prime * result + ((getLastAppliedTransactionOriginalCommitTimestamp() == null) ? 0 : getLastAppliedTransactionOriginalCommitTimestamp().hashCode());
        result = prime * result + ((getLastAppliedTransactionImmediateCommitTimestamp() == null) ? 0 : getLastAppliedTransactionImmediateCommitTimestamp().hashCode());
        result = prime * result + ((getLastAppliedTransactionStartApplyTimestamp() == null) ? 0 : getLastAppliedTransactionStartApplyTimestamp().hashCode());
        result = prime * result + ((getLastAppliedTransactionEndApplyTimestamp() == null) ? 0 : getLastAppliedTransactionEndApplyTimestamp().hashCode());
        result = prime * result + ((getApplyingTransaction() == null) ? 0 : getApplyingTransaction().hashCode());
        result = prime * result + ((getApplyingTransactionOriginalCommitTimestamp() == null) ? 0 : getApplyingTransactionOriginalCommitTimestamp().hashCode());
        result = prime * result + ((getApplyingTransactionImmediateCommitTimestamp() == null) ? 0 : getApplyingTransactionImmediateCommitTimestamp().hashCode());
        result = prime * result + ((getApplyingTransactionStartApplyTimestamp() == null) ? 0 : getApplyingTransactionStartApplyTimestamp().hashCode());
        result = prime * result + ((getLastAppliedTransactionRetriesCount() == null) ? 0 : getLastAppliedTransactionRetriesCount().hashCode());
        result = prime * result + ((getLastAppliedTransactionLastTransientErrorNumber() == null) ? 0 : getLastAppliedTransactionLastTransientErrorNumber().hashCode());
        result = prime * result + ((getLastAppliedTransactionLastTransientErrorMessage() == null) ? 0 : getLastAppliedTransactionLastTransientErrorMessage().hashCode());
        result = prime * result + ((getLastAppliedTransactionLastTransientErrorTimestamp() == null) ? 0 : getLastAppliedTransactionLastTransientErrorTimestamp().hashCode());
        result = prime * result + ((getApplyingTransactionRetriesCount() == null) ? 0 : getApplyingTransactionRetriesCount().hashCode());
        result = prime * result + ((getApplyingTransactionLastTransientErrorNumber() == null) ? 0 : getApplyingTransactionLastTransientErrorNumber().hashCode());
        result = prime * result + ((getApplyingTransactionLastTransientErrorMessage() == null) ? 0 : getApplyingTransactionLastTransientErrorMessage().hashCode());
        result = prime * result + ((getApplyingTransactionLastTransientErrorTimestamp() == null) ? 0 : getApplyingTransactionLastTransientErrorTimestamp().hashCode());
        return result;
    }
}