package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class OptimizerTrace implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: OPTIMIZER_TRACE.QUERY")
    private String query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source field: OPTIMIZER_TRACE.TRACE")
    private String trace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source field: OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
    private Integer missingBytesBeyondMaxMemSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source field: OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES")
    private Boolean insufficientPrivileges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source Table: OPTIMIZER_TRACE")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: OPTIMIZER_TRACE.QUERY")
    public String getQuery() {
        return query;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: OPTIMIZER_TRACE.QUERY")
    public void setQuery(String query) {
        this.query = query;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source field: OPTIMIZER_TRACE.TRACE")
    public String getTrace() {
        return trace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source field: OPTIMIZER_TRACE.TRACE")
    public void setTrace(String trace) {
        this.trace = trace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source field: OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
    public Integer getMissingBytesBeyondMaxMemSize() {
        return missingBytesBeyondMaxMemSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source field: OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
    public void setMissingBytesBeyondMaxMemSize(Integer missingBytesBeyondMaxMemSize) {
        this.missingBytesBeyondMaxMemSize = missingBytesBeyondMaxMemSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source field: OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES")
    public Boolean getInsufficientPrivileges() {
        return insufficientPrivileges;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source field: OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES")
    public void setInsufficientPrivileges(Boolean insufficientPrivileges) {
        this.insufficientPrivileges = insufficientPrivileges;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source Table: OPTIMIZER_TRACE")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", query=").append(query);
        sb.append(", trace=").append(trace);
        sb.append(", missingBytesBeyondMaxMemSize=").append(missingBytesBeyondMaxMemSize);
        sb.append(", insufficientPrivileges=").append(insufficientPrivileges);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source Table: OPTIMIZER_TRACE")
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
        OptimizerTrace other = (OptimizerTrace) that;
        return (this.getQuery() == null ? other.getQuery() == null : this.getQuery().equals(other.getQuery()))
            && (this.getTrace() == null ? other.getTrace() == null : this.getTrace().equals(other.getTrace()))
            && (this.getMissingBytesBeyondMaxMemSize() == null ? other.getMissingBytesBeyondMaxMemSize() == null : this.getMissingBytesBeyondMaxMemSize().equals(other.getMissingBytesBeyondMaxMemSize()))
            && (this.getInsufficientPrivileges() == null ? other.getInsufficientPrivileges() == null : this.getInsufficientPrivileges().equals(other.getInsufficientPrivileges()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2179135+08:00", comments="Source Table: OPTIMIZER_TRACE")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuery() == null) ? 0 : getQuery().hashCode());
        result = prime * result + ((getTrace() == null) ? 0 : getTrace().hashCode());
        result = prime * result + ((getMissingBytesBeyondMaxMemSize() == null) ? 0 : getMissingBytesBeyondMaxMemSize().hashCode());
        result = prime * result + ((getInsufficientPrivileges() == null) ? 0 : getInsufficientPrivileges().hashCode());
        return result;
    }
}