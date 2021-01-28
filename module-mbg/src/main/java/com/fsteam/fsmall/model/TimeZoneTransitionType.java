package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class TimeZoneTransitionType implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Time_zone_id")
    private Integer timeZoneId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Transition_type_id")
    private Integer transitionTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Offset")
    private Integer offset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Is_DST")
    private Byte isDst;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Abbreviation")
    private String abbreviation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: time_zone_transition_type")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Time_zone_id")
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Time_zone_id")
    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Transition_type_id")
    public Integer getTransitionTypeId() {
        return transitionTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Transition_type_id")
    public void setTransitionTypeId(Integer transitionTypeId) {
        this.transitionTypeId = transitionTypeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Offset")
    public Integer getOffset() {
        return offset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Is_DST")
    public Byte getIsDst() {
        return isDst;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Is_DST")
    public void setIsDst(Byte isDst) {
        this.isDst = isDst;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source field: time_zone_transition_type.Abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: time_zone_transition_type")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timeZoneId=").append(timeZoneId);
        sb.append(", transitionTypeId=").append(transitionTypeId);
        sb.append(", offset=").append(offset);
        sb.append(", isDst=").append(isDst);
        sb.append(", abbreviation=").append(abbreviation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: time_zone_transition_type")
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
        TimeZoneTransitionType other = (TimeZoneTransitionType) that;
        return (this.getTimeZoneId() == null ? other.getTimeZoneId() == null : this.getTimeZoneId().equals(other.getTimeZoneId()))
            && (this.getTransitionTypeId() == null ? other.getTransitionTypeId() == null : this.getTransitionTypeId().equals(other.getTransitionTypeId()))
            && (this.getOffset() == null ? other.getOffset() == null : this.getOffset().equals(other.getOffset()))
            && (this.getIsDst() == null ? other.getIsDst() == null : this.getIsDst().equals(other.getIsDst()))
            && (this.getAbbreviation() == null ? other.getAbbreviation() == null : this.getAbbreviation().equals(other.getAbbreviation()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: time_zone_transition_type")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        result = prime * result + ((getTransitionTypeId() == null) ? 0 : getTransitionTypeId().hashCode());
        result = prime * result + ((getOffset() == null) ? 0 : getOffset().hashCode());
        result = prime * result + ((getIsDst() == null) ? 0 : getIsDst().hashCode());
        result = prime * result + ((getAbbreviation() == null) ? 0 : getAbbreviation().hashCode());
        return result;
    }
}