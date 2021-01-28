package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class MemoryGlobalByCurrentBytes implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.event_name")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_count")
    private Long currentCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_alloc")
    private String currentAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_avg_alloc")
    private String currentAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_count")
    private Long highCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_alloc")
    private String highAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_avg_alloc")
    private String highAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source Table: memory_global_by_current_bytes")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.event_name")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.event_name")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_count")
    public Long getCurrentCount() {
        return currentCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_count")
    public void setCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_alloc")
    public String getCurrentAlloc() {
        return currentAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_alloc")
    public void setCurrentAlloc(String currentAlloc) {
        this.currentAlloc = currentAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_avg_alloc")
    public String getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_avg_alloc")
    public void setCurrentAvgAlloc(String currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_count")
    public Long getHighCount() {
        return highCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_count")
    public void setHighCount(Long highCount) {
        this.highCount = highCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_alloc")
    public String getHighAlloc() {
        return highAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_alloc")
    public void setHighAlloc(String highAlloc) {
        this.highAlloc = highAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_avg_alloc")
    public String getHighAvgAlloc() {
        return highAvgAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_avg_alloc")
    public void setHighAvgAlloc(String highAvgAlloc) {
        this.highAvgAlloc = highAvgAlloc;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source Table: memory_global_by_current_bytes")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eventName=").append(eventName);
        sb.append(", currentCount=").append(currentCount);
        sb.append(", currentAlloc=").append(currentAlloc);
        sb.append(", currentAvgAlloc=").append(currentAvgAlloc);
        sb.append(", highCount=").append(highCount);
        sb.append(", highAlloc=").append(highAlloc);
        sb.append(", highAvgAlloc=").append(highAvgAlloc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source Table: memory_global_by_current_bytes")
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
        MemoryGlobalByCurrentBytes other = (MemoryGlobalByCurrentBytes) that;
        return (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getCurrentCount() == null ? other.getCurrentCount() == null : this.getCurrentCount().equals(other.getCurrentCount()))
            && (this.getCurrentAlloc() == null ? other.getCurrentAlloc() == null : this.getCurrentAlloc().equals(other.getCurrentAlloc()))
            && (this.getCurrentAvgAlloc() == null ? other.getCurrentAvgAlloc() == null : this.getCurrentAvgAlloc().equals(other.getCurrentAvgAlloc()))
            && (this.getHighCount() == null ? other.getHighCount() == null : this.getHighCount().equals(other.getHighCount()))
            && (this.getHighAlloc() == null ? other.getHighAlloc() == null : this.getHighAlloc().equals(other.getHighAlloc()))
            && (this.getHighAvgAlloc() == null ? other.getHighAvgAlloc() == null : this.getHighAvgAlloc().equals(other.getHighAvgAlloc()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source Table: memory_global_by_current_bytes")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getCurrentCount() == null) ? 0 : getCurrentCount().hashCode());
        result = prime * result + ((getCurrentAlloc() == null) ? 0 : getCurrentAlloc().hashCode());
        result = prime * result + ((getCurrentAvgAlloc() == null) ? 0 : getCurrentAvgAlloc().hashCode());
        result = prime * result + ((getHighCount() == null) ? 0 : getHighCount().hashCode());
        result = prime * result + ((getHighAlloc() == null) ? 0 : getHighAlloc().hashCode());
        result = prime * result + ((getHighAvgAlloc() == null) ? 0 : getHighAvgAlloc().hashCode());
        return result;
    }
}