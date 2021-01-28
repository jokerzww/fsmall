package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStatementsSummaryByAccountByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source Table: events_statements_summary_by_account_by_event_name")
    public static final EventsStatementsSummaryByAccountByEventName eventsStatementsSummaryByAccountByEventName = new EventsStatementsSummaryByAccountByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.USER")
    public static final SqlColumn<String> user = eventsStatementsSummaryByAccountByEventName.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.HOST")
    public static final SqlColumn<String> host = eventsStatementsSummaryByAccountByEventName.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsStatementsSummaryByAccountByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsStatementsSummaryByAccountByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsStatementsSummaryByAccountByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsStatementsSummaryByAccountByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsStatementsSummaryByAccountByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsStatementsSummaryByAccountByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_LOCK_TIME")
    public static final SqlColumn<Long> sumLockTime = eventsStatementsSummaryByAccountByEventName.sumLockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_ERRORS")
    public static final SqlColumn<Long> sumErrors = eventsStatementsSummaryByAccountByEventName.sumErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_WARNINGS")
    public static final SqlColumn<Long> sumWarnings = eventsStatementsSummaryByAccountByEventName.sumWarnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_ROWS_AFFECTED")
    public static final SqlColumn<Long> sumRowsAffected = eventsStatementsSummaryByAccountByEventName.sumRowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_ROWS_SENT")
    public static final SqlColumn<Long> sumRowsSent = eventsStatementsSummaryByAccountByEventName.sumRowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_ROWS_EXAMINED")
    public static final SqlColumn<Long> sumRowsExamined = eventsStatementsSummaryByAccountByEventName.sumRowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_CREATED_TMP_DISK_TABLES")
    public static final SqlColumn<Long> sumCreatedTmpDiskTables = eventsStatementsSummaryByAccountByEventName.sumCreatedTmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_CREATED_TMP_TABLES")
    public static final SqlColumn<Long> sumCreatedTmpTables = eventsStatementsSummaryByAccountByEventName.sumCreatedTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_SELECT_FULL_JOIN")
    public static final SqlColumn<Long> sumSelectFullJoin = eventsStatementsSummaryByAccountByEventName.sumSelectFullJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_SELECT_FULL_RANGE_JOIN")
    public static final SqlColumn<Long> sumSelectFullRangeJoin = eventsStatementsSummaryByAccountByEventName.sumSelectFullRangeJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_SELECT_RANGE")
    public static final SqlColumn<Long> sumSelectRange = eventsStatementsSummaryByAccountByEventName.sumSelectRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_SELECT_RANGE_CHECK")
    public static final SqlColumn<Long> sumSelectRangeCheck = eventsStatementsSummaryByAccountByEventName.sumSelectRangeCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_SELECT_SCAN")
    public static final SqlColumn<Long> sumSelectScan = eventsStatementsSummaryByAccountByEventName.sumSelectScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_SORT_MERGE_PASSES")
    public static final SqlColumn<Long> sumSortMergePasses = eventsStatementsSummaryByAccountByEventName.sumSortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_SORT_RANGE")
    public static final SqlColumn<Long> sumSortRange = eventsStatementsSummaryByAccountByEventName.sumSortRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_SORT_ROWS")
    public static final SqlColumn<Long> sumSortRows = eventsStatementsSummaryByAccountByEventName.sumSortRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_SORT_SCAN")
    public static final SqlColumn<Long> sumSortScan = eventsStatementsSummaryByAccountByEventName.sumSortScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_NO_INDEX_USED")
    public static final SqlColumn<Long> sumNoIndexUsed = eventsStatementsSummaryByAccountByEventName.sumNoIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4841557+08:00", comments="Source field: events_statements_summary_by_account_by_event_name.SUM_NO_GOOD_INDEX_USED")
    public static final SqlColumn<Long> sumNoGoodIndexUsed = eventsStatementsSummaryByAccountByEventName.sumNoGoodIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4831554+08:00", comments="Source Table: events_statements_summary_by_account_by_event_name")
    public static final class EventsStatementsSummaryByAccountByEventName extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

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

        public EventsStatementsSummaryByAccountByEventName() {
            super("events_statements_summary_by_account_by_event_name");
        }
    }
}