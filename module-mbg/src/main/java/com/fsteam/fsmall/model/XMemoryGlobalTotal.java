package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XMemoryGlobalTotal implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source field: x$memory_global_total.total_allocated")
    private BigDecimal totalAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source field: x$memory_global_total.total_allocated")
    public BigDecimal getTotalAllocated() {
        return totalAllocated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source field: x$memory_global_total.total_allocated")
    public void setTotalAllocated(BigDecimal totalAllocated) {
        this.totalAllocated = totalAllocated;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", totalAllocated=").append(totalAllocated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
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
        XMemoryGlobalTotal other = (XMemoryGlobalTotal) that;
        return (this.getTotalAllocated() == null ? other.getTotalAllocated() == null : this.getTotalAllocated().equals(other.getTotalAllocated()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTotalAllocated() == null) ? 0 : getTotalAllocated().hashCode());
        return result;
    }
}