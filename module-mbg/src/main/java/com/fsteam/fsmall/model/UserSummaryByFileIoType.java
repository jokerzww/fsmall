package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class UserSummaryByFileIoType implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.user")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.event_name")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.total")
    private Long total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.latency")
    private String latency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.max_latency")
    private String maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: user_summary_by_file_io_type")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.user")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.user")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.event_name")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.event_name")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.total")
    public Long getTotal() {
        return total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.latency")
    public String getLatency() {
        return latency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.latency")
    public void setLatency(String latency) {
        this.latency = latency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.max_latency")
    public String getMaxLatency() {
        return maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.max_latency")
    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: user_summary_by_file_io_type")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", eventName=").append(eventName);
        sb.append(", total=").append(total);
        sb.append(", latency=").append(latency);
        sb.append(", maxLatency=").append(maxLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: user_summary_by_file_io_type")
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
        UserSummaryByFileIoType other = (UserSummaryByFileIoType) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getLatency() == null ? other.getLatency() == null : this.getLatency().equals(other.getLatency()))
            && (this.getMaxLatency() == null ? other.getMaxLatency() == null : this.getMaxLatency().equals(other.getMaxLatency()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: user_summary_by_file_io_type")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getLatency() == null) ? 0 : getLatency().hashCode());
        result = prime * result + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        return result;
    }
}