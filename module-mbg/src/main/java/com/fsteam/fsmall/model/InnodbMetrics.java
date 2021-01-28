package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class InnodbMetrics implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.SUBSYSTEM")
    private String subsystem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.COUNT")
    private Long count;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MAX_COUNT")
    private Long maxCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MIN_COUNT")
    private Long minCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.AVG_COUNT")
    private Float avgCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.COUNT_RESET")
    private Long countReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MAX_COUNT_RESET")
    private Long maxCountReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MIN_COUNT_RESET")
    private Long minCountReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.AVG_COUNT_RESET")
    private Float avgCountReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_ENABLED")
    private Date timeEnabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_DISABLED")
    private Date timeDisabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_ELAPSED")
    private Long timeElapsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_RESET")
    private Date timeReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.STATUS")
    private String status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TYPE")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.COMMENT")
    private String comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source Table: INNODB_METRICS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.SUBSYSTEM")
    public String getSubsystem() {
        return subsystem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.SUBSYSTEM")
    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.COUNT")
    public Long getCount() {
        return count;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.COUNT")
    public void setCount(Long count) {
        this.count = count;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MAX_COUNT")
    public Long getMaxCount() {
        return maxCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MAX_COUNT")
    public void setMaxCount(Long maxCount) {
        this.maxCount = maxCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MIN_COUNT")
    public Long getMinCount() {
        return minCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MIN_COUNT")
    public void setMinCount(Long minCount) {
        this.minCount = minCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.AVG_COUNT")
    public Float getAvgCount() {
        return avgCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.AVG_COUNT")
    public void setAvgCount(Float avgCount) {
        this.avgCount = avgCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.COUNT_RESET")
    public Long getCountReset() {
        return countReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.COUNT_RESET")
    public void setCountReset(Long countReset) {
        this.countReset = countReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MAX_COUNT_RESET")
    public Long getMaxCountReset() {
        return maxCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MAX_COUNT_RESET")
    public void setMaxCountReset(Long maxCountReset) {
        this.maxCountReset = maxCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MIN_COUNT_RESET")
    public Long getMinCountReset() {
        return minCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.MIN_COUNT_RESET")
    public void setMinCountReset(Long minCountReset) {
        this.minCountReset = minCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.AVG_COUNT_RESET")
    public Float getAvgCountReset() {
        return avgCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.AVG_COUNT_RESET")
    public void setAvgCountReset(Float avgCountReset) {
        this.avgCountReset = avgCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_ENABLED")
    public Date getTimeEnabled() {
        return timeEnabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_ENABLED")
    public void setTimeEnabled(Date timeEnabled) {
        this.timeEnabled = timeEnabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_DISABLED")
    public Date getTimeDisabled() {
        return timeDisabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_DISABLED")
    public void setTimeDisabled(Date timeDisabled) {
        this.timeDisabled = timeDisabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_ELAPSED")
    public Long getTimeElapsed() {
        return timeElapsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_ELAPSED")
    public void setTimeElapsed(Long timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_RESET")
    public Date getTimeReset() {
        return timeReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TIME_RESET")
    public void setTimeReset(Date timeReset) {
        this.timeReset = timeReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.STATUS")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.STATUS")
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TYPE")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.TYPE")
    public void setType(String type) {
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.COMMENT")
    public String getComment() {
        return comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source field: INNODB_METRICS.COMMENT")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source Table: INNODB_METRICS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", subsystem=").append(subsystem);
        sb.append(", count=").append(count);
        sb.append(", maxCount=").append(maxCount);
        sb.append(", minCount=").append(minCount);
        sb.append(", avgCount=").append(avgCount);
        sb.append(", countReset=").append(countReset);
        sb.append(", maxCountReset=").append(maxCountReset);
        sb.append(", minCountReset=").append(minCountReset);
        sb.append(", avgCountReset=").append(avgCountReset);
        sb.append(", timeEnabled=").append(timeEnabled);
        sb.append(", timeDisabled=").append(timeDisabled);
        sb.append(", timeElapsed=").append(timeElapsed);
        sb.append(", timeReset=").append(timeReset);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source Table: INNODB_METRICS")
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
        InnodbMetrics other = (InnodbMetrics) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSubsystem() == null ? other.getSubsystem() == null : this.getSubsystem().equals(other.getSubsystem()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getMaxCount() == null ? other.getMaxCount() == null : this.getMaxCount().equals(other.getMaxCount()))
            && (this.getMinCount() == null ? other.getMinCount() == null : this.getMinCount().equals(other.getMinCount()))
            && (this.getAvgCount() == null ? other.getAvgCount() == null : this.getAvgCount().equals(other.getAvgCount()))
            && (this.getCountReset() == null ? other.getCountReset() == null : this.getCountReset().equals(other.getCountReset()))
            && (this.getMaxCountReset() == null ? other.getMaxCountReset() == null : this.getMaxCountReset().equals(other.getMaxCountReset()))
            && (this.getMinCountReset() == null ? other.getMinCountReset() == null : this.getMinCountReset().equals(other.getMinCountReset()))
            && (this.getAvgCountReset() == null ? other.getAvgCountReset() == null : this.getAvgCountReset().equals(other.getAvgCountReset()))
            && (this.getTimeEnabled() == null ? other.getTimeEnabled() == null : this.getTimeEnabled().equals(other.getTimeEnabled()))
            && (this.getTimeDisabled() == null ? other.getTimeDisabled() == null : this.getTimeDisabled().equals(other.getTimeDisabled()))
            && (this.getTimeElapsed() == null ? other.getTimeElapsed() == null : this.getTimeElapsed().equals(other.getTimeElapsed()))
            && (this.getTimeReset() == null ? other.getTimeReset() == null : this.getTimeReset().equals(other.getTimeReset()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3950744+08:00", comments="Source Table: INNODB_METRICS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSubsystem() == null) ? 0 : getSubsystem().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getMaxCount() == null) ? 0 : getMaxCount().hashCode());
        result = prime * result + ((getMinCount() == null) ? 0 : getMinCount().hashCode());
        result = prime * result + ((getAvgCount() == null) ? 0 : getAvgCount().hashCode());
        result = prime * result + ((getCountReset() == null) ? 0 : getCountReset().hashCode());
        result = prime * result + ((getMaxCountReset() == null) ? 0 : getMaxCountReset().hashCode());
        result = prime * result + ((getMinCountReset() == null) ? 0 : getMinCountReset().hashCode());
        result = prime * result + ((getAvgCountReset() == null) ? 0 : getAvgCountReset().hashCode());
        result = prime * result + ((getTimeEnabled() == null) ? 0 : getTimeEnabled().hashCode());
        result = prime * result + ((getTimeDisabled() == null) ? 0 : getTimeDisabled().hashCode());
        result = prime * result + ((getTimeElapsed() == null) ? 0 : getTimeElapsed().hashCode());
        result = prime * result + ((getTimeReset() == null) ? 0 : getTimeReset().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        return result;
    }
}