package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ObjectsSummaryGlobalByType implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_TYPE")
    private String objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_SCHEMA")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_NAME")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.COUNT_STAR")
    private Long countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.SUM_TIMER_WAIT")
    private Long sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.MIN_TIMER_WAIT")
    private Long minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.AVG_TIMER_WAIT")
    private Long avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.MAX_TIMER_WAIT")
    private Long maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source Table: objects_summary_global_by_type")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_TYPE")
    public String getObjectType() {
        return objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_TYPE")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_SCHEMA")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_SCHEMA")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_NAME")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_NAME")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.COUNT_STAR")
    public Long getCountStar() {
        return countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.COUNT_STAR")
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.SUM_TIMER_WAIT")
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.SUM_TIMER_WAIT")
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.MIN_TIMER_WAIT")
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.MIN_TIMER_WAIT")
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.AVG_TIMER_WAIT")
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.AVG_TIMER_WAIT")
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.MAX_TIMER_WAIT")
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.MAX_TIMER_WAIT")
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source Table: objects_summary_global_by_type")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectType=").append(objectType);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", countStar=").append(countStar);
        sb.append(", sumTimerWait=").append(sumTimerWait);
        sb.append(", minTimerWait=").append(minTimerWait);
        sb.append(", avgTimerWait=").append(avgTimerWait);
        sb.append(", maxTimerWait=").append(maxTimerWait);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source Table: objects_summary_global_by_type")
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
        ObjectsSummaryGlobalByType other = (ObjectsSummaryGlobalByType) that;
        return (this.getObjectType() == null ? other.getObjectType() == null : this.getObjectType().equals(other.getObjectType()))
            && (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getCountStar() == null ? other.getCountStar() == null : this.getCountStar().equals(other.getCountStar()))
            && (this.getSumTimerWait() == null ? other.getSumTimerWait() == null : this.getSumTimerWait().equals(other.getSumTimerWait()))
            && (this.getMinTimerWait() == null ? other.getMinTimerWait() == null : this.getMinTimerWait().equals(other.getMinTimerWait()))
            && (this.getAvgTimerWait() == null ? other.getAvgTimerWait() == null : this.getAvgTimerWait().equals(other.getAvgTimerWait()))
            && (this.getMaxTimerWait() == null ? other.getMaxTimerWait() == null : this.getMaxTimerWait().equals(other.getMaxTimerWait()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source Table: objects_summary_global_by_type")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getCountStar() == null) ? 0 : getCountStar().hashCode());
        result = prime * result + ((getSumTimerWait() == null) ? 0 : getSumTimerWait().hashCode());
        result = prime * result + ((getMinTimerWait() == null) ? 0 : getMinTimerWait().hashCode());
        result = prime * result + ((getAvgTimerWait() == null) ? 0 : getAvgTimerWait().hashCode());
        result = prime * result + ((getMaxTimerWait() == null) ? 0 : getMaxTimerWait().hashCode());
        return result;
    }
}