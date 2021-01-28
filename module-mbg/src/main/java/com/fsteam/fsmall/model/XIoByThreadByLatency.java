package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XIoByThreadByLatency implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source field: x$io_by_thread_by_latency.user")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.total")
    private BigDecimal total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.total_latency")
    private BigDecimal totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.min_latency")
    private Long minLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.avg_latency")
    private BigDecimal avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.max_latency")
    private Long maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.thread_id")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.processlist_id")
    private Long processlistId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source field: x$io_by_thread_by_latency.user")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source field: x$io_by_thread_by_latency.user")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.total")
    public BigDecimal getTotal() {
        return total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.total")
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.total_latency")
    public BigDecimal getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.total_latency")
    public void setTotalLatency(BigDecimal totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.min_latency")
    public Long getMinLatency() {
        return minLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.min_latency")
    public void setMinLatency(Long minLatency) {
        this.minLatency = minLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.avg_latency")
    public BigDecimal getAvgLatency() {
        return avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.avg_latency")
    public void setAvgLatency(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.max_latency")
    public Long getMaxLatency() {
        return maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.max_latency")
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.thread_id")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.thread_id")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.processlist_id")
    public Long getProcesslistId() {
        return processlistId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.processlist_id")
    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", total=").append(total);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", minLatency=").append(minLatency);
        sb.append(", avgLatency=").append(avgLatency);
        sb.append(", maxLatency=").append(maxLatency);
        sb.append(", threadId=").append(threadId);
        sb.append(", processlistId=").append(processlistId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
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
        XIoByThreadByLatency other = (XIoByThreadByLatency) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getTotalLatency() == null ? other.getTotalLatency() == null : this.getTotalLatency().equals(other.getTotalLatency()))
            && (this.getMinLatency() == null ? other.getMinLatency() == null : this.getMinLatency().equals(other.getMinLatency()))
            && (this.getAvgLatency() == null ? other.getAvgLatency() == null : this.getAvgLatency().equals(other.getAvgLatency()))
            && (this.getMaxLatency() == null ? other.getMaxLatency() == null : this.getMaxLatency().equals(other.getMaxLatency()))
            && (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getProcesslistId() == null ? other.getProcesslistId() == null : this.getProcesslistId().equals(other.getProcesslistId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getTotalLatency() == null) ? 0 : getTotalLatency().hashCode());
        result = prime * result + ((getMinLatency() == null) ? 0 : getMinLatency().hashCode());
        result = prime * result + ((getAvgLatency() == null) ? 0 : getAvgLatency().hashCode());
        result = prime * result + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getProcesslistId() == null) ? 0 : getProcesslistId().hashCode());
        return result;
    }
}