package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class EventsStatementsSummaryByDigest implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SCHEMA_NAME")
    private String schemaName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.DIGEST")
    private String digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.COUNT_STAR")
    private Long countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_TIMER_WAIT")
    private Long sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.MIN_TIMER_WAIT")
    private Long minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.AVG_TIMER_WAIT")
    private Long avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.MAX_TIMER_WAIT")
    private Long maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_LOCK_TIME")
    private Long sumLockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ERRORS")
    private Long sumErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_WARNINGS")
    private Long sumWarnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_AFFECTED")
    private Long sumRowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_SENT")
    private Long sumRowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_EXAMINED")
    private Long sumRowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_CREATED_TMP_DISK_TABLES")
    private Long sumCreatedTmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_CREATED_TMP_TABLES")
    private Long sumCreatedTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_FULL_JOIN")
    private Long sumSelectFullJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_FULL_RANGE_JOIN")
    private Long sumSelectFullRangeJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_RANGE")
    private Long sumSelectRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_RANGE_CHECK")
    private Long sumSelectRangeCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_SCAN")
    private Long sumSelectScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_MERGE_PASSES")
    private Long sumSortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_RANGE")
    private Long sumSortRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_ROWS")
    private Long sumSortRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_SCAN")
    private Long sumSortScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_NO_INDEX_USED")
    private Long sumNoIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_NO_GOOD_INDEX_USED")
    private Long sumNoGoodIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.FIRST_SEEN")
    private Date firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.LAST_SEEN")
    private Date lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_95")
    private Long quantile95;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_99")
    private Long quantile99;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_999")
    private Long quantile999;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_SEEN")
    private Date querySampleSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_TIMER_WAIT")
    private Long querySampleTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.DIGEST_TEXT")
    private String digestText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_TEXT")
    private String querySampleText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source Table: events_statements_summary_by_digest")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SCHEMA_NAME")
    public String getSchemaName() {
        return schemaName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SCHEMA_NAME")
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.DIGEST")
    public String getDigest() {
        return digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.DIGEST")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.COUNT_STAR")
    public Long getCountStar() {
        return countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.COUNT_STAR")
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_TIMER_WAIT")
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_TIMER_WAIT")
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.MIN_TIMER_WAIT")
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.MIN_TIMER_WAIT")
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.AVG_TIMER_WAIT")
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.AVG_TIMER_WAIT")
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.MAX_TIMER_WAIT")
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.MAX_TIMER_WAIT")
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_LOCK_TIME")
    public Long getSumLockTime() {
        return sumLockTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_LOCK_TIME")
    public void setSumLockTime(Long sumLockTime) {
        this.sumLockTime = sumLockTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ERRORS")
    public Long getSumErrors() {
        return sumErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ERRORS")
    public void setSumErrors(Long sumErrors) {
        this.sumErrors = sumErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_WARNINGS")
    public Long getSumWarnings() {
        return sumWarnings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_WARNINGS")
    public void setSumWarnings(Long sumWarnings) {
        this.sumWarnings = sumWarnings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_AFFECTED")
    public Long getSumRowsAffected() {
        return sumRowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_AFFECTED")
    public void setSumRowsAffected(Long sumRowsAffected) {
        this.sumRowsAffected = sumRowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_SENT")
    public Long getSumRowsSent() {
        return sumRowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_SENT")
    public void setSumRowsSent(Long sumRowsSent) {
        this.sumRowsSent = sumRowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_EXAMINED")
    public Long getSumRowsExamined() {
        return sumRowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_EXAMINED")
    public void setSumRowsExamined(Long sumRowsExamined) {
        this.sumRowsExamined = sumRowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_CREATED_TMP_DISK_TABLES")
    public Long getSumCreatedTmpDiskTables() {
        return sumCreatedTmpDiskTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_CREATED_TMP_DISK_TABLES")
    public void setSumCreatedTmpDiskTables(Long sumCreatedTmpDiskTables) {
        this.sumCreatedTmpDiskTables = sumCreatedTmpDiskTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_CREATED_TMP_TABLES")
    public Long getSumCreatedTmpTables() {
        return sumCreatedTmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_CREATED_TMP_TABLES")
    public void setSumCreatedTmpTables(Long sumCreatedTmpTables) {
        this.sumCreatedTmpTables = sumCreatedTmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_FULL_JOIN")
    public Long getSumSelectFullJoin() {
        return sumSelectFullJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_FULL_JOIN")
    public void setSumSelectFullJoin(Long sumSelectFullJoin) {
        this.sumSelectFullJoin = sumSelectFullJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_FULL_RANGE_JOIN")
    public Long getSumSelectFullRangeJoin() {
        return sumSelectFullRangeJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_FULL_RANGE_JOIN")
    public void setSumSelectFullRangeJoin(Long sumSelectFullRangeJoin) {
        this.sumSelectFullRangeJoin = sumSelectFullRangeJoin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_RANGE")
    public Long getSumSelectRange() {
        return sumSelectRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_RANGE")
    public void setSumSelectRange(Long sumSelectRange) {
        this.sumSelectRange = sumSelectRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_RANGE_CHECK")
    public Long getSumSelectRangeCheck() {
        return sumSelectRangeCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_RANGE_CHECK")
    public void setSumSelectRangeCheck(Long sumSelectRangeCheck) {
        this.sumSelectRangeCheck = sumSelectRangeCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_SCAN")
    public Long getSumSelectScan() {
        return sumSelectScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_SCAN")
    public void setSumSelectScan(Long sumSelectScan) {
        this.sumSelectScan = sumSelectScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_MERGE_PASSES")
    public Long getSumSortMergePasses() {
        return sumSortMergePasses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_MERGE_PASSES")
    public void setSumSortMergePasses(Long sumSortMergePasses) {
        this.sumSortMergePasses = sumSortMergePasses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_RANGE")
    public Long getSumSortRange() {
        return sumSortRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_RANGE")
    public void setSumSortRange(Long sumSortRange) {
        this.sumSortRange = sumSortRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_ROWS")
    public Long getSumSortRows() {
        return sumSortRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_ROWS")
    public void setSumSortRows(Long sumSortRows) {
        this.sumSortRows = sumSortRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_SCAN")
    public Long getSumSortScan() {
        return sumSortScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_SCAN")
    public void setSumSortScan(Long sumSortScan) {
        this.sumSortScan = sumSortScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_NO_INDEX_USED")
    public Long getSumNoIndexUsed() {
        return sumNoIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_NO_INDEX_USED")
    public void setSumNoIndexUsed(Long sumNoIndexUsed) {
        this.sumNoIndexUsed = sumNoIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_NO_GOOD_INDEX_USED")
    public Long getSumNoGoodIndexUsed() {
        return sumNoGoodIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.SUM_NO_GOOD_INDEX_USED")
    public void setSumNoGoodIndexUsed(Long sumNoGoodIndexUsed) {
        this.sumNoGoodIndexUsed = sumNoGoodIndexUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.FIRST_SEEN")
    public Date getFirstSeen() {
        return firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.FIRST_SEEN")
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.LAST_SEEN")
    public Date getLastSeen() {
        return lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.LAST_SEEN")
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_95")
    public Long getQuantile95() {
        return quantile95;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_95")
    public void setQuantile95(Long quantile95) {
        this.quantile95 = quantile95;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_99")
    public Long getQuantile99() {
        return quantile99;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_99")
    public void setQuantile99(Long quantile99) {
        this.quantile99 = quantile99;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_999")
    public Long getQuantile999() {
        return quantile999;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_999")
    public void setQuantile999(Long quantile999) {
        this.quantile999 = quantile999;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_SEEN")
    public Date getQuerySampleSeen() {
        return querySampleSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_SEEN")
    public void setQuerySampleSeen(Date querySampleSeen) {
        this.querySampleSeen = querySampleSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_TIMER_WAIT")
    public Long getQuerySampleTimerWait() {
        return querySampleTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_TIMER_WAIT")
    public void setQuerySampleTimerWait(Long querySampleTimerWait) {
        this.querySampleTimerWait = querySampleTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.DIGEST_TEXT")
    public String getDigestText() {
        return digestText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.DIGEST_TEXT")
    public void setDigestText(String digestText) {
        this.digestText = digestText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_TEXT")
    public String getQuerySampleText() {
        return querySampleText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_TEXT")
    public void setQuerySampleText(String querySampleText) {
        this.querySampleText = querySampleText;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source Table: events_statements_summary_by_digest")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaName=").append(schemaName);
        sb.append(", digest=").append(digest);
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
        sb.append(", firstSeen=").append(firstSeen);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", quantile95=").append(quantile95);
        sb.append(", quantile99=").append(quantile99);
        sb.append(", quantile999=").append(quantile999);
        sb.append(", querySampleSeen=").append(querySampleSeen);
        sb.append(", querySampleTimerWait=").append(querySampleTimerWait);
        sb.append(", digestText=").append(digestText);
        sb.append(", querySampleText=").append(querySampleText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source Table: events_statements_summary_by_digest")
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
        EventsStatementsSummaryByDigest other = (EventsStatementsSummaryByDigest) that;
        return (this.getSchemaName() == null ? other.getSchemaName() == null : this.getSchemaName().equals(other.getSchemaName()))
            && (this.getDigest() == null ? other.getDigest() == null : this.getDigest().equals(other.getDigest()))
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
            && (this.getSumNoGoodIndexUsed() == null ? other.getSumNoGoodIndexUsed() == null : this.getSumNoGoodIndexUsed().equals(other.getSumNoGoodIndexUsed()))
            && (this.getFirstSeen() == null ? other.getFirstSeen() == null : this.getFirstSeen().equals(other.getFirstSeen()))
            && (this.getLastSeen() == null ? other.getLastSeen() == null : this.getLastSeen().equals(other.getLastSeen()))
            && (this.getQuantile95() == null ? other.getQuantile95() == null : this.getQuantile95().equals(other.getQuantile95()))
            && (this.getQuantile99() == null ? other.getQuantile99() == null : this.getQuantile99().equals(other.getQuantile99()))
            && (this.getQuantile999() == null ? other.getQuantile999() == null : this.getQuantile999().equals(other.getQuantile999()))
            && (this.getQuerySampleSeen() == null ? other.getQuerySampleSeen() == null : this.getQuerySampleSeen().equals(other.getQuerySampleSeen()))
            && (this.getQuerySampleTimerWait() == null ? other.getQuerySampleTimerWait() == null : this.getQuerySampleTimerWait().equals(other.getQuerySampleTimerWait()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source Table: events_statements_summary_by_digest")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        result = prime * result + ((getDigest() == null) ? 0 : getDigest().hashCode());
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
        result = prime * result + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        result = prime * result + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        result = prime * result + ((getQuantile95() == null) ? 0 : getQuantile95().hashCode());
        result = prime * result + ((getQuantile99() == null) ? 0 : getQuantile99().hashCode());
        result = prime * result + ((getQuantile999() == null) ? 0 : getQuantile999().hashCode());
        result = prime * result + ((getQuerySampleSeen() == null) ? 0 : getQuerySampleSeen().hashCode());
        result = prime * result + ((getQuerySampleTimerWait() == null) ? 0 : getQuerySampleTimerWait().hashCode());
        return result;
    }
}