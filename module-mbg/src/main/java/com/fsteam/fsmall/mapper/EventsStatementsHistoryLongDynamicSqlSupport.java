package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStatementsHistoryLongDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.344028+08:00", comments="Source Table: events_statements_history_long")
    public static final EventsStatementsHistoryLong eventsStatementsHistoryLong = new EventsStatementsHistoryLong();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.344028+08:00", comments="Source field: events_statements_history_long.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsStatementsHistoryLong.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.344028+08:00", comments="Source field: events_statements_history_long.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsStatementsHistoryLong.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.344028+08:00", comments="Source field: events_statements_history_long.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsStatementsHistoryLong.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.344028+08:00", comments="Source field: events_statements_history_long.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsStatementsHistoryLong.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.344028+08:00", comments="Source field: events_statements_history_long.SOURCE")
    public static final SqlColumn<String> source = eventsStatementsHistoryLong.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.344028+08:00", comments="Source field: events_statements_history_long.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsStatementsHistoryLong.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.344028+08:00", comments="Source field: events_statements_history_long.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsStatementsHistoryLong.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsStatementsHistoryLong.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.LOCK_TIME")
    public static final SqlColumn<Long> lockTime = eventsStatementsHistoryLong.lockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.DIGEST")
    public static final SqlColumn<String> digest = eventsStatementsHistoryLong.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.CURRENT_SCHEMA")
    public static final SqlColumn<String> currentSchema = eventsStatementsHistoryLong.currentSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = eventsStatementsHistoryLong.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = eventsStatementsHistoryLong.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.OBJECT_NAME")
    public static final SqlColumn<String> objectName = eventsStatementsHistoryLong.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = eventsStatementsHistoryLong.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.MYSQL_ERRNO")
    public static final SqlColumn<Integer> mysqlErrno = eventsStatementsHistoryLong.mysqlErrno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.RETURNED_SQLSTATE")
    public static final SqlColumn<String> returnedSqlstate = eventsStatementsHistoryLong.returnedSqlstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.MESSAGE_TEXT")
    public static final SqlColumn<String> messageText = eventsStatementsHistoryLong.messageText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.ERRORS")
    public static final SqlColumn<Long> errors = eventsStatementsHistoryLong.errors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.WARNINGS")
    public static final SqlColumn<Long> warnings = eventsStatementsHistoryLong.warnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.ROWS_AFFECTED")
    public static final SqlColumn<Long> rowsAffected = eventsStatementsHistoryLong.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.ROWS_SENT")
    public static final SqlColumn<Long> rowsSent = eventsStatementsHistoryLong.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.ROWS_EXAMINED")
    public static final SqlColumn<Long> rowsExamined = eventsStatementsHistoryLong.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.CREATED_TMP_DISK_TABLES")
    public static final SqlColumn<Long> createdTmpDiskTables = eventsStatementsHistoryLong.createdTmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.CREATED_TMP_TABLES")
    public static final SqlColumn<Long> createdTmpTables = eventsStatementsHistoryLong.createdTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.345029+08:00", comments="Source field: events_statements_history_long.SELECT_FULL_JOIN")
    public static final SqlColumn<Long> selectFullJoin = eventsStatementsHistoryLong.selectFullJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.SELECT_FULL_RANGE_JOIN")
    public static final SqlColumn<Long> selectFullRangeJoin = eventsStatementsHistoryLong.selectFullRangeJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.SELECT_RANGE")
    public static final SqlColumn<Long> selectRange = eventsStatementsHistoryLong.selectRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.SELECT_RANGE_CHECK")
    public static final SqlColumn<Long> selectRangeCheck = eventsStatementsHistoryLong.selectRangeCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.SELECT_SCAN")
    public static final SqlColumn<Long> selectScan = eventsStatementsHistoryLong.selectScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.SORT_MERGE_PASSES")
    public static final SqlColumn<Long> sortMergePasses = eventsStatementsHistoryLong.sortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.SORT_RANGE")
    public static final SqlColumn<Long> sortRange = eventsStatementsHistoryLong.sortRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.SORT_ROWS")
    public static final SqlColumn<Long> sortRows = eventsStatementsHistoryLong.sortRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.SORT_SCAN")
    public static final SqlColumn<Long> sortScan = eventsStatementsHistoryLong.sortScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.NO_INDEX_USED")
    public static final SqlColumn<Long> noIndexUsed = eventsStatementsHistoryLong.noIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.NO_GOOD_INDEX_USED")
    public static final SqlColumn<Long> noGoodIndexUsed = eventsStatementsHistoryLong.noGoodIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsStatementsHistoryLong.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsStatementsHistoryLong.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.NESTING_EVENT_LEVEL")
    public static final SqlColumn<Integer> nestingEventLevel = eventsStatementsHistoryLong.nestingEventLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.STATEMENT_ID")
    public static final SqlColumn<Long> statementId = eventsStatementsHistoryLong.statementId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.SQL_TEXT")
    public static final SqlColumn<String> sqlText = eventsStatementsHistoryLong.sqlText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3460297+08:00", comments="Source field: events_statements_history_long.DIGEST_TEXT")
    public static final SqlColumn<String> digestText = eventsStatementsHistoryLong.digestText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.344028+08:00", comments="Source Table: events_statements_history_long")
    public static final class EventsStatementsHistoryLong extends SqlTable {
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

        public EventsStatementsHistoryLong() {
            super("events_statements_history_long");
        }
    }
}