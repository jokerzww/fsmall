package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class XWaitsByUserByLatency implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.user")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.event")
    private String event;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.total")
    private Long total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.total_latency")
    private Long totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.avg_latency")
    private Long avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.max_latency")
    private Long maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.user")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.user")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.event")
    public String getEvent() {
        return event;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.event")
    public void setEvent(String event) {
        this.event = event;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.total")
    public Long getTotal() {
        return total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.total_latency")
    public Long getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.total_latency")
    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.avg_latency")
    public Long getAvgLatency() {
        return avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.avg_latency")
    public void setAvgLatency(Long avgLatency) {
        this.avgLatency = avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.max_latency")
    public Long getMaxLatency() {
        return maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.max_latency")
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", event=").append(event);
        sb.append(", total=").append(total);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", avgLatency=").append(avgLatency);
        sb.append(", maxLatency=").append(maxLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
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
        XWaitsByUserByLatency other = (XWaitsByUserByLatency) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getEvent() == null ? other.getEvent() == null : this.getEvent().equals(other.getEvent()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getTotalLatency() == null ? other.getTotalLatency() == null : this.getTotalLatency().equals(other.getTotalLatency()))
            && (this.getAvgLatency() == null ? other.getAvgLatency() == null : this.getAvgLatency().equals(other.getAvgLatency()))
            && (this.getMaxLatency() == null ? other.getMaxLatency() == null : this.getMaxLatency().equals(other.getMaxLatency()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getEvent() == null) ? 0 : getEvent().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getTotalLatency() == null) ? 0 : getTotalLatency().hashCode());
        result = prime * result + ((getAvgLatency() == null) ? 0 : getAvgLatency().hashCode());
        result = prime * result + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        return result;
    }
}