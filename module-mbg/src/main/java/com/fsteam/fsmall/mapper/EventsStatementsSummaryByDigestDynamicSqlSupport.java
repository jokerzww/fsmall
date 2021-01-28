package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStatementsSummaryByDigestDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4611357+08:00", comments="Source Table: events_statements_summary_by_digest")
    public static final EventsStatementsSummaryByDigest eventsStatementsSummaryByDigest = new EventsStatementsSummaryByDigest();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SCHEMA_NAME")
    public static final SqlColumn<String> schemaName = eventsStatementsSummaryByDigest.schemaName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.DIGEST")
    public static final SqlColumn<String> digest = eventsStatementsSummaryByDigest.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsStatementsSummaryByDigest.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsStatementsSummaryByDigest.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsStatementsSummaryByDigest.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsStatementsSummaryByDigest.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsStatementsSummaryByDigest.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_LOCK_TIME")
    public static final SqlColumn<Long> sumLockTime = eventsStatementsSummaryByDigest.sumLockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ERRORS")
    public static final SqlColumn<Long> sumErrors = eventsStatementsSummaryByDigest.sumErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_WARNINGS")
    public static final SqlColumn<Long> sumWarnings = eventsStatementsSummaryByDigest.sumWarnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_AFFECTED")
    public static final SqlColumn<Long> sumRowsAffected = eventsStatementsSummaryByDigest.sumRowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_SENT")
    public static final SqlColumn<Long> sumRowsSent = eventsStatementsSummaryByDigest.sumRowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_ROWS_EXAMINED")
    public static final SqlColumn<Long> sumRowsExamined = eventsStatementsSummaryByDigest.sumRowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_CREATED_TMP_DISK_TABLES")
    public static final SqlColumn<Long> sumCreatedTmpDiskTables = eventsStatementsSummaryByDigest.sumCreatedTmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_CREATED_TMP_TABLES")
    public static final SqlColumn<Long> sumCreatedTmpTables = eventsStatementsSummaryByDigest.sumCreatedTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_FULL_JOIN")
    public static final SqlColumn<Long> sumSelectFullJoin = eventsStatementsSummaryByDigest.sumSelectFullJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_FULL_RANGE_JOIN")
    public static final SqlColumn<Long> sumSelectFullRangeJoin = eventsStatementsSummaryByDigest.sumSelectFullRangeJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_RANGE")
    public static final SqlColumn<Long> sumSelectRange = eventsStatementsSummaryByDigest.sumSelectRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_RANGE_CHECK")
    public static final SqlColumn<Long> sumSelectRangeCheck = eventsStatementsSummaryByDigest.sumSelectRangeCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SELECT_SCAN")
    public static final SqlColumn<Long> sumSelectScan = eventsStatementsSummaryByDigest.sumSelectScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_MERGE_PASSES")
    public static final SqlColumn<Long> sumSortMergePasses = eventsStatementsSummaryByDigest.sumSortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_RANGE")
    public static final SqlColumn<Long> sumSortRange = eventsStatementsSummaryByDigest.sumSortRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_ROWS")
    public static final SqlColumn<Long> sumSortRows = eventsStatementsSummaryByDigest.sumSortRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.SUM_SORT_SCAN")
    public static final SqlColumn<Long> sumSortScan = eventsStatementsSummaryByDigest.sumSortScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.SUM_NO_INDEX_USED")
    public static final SqlColumn<Long> sumNoIndexUsed = eventsStatementsSummaryByDigest.sumNoIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.SUM_NO_GOOD_INDEX_USED")
    public static final SqlColumn<Long> sumNoGoodIndexUsed = eventsStatementsSummaryByDigest.sumNoGoodIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.FIRST_SEEN")
    public static final SqlColumn<Date> firstSeen = eventsStatementsSummaryByDigest.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.LAST_SEEN")
    public static final SqlColumn<Date> lastSeen = eventsStatementsSummaryByDigest.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_95")
    public static final SqlColumn<Long> quantile95 = eventsStatementsSummaryByDigest.quantile95;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_99")
    public static final SqlColumn<Long> quantile99 = eventsStatementsSummaryByDigest.quantile99;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.QUANTILE_999")
    public static final SqlColumn<Long> quantile999 = eventsStatementsSummaryByDigest.quantile999;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_SEEN")
    public static final SqlColumn<Date> querySampleSeen = eventsStatementsSummaryByDigest.querySampleSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_TIMER_WAIT")
    public static final SqlColumn<Long> querySampleTimerWait = eventsStatementsSummaryByDigest.querySampleTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.DIGEST_TEXT")
    public static final SqlColumn<String> digestText = eventsStatementsSummaryByDigest.digestText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source field: events_statements_summary_by_digest.QUERY_SAMPLE_TEXT")
    public static final SqlColumn<String> querySampleText = eventsStatementsSummaryByDigest.querySampleText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4621364+08:00", comments="Source Table: events_statements_summary_by_digest")
    public static final class EventsStatementsSummaryByDigest extends SqlTable {
        public final SqlColumn<String> schemaName = column("SCHEMA_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> digest = column("DIGEST", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> sumLockTime = column("SUM_LOCK_TIME", JDBCType.BIGINT);

        public final SqlColumn<Long> sumErrors = column("SUM_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> sumWarnings = column("SUM_WARNINGS", JDBCType.BIGINT);

        public final SqlColumn<Long> sumRowsAffected = column("SUM_ROWS_AFFECTED", JDBCType.BIGINT);

        public final SqlColumn<Long> sumRowsSent = column("SUM_ROWS_SENT", JDBCType.BIGINT);

        public final SqlColumn<Long> sumRowsExamined = column("SUM_ROWS_EXAMINED", JDBCType.BIGINT);

        public final SqlColumn<Long> sumCreatedTmpDiskTables = column("SUM_CREATED_TMP_DISK_TABLES", JDBCType.BIGINT);

        public final SqlColumn<Long> sumCreatedTmpTables = column("SUM_CREATED_TMP_TABLES", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSelectFullJoin = column("SUM_SELECT_FULL_JOIN", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSelectFullRangeJoin = column("SUM_SELECT_FULL_RANGE_JOIN", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSelectRange = column("SUM_SELECT_RANGE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSelectRangeCheck = column("SUM_SELECT_RANGE_CHECK", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSelectScan = column("SUM_SELECT_SCAN", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSortMergePasses = column("SUM_SORT_MERGE_PASSES", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSortRange = column("SUM_SORT_RANGE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSortRows = column("SUM_SORT_ROWS", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSortScan = column("SUM_SORT_SCAN", JDBCType.BIGINT);

        public final SqlColumn<Long> sumNoIndexUsed = column("SUM_NO_INDEX_USED", JDBCType.BIGINT);

        public final SqlColumn<Long> sumNoGoodIndexUsed = column("SUM_NO_GOOD_INDEX_USED", JDBCType.BIGINT);

        public final SqlColumn<Date> firstSeen = column("FIRST_SEEN", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("LAST_SEEN", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> quantile95 = column("QUANTILE_95", JDBCType.BIGINT);

        public final SqlColumn<Long> quantile99 = column("QUANTILE_99", JDBCType.BIGINT);

        public final SqlColumn<Long> quantile999 = column("QUANTILE_999", JDBCType.BIGINT);

        public final SqlColumn<Date> querySampleSeen = column("QUERY_SAMPLE_SEEN", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> querySampleTimerWait = column("QUERY_SAMPLE_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<String> digestText = column("DIGEST_TEXT", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> querySampleText = column("QUERY_SAMPLE_TEXT", JDBCType.LONGVARCHAR);

        public EventsStatementsSummaryByDigest() {
            super("events_statements_summary_by_digest");
        }
    }
}