package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class TimeZone implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source field: time_zone.Time_zone_id")
    private Integer timeZoneId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source field: time_zone.Use_leap_seconds")
    private String useLeapSeconds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source field: time_zone.Time_zone_id")
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source field: time_zone.Time_zone_id")
    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source field: time_zone.Use_leap_seconds")
    public String getUseLeapSeconds() {
        return useLeapSeconds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source field: time_zone.Use_leap_seconds")
    public void setUseLeapSeconds(String useLeapSeconds) {
        this.useLeapSeconds = useLeapSeconds;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timeZoneId=").append(timeZoneId);
        sb.append(", useLeapSeconds=").append(useLeapSeconds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
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
        TimeZone other = (TimeZone) that;
        return (this.getTimeZoneId() == null ? other.getTimeZoneId() == null : this.getTimeZoneId().equals(other.getTimeZoneId()))
            && (this.getUseLeapSeconds() == null ? other.getUseLeapSeconds() == null : this.getUseLeapSeconds().equals(other.getUseLeapSeconds()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        result = prime * result + ((getUseLeapSeconds() == null) ? 0 : getUseLeapSeconds().hashCode());
        return result;
    }
}