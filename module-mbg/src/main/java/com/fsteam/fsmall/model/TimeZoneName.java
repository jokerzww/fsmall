package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class TimeZoneName implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source field: time_zone_name.Name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source field: time_zone_name.Time_zone_id")
    private Integer timeZoneId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: time_zone_name")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source field: time_zone_name.Name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source field: time_zone_name.Name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source field: time_zone_name.Time_zone_id")
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source field: time_zone_name.Time_zone_id")
    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: time_zone_name")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", timeZoneId=").append(timeZoneId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: time_zone_name")
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
        TimeZoneName other = (TimeZoneName) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTimeZoneId() == null ? other.getTimeZoneId() == null : this.getTimeZoneId().equals(other.getTimeZoneId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: time_zone_name")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        return result;
    }
}