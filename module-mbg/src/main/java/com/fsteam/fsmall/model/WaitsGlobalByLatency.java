package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class WaitsGlobalByLatency implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.events")
    private String events;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.total")
    private Long total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.total_latency")
    private String totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.avg_latency")
    private String avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.max_latency")
    private String maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source Table: waits_global_by_latency")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.events")
    public String getEvents() {
        return events;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.events")
    public void setEvents(String events) {
        this.events = events;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.total")
    public Long getTotal() {
        return total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.total_latency")
    public String getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.total_latency")
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.avg_latency")
    public String getAvgLatency() {
        return avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.avg_latency")
    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.max_latency")
    public String getMaxLatency() {
        return maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source field: waits_global_by_latency.max_latency")
    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source Table: waits_global_by_latency")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", events=").append(events);
        sb.append(", total=").append(total);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", avgLatency=").append(avgLatency);
        sb.append(", maxLatency=").append(maxLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source Table: waits_global_by_latency")
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
        WaitsGlobalByLatency other = (WaitsGlobalByLatency) that;
        return (this.getEvents() == null ? other.getEvents() == null : this.getEvents().equals(other.getEvents()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getTotalLatency() == null ? other.getTotalLatency() == null : this.getTotalLatency().equals(other.getTotalLatency()))
            && (this.getAvgLatency() == null ? other.getAvgLatency() == null : this.getAvgLatency().equals(other.getAvgLatency()))
            && (this.getMaxLatency() == null ? other.getMaxLatency() == null : this.getMaxLatency().equals(other.getMaxLatency()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source Table: waits_global_by_latency")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEvents() == null) ? 0 : getEvents().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getTotalLatency() == null) ? 0 : getTotalLatency().hashCode());
        result = prime * result + ((getAvgLatency() == null) ? 0 : getAvgLatency().hashCode());
        result = prime * result + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        return result;
    }
}