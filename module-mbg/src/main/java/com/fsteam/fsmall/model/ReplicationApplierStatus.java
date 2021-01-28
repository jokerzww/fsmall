package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ReplicationApplierStatus implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.CHANNEL_NAME")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.SERVICE_STATE")
    private String serviceState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.REMAINING_DELAY")
    private Integer remainingDelay;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.COUNT_TRANSACTIONS_RETRIES")
    private Long countTransactionsRetries;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.CHANNEL_NAME")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.CHANNEL_NAME")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.SERVICE_STATE")
    public String getServiceState() {
        return serviceState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.SERVICE_STATE")
    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.REMAINING_DELAY")
    public Integer getRemainingDelay() {
        return remainingDelay;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.REMAINING_DELAY")
    public void setRemainingDelay(Integer remainingDelay) {
        this.remainingDelay = remainingDelay;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.COUNT_TRANSACTIONS_RETRIES")
    public Long getCountTransactionsRetries() {
        return countTransactionsRetries;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.COUNT_TRANSACTIONS_RETRIES")
    public void setCountTransactionsRetries(Long countTransactionsRetries) {
        this.countTransactionsRetries = countTransactionsRetries;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", serviceState=").append(serviceState);
        sb.append(", remainingDelay=").append(remainingDelay);
        sb.append(", countTransactionsRetries=").append(countTransactionsRetries);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
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
        ReplicationApplierStatus other = (ReplicationApplierStatus) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getServiceState() == null ? other.getServiceState() == null : this.getServiceState().equals(other.getServiceState()))
            && (this.getRemainingDelay() == null ? other.getRemainingDelay() == null : this.getRemainingDelay().equals(other.getRemainingDelay()))
            && (this.getCountTransactionsRetries() == null ? other.getCountTransactionsRetries() == null : this.getCountTransactionsRetries().equals(other.getCountTransactionsRetries()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getServiceState() == null) ? 0 : getServiceState().hashCode());
        result = prime * result + ((getRemainingDelay() == null) ? 0 : getRemainingDelay().hashCode());
        result = prime * result + ((getCountTransactionsRetries() == null) ? 0 : getCountTransactionsRetries().hashCode());
        return result;
    }
}