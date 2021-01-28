package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class EventsErrorsSummaryByHostByError implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.HOST")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.ERROR_NUMBER")
    private Integer errorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.ERROR_NAME")
    private String errorName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.SQL_STATE")
    private String sqlState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.SUM_ERROR_RAISED")
    private Long sumErrorRaised;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED")
    private Long sumErrorHandled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.FIRST_SEEN")
    private Date firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.LAST_SEEN")
    private Date lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: events_errors_summary_by_host_by_error")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.HOST")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.HOST")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.ERROR_NUMBER")
    public Integer getErrorNumber() {
        return errorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.ERROR_NUMBER")
    public void setErrorNumber(Integer errorNumber) {
        this.errorNumber = errorNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.ERROR_NAME")
    public String getErrorName() {
        return errorName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.ERROR_NAME")
    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.SQL_STATE")
    public String getSqlState() {
        return sqlState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.SQL_STATE")
    public void setSqlState(String sqlState) {
        this.sqlState = sqlState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.SUM_ERROR_RAISED")
    public Long getSumErrorRaised() {
        return sumErrorRaised;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.SUM_ERROR_RAISED")
    public void setSumErrorRaised(Long sumErrorRaised) {
        this.sumErrorRaised = sumErrorRaised;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED")
    public Long getSumErrorHandled() {
        return sumErrorHandled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED")
    public void setSumErrorHandled(Long sumErrorHandled) {
        this.sumErrorHandled = sumErrorHandled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.FIRST_SEEN")
    public Date getFirstSeen() {
        return firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.FIRST_SEEN")
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.LAST_SEEN")
    public Date getLastSeen() {
        return lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.LAST_SEEN")
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: events_errors_summary_by_host_by_error")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", errorNumber=").append(errorNumber);
        sb.append(", errorName=").append(errorName);
        sb.append(", sqlState=").append(sqlState);
        sb.append(", sumErrorRaised=").append(sumErrorRaised);
        sb.append(", sumErrorHandled=").append(sumErrorHandled);
        sb.append(", firstSeen=").append(firstSeen);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: events_errors_summary_by_host_by_error")
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
        EventsErrorsSummaryByHostByError other = (EventsErrorsSummaryByHostByError) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getErrorNumber() == null ? other.getErrorNumber() == null : this.getErrorNumber().equals(other.getErrorNumber()))
            && (this.getErrorName() == null ? other.getErrorName() == null : this.getErrorName().equals(other.getErrorName()))
            && (this.getSqlState() == null ? other.getSqlState() == null : this.getSqlState().equals(other.getSqlState()))
            && (this.getSumErrorRaised() == null ? other.getSumErrorRaised() == null : this.getSumErrorRaised().equals(other.getSumErrorRaised()))
            && (this.getSumErrorHandled() == null ? other.getSumErrorHandled() == null : this.getSumErrorHandled().equals(other.getSumErrorHandled()))
            && (this.getFirstSeen() == null ? other.getFirstSeen() == null : this.getFirstSeen().equals(other.getFirstSeen()))
            && (this.getLastSeen() == null ? other.getLastSeen() == null : this.getLastSeen().equals(other.getLastSeen()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: events_errors_summary_by_host_by_error")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getErrorNumber() == null) ? 0 : getErrorNumber().hashCode());
        result = prime * result + ((getErrorName() == null) ? 0 : getErrorName().hashCode());
        result = prime * result + ((getSqlState() == null) ? 0 : getSqlState().hashCode());
        result = prime * result + ((getSumErrorRaised() == null) ? 0 : getSumErrorRaised().hashCode());
        result = prime * result + ((getSumErrorHandled() == null) ? 0 : getSumErrorHandled().hashCode());
        result = prime * result + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        result = prime * result + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        return result;
    }
}