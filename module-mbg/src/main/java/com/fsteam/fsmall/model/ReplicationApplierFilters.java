package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class ReplicationApplierFilters implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.CHANNEL_NAME")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.FILTER_NAME")
    private String filterName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.CONFIGURED_BY")
    private String configuredBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.ACTIVE_SINCE")
    private Date activeSince;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.COUNTER")
    private Long counter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.FILTER_RULE")
    private String filterRule;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: replication_applier_filters")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.CHANNEL_NAME")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.CHANNEL_NAME")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.FILTER_NAME")
    public String getFilterName() {
        return filterName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.FILTER_NAME")
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.CONFIGURED_BY")
    public String getConfiguredBy() {
        return configuredBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.CONFIGURED_BY")
    public void setConfiguredBy(String configuredBy) {
        this.configuredBy = configuredBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.ACTIVE_SINCE")
    public Date getActiveSince() {
        return activeSince;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.ACTIVE_SINCE")
    public void setActiveSince(Date activeSince) {
        this.activeSince = activeSince;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.COUNTER")
    public Long getCounter() {
        return counter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.COUNTER")
    public void setCounter(Long counter) {
        this.counter = counter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.FILTER_RULE")
    public String getFilterRule() {
        return filterRule;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.FILTER_RULE")
    public void setFilterRule(String filterRule) {
        this.filterRule = filterRule;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: replication_applier_filters")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", filterName=").append(filterName);
        sb.append(", configuredBy=").append(configuredBy);
        sb.append(", activeSince=").append(activeSince);
        sb.append(", counter=").append(counter);
        sb.append(", filterRule=").append(filterRule);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: replication_applier_filters")
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
        ReplicationApplierFilters other = (ReplicationApplierFilters) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getFilterName() == null ? other.getFilterName() == null : this.getFilterName().equals(other.getFilterName()))
            && (this.getConfiguredBy() == null ? other.getConfiguredBy() == null : this.getConfiguredBy().equals(other.getConfiguredBy()))
            && (this.getActiveSince() == null ? other.getActiveSince() == null : this.getActiveSince().equals(other.getActiveSince()))
            && (this.getCounter() == null ? other.getCounter() == null : this.getCounter().equals(other.getCounter()))
            && (this.getFilterRule() == null ? other.getFilterRule() == null : this.getFilterRule().equals(other.getFilterRule()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: replication_applier_filters")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        result = prime * result + ((getConfiguredBy() == null) ? 0 : getConfiguredBy().hashCode());
        result = prime * result + ((getActiveSince() == null) ? 0 : getActiveSince().hashCode());
        result = prime * result + ((getCounter() == null) ? 0 : getCounter().hashCode());
        result = prime * result + ((getFilterRule() == null) ? 0 : getFilterRule().hashCode());
        return result;
    }
}