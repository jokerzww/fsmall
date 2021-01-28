package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class EventsWaitsCurrent implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.212909+08:00", comments="Source field: events_waits_current.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.EVENT_ID")
    private Long eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.END_EVENT_ID")
    private Long endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.SOURCE")
    private String source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.TIMER_START")
    private Long timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.TIMER_END")
    private Long timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.TIMER_WAIT")
    private Long timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.SPINS")
    private Integer spins;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_SCHEMA")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_NAME")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.INDEX_NAME")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_TYPE")
    private String objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.NESTING_EVENT_ID")
    private Long nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.NESTING_EVENT_TYPE")
    private String nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OPERATION")
    private String operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.NUMBER_OF_BYTES")
    private Long numberOfBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.FLAGS")
    private Integer flags;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source Table: events_waits_current")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.212909+08:00", comments="Source field: events_waits_current.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.EVENT_ID")
    public Long getEventId() {
        return eventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.EVENT_ID")
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.END_EVENT_ID")
    public Long getEndEventId() {
        return endEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.END_EVENT_ID")
    public void setEndEventId(Long endEventId) {
        this.endEventId = endEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.SOURCE")
    public String getSource() {
        return source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.SOURCE")
    public void setSource(String source) {
        this.source = source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.TIMER_START")
    public Long getTimerStart() {
        return timerStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.TIMER_START")
    public void setTimerStart(Long timerStart) {
        this.timerStart = timerStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.TIMER_END")
    public Long getTimerEnd() {
        return timerEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.TIMER_END")
    public void setTimerEnd(Long timerEnd) {
        this.timerEnd = timerEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.TIMER_WAIT")
    public Long getTimerWait() {
        return timerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.TIMER_WAIT")
    public void setTimerWait(Long timerWait) {
        this.timerWait = timerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.SPINS")
    public Integer getSpins() {
        return spins;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.SPINS")
    public void setSpins(Integer spins) {
        this.spins = spins;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_SCHEMA")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_SCHEMA")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_NAME")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_NAME")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.INDEX_NAME")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.INDEX_NAME")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_TYPE")
    public String getObjectType() {
        return objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_TYPE")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_INSTANCE_BEGIN")
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OBJECT_INSTANCE_BEGIN")
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.NESTING_EVENT_ID")
    public Long getNestingEventId() {
        return nestingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.NESTING_EVENT_ID")
    public void setNestingEventId(Long nestingEventId) {
        this.nestingEventId = nestingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.NESTING_EVENT_TYPE")
    public String getNestingEventType() {
        return nestingEventType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.NESTING_EVENT_TYPE")
    public void setNestingEventType(String nestingEventType) {
        this.nestingEventType = nestingEventType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OPERATION")
    public String getOperation() {
        return operation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.OPERATION")
    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.NUMBER_OF_BYTES")
    public Long getNumberOfBytes() {
        return numberOfBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.NUMBER_OF_BYTES")
    public void setNumberOfBytes(Long numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.FLAGS")
    public Integer getFlags() {
        return flags;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.FLAGS")
    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source Table: events_waits_current")
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
        sb.append(", spins=").append(spins);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", indexName=").append(indexName);
        sb.append(", objectType=").append(objectType);
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", nestingEventId=").append(nestingEventId);
        sb.append(", nestingEventType=").append(nestingEventType);
        sb.append(", operation=").append(operation);
        sb.append(", numberOfBytes=").append(numberOfBytes);
        sb.append(", flags=").append(flags);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source Table: events_waits_current")
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
        EventsWaitsCurrent other = (EventsWaitsCurrent) that;
        return (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getEventId() == null ? other.getEventId() == null : this.getEventId().equals(other.getEventId()))
            && (this.getEndEventId() == null ? other.getEndEventId() == null : this.getEndEventId().equals(other.getEndEventId()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getTimerStart() == null ? other.getTimerStart() == null : this.getTimerStart().equals(other.getTimerStart()))
            && (this.getTimerEnd() == null ? other.getTimerEnd() == null : this.getTimerEnd().equals(other.getTimerEnd()))
            && (this.getTimerWait() == null ? other.getTimerWait() == null : this.getTimerWait().equals(other.getTimerWait()))
            && (this.getSpins() == null ? other.getSpins() == null : this.getSpins().equals(other.getSpins()))
            && (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getIndexName() == null ? other.getIndexName() == null : this.getIndexName().equals(other.getIndexName()))
            && (this.getObjectType() == null ? other.getObjectType() == null : this.getObjectType().equals(other.getObjectType()))
            && (this.getObjectInstanceBegin() == null ? other.getObjectInstanceBegin() == null : this.getObjectInstanceBegin().equals(other.getObjectInstanceBegin()))
            && (this.getNestingEventId() == null ? other.getNestingEventId() == null : this.getNestingEventId().equals(other.getNestingEventId()))
            && (this.getNestingEventType() == null ? other.getNestingEventType() == null : this.getNestingEventType().equals(other.getNestingEventType()))
            && (this.getOperation() == null ? other.getOperation() == null : this.getOperation().equals(other.getOperation()))
            && (this.getNumberOfBytes() == null ? other.getNumberOfBytes() == null : this.getNumberOfBytes().equals(other.getNumberOfBytes()))
            && (this.getFlags() == null ? other.getFlags() == null : this.getFlags().equals(other.getFlags()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source Table: events_waits_current")
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
        result = prime * result + ((getSpins() == null) ? 0 : getSpins().hashCode());
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        result = prime * result + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        result = prime * result + ((getObjectInstanceBegin() == null) ? 0 : getObjectInstanceBegin().hashCode());
        result = prime * result + ((getNestingEventId() == null) ? 0 : getNestingEventId().hashCode());
        result = prime * result + ((getNestingEventType() == null) ? 0 : getNestingEventType().hashCode());
        result = prime * result + ((getOperation() == null) ? 0 : getOperation().hashCode());
        result = prime * result + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes().hashCode());
        result = prime * result + ((getFlags() == null) ? 0 : getFlags().hashCode());
        return result;
    }
}