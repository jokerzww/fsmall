package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class PerformanceTimers implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: performance_timers.TIMER_NAME")
    private String timerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_FREQUENCY")
    private Long timerFrequency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_RESOLUTION")
    private Long timerResolution;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_OVERHEAD")
    private Long timerOverhead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: performance_timers.TIMER_NAME")
    public String getTimerName() {
        return timerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_NAME")
    public void setTimerName(String timerName) {
        this.timerName = timerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_FREQUENCY")
    public Long getTimerFrequency() {
        return timerFrequency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_FREQUENCY")
    public void setTimerFrequency(Long timerFrequency) {
        this.timerFrequency = timerFrequency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_RESOLUTION")
    public Long getTimerResolution() {
        return timerResolution;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_RESOLUTION")
    public void setTimerResolution(Long timerResolution) {
        this.timerResolution = timerResolution;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_OVERHEAD")
    public Long getTimerOverhead() {
        return timerOverhead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_OVERHEAD")
    public void setTimerOverhead(Long timerOverhead) {
        this.timerOverhead = timerOverhead;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timerName=").append(timerName);
        sb.append(", timerFrequency=").append(timerFrequency);
        sb.append(", timerResolution=").append(timerResolution);
        sb.append(", timerOverhead=").append(timerOverhead);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
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
        PerformanceTimers other = (PerformanceTimers) that;
        return (this.getTimerName() == null ? other.getTimerName() == null : this.getTimerName().equals(other.getTimerName()))
            && (this.getTimerFrequency() == null ? other.getTimerFrequency() == null : this.getTimerFrequency().equals(other.getTimerFrequency()))
            && (this.getTimerResolution() == null ? other.getTimerResolution() == null : this.getTimerResolution().equals(other.getTimerResolution()))
            && (this.getTimerOverhead() == null ? other.getTimerOverhead() == null : this.getTimerOverhead().equals(other.getTimerOverhead()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTimerName() == null) ? 0 : getTimerName().hashCode());
        result = prime * result + ((getTimerFrequency() == null) ? 0 : getTimerFrequency().hashCode());
        result = prime * result + ((getTimerResolution() == null) ? 0 : getTimerResolution().hashCode());
        result = prime * result + ((getTimerOverhead() == null) ? 0 : getTimerOverhead().hashCode());
        return result;
    }
}