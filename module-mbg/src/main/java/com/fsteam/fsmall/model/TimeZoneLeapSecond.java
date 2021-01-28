package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class TimeZoneLeapSecond implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source field: time_zone_leap_second.Transition_time")
    private Long transitionTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source field: time_zone_leap_second.Correction")
    private Integer correction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source field: time_zone_leap_second.Transition_time")
    public Long getTransitionTime() {
        return transitionTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source field: time_zone_leap_second.Transition_time")
    public void setTransitionTime(Long transitionTime) {
        this.transitionTime = transitionTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source field: time_zone_leap_second.Correction")
    public Integer getCorrection() {
        return correction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source field: time_zone_leap_second.Correction")
    public void setCorrection(Integer correction) {
        this.correction = correction;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transitionTime=").append(transitionTime);
        sb.append(", correction=").append(correction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
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
        TimeZoneLeapSecond other = (TimeZoneLeapSecond) that;
        return (this.getTransitionTime() == null ? other.getTransitionTime() == null : this.getTransitionTime().equals(other.getTransitionTime()))
            && (this.getCorrection() == null ? other.getCorrection() == null : this.getCorrection().equals(other.getCorrection()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransitionTime() == null) ? 0 : getTransitionTime().hashCode());
        result = prime * result + ((getCorrection() == null) ? 0 : getCorrection().hashCode());
        return result;
    }
}