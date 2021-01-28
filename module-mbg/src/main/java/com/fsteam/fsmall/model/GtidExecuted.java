package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class GtidExecuted implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3290146+08:00", comments="Source field: gtid_executed.source_uuid")
    private String sourceUuid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3290146+08:00", comments="Source field: gtid_executed.interval_start")
    private Long intervalStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3290146+08:00", comments="Source field: gtid_executed.interval_end")
    private Long intervalEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3290146+08:00", comments="Source field: gtid_executed.source_uuid")
    public String getSourceUuid() {
        return sourceUuid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3290146+08:00", comments="Source field: gtid_executed.source_uuid")
    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3290146+08:00", comments="Source field: gtid_executed.interval_start")
    public Long getIntervalStart() {
        return intervalStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3290146+08:00", comments="Source field: gtid_executed.interval_start")
    public void setIntervalStart(Long intervalStart) {
        this.intervalStart = intervalStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: gtid_executed.interval_end")
    public Long getIntervalEnd() {
        return intervalEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: gtid_executed.interval_end")
    public void setIntervalEnd(Long intervalEnd) {
        this.intervalEnd = intervalEnd;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sourceUuid=").append(sourceUuid);
        sb.append(", intervalStart=").append(intervalStart);
        sb.append(", intervalEnd=").append(intervalEnd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
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
        GtidExecuted other = (GtidExecuted) that;
        return (this.getSourceUuid() == null ? other.getSourceUuid() == null : this.getSourceUuid().equals(other.getSourceUuid()))
            && (this.getIntervalStart() == null ? other.getIntervalStart() == null : this.getIntervalStart().equals(other.getIntervalStart()))
            && (this.getIntervalEnd() == null ? other.getIntervalEnd() == null : this.getIntervalEnd().equals(other.getIntervalEnd()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSourceUuid() == null) ? 0 : getSourceUuid().hashCode());
        result = prime * result + ((getIntervalStart() == null) ? 0 : getIntervalStart().hashCode());
        result = prime * result + ((getIntervalEnd() == null) ? 0 : getIntervalEnd().hashCode());
        return result;
    }
}