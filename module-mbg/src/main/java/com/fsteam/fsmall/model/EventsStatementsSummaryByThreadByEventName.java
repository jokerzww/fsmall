package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class EventsStatementsSummaryByThreadByEventName implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.COUNT_STAR")
    private Long countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_TIMER_WAIT")
    private Long sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.MIN_TIMER_WAIT")
    private Long minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.AVG_TIMER_WAIT")
    private Long avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.MAX_TIMER_WAIT")
    private Long maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_LOCK_TIME")
    private Long sumLockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ERRORS")
    private Long sumErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_WARNINGS")
    private Long sumWarnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ROWS_AFFECTED")
    private Long sumRowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ROWS_SENT")
    private Long sumRowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ROWS_EXAMINED")
    private Long sumRowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_CREATED_TMP_DISK_TABLES")
    private Long sumCreatedTmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_CREATED_TMP_TABLES")
    private Long sumCreatedTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_FULL_JOIN")
    private Long sumSelectFullJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_FULL_RANGE_JOIN")
    private Long sumSelectFullRangeJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_RANGE")
    private Long sumSelectRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_RANGE_CHECK")
    private Long sumSelectRangeCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_SCAN")
    private Long sumSelectScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_MERGE_PASSES")
    private Long sumSortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_RANGE")
    private Long sumSortRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_ROWS")
    private Long sumSortRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_SCAN")
    private Long sumSortScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_NO_INDEX_USED")
    private Long sumNoIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_NO_GOOD_INDEX_USED")
    private Long sumNoGoodIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source Table: events_statements_summary_by_thread_by_event_name")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.COUNT_STAR")
    public Long getCountStar() {
        return countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.COUNT_STAR")
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_TIMER_WAIT")
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_TIMER_WAIT")
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.MIN_TIMER_WAIT")
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.MIN_TIMER_WAIT")
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.AVG_TIMER_WAIT")
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.AVG_TIMER_WAIT")
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.MAX_TIMER_WAIT")
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.MAX_TIMER_WAIT")
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_LOCK_TIME")
    public Long getSumLockTime() {
        return sumLockTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_LOCK_TIME")
    public void setSumLockTime(Long sumLockTime) {
        this.sumLockTime = sumLockTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ERRORS")
    public Long getSumErrors() {
        return sumErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ERRORS")
    public void setSumErrors(Long sumErrors) {
        this.sumErrors = sumErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_WARNINGS")
    public Long getSumWarnings() {
        return sumWarnings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_WARNINGS")
    public void setSumWarnings(Long sumWarnings) {
        this.sumWarnings = sumWarnings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ROWS_AFFECTED")
    public Long getSumRowsAffected() {
        return sumRowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ROWS_AFFECTED")
    public void setSumRowsAffected(Long sumRowsAffected) {
        this.sumRowsAffected = sumRowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ROWS_SENT")
    public Long getSumRowsSent() {
        return sumRowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ROWS_SENT")
    public void setSumRowsSent(Long sumRowsSent) {
        this.sumRowsSent = sumRowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ROWS_EXAMINED")
    public Long getSumRowsExamined() {
        return sumRowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_ROWS_EXAMINED")
    public void setSumRowsExamined(Long sumRowsExamined) {
        this.sumRowsExamined = sumRowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_CREATED_TMP_DISK_TABLES")
    public Long getSumCreatedTmpDiskTables() {
        return sumCreatedTmpDiskTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_CREATED_TMP_DISK_TABLES")
    public void setSumCreatedTmpDiskTables(Long sumCreatedTmpDiskTables) {
        this.sumCreatedTmpDiskTables = sumCreatedTmpDiskTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_CREATED_TMP_TABLES")
    public Long getSumCreatedTmpTables() {
        return sumCreatedTmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_CREATED_TMP_TABLES")
    public void setSumCreatedTmpTables(Long sumCreatedTmpTables) {
        this.sumCreatedTmpTables = sumCreatedTmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_FULL_JOIN")
    public Long getSumSelectFullJoin() {
        return sumSelectFullJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_FULL_JOIN")
    public void setSumSelectFullJoin(Long sumSelectFullJoin) {
        this.sumSelectFullJoin = sumSelectFullJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_FULL_RANGE_JOIN")
    public Long getSumSelectFullRangeJoin() {
        return sumSelectFullRangeJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_FULL_RANGE_JOIN")
    public void setSumSelectFullRangeJoin(Long sumSelectFullRangeJoin) {
        this.sumSelectFullRangeJoin = sumSelectFullRangeJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4571314+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_RANGE")
    public Long getSumSelectRange() {
        return sumSelectRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_RANGE")
    public void setSumSelectRange(Long sumSelectRange) {
        this.sumSelectRange = sumSelectRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_RANGE_CHECK")
    public Long getSumSelectRangeCheck() {
        return sumSelectRangeCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_RANGE_CHECK")
    public void setSumSelectRangeCheck(Long sumSelectRangeCheck) {
        this.sumSelectRangeCheck = sumSelectRangeCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_SCAN")
    public Long getSumSelectScan() {
        return sumSelectScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SELECT_SCAN")
    public void setSumSelectScan(Long sumSelectScan) {
        this.sumSelectScan = sumSelectScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_MERGE_PASSES")
    public Long getSumSortMergePasses() {
        return sumSortMergePasses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_MERGE_PASSES")
    public void setSumSortMergePasses(Long sumSortMergePasses) {
        this.sumSortMergePasses = sumSortMergePasses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_RANGE")
    public Long getSumSortRange() {
        return sumSortRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_RANGE")
    public void setSumSortRange(Long sumSortRange) {
        this.sumSortRange = sumSortRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_ROWS")
    public Long getSumSortRows() {
        return sumSortRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_ROWS")
    public void setSumSortRows(Long sumSortRows) {
        this.sumSortRows = sumSortRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_SCAN")
    public Long getSumSortScan() {
        return sumSortScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_SORT_SCAN")
    public void setSumSortScan(Long sumSortScan) {
        this.sumSortScan = sumSortScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_NO_INDEX_USED")
    public Long getSumNoIndexUsed() {
        return sumNoIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_NO_INDEX_USED")
    public void setSumNoIndexUsed(Long sumNoIndexUsed) {
        this.sumNoIndexUsed = sumNoIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_NO_GOOD_INDEX_USED")
    public Long getSumNoGoodIndexUsed() {
        return sumNoGoodIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source field: events_statements_summary_by_thread_by_event_name.SUM_NO_GOOD_INDEX_USED")
    public void setSumNoGoodIndexUsed(Long sumNoGoodIndexUsed) {
        this.sumNoGoodIndexUsed = sumNoGoodIndexUsed;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source Table: events_statements_summary_by_thread_by_event_name")
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
        sb.append(", sumLockTime=").append(sumLockTime);
        sb.append(", sumErrors=").append(sumErrors);
        sb.append(", sumWarnings=").append(sumWarnings);
        sb.append(", sumRowsAffected=").append(sumRowsAffected);
        sb.append(", sumRowsSent=").append(sumRowsSent);
        sb.append(", sumRowsExamined=").append(sumRowsExamined);
        sb.append(", sumCreatedTmpDiskTables=").append(sumCreatedTmpDiskTables);
        sb.append(", sumCreatedTmpTables=").append(sumCreatedTmpTables);
        sb.append(", sumSelectFullJoin=").append(sumSelectFullJoin);
        sb.append(", sumSelectFullRangeJoin=").append(sumSelectFullRangeJoin);
        sb.append(", sumSelectRange=").append(sumSelectRange);
        sb.append(", sumSelectRangeCheck=").append(sumSelectRangeCheck);
        sb.append(", sumSelectScan=").append(sumSelectScan);
        sb.append(", sumSortMergePasses=").append(sumSortMergePasses);
        sb.append(", sumSortRange=").append(sumSortRange);
        sb.append(", sumSortRows=").append(sumSortRows);
        sb.append(", sumSortScan=").append(sumSortScan);
        sb.append(", sumNoIndexUsed=").append(sumNoIndexUsed);
        sb.append(", sumNoGoodIndexUsed=").append(sumNoGoodIndexUsed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source Table: events_statements_summary_by_thread_by_event_name")
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
        EventsStatementsSummaryByThreadByEventName other = (EventsStatementsSummaryByThreadByEventName) that;
        return (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getCountStar() == null ? other.getCountStar() == null : this.getCountStar().equals(other.getCountStar()))
            && (this.getSumTimerWait() == null ? other.getSumTimerWait() == null : this.getSumTimerWait().equals(other.getSumTimerWait()))
            && (this.getMinTimerWait() == null ? other.getMinTimerWait() == null : this.getMinTimerWait().equals(other.getMinTimerWait()))
            && (this.getAvgTimerWait() == null ? other.getAvgTimerWait() == null : this.getAvgTimerWait().equals(other.getAvgTimerWait()))
            && (this.getMaxTimerWait() == null ? other.getMaxTimerWait() == null : this.getMaxTimerWait().equals(other.getMaxTimerWait()))
            && (this.getSumLockTime() == null ? other.getSumLockTime() == null : this.getSumLockTime().equals(other.getSumLockTime()))
            && (this.getSumErrors() == null ? other.getSumErrors() == null : this.getSumErrors().equals(other.getSumErrors()))
            && (this.getSumWarnings() == null ? other.getSumWarnings() == null : this.getSumWarnings().equals(other.getSumWarnings()))
            && (this.getSumRowsAffected() == null ? other.getSumRowsAffected() == null : this.getSumRowsAffected().equals(other.getSumRowsAffected()))
            && (this.getSumRowsSent() == null ? other.getSumRowsSent() == null : this.getSumRowsSent().equals(other.getSumRowsSent()))
            && (this.getSumRowsExamined() == null ? other.getSumRowsExamined() == null : this.getSumRowsExamined().equals(other.getSumRowsExamined()))
            && (this.getSumCreatedTmpDiskTables() == null ? other.getSumCreatedTmpDiskTables() == null : this.getSumCreatedTmpDiskTables().equals(other.getSumCreatedTmpDiskTables()))
            && (this.getSumCreatedTmpTables() == null ? other.getSumCreatedTmpTables() == null : this.getSumCreatedTmpTables().equals(other.getSumCreatedTmpTables()))
            && (this.getSumSelectFullJoin() == null ? other.getSumSelectFullJoin() == null : this.getSumSelectFullJoin().equals(other.getSumSelectFullJoin()))
            && (this.getSumSelectFullRangeJoin() == null ? other.getSumSelectFullRangeJoin() == null : this.getSumSelectFullRangeJoin().equals(other.getSumSelectFullRangeJoin()))
            && (this.getSumSelectRange() == null ? other.getSumSelectRange() == null : this.getSumSelectRange().equals(other.getSumSelectRange()))
            && (this.getSumSelectRangeCheck() == null ? other.getSumSelectRangeCheck() == null : this.getSumSelectRangeCheck().equals(other.getSumSelectRangeCheck()))
            && (this.getSumSelectScan() == null ? other.getSumSelectScan() == null : this.getSumSelectScan().equals(other.getSumSelectScan()))
            && (this.getSumSortMergePasses() == null ? other.getSumSortMergePasses() == null : this.getSumSortMergePasses().equals(other.getSumSortMergePasses()))
            && (this.getSumSortRange() == null ? other.getSumSortRange() == null : this.getSumSortRange().equals(other.getSumSortRange()))
            && (this.getSumSortRows() == null ? other.getSumSortRows() == null : this.getSumSortRows().equals(other.getSumSortRows()))
            && (this.getSumSortScan() == null ? other.getSumSortScan() == null : this.getSumSortScan().equals(other.getSumSortScan()))
            && (this.getSumNoIndexUsed() == null ? other.getSumNoIndexUsed() == null : this.getSumNoIndexUsed().equals(other.getSumNoIndexUsed()))
            && (this.getSumNoGoodIndexUsed() == null ? other.getSumNoGoodIndexUsed() == null : this.getSumNoGoodIndexUsed().equals(other.getSumNoGoodIndexUsed()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4581333+08:00", comments="Source Table: events_statements_summary_by_thread_by_event_name")
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
        result = prime * result + ((getSumLockTime() == null) ? 0 : getSumLockTime().hashCode());
        result = prime * result + ((getSumErrors() == null) ? 0 : getSumErrors().hashCode());
        result = prime * result + ((getSumWarnings() == null) ? 0 : getSumWarnings().hashCode());
        result = prime * result + ((getSumRowsAffected() == null) ? 0 : getSumRowsAffected().hashCode());
        result = prime * result + ((getSumRowsSent() == null) ? 0 : getSumRowsSent().hashCode());
        result = prime * result + ((getSumRowsExamined() == null) ? 0 : getSumRowsExamined().hashCode());
        result = prime * result + ((getSumCreatedTmpDiskTables() == null) ? 0 : getSumCreatedTmpDiskTables().hashCode());
        result = prime * result + ((getSumCreatedTmpTables() == null) ? 0 : getSumCreatedTmpTables().hashCode());
        result = prime * result + ((getSumSelectFullJoin() == null) ? 0 : getSumSelectFullJoin().hashCode());
        result = prime * result + ((getSumSelectFullRangeJoin() == null) ? 0 : getSumSelectFullRangeJoin().hashCode());
        result = prime * result + ((getSumSelectRange() == null) ? 0 : getSumSelectRange().hashCode());
        result = prime * result + ((getSumSelectRangeCheck() == null) ? 0 : getSumSelectRangeCheck().hashCode());
        result = prime * result + ((getSumSelectScan() == null) ? 0 : getSumSelectScan().hashCode());
        result = prime * result + ((getSumSortMergePasses() == null) ? 0 : getSumSortMergePasses().hashCode());
        result = prime * result + ((getSumSortRange() == null) ? 0 : getSumSortRange().hashCode());
        result = prime * result + ((getSumSortRows() == null) ? 0 : getSumSortRows().hashCode());
        result = prime * result + ((getSumSortScan() == null) ? 0 : getSumSortScan().hashCode());
        result = prime * result + ((getSumNoIndexUsed() == null) ? 0 : getSumNoIndexUsed().hashCode());
        result = prime * result + ((getSumNoGoodIndexUsed() == null) ? 0 : getSumNoGoodIndexUsed().hashCode());
        return result;
    }
}