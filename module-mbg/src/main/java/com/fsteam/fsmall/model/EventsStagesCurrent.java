package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class EventsStagesCurrent implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.EVENT_ID")
    private Long eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.END_EVENT_ID")
    private Long endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.SOURCE")
    private String source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.TIMER_START")
    private Long timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.TIMER_END")
    private Long timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.TIMER_WAIT")
    private Long timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.WORK_COMPLETED")
    private Long workCompleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.WORK_ESTIMATED")
    private Long workEstimated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.NESTING_EVENT_ID")
    private Long nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.NESTING_EVENT_TYPE")
    private String nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: events_stages_current")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.EVENT_ID")
    public Long getEventId() {
        return eventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.EVENT_ID")
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.END_EVENT_ID")
    public Long getEndEventId() {
        return endEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.END_EVENT_ID")
    public void setEndEventId(Long endEventId) {
        this.endEventId = endEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.SOURCE")
    public String getSource() {
        return source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.SOURCE")
    public void setSource(String source) {
        this.source = source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.TIMER_START")
    public Long getTimerStart() {
        return timerStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.TIMER_START")
    public void setTimerStart(Long timerStart) {
        this.timerStart = timerStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.TIMER_END")
    public Long getTimerEnd() {
        return timerEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.TIMER_END")
    public void setTimerEnd(Long timerEnd) {
        this.timerEnd = timerEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.TIMER_WAIT")
    public Long getTimerWait() {
        return timerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.TIMER_WAIT")
    public void setTimerWait(Long timerWait) {
        this.timerWait = timerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.WORK_COMPLETED")
    public Long getWorkCompleted() {
        return workCompleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.WORK_COMPLETED")
    public void setWorkCompleted(Long workCompleted) {
        this.workCompleted = workCompleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.WORK_ESTIMATED")
    public Long getWorkEstimated() {
        return workEstimated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.WORK_ESTIMATED")
    public void setWorkEstimated(Long workEstimated) {
        this.workEstimated = workEstimated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.NESTING_EVENT_ID")
    public Long getNestingEventId() {
        return nestingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.NESTING_EVENT_ID")
    public void setNestingEventId(Long nestingEventId) {
        this.nestingEventId = nestingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.NESTING_EVENT_TYPE")
    public String getNestingEventType() {
        return nestingEventType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source field: events_stages_current.NESTING_EVENT_TYPE")
    public void setNestingEventType(String nestingEventType) {
        this.nestingEventType = nestingEventType;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: events_stages_current")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", threadId=").append(threadId);
        sb.append(", eventId=").append(eventId);
        sb.append(", endEventId=").append(endEventId);
        sb.append(", eventName=").append(eventName);
        sb.append(", source=").append(source);
        sb.append(", timerStart=").append(timerStart);
        sb.append(", timerEnd=").append(timerEnd);
        sb.append(", timerWait=").append(timerWait);
        sb.append(", workCompleted=").append(workCompleted);
        sb.append(", workEstimated=").append(workEstimated);
        sb.append(", nestingEventId=").append(nestingEventId);
        sb.append(", nestingEventType=").append(nestingEventType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: events_stages_current")
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
        EventsStagesCurrent other = (EventsStagesCurrent) that;
        return (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getEventId() == null ? other.getEventId() == null : this.getEventId().equals(other.getEventId()))
            && (this.getEndEventId() == null ? other.getEndEventId() == null : this.getEndEventId().equals(other.getEndEventId()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getTimerStart() == null ? other.getTimerStart() == null : this.getTimerStart().equals(other.getTimerStart()))
            && (this.getTimerEnd() == null ? other.getTimerEnd() == null : this.getTimerEnd().equals(other.getTimerEnd()))
            && (this.getTimerWait() == null ? other.getTimerWait() == null : this.getTimerWait().equals(other.getTimerWait()))
            && (this.getWorkCompleted() == null ? other.getWorkCompleted() == null : this.getWorkCompleted().equals(other.getWorkCompleted()))
            && (this.getWorkEstimated() == null ? other.getWorkEstimated() == null : this.getWorkEstimated().equals(other.getWorkEstimated()))
            && (this.getNestingEventId() == null ? other.getNestingEventId() == null : this.getNestingEventId().equals(other.getNestingEventId()))
            && (this.getNestingEventType() == null ? other.getNestingEventType() == null : this.getNestingEventType().equals(other.getNestingEventType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: events_stages_current")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getEventId() == null) ? 0 : getEventId().hashCode());
        result = prime * result + ((getEndEventId() == null) ? 0 : getEndEventId().hashCode());
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getTimerStart() == null) ? 0 : getTimerStart().hashCode());
        result = prime * result + ((getTimerEnd() == null) ? 0 : getTimerEnd().hashCode());
        result = prime * result + ((getTimerWait() == null) ? 0 : getTimerWait().hashCode());
        result = prime * result + ((getWorkCompleted() == null) ? 0 : getWorkCompleted().hashCode());
        result = prime * result + ((getWorkEstimated() == null) ? 0 : getWorkEstimated().hashCode());
        result = prime * result + ((getNestingEventId() == null) ? 0 : getNestingEventId().hashCode());
        result = prime * result + ((getNestingEventType() == null) ? 0 : getNestingEventType().hashCode());
        return result;
    }
}