package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStatementsHistoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source Table: events_statements_history")
    public static final EventsStatementsHistory eventsStatementsHistory = new EventsStatementsHistory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsStatementsHistory.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsStatementsHistory.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsStatementsHistory.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsStatementsHistory.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.SOURCE")
    public static final SqlColumn<String> source = eventsStatementsHistory.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsStatementsHistory.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsStatementsHistory.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsStatementsHistory.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.LOCK_TIME")
    public static final SqlColumn<Long> lockTime = eventsStatementsHistory.lockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.DIGEST")
    public static final SqlColumn<String> digest = eventsStatementsHistory.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.CURRENT_SCHEMA")
    public static final SqlColumn<String> currentSchema = eventsStatementsHistory.currentSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = eventsStatementsHistory.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = eventsStatementsHistory.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source field: events_statements_history.OBJECT_NAME")
    public static final SqlColumn<String> objectName = eventsStatementsHistory.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = eventsStatementsHistory.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.MYSQL_ERRNO")
    public static final SqlColumn<Integer> mysqlErrno = eventsStatementsHistory.mysqlErrno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.RETURNED_SQLSTATE")
    public static final SqlColumn<String> returnedSqlstate = eventsStatementsHistory.returnedSqlstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.MESSAGE_TEXT")
    public static final SqlColumn<String> messageText = eventsStatementsHistory.messageText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.ERRORS")
    public static final SqlColumn<Long> errors = eventsStatementsHistory.errors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.WARNINGS")
    public static final SqlColumn<Long> warnings = eventsStatementsHistory.warnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.ROWS_AFFECTED")
    public static final SqlColumn<Long> rowsAffected = eventsStatementsHistory.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.ROWS_SENT")
    public static final SqlColumn<Long> rowsSent = eventsStatementsHistory.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.ROWS_EXAMINED")
    public static final SqlColumn<Long> rowsExamined = eventsStatementsHistory.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.CREATED_TMP_DISK_TABLES")
    public static final SqlColumn<Long> createdTmpDiskTables = eventsStatementsHistory.createdTmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.CREATED_TMP_TABLES")
    public static final SqlColumn<Long> createdTmpTables = eventsStatementsHistory.createdTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.SELECT_FULL_JOIN")
    public static final SqlColumn<Long> selectFullJoin = eventsStatementsHistory.selectFullJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.SELECT_FULL_RANGE_JOIN")
    public static final SqlColumn<Long> selectFullRangeJoin = eventsStatementsHistory.selectFullRangeJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.SELECT_RANGE")
    public static final SqlColumn<Long> selectRange = eventsStatementsHistory.selectRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.SELECT_RANGE_CHECK")
    public static final SqlColumn<Long> selectRangeCheck = eventsStatementsHistory.selectRangeCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.SELECT_SCAN")
    public static final SqlColumn<Long> selectScan = eventsStatementsHistory.selectScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.SORT_MERGE_PASSES")
    public static final SqlColumn<Long> sortMergePasses = eventsStatementsHistory.sortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.SORT_RANGE")
    public static final SqlColumn<Long> sortRange = eventsStatementsHistory.sortRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.SORT_ROWS")
    public static final SqlColumn<Long> sortRows = eventsStatementsHistory.sortRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5482144+08:00", comments="Source field: events_statements_history.SORT_SCAN")
    public static final SqlColumn<Long> sortScan = eventsStatementsHistory.sortScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5492151+08:00", comments="Source field: events_statements_history.NO_INDEX_USED")
    public static final SqlColumn<Long> noIndexUsed = eventsStatementsHistory.noIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5492151+08:00", comments="Source field: events_statements_history.NO_GOOD_INDEX_USED")
    public static final SqlColumn<Long> noGoodIndexUsed = eventsStatementsHistory.noGoodIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5492151+08:00", comments="Source field: events_statements_history.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsStatementsHistory.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5492151+08:00", comments="Source field: events_statements_history.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsStatementsHistory.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5492151+08:00", comments="Source field: events_statements_history.NESTING_EVENT_LEVEL")
    public static final SqlColumn<Integer> nestingEventLevel = eventsStatementsHistory.nestingEventLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5492151+08:00", comments="Source field: events_statements_history.STATEMENT_ID")
    public static final SqlColumn<Long> statementId = eventsStatementsHistory.statementId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5492151+08:00", comments="Source field: events_statements_history.SQL_TEXT")
    public static final SqlColumn<String> sqlText = eventsStatementsHistory.sqlText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5492151+08:00", comments="Source field: events_statements_history.DIGEST_TEXT")
    public static final SqlColumn<String> digestText = eventsStatementsHistory.digestText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5472145+08:00", comments="Source Table: events_statements_history")
    public static final class EventsStatementsHistory extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> eventId = column("EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> endEventId = column("END_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("SOURCE", JDBCType.VARCHAR);

        public final SqlColumn<Long> timerStart = column("TIMER_START", JDBCType.BIGINT);

        public final SqlColumn<Long> timerEnd = column("TIMER_END", JDBCType.BIGINT);

        public final SqlColumn<Long> timerWait = column("TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> lockTime = column("LOCK_TIME", JDBCType.BIGINT);

        public final SqlColumn<String> digest = column("DIGEST", JDBCType.VARCHAR);

        public final SqlColumn<String> currentSchema = column("CURRENT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> objectType = column("OBJECT_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> objectSchema = column("OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("OBJECT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<Integer> mysqlErrno = column("MYSQL_ERRNO", JDBCType.INTEGER);

        public final SqlColumn<String> returnedSqlstate = column("RETURNED_SQLSTATE", JDBCType.VARCHAR);

        public final SqlColumn<String> messageText = column("MESSAGE_TEXT", JDBCType.VARCHAR);

        public final SqlColumn<Long> errors = column("ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> warnings = column("WARNINGS", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsAffected = column("ROWS_AFFECTED", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsSent = column("ROWS_SENT", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsExamined = column("ROWS_EXAMINED", JDBCType.BIGINT);

        public final SqlColumn<Long> createdTmpDiskTables = column("CREATED_TMP_DISK_TABLES", JDBCType.BIGINT);

        public final SqlColumn<Long> createdTmpTables = column("CREATED_TMP_TABLES", JDBCType.BIGINT);

        public final SqlColumn<Long> selectFullJoin = column("SELECT_FULL_JOIN", JDBCType.BIGINT);

        public final SqlColumn<Long> selectFullRangeJoin = column("SELECT_FULL_RANGE_JOIN", JDBCType.BIGINT);

        public final SqlColumn<Long> selectRange = column("SELECT_RANGE", JDBCType.BIGINT);

        public final SqlColumn<Long> selectRangeCheck = column("SELECT_RANGE_CHECK", JDBCType.BIGINT);

        public final SqlColumn<Long> selectScan = column("SELECT_SCAN", JDBCType.BIGINT);

        public final SqlColumn<Long> sortMergePasses = column("SORT_MERGE_PASSES", JDBCType.BIGINT);

        public final SqlColumn<Long> sortRange = column("SORT_RANGE", JDBCType.BIGINT);

        public final SqlColumn<Long> sortRows = column("SORT_ROWS", JDBCType.BIGINT);

        public final SqlColumn<Long> sortScan = column("SORT_SCAN", JDBCType.BIGINT);

        public final SqlColumn<Long> noIndexUsed = column("NO_INDEX_USED", JDBCType.BIGINT);

        public final SqlColumn<Long> noGoodIndexUsed = column("NO_GOOD_INDEX_USED", JDBCType.BIGINT);

        public final SqlColumn<Long> nestingEventId = column("NESTING_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> nestingEventType = column("NESTING_EVENT_TYPE", JDBCType.CHAR);

        public final SqlColumn<Integer> nestingEventLevel = column("NESTING_EVENT_LEVEL", JDBCType.INTEGER);

        public final SqlColumn<Long> statementId = column("STATEMENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> sqlText = column("SQL_TEXT", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> digestText = column("DIGEST_TEXT", JDBCType.LONGVARCHAR);

        public EventsStatementsHistory() {
            super("events_statements_history");
        }
    }
}