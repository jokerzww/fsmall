package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XMemoryByUserByCurrentBytes implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.user")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_count_used")
    private BigDecimal currentCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_allocated")
    private BigDecimal currentAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_avg_alloc")
    private BigDecimal currentAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_max_alloc")
    private Long currentMaxAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.total_allocated")
    private BigDecimal totalAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$memory_by_user_by_current_bytes")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.user")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.user")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_count_used")
    public BigDecimal getCurrentCountUsed() {
        return currentCountUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_count_used")
    public void setCurrentCountUsed(BigDecimal currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_allocated")
    public BigDecimal getCurrentAllocated() {
        return currentAllocated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_allocated")
    public void setCurrentAllocated(BigDecimal currentAllocated) {
        this.currentAllocated = currentAllocated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_avg_alloc")
    public BigDecimal getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_avg_alloc")
    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_max_alloc")
    public Long getCurrentMaxAlloc() {
        return currentMaxAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_max_alloc")
    public void setCurrentMaxAlloc(Long currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.total_allocated")
    public BigDecimal getTotalAllocated() {
        return totalAllocated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.total_allocated")
    public void setTotalAllocated(BigDecimal totalAllocated) {
        this.totalAllocated = totalAllocated;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$memory_by_user_by_current_bytes")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", currentCountUsed=").append(currentCountUsed);
        sb.append(", currentAllocated=").append(currentAllocated);
        sb.append(", currentAvgAlloc=").append(currentAvgAlloc);
        sb.append(", currentMaxAlloc=").append(currentMaxAlloc);
        sb.append(", totalAllocated=").append(totalAllocated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$memory_by_user_by_current_bytes")
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
        XMemoryByUserByCurrentBytes other = (XMemoryByUserByCurrentBytes) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getCurrentCountUsed() == null ? other.getCurrentCountUsed() == null : this.getCurrentCountUsed().equals(other.getCurrentCountUsed()))
            && (this.getCurrentAllocated() == null ? other.getCurrentAllocated() == null : this.getCurrentAllocated().equals(other.getCurrentAllocated()))
            && (this.getCurrentAvgAlloc() == null ? other.getCurrentAvgAlloc() == null : this.getCurrentAvgAlloc().equals(other.getCurrentAvgAlloc()))
            && (this.getCurrentMaxAlloc() == null ? other.getCurrentMaxAlloc() == null : this.getCurrentMaxAlloc().equals(other.getCurrentMaxAlloc()))
            && (this.getTotalAllocated() == null ? other.getTotalAllocated() == null : this.getTotalAllocated().equals(other.getTotalAllocated()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$memory_by_user_by_current_bytes")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getCurrentCountUsed() == null) ? 0 : getCurrentCountUsed().hashCode());
        result = prime * result + ((getCurrentAllocated() == null) ? 0 : getCurrentAllocated().hashCode());
        result = prime * result + ((getCurrentAvgAlloc() == null) ? 0 : getCurrentAvgAlloc().hashCode());
        result = prime * result + ((getCurrentMaxAlloc() == null) ? 0 : getCurrentMaxAlloc().hashCode());
        result = prime * result + ((getTotalAllocated() == null) ? 0 : getTotalAllocated().hashCode());
        return result;
    }
}