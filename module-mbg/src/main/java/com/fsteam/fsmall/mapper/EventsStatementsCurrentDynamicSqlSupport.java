package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStatementsCurrentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source Table: events_statements_current")
    public static final EventsStatementsCurrent eventsStatementsCurrent = new EventsStatementsCurrent();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source field: events_statements_current.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsStatementsCurrent.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source field: events_statements_current.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsStatementsCurrent.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source field: events_statements_current.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsStatementsCurrent.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source field: events_statements_current.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsStatementsCurrent.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source field: events_statements_current.SOURCE")
    public static final SqlColumn<String> source = eventsStatementsCurrent.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source field: events_statements_current.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsStatementsCurrent.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source field: events_statements_current.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsStatementsCurrent.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source field: events_statements_current.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsStatementsCurrent.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source field: events_statements_current.LOCK_TIME")
    public static final SqlColumn<Long> lockTime = eventsStatementsCurrent.lockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.DIGEST")
    public static final SqlColumn<String> digest = eventsStatementsCurrent.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.CURRENT_SCHEMA")
    public static final SqlColumn<String> currentSchema = eventsStatementsCurrent.currentSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = eventsStatementsCurrent.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = eventsStatementsCurrent.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.OBJECT_NAME")
    public static final SqlColumn<String> objectName = eventsStatementsCurrent.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = eventsStatementsCurrent.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.MYSQL_ERRNO")
    public static final SqlColumn<Integer> mysqlErrno = eventsStatementsCurrent.mysqlErrno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.RETURNED_SQLSTATE")
    public static final SqlColumn<String> returnedSqlstate = eventsStatementsCurrent.returnedSqlstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.MESSAGE_TEXT")
    public static final SqlColumn<String> messageText = eventsStatementsCurrent.messageText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.ERRORS")
    public static final SqlColumn<Long> errors = eventsStatementsCurrent.errors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.WARNINGS")
    public static final SqlColumn<Long> warnings = eventsStatementsCurrent.warnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.ROWS_AFFECTED")
    public static final SqlColumn<Long> rowsAffected = eventsStatementsCurrent.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.ROWS_SENT")
    public static final SqlColumn<Long> rowsSent = eventsStatementsCurrent.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.ROWS_EXAMINED")
    public static final SqlColumn<Long> rowsExamined = eventsStatementsCurrent.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.CREATED_TMP_DISK_TABLES")
    public static final SqlColumn<Long> createdTmpDiskTables = eventsStatementsCurrent.createdTmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.CREATED_TMP_TABLES")
    public static final SqlColumn<Long> createdTmpTables = eventsStatementsCurrent.createdTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.SELECT_FULL_JOIN")
    public static final SqlColumn<Long> selectFullJoin = eventsStatementsCurrent.selectFullJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.SELECT_FULL_RANGE_JOIN")
    public static final SqlColumn<Long> selectFullRangeJoin = eventsStatementsCurrent.selectFullRangeJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.SELECT_RANGE")
    public static final SqlColumn<Long> selectRange = eventsStatementsCurrent.selectRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.SELECT_RANGE_CHECK")
    public static final SqlColumn<Long> selectRangeCheck = eventsStatementsCurrent.selectRangeCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.SELECT_SCAN")
    public static final SqlColumn<Long> selectScan = eventsStatementsCurrent.selectScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.SORT_MERGE_PASSES")
    public static final SqlColumn<Long> sortMergePasses = eventsStatementsCurrent.sortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.SORT_RANGE")
    public static final SqlColumn<Long> sortRange = eventsStatementsCurrent.sortRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.219915+08:00", comments="Source field: events_statements_current.SORT_ROWS")
    public static final SqlColumn<Long> sortRows = eventsStatementsCurrent.sortRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source field: events_statements_current.SORT_SCAN")
    public static final SqlColumn<Long> sortScan = eventsStatementsCurrent.sortScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source field: events_statements_current.NO_INDEX_USED")
    public static final SqlColumn<Long> noIndexUsed = eventsStatementsCurrent.noIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source field: events_statements_current.NO_GOOD_INDEX_USED")
    public static final SqlColumn<Long> noGoodIndexUsed = eventsStatementsCurrent.noGoodIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source field: events_statements_current.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsStatementsCurrent.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source field: events_statements_current.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsStatementsCurrent.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source field: events_statements_current.NESTING_EVENT_LEVEL")
    public static final SqlColumn<Integer> nestingEventLevel = eventsStatementsCurrent.nestingEventLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source field: events_statements_current.STATEMENT_ID")
    public static final SqlColumn<Long> statementId = eventsStatementsCurrent.statementId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source field: events_statements_current.SQL_TEXT")
    public static final SqlColumn<String> sqlText = eventsStatementsCurrent.sqlText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source field: events_statements_current.DIGEST_TEXT")
    public static final SqlColumn<String> digestText = eventsStatementsCurrent.digestText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.218915+08:00", comments="Source Table: events_statements_current")
    public static final class EventsStatementsCurrent extends SqlTable {
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

        public EventsStatementsCurrent() {
            super("events_statements_current");
        }
    }
}