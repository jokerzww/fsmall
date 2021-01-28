package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class TimeZoneTransition implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Time_zone_id")
    private Integer timeZoneId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Transition_time")
    private Long transitionTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Transition_type_id")
    private Integer transitionTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Time_zone_id")
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Time_zone_id")
    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Transition_time")
    public Long getTransitionTime() {
        return transitionTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Transition_time")
    public void setTransitionTime(Long transitionTime) {
        this.transitionTime = transitionTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Transition_type_id")
    public Integer getTransitionTypeId() {
        return transitionTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Transition_type_id")
    public void setTransitionTypeId(Integer transitionTypeId) {
        this.transitionTypeId = transitionTypeId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timeZoneId=").append(timeZoneId);
        sb.append(", transitionTime=").append(transitionTime);
        sb.append(", transitionTypeId=").append(transitionTypeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
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
        TimeZoneTransition other = (TimeZoneTransition) that;
        return (this.getTimeZoneId() == null ? other.getTimeZoneId() == null : this.getTimeZoneId().equals(other.getTimeZoneId()))
            && (this.getTransitionTime() == null ? other.getTransitionTime() == null : this.getTransitionTime().equals(other.getTransitionTime()))
            && (this.getTransitionTypeId() == null ? other.getTransitionTypeId() == null : this.getTransitionTypeId().equals(other.getTransitionTypeId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        result = prime * result + ((getTransitionTime() == null) ? 0 : getTransitionTime().hashCode());
        result = prime * result + ((getTransitionTypeId() == null) ? 0 : getTransitionTypeId().hashCode());
        return result;
    }
}