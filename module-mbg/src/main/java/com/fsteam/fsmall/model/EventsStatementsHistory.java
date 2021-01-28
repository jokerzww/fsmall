package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class EventsStatementsHistory implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.EVENT_ID")
    private Long eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.END_EVENT_ID")
    private Long endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.SOURCE")
    private String source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.TIMER_START")
    private Long timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.TIMER_END")
    private Long timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.TIMER_WAIT")
    private Long timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.LOCK_TIME")
    private Long lockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.DIGEST")
    private String digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.CURRENT_SCHEMA")
    private String currentSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_TYPE")
    private String objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_SCHEMA")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_NAME")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.MYSQL_ERRNO")
    private Integer mysqlErrno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.RETURNED_SQLSTATE")
    private String returnedSqlstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.MESSAGE_TEXT")
    private String messageText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ERRORS")
    private Long errors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.WARNINGS")
    private Long warnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ROWS_AFFECTED")
    private Long rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ROWS_SENT")
    private Long rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ROWS_EXAMINED")
    private Long rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.CREATED_TMP_DISK_TABLES")
    private Long createdTmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.CREATED_TMP_TABLES")
    private Long createdTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.SELECT_FULL_JOIN")
    private Long selectFullJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_FULL_RANGE_JOIN")
    private Long selectFullRangeJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_RANGE")
    private Long selectRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_RANGE_CHECK")
    private Long selectRangeCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_SCAN")
    private Long selectScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_MERGE_PASSES")
    private Long sortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_RANGE")
    private Long sortRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_ROWS")
    private Long sortRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_SCAN")
    private Long sortScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NO_INDEX_USED")
    private Long noIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NO_GOOD_INDEX_USED")
    private Long noGoodIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NESTING_EVENT_ID")
    private Long nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NESTING_EVENT_TYPE")
    private String nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NESTING_EVENT_LEVEL")
    private Integer nestingEventLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.STATEMENT_ID")
    private Long statementId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SQL_TEXT")
    private String sqlText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.DIGEST_TEXT")
    private String digestText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source Table: events_statements_history")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.EVENT_ID")
    public Long getEventId() {
        return eventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.EVENT_ID")
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.END_EVENT_ID")
    public Long getEndEventId() {
        return endEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.END_EVENT_ID")
    public void setEndEventId(Long endEventId) {
        this.endEventId = endEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.SOURCE")
    public String getSource() {
        return source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.SOURCE")
    public void setSource(String source) {
        this.source = source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.TIMER_START")
    public Long getTimerStart() {
        return timerStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.TIMER_START")
    public void setTimerStart(Long timerStart) {
        this.timerStart = timerStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.TIMER_END")
    public Long getTimerEnd() {
        return timerEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.TIMER_END")
    public void setTimerEnd(Long timerEnd) {
        this.timerEnd = timerEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.TIMER_WAIT")
    public Long getTimerWait() {
        return timerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.TIMER_WAIT")
    public void setTimerWait(Long timerWait) {
        this.timerWait = timerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.LOCK_TIME")
    public Long getLockTime() {
        return lockTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.LOCK_TIME")
    public void setLockTime(Long lockTime) {
        this.lockTime = lockTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.DIGEST")
    public String getDigest() {
        return digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.DIGEST")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.CURRENT_SCHEMA")
    public String getCurrentSchema() {
        return currentSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.CURRENT_SCHEMA")
    public void setCurrentSchema(String currentSchema) {
        this.currentSchema = currentSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_TYPE")
    public String getObjectType() {
        return objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_TYPE")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_SCHEMA")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_SCHEMA")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_NAME")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_NAME")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_INSTANCE_BEGIN")
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.OBJECT_INSTANCE_BEGIN")
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.MYSQL_ERRNO")
    public Integer getMysqlErrno() {
        return mysqlErrno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.MYSQL_ERRNO")
    public void setMysqlErrno(Integer mysqlErrno) {
        this.mysqlErrno = mysqlErrno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.RETURNED_SQLSTATE")
    public String getReturnedSqlstate() {
        return returnedSqlstate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.RETURNED_SQLSTATE")
    public void setReturnedSqlstate(String returnedSqlstate) {
        this.returnedSqlstate = returnedSqlstate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.MESSAGE_TEXT")
    public String getMessageText() {
        return messageText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.MESSAGE_TEXT")
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ERRORS")
    public Long getErrors() {
        return errors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ERRORS")
    public void setErrors(Long errors) {
        this.errors = errors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.WARNINGS")
    public Long getWarnings() {
        return warnings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.WARNINGS")
    public void setWarnings(Long warnings) {
        this.warnings = warnings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ROWS_AFFECTED")
    public Long getRowsAffected() {
        return rowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ROWS_AFFECTED")
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ROWS_SENT")
    public Long getRowsSent() {
        return rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ROWS_SENT")
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ROWS_EXAMINED")
    public Long getRowsExamined() {
        return rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.ROWS_EXAMINED")
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.CREATED_TMP_DISK_TABLES")
    public Long getCreatedTmpDiskTables() {
        return createdTmpDiskTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.CREATED_TMP_DISK_TABLES")
    public void setCreatedTmpDiskTables(Long createdTmpDiskTables) {
        this.createdTmpDiskTables = createdTmpDiskTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.CREATED_TMP_TABLES")
    public Long getCreatedTmpTables() {
        return createdTmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.546214+08:00", comments="Source field: events_statements_history.CREATED_TMP_TABLES")
    public void setCreatedTmpTables(Long createdTmpTables) {
        this.createdTmpTables = createdTmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_FULL_JOIN")
    public Long getSelectFullJoin() {
        return selectFullJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_FULL_JOIN")
    public void setSelectFullJoin(Long selectFullJoin) {
        this.selectFullJoin = selectFullJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_FULL_RANGE_JOIN")
    public Long getSelectFullRangeJoin() {
        return selectFullRangeJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_FULL_RANGE_JOIN")
    public void setSelectFullRangeJoin(Long selectFullRangeJoin) {
        this.selectFullRangeJoin = selectFullRangeJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_RANGE")
    public Long getSelectRange() {
        return selectRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_RANGE")
    public void setSelectRange(Long selectRange) {
        this.selectRange = selectRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_RANGE_CHECK")
    public Long getSelectRangeCheck() {
        return selectRangeCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_RANGE_CHECK")
    public void setSelectRangeCheck(Long selectRangeCheck) {
        this.selectRangeCheck = selectRangeCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_SCAN")
    public Long getSelectScan() {
        return selectScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SELECT_SCAN")
    public void setSelectScan(Long selectScan) {
        this.selectScan = selectScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_MERGE_PASSES")
    public Long getSortMergePasses() {
        return sortMergePasses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_MERGE_PASSES")
    public void setSortMergePasses(Long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_RANGE")
    public Long getSortRange() {
        return sortRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_RANGE")
    public void setSortRange(Long sortRange) {
        this.sortRange = sortRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_ROWS")
    public Long getSortRows() {
        return sortRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_ROWS")
    public void setSortRows(Long sortRows) {
        this.sortRows = sortRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_SCAN")
    public Long getSortScan() {
        return sortScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SORT_SCAN")
    public void setSortScan(Long sortScan) {
        this.sortScan = sortScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NO_INDEX_USED")
    public Long getNoIndexUsed() {
        return noIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NO_INDEX_USED")
    public void setNoIndexUsed(Long noIndexUsed) {
        this.noIndexUsed = noIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NO_GOOD_INDEX_USED")
    public Long getNoGoodIndexUsed() {
        return noGoodIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NO_GOOD_INDEX_USED")
    public void setNoGoodIndexUsed(Long noGoodIndexUsed) {
        this.noGoodIndexUsed = noGoodIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NESTING_EVENT_ID")
    public Long getNestingEventId() {
        return nestingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NESTING_EVENT_ID")
    public void setNestingEventId(Long nestingEventId) {
        this.nestingEventId = nestingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NESTING_EVENT_TYPE")
    public String getNestingEventType() {
        return nestingEventType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NESTING_EVENT_TYPE")
    public void setNestingEventType(String nestingEventType) {
        this.nestingEventType = nestingEventType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NESTING_EVENT_LEVEL")
    public Integer getNestingEventLevel() {
        return nestingEventLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.NESTING_EVENT_LEVEL")
    public void setNestingEventLevel(Integer nestingEventLevel) {
        this.nestingEventLevel = nestingEventLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.STATEMENT_ID")
    public Long getStatementId() {
        return statementId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.STATEMENT_ID")
    public void setStatementId(Long statementId) {
        this.statementId = statementId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SQL_TEXT")
    public String getSqlText() {
        return sqlText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SQL_TEXT")
    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.DIGEST_TEXT")
    public String getDigestText() {
        return digestText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.DIGEST_TEXT")
    public void setDigestText(String digestText) {
        this.digestText = digestText;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source Table: events_statements_history")
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
        sb.append(", lockTime=").append(lockTime);
        sb.append(", digest=").append(digest);
        sb.append(", currentSchema=").append(currentSchema);
        sb.append(", objectType=").append(objectType);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", mysqlErrno=").append(mysqlErrno);
        sb.append(", returnedSqlstate=").append(returnedSqlstate);
        sb.append(", messageText=").append(messageText);
        sb.append(", errors=").append(errors);
        sb.append(", warnings=").append(warnings);
        sb.append(", rowsAffected=").append(rowsAffected);
        sb.append(", rowsSent=").append(rowsSent);
        sb.append(", rowsExamined=").append(rowsExamined);
        sb.append(", createdTmpDiskTables=").append(createdTmpDiskTables);
        sb.append(", createdTmpTables=").append(createdTmpTables);
        sb.append(", selectFullJoin=").append(selectFullJoin);
        sb.append(", selectFullRangeJoin=").append(selectFullRangeJoin);
        sb.append(", selectRange=").append(selectRange);
        sb.append(", selectRangeCheck=").append(selectRangeCheck);
        sb.append(", selectScan=").append(selectScan);
        sb.append(", sortMergePasses=").append(sortMergePasses);
        sb.append(", sortRange=").append(sortRange);
        sb.append(", sortRows=").append(sortRows);
        sb.append(", sortScan=").append(sortScan);
        sb.append(", noIndexUsed=").append(noIndexUsed);
        sb.append(", noGoodIndexUsed=").append(noGoodIndexUsed);
        sb.append(", nestingEventId=").append(nestingEventId);
        sb.append(", nestingEventType=").append(nestingEventType);
        sb.append(", nestingEventLevel=").append(nestingEventLevel);
        sb.append(", statementId=").append(statementId);
        sb.append(", sqlText=").append(sqlText);
        sb.append(", digestText=").append(digestText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source Table: events_statements_history")
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
        EventsStatementsHistory other = (EventsStatementsHistory) that;
        return (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getEventId() == null ? other.getEventId() == null : this.getEventId().equals(other.getEventId()))
            && (this.getEndEventId() == null ? other.getEndEventId() == null : this.getEndEventId().equals(other.getEndEventId()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getTimerStart() == null ? other.getTimerStart() == null : this.getTimerStart().equals(other.getTimerStart()))
            && (this.getTimerEnd() == null ? other.getTimerEnd() == null : this.getTimerEnd().equals(other.getTimerEnd()))
            && (this.getTimerWait() == null ? other.getTimerWait() == null : this.getTimerWait().equals(other.getTimerWait()))
            && (this.getLockTime() == null ? other.getLockTime() == null : this.getLockTime().equals(other.getLockTime()))
            && (this.getDigest() == null ? other.getDigest() == null : this.getDigest().equals(other.getDigest()))
            && (this.getCurrentSchema() == null ? other.getCurrentSchema() == null : this.getCurrentSchema().equals(other.getCurrentSchema()))
            && (this.getObjectType() == null ? other.getObjectType() == null : this.getObjectType().equals(other.getObjectType()))
            && (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getObjectInstanceBegin() == null ? other.getObjectInstanceBegin() == null : this.getObjectInstanceBegin().equals(other.getObjectInstanceBegin()))
            && (this.getMysqlErrno() == null ? other.getMysqlErrno() == null : this.getMysqlErrno().equals(other.getMysqlErrno()))
            && (this.getReturnedSqlstate() == null ? other.getReturnedSqlstate() == null : this.getReturnedSqlstate().equals(other.getReturnedSqlstate()))
            && (this.getMessageText() == null ? other.getMessageText() == null : this.getMessageText().equals(other.getMessageText()))
            && (this.getErrors() == null ? other.getErrors() == null : this.getErrors().equals(other.getErrors()))
            && (this.getWarnings() == null ? other.getWarnings() == null : this.getWarnings().equals(other.getWarnings()))
            && (this.getRowsAffected() == null ? other.getRowsAffected() == null : this.getRowsAffected().equals(other.getRowsAffected()))
            && (this.getRowsSent() == null ? other.getRowsSent() == null : this.getRowsSent().equals(other.getRowsSent()))
            && (this.getRowsExamined() == null ? other.getRowsExamined() == null : this.getRowsExamined().equals(other.getRowsExamined()))
            && (this.getCreatedTmpDiskTables() == null ? other.getCreatedTmpDiskTables() == null : this.getCreatedTmpDiskTables().equals(other.getCreatedTmpDiskTables()))
            && (this.getCreatedTmpTables() == null ? other.getCreatedTmpTables() == null : this.getCreatedTmpTables().equals(other.getCreatedTmpTables()))
            && (this.getSelectFullJoin() == null ? other.getSelectFullJoin() == null : this.getSelectFullJoin().equals(other.getSelectFullJoin()))
            && (this.getSelectFullRangeJoin() == null ? other.getSelectFullRangeJoin() == null : this.getSelectFullRangeJoin().equals(other.getSelectFullRangeJoin()))
            && (this.getSelectRange() == null ? other.getSelectRange() == null : this.getSelectRange().equals(other.getSelectRange()))
            && (this.getSelectRangeCheck() == null ? other.getSelectRangeCheck() == null : this.getSelectRangeCheck().equals(other.getSelectRangeCheck()))
            && (this.getSelectScan() == null ? other.getSelectScan() == null : this.getSelectScan().equals(other.getSelectScan()))
            && (this.getSortMergePasses() == null ? other.getSortMergePasses() == null : this.getSortMergePasses().equals(other.getSortMergePasses()))
            && (this.getSortRange() == null ? other.getSortRange() == null : this.getSortRange().equals(other.getSortRange()))
            && (this.getSortRows() == null ? other.getSortRows() == null : this.getSortRows().equals(other.getSortRows()))
            && (this.getSortScan() == null ? other.getSortScan() == null : this.getSortScan().equals(other.getSortScan()))
            && (this.getNoIndexUsed() == null ? other.getNoIndexUsed() == null : this.getNoIndexUsed().equals(other.getNoIndexUsed()))
            && (this.getNoGoodIndexUsed() == null ? other.getNoGoodIndexUsed() == null : this.getNoGoodIndexUsed().equals(other.getNoGoodIndexUsed()))
            && (this.getNestingEventId() == null ? other.getNestingEventId() == null : this.getNestingEventId().equals(other.getNestingEventId()))
            && (this.getNestingEventType() == null ? other.getNestingEventType() == null : this.getNestingEventType().equals(other.getNestingEventType()))
            && (this.getNestingEventLevel() == null ? other.getNestingEventLevel() == null : this.getNestingEventLevel().equals(other.getNestingEventLevel()))
            && (this.getStatementId() == null ? other.getStatementId() == null : this.getStatementId().equals(other.getStatementId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source Table: events_statements_history")
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
        result = prime * result + ((getLockTime() == null) ? 0 : getLockTime().hashCode());
        result = prime * result + ((getDigest() == null) ? 0 : getDigest().hashCode());
        result = prime * result + ((getCurrentSchema() == null) ? 0 : getCurrentSchema().hashCode());
        result = prime * result + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getObjectInstanceBegin() == null) ? 0 : getObjectInstanceBegin().hashCode());
        result = prime * result + ((getMysqlErrno() == null) ? 0 : getMysqlErrno().hashCode());
        result = prime * result + ((getReturnedSqlstate() == null) ? 0 : getReturnedSqlstate().hashCode());
        result = prime * result + ((getMessageText() == null) ? 0 : getMessageText().hashCode());
        result = prime * result + ((getErrors() == null) ? 0 : getErrors().hashCode());
        result = prime * result + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        result = prime * result + ((getRowsAffected() == null) ? 0 : getRowsAffected().hashCode());
        result = prime * result + ((getRowsSent() == null) ? 0 : getRowsSent().hashCode());
        result = prime * result + ((getRowsExamined() == null) ? 0 : getRowsExamined().hashCode());
        result = prime * result + ((getCreatedTmpDiskTables() == null) ? 0 : getCreatedTmpDiskTables().hashCode());
        result = prime * result + ((getCreatedTmpTables() == null) ? 0 : getCreatedTmpTables().hashCode());
        result = prime * result + ((getSelectFullJoin() == null) ? 0 : getSelectFullJoin().hashCode());
        result = prime * result + ((getSelectFullRangeJoin() == null) ? 0 : getSelectFullRangeJoin().hashCode());
        result = prime * result + ((getSelectRange() == null) ? 0 : getSelectRange().hashCode());
        result = prime * result + ((getSelectRangeCheck() == null) ? 0 : getSelectRangeCheck().hashCode());
        result = prime * result + ((getSelectScan() == null) ? 0 : getSelectScan().hashCode());
        result = prime * result + ((getSortMergePasses() == null) ? 0 : getSortMergePasses().hashCode());
        result = prime * result + ((getSortRange() == null) ? 0 : getSortRange().hashCode());
        result = prime * result + ((getSortRows() == null) ? 0 : getSortRows().hashCode());
        result = prime * result + ((getSortScan() == null) ? 0 : getSortScan().hashCode());
        result = prime * result + ((getNoIndexUsed() == null) ? 0 : getNoIndexUsed().hashCode());
        result = prime * result + ((getNoGoodIndexUsed() == null) ? 0 : getNoGoodIndexUsed().hashCode());
        result = prime * result + ((getNestingEventId() == null) ? 0 : getNestingEventId().hashCode());
        result = prime * result + ((getNestingEventType() == null) ? 0 : getNestingEventType().hashCode());
        result = prime * result + ((getNestingEventLevel() == null) ? 0 : getNestingEventLevel().hashCode());
        result = prime * result + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        return result;
    }
}