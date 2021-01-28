package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class IoGlobalByWaitByBytes implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.event_name")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total")
    private Long total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_latency")
    private String totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.min_latency")
    private String minLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_latency")
    private String avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.max_latency")
    private String maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.count_read")
    private Long countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_read")
    private String totalRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_read")
    private String avgRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.count_write")
    private Long countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_written")
    private String totalWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_written")
    private String avgWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_requested")
    private String totalRequested;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.event_name")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.event_name")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total")
    public Long getTotal() {
        return total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_latency")
    public String getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_latency")
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.min_latency")
    public String getMinLatency() {
        return minLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.min_latency")
    public void setMinLatency(String minLatency) {
        this.minLatency = minLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_latency")
    public String getAvgLatency() {
        return avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_latency")
    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.max_latency")
    public String getMaxLatency() {
        return maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.max_latency")
    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.count_read")
    public Long getCountRead() {
        return countRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.count_read")
    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_read")
    public String getTotalRead() {
        return totalRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_read")
    public void setTotalRead(String totalRead) {
        this.totalRead = totalRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_read")
    public String getAvgRead() {
        return avgRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_read")
    public void setAvgRead(String avgRead) {
        this.avgRead = avgRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.count_write")
    public Long getCountWrite() {
        return countWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.count_write")
    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_written")
    public String getTotalWritten() {
        return totalWritten;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_written")
    public void setTotalWritten(String totalWritten) {
        this.totalWritten = totalWritten;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_written")
    public String getAvgWritten() {
        return avgWritten;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_written")
    public void setAvgWritten(String avgWritten) {
        this.avgWritten = avgWritten;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_requested")
    public String getTotalRequested() {
        return totalRequested;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_requested")
    public void setTotalRequested(String totalRequested) {
        this.totalRequested = totalRequested;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eventName=").append(eventName);
        sb.append(", total=").append(total);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", minLatency=").append(minLatency);
        sb.append(", avgLatency=").append(avgLatency);
        sb.append(", maxLatency=").append(maxLatency);
        sb.append(", countRead=").append(countRead);
        sb.append(", totalRead=").append(totalRead);
        sb.append(", avgRead=").append(avgRead);
        sb.append(", countWrite=").append(countWrite);
        sb.append(", totalWritten=").append(totalWritten);
        sb.append(", avgWritten=").append(avgWritten);
        sb.append(", totalRequested=").append(totalRequested);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source Table: io_global_by_wait_by_bytes")
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
        IoGlobalByWaitByBytes other = (IoGlobalByWaitByBytes) that;
        return (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getTotalLatency() == null ? other.getTotalLatency() == null : this.getTotalLatency().equals(other.getTotalLatency()))
            && (this.getMinLatency() == null ? other.getMinLatency() == null : this.getMinLatency().equals(other.getMinLatency()))
            && (this.getAvgLatency() == null ? other.getAvgLatency() == null : this.getAvgLatency().equals(other.getAvgLatency()))
            && (this.getMaxLatency() == null ? other.getMaxLatency() == null : this.getMaxLatency().equals(other.getMaxLatency()))
            && (this.getCountRead() == null ? other.getCountRead() == null : this.getCountRead().equals(other.getCountRead()))
            && (this.getTotalRead() == null ? other.getTotalRead() == null : this.getTotalRead().equals(other.getTotalRead()))
            && (this.getAvgRead() == null ? other.getAvgRead() == null : this.getAvgRead().equals(other.getAvgRead()))
            && (this.getCountWrite() == null ? other.getCountWrite() == null : this.getCountWrite().equals(other.getCountWrite()))
            && (this.getTotalWritten() == null ? other.getTotalWritten() == null : this.getTotalWritten().equals(other.getTotalWritten()))
            && (this.getAvgWritten() == null ? other.getAvgWritten() == null : this.getAvgWritten().equals(other.getAvgWritten()))
            && (this.getTotalRequested() == null ? other.getTotalRequested() == null : this.getTotalRequested().equals(other.getTotalRequested()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getTotalLatency() == null) ? 0 : getTotalLatency().hashCode());
        result = prime * result + ((getMinLatency() == null) ? 0 : getMinLatency().hashCode());
        result = prime * result + ((getAvgLatency() == null) ? 0 : getAvgLatency().hashCode());
        result = prime * result + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        result = prime * result + ((getCountRead() == null) ? 0 : getCountRead().hashCode());
        result = prime * result + ((getTotalRead() == null) ? 0 : getTotalRead().hashCode());
        result = prime * result + ((getAvgRead() == null) ? 0 : getAvgRead().hashCode());
        result = prime * result + ((getCountWrite() == null) ? 0 : getCountWrite().hashCode());
        result = prime * result + ((getTotalWritten() == null) ? 0 : getTotalWritten().hashCode());
        result = prime * result + ((getAvgWritten() == null) ? 0 : getAvgWritten().hashCode());
        result = prime * result + ((getTotalRequested() == null) ? 0 : getTotalRequested().hashCode());
        return result;
    }
}