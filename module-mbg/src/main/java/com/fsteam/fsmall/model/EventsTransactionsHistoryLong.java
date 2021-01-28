package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class EventsTransactionsHistoryLong implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: events_transactions_history_long.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: events_transactions_history_long.EVENT_ID")
    private Long eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: events_transactions_history_long.END_EVENT_ID")
    private Long endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.STATE")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TRX_ID")
    private Long trxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.GTID")
    private String gtid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_FORMAT_ID")
    private Integer xidFormatId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_GTRID")
    private String xidGtrid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_BQUAL")
    private String xidBqual;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XA_STATE")
    private String xaState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.SOURCE")
    private String source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_START")
    private Long timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_END")
    private Long timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_WAIT")
    private Long timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.ACCESS_MODE")
    private String accessMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.ISOLATION_LEVEL")
    private String isolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.AUTOCOMMIT")
    private String autocommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_SAVEPOINTS")
    private Long numberOfSavepoints;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_ROLLBACK_TO_SAVEPOINT")
    private Long numberOfRollbackToSavepoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_RELEASE_SAVEPOINT")
    private Long numberOfReleaseSavepoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NESTING_EVENT_ID")
    private Long nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NESTING_EVENT_TYPE")
    private String nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source Table: events_transactions_history_long")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: events_transactions_history_long.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: events_transactions_history_long.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: events_transactions_history_long.EVENT_ID")
    public Long getEventId() {
        return eventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: events_transactions_history_long.EVENT_ID")
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: events_transactions_history_long.END_EVENT_ID")
    public Long getEndEventId() {
        return endEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.END_EVENT_ID")
    public void setEndEventId(Long endEventId) {
        this.endEventId = endEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.STATE")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.STATE")
    public void setState(String state) {
        this.state = state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TRX_ID")
    public Long getTrxId() {
        return trxId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TRX_ID")
    public void setTrxId(Long trxId) {
        this.trxId = trxId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.GTID")
    public String getGtid() {
        return gtid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.GTID")
    public void setGtid(String gtid) {
        this.gtid = gtid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_FORMAT_ID")
    public Integer getXidFormatId() {
        return xidFormatId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_FORMAT_ID")
    public void setXidFormatId(Integer xidFormatId) {
        this.xidFormatId = xidFormatId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_GTRID")
    public String getXidGtrid() {
        return xidGtrid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_GTRID")
    public void setXidGtrid(String xidGtrid) {
        this.xidGtrid = xidGtrid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_BQUAL")
    public String getXidBqual() {
        return xidBqual;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_BQUAL")
    public void setXidBqual(String xidBqual) {
        this.xidBqual = xidBqual;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XA_STATE")
    public String getXaState() {
        return xaState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XA_STATE")
    public void setXaState(String xaState) {
        this.xaState = xaState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.SOURCE")
    public String getSource() {
        return source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.SOURCE")
    public void setSource(String source) {
        this.source = source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_START")
    public Long getTimerStart() {
        return timerStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_START")
    public void setTimerStart(Long timerStart) {
        this.timerStart = timerStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_END")
    public Long getTimerEnd() {
        return timerEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_END")
    public void setTimerEnd(Long timerEnd) {
        this.timerEnd = timerEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_WAIT")
    public Long getTimerWait() {
        return timerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_WAIT")
    public void setTimerWait(Long timerWait) {
        this.timerWait = timerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.ACCESS_MODE")
    public String getAccessMode() {
        return accessMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.ACCESS_MODE")
    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.ISOLATION_LEVEL")
    public String getIsolationLevel() {
        return isolationLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.ISOLATION_LEVEL")
    public void setIsolationLevel(String isolationLevel) {
        this.isolationLevel = isolationLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.AUTOCOMMIT")
    public String getAutocommit() {
        return autocommit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.AUTOCOMMIT")
    public void setAutocommit(String autocommit) {
        this.autocommit = autocommit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_SAVEPOINTS")
    public Long getNumberOfSavepoints() {
        return numberOfSavepoints;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_SAVEPOINTS")
    public void setNumberOfSavepoints(Long numberOfSavepoints) {
        this.numberOfSavepoints = numberOfSavepoints;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_ROLLBACK_TO_SAVEPOINT")
    public Long getNumberOfRollbackToSavepoint() {
        return numberOfRollbackToSavepoint;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_ROLLBACK_TO_SAVEPOINT")
    public void setNumberOfRollbackToSavepoint(Long numberOfRollbackToSavepoint) {
        this.numberOfRollbackToSavepoint = numberOfRollbackToSavepoint;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_RELEASE_SAVEPOINT")
    public Long getNumberOfReleaseSavepoint() {
        return numberOfReleaseSavepoint;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_RELEASE_SAVEPOINT")
    public void setNumberOfReleaseSavepoint(Long numberOfReleaseSavepoint) {
        this.numberOfReleaseSavepoint = numberOfReleaseSavepoint;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.OBJECT_INSTANCE_BEGIN")
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.OBJECT_INSTANCE_BEGIN")
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NESTING_EVENT_ID")
    public Long getNestingEventId() {
        return nestingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NESTING_EVENT_ID")
    public void setNestingEventId(Long nestingEventId) {
        this.nestingEventId = nestingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NESTING_EVENT_TYPE")
    public String getNestingEventType() {
        return nestingEventType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.NESTING_EVENT_TYPE")
    public void setNestingEventType(String nestingEventType) {
        this.nestingEventType = nestingEventType;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source Table: events_transactions_history_long")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", threadId=").append(threadId);
        sb.append(", eventId=").append(eventId);
        sb.append(", endEventId=").append(endEventId);
        sb.append(", eventName=").append(eventName);
        sb.append(", state=").append(state);
        sb.append(", trxId=").append(trxId);
        sb.append(", gtid=").append(gtid);
        sb.append(", xidFormatId=").append(xidFormatId);
        sb.append(", xidGtrid=").append(xidGtrid);
        sb.append(", xidBqual=").append(xidBqual);
        sb.append(", xaState=").append(xaState);
        sb.append(", source=").append(source);
        sb.append(", timerStart=").append(timerStart);
        sb.append(", timerEnd=").append(timerEnd);
        sb.append(", timerWait=").append(timerWait);
        sb.append(", accessMode=").append(accessMode);
        sb.append(", isolationLevel=").append(isolationLevel);
        sb.append(", autocommit=").append(autocommit);
        sb.append(", numberOfSavepoints=").append(numberOfSavepoints);
        sb.append(", numberOfRollbackToSavepoint=").append(numberOfRollbackToSavepoint);
        sb.append(", numberOfReleaseSavepoint=").append(numberOfReleaseSavepoint);
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", nestingEventId=").append(nestingEventId);
        sb.append(", nestingEventType=").append(nestingEventType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source Table: events_transactions_history_long")
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
        EventsTransactionsHistoryLong other = (EventsTransactionsHistoryLong) that;
        return (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getEventId() == null ? other.getEventId() == null : this.getEventId().equals(other.getEventId()))
            && (this.getEndEventId() == null ? other.getEndEventId() == null : this.getEndEventId().equals(other.getEndEventId()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getTrxId() == null ? other.getTrxId() == null : this.getTrxId().equals(other.getTrxId()))
            && (this.getGtid() == null ? other.getGtid() == null : this.getGtid().equals(other.getGtid()))
            && (this.getXidFormatId() == null ? other.getXidFormatId() == null : this.getXidFormatId().equals(other.getXidFormatId()))
            && (this.getXidGtrid() == null ? other.getXidGtrid() == null : this.getXidGtrid().equals(other.getXidGtrid()))
            && (this.getXidBqual() == null ? other.getXidBqual() == null : this.getXidBqual().equals(other.getXidBqual()))
            && (this.getXaState() == null ? other.getXaState() == null : this.getXaState().equals(other.getXaState()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getTimerStart() == null ? other.getTimerStart() == null : this.getTimerStart().equals(other.getTimerStart()))
            && (this.getTimerEnd() == null ? other.getTimerEnd() == null : this.getTimerEnd().equals(other.getTimerEnd()))
            && (this.getTimerWait() == null ? other.getTimerWait() == null : this.getTimerWait().equals(other.getTimerWait()))
            && (this.getAccessMode() == null ? other.getAccessMode() == null : this.getAccessMode().equals(other.getAccessMode()))
            && (this.getIsolationLevel() == null ? other.getIsolationLevel() == null : this.getIsolationLevel().equals(other.getIsolationLevel()))
            && (this.getAutocommit() == null ? other.getAutocommit() == null : this.getAutocommit().equals(other.getAutocommit()))
            && (this.getNumberOfSavepoints() == null ? other.getNumberOfSavepoints() == null : this.getNumberOfSavepoints().equals(other.getNumberOfSavepoints()))
            && (this.getNumberOfRollbackToSavepoint() == null ? other.getNumberOfRollbackToSavepoint() == null : this.getNumberOfRollbackToSavepoint().equals(other.getNumberOfRollbackToSavepoint()))
            && (this.getNumberOfReleaseSavepoint() == null ? other.getNumberOfReleaseSavepoint() == null : this.getNumberOfReleaseSavepoint().equals(other.getNumberOfReleaseSavepoint()))
            && (this.getObjectInstanceBegin() == null ? other.getObjectInstanceBegin() == null : this.getObjectInstanceBegin().equals(other.getObjectInstanceBegin()))
            && (this.getNestingEventId() == null ? other.getNestingEventId() == null : this.getNestingEventId().equals(other.getNestingEventId()))
            && (this.getNestingEventType() == null ? other.getNestingEventType() == null : this.getNestingEventType().equals(other.getNestingEventType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source Table: events_transactions_history_long")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getEventId() == null) ? 0 : getEventId().hashCode());
        result = prime * result + ((getEndEventId() == null) ? 0 : getEndEventId().hashCode());
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getTrxId() == null) ? 0 : getTrxId().hashCode());
        result = prime * result + ((getGtid() == null) ? 0 : getGtid().hashCode());
        result = prime * result + ((getXidFormatId() == null) ? 0 : getXidFormatId().hashCode());
        result = prime * result + ((getXidGtrid() == null) ? 0 : getXidGtrid().hashCode());
        result = prime * result + ((getXidBqual() == null) ? 0 : getXidBqual().hashCode());
        result = prime * result + ((getXaState() == null) ? 0 : getXaState().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getTimerStart() == null) ? 0 : getTimerStart().hashCode());
        result = prime * result + ((getTimerEnd() == null) ? 0 : getTimerEnd().hashCode());
        result = prime * result + ((getTimerWait() == null) ? 0 : getTimerWait().hashCode());
        result = prime * result + ((getAccessMode() == null) ? 0 : getAccessMode().hashCode());
        result = prime * result + ((getIsolationLevel() == null) ? 0 : getIsolationLevel().hashCode());
        result = prime * result + ((getAutocommit() == null) ? 0 : getAutocommit().hashCode());
        result = prime * result + ((getNumberOfSavepoints() == null) ? 0 : getNumberOfSavepoints().hashCode());
        result = prime * result + ((getNumberOfRollbackToSavepoint() == null) ? 0 : getNumberOfRollbackToSavepoint().hashCode());
        result = prime * result + ((getNumberOfReleaseSavepoint() == null) ? 0 : getNumberOfReleaseSavepoint().hashCode());
        result = prime * result + ((getObjectInstanceBegin() == null) ? 0 : getObjectInstanceBegin().hashCode());
        result = prime * result + ((getNestingEventId() == null) ? 0 : getNestingEventId().hashCode());
        result = prime * result + ((getNestingEventType() == null) ? 0 : getNestingEventType().hashCode());
        return result;
    }
}