package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class EventsStagesSummaryByThreadByEventName implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.COUNT_STAR")
    private Long countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.SUM_TIMER_WAIT")
    private Long sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.MIN_TIMER_WAIT")
    private Long minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.AVG_TIMER_WAIT")
    private Long avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.MAX_TIMER_WAIT")
    private Long maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source Table: events_stages_summary_by_thread_by_event_name")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.COUNT_STAR")
    public Long getCountStar() {
        return countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.COUNT_STAR")
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.SUM_TIMER_WAIT")
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.SUM_TIMER_WAIT")
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.MIN_TIMER_WAIT")
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.MIN_TIMER_WAIT")
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.AVG_TIMER_WAIT")
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.AVG_TIMER_WAIT")
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.MAX_TIMER_WAIT")
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.MAX_TIMER_WAIT")
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source Table: events_stages_summary_by_thread_by_event_name")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", threadId=").append(threadId);
        sb.append(", eventName=").append(eventName);
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
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source Table: events_stages_summary_by_thread_by_event_name")
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
        EventsStagesSummaryByThreadByEventName other = (EventsStagesSummaryByThreadByEventName) that;
        return (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getCountStar() == null ? other.getCountStar() == null : this.getCountStar().equals(other.getCountStar()))
            && (this.getSumTimerWait() == null ? other.getSumTimerWait() == null : this.getSumTimerWait().equals(other.getSumTimerWait()))
            && (this.getMinTimerWait() == null ? other.getMinTimerWait() == null : this.getMinTimerWait().equals(other.getMinTimerWait()))
            && (this.getAvgTimerWait() == null ? other.getAvgTimerWait() == null : this.getAvgTimerWait().equals(other.getAvgTimerWait()))
            && (this.getMaxTimerWait() == null ? other.getMaxTimerWait() == null : this.getMaxTimerWait().equals(other.getMaxTimerWait()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source Table: events_stages_summary_by_thread_by_event_name")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getCountStar() == null) ? 0 : getCountStar().hashCode());
        result = prime * result + ((getSumTimerWait() == null) ? 0 : getSumTimerWait().hashCode());
        result = prime * result + ((getMinTimerWait() == null) ? 0 : getMinTimerWait().hashCode());
        result = prime * result + ((getAvgTimerWait() == null) ? 0 : getAvgTimerWait().hashCode());
        result = prime * result + ((getMaxTimerWait() == null) ? 0 : getMaxTimerWait().hashCode());
        return result;
    }
}