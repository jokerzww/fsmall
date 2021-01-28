package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ReplicationGroupMemberStats implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.CHANNEL_NAME")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.VIEW_ID")
    private String viewId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.MEMBER_ID")
    private String memberId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE")
    private Long countTransactionsInQueue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED")
    private Long countTransactionsChecked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_CONFLICTS_DETECTED")
    private Long countConflictsDetected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING")
    private Long countTransactionsRowsValidating;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE")
    private Long countTransactionsRemoteInApplierQueue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED")
    private Long countTransactionsRemoteApplied;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED")
    private Long countTransactionsLocalProposed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK")
    private Long countTransactionsLocalRollback;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS")
    private String transactionsCommittedAllMembers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION")
    private String lastConflictFreeTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source Table: replication_group_member_stats")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.CHANNEL_NAME")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.CHANNEL_NAME")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.VIEW_ID")
    public String getViewId() {
        return viewId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.VIEW_ID")
    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.MEMBER_ID")
    public String getMemberId() {
        return memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.MEMBER_ID")
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE")
    public Long getCountTransactionsInQueue() {
        return countTransactionsInQueue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE")
    public void setCountTransactionsInQueue(Long countTransactionsInQueue) {
        this.countTransactionsInQueue = countTransactionsInQueue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED")
    public Long getCountTransactionsChecked() {
        return countTransactionsChecked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED")
    public void setCountTransactionsChecked(Long countTransactionsChecked) {
        this.countTransactionsChecked = countTransactionsChecked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_CONFLICTS_DETECTED")
    public Long getCountConflictsDetected() {
        return countConflictsDetected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_CONFLICTS_DETECTED")
    public void setCountConflictsDetected(Long countConflictsDetected) {
        this.countConflictsDetected = countConflictsDetected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING")
    public Long getCountTransactionsRowsValidating() {
        return countTransactionsRowsValidating;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING")
    public void setCountTransactionsRowsValidating(Long countTransactionsRowsValidating) {
        this.countTransactionsRowsValidating = countTransactionsRowsValidating;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE")
    public Long getCountTransactionsRemoteInApplierQueue() {
        return countTransactionsRemoteInApplierQueue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE")
    public void setCountTransactionsRemoteInApplierQueue(Long countTransactionsRemoteInApplierQueue) {
        this.countTransactionsRemoteInApplierQueue = countTransactionsRemoteInApplierQueue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED")
    public Long getCountTransactionsRemoteApplied() {
        return countTransactionsRemoteApplied;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED")
    public void setCountTransactionsRemoteApplied(Long countTransactionsRemoteApplied) {
        this.countTransactionsRemoteApplied = countTransactionsRemoteApplied;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED")
    public Long getCountTransactionsLocalProposed() {
        return countTransactionsLocalProposed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED")
    public void setCountTransactionsLocalProposed(Long countTransactionsLocalProposed) {
        this.countTransactionsLocalProposed = countTransactionsLocalProposed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK")
    public Long getCountTransactionsLocalRollback() {
        return countTransactionsLocalRollback;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK")
    public void setCountTransactionsLocalRollback(Long countTransactionsLocalRollback) {
        this.countTransactionsLocalRollback = countTransactionsLocalRollback;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS")
    public String getTransactionsCommittedAllMembers() {
        return transactionsCommittedAllMembers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS")
    public void setTransactionsCommittedAllMembers(String transactionsCommittedAllMembers) {
        this.transactionsCommittedAllMembers = transactionsCommittedAllMembers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION")
    public String getLastConflictFreeTransaction() {
        return lastConflictFreeTransaction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION")
    public void setLastConflictFreeTransaction(String lastConflictFreeTransaction) {
        this.lastConflictFreeTransaction = lastConflictFreeTransaction;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source Table: replication_group_member_stats")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", viewId=").append(viewId);
        sb.append(", memberId=").append(memberId);
        sb.append(", countTransactionsInQueue=").append(countTransactionsInQueue);
        sb.append(", countTransactionsChecked=").append(countTransactionsChecked);
        sb.append(", countConflictsDetected=").append(countConflictsDetected);
        sb.append(", countTransactionsRowsValidating=").append(countTransactionsRowsValidating);
        sb.append(", countTransactionsRemoteInApplierQueue=").append(countTransactionsRemoteInApplierQueue);
        sb.append(", countTransactionsRemoteApplied=").append(countTransactionsRemoteApplied);
        sb.append(", countTransactionsLocalProposed=").append(countTransactionsLocalProposed);
        sb.append(", countTransactionsLocalRollback=").append(countTransactionsLocalRollback);
        sb.append(", transactionsCommittedAllMembers=").append(transactionsCommittedAllMembers);
        sb.append(", lastConflictFreeTransaction=").append(lastConflictFreeTransaction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source Table: replication_group_member_stats")
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
        ReplicationGroupMemberStats other = (ReplicationGroupMemberStats) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getViewId() == null ? other.getViewId() == null : this.getViewId().equals(other.getViewId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getCountTransactionsInQueue() == null ? other.getCountTransactionsInQueue() == null : this.getCountTransactionsInQueue().equals(other.getCountTransactionsInQueue()))
            && (this.getCountTransactionsChecked() == null ? other.getCountTransactionsChecked() == null : this.getCountTransactionsChecked().equals(other.getCountTransactionsChecked()))
            && (this.getCountConflictsDetected() == null ? other.getCountConflictsDetected() == null : this.getCountConflictsDetected().equals(other.getCountConflictsDetected()))
            && (this.getCountTransactionsRowsValidating() == null ? other.getCountTransactionsRowsValidating() == null : this.getCountTransactionsRowsValidating().equals(other.getCountTransactionsRowsValidating()))
            && (this.getCountTransactionsRemoteInApplierQueue() == null ? other.getCountTransactionsRemoteInApplierQueue() == null : this.getCountTransactionsRemoteInApplierQueue().equals(other.getCountTransactionsRemoteInApplierQueue()))
            && (this.getCountTransactionsRemoteApplied() == null ? other.getCountTransactionsRemoteApplied() == null : this.getCountTransactionsRemoteApplied().equals(other.getCountTransactionsRemoteApplied()))
            && (this.getCountTransactionsLocalProposed() == null ? other.getCountTransactionsLocalProposed() == null : this.getCountTransactionsLocalProposed().equals(other.getCountTransactionsLocalProposed()))
            && (this.getCountTransactionsLocalRollback() == null ? other.getCountTransactionsLocalRollback() == null : this.getCountTransactionsLocalRollback().equals(other.getCountTransactionsLocalRollback()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source Table: replication_group_member_stats")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getViewId() == null) ? 0 : getViewId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getCountTransactionsInQueue() == null) ? 0 : getCountTransactionsInQueue().hashCode());
        result = prime * result + ((getCountTransactionsChecked() == null) ? 0 : getCountTransactionsChecked().hashCode());
        result = prime * result + ((getCountConflictsDetected() == null) ? 0 : getCountConflictsDetected().hashCode());
        result = prime * result + ((getCountTransactionsRowsValidating() == null) ? 0 : getCountTransactionsRowsValidating().hashCode());
        result = prime * result + ((getCountTransactionsRemoteInApplierQueue() == null) ? 0 : getCountTransactionsRemoteInApplierQueue().hashCode());
        result = prime * result + ((getCountTransactionsRemoteApplied() == null) ? 0 : getCountTransactionsRemoteApplied().hashCode());
        result = prime * result + ((getCountTransactionsLocalProposed() == null) ? 0 : getCountTransactionsLocalProposed().hashCode());
        result = prime * result + ((getCountTransactionsLocalRollback() == null) ? 0 : getCountTransactionsLocalRollback().hashCode());
        return result;
    }
}