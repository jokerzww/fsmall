package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsTransactionsHistoryLongDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source Table: events_transactions_history_long")
    public static final EventsTransactionsHistoryLong eventsTransactionsHistoryLong = new EventsTransactionsHistoryLong();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsTransactionsHistoryLong.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsTransactionsHistoryLong.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsTransactionsHistoryLong.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsTransactionsHistoryLong.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.STATE")
    public static final SqlColumn<String> state = eventsTransactionsHistoryLong.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TRX_ID")
    public static final SqlColumn<Long> trxId = eventsTransactionsHistoryLong.trxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.GTID")
    public static final SqlColumn<String> gtid = eventsTransactionsHistoryLong.gtid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_FORMAT_ID")
    public static final SqlColumn<Integer> xidFormatId = eventsTransactionsHistoryLong.xidFormatId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_GTRID")
    public static final SqlColumn<String> xidGtrid = eventsTransactionsHistoryLong.xidGtrid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XID_BQUAL")
    public static final SqlColumn<String> xidBqual = eventsTransactionsHistoryLong.xidBqual;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.XA_STATE")
    public static final SqlColumn<String> xaState = eventsTransactionsHistoryLong.xaState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.SOURCE")
    public static final SqlColumn<String> source = eventsTransactionsHistoryLong.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsTransactionsHistoryLong.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source field: events_transactions_history_long.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsTransactionsHistoryLong.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5522181+08:00", comments="Source field: events_transactions_history_long.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsTransactionsHistoryLong.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5522181+08:00", comments="Source field: events_transactions_history_long.ACCESS_MODE")
    public static final SqlColumn<String> accessMode = eventsTransactionsHistoryLong.accessMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5522181+08:00", comments="Source field: events_transactions_history_long.ISOLATION_LEVEL")
    public static final SqlColumn<String> isolationLevel = eventsTransactionsHistoryLong.isolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5522181+08:00", comments="Source field: events_transactions_history_long.AUTOCOMMIT")
    public static final SqlColumn<String> autocommit = eventsTransactionsHistoryLong.autocommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5522181+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_SAVEPOINTS")
    public static final SqlColumn<Long> numberOfSavepoints = eventsTransactionsHistoryLong.numberOfSavepoints;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5522181+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_ROLLBACK_TO_SAVEPOINT")
    public static final SqlColumn<Long> numberOfRollbackToSavepoint = eventsTransactionsHistoryLong.numberOfRollbackToSavepoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5522181+08:00", comments="Source field: events_transactions_history_long.NUMBER_OF_RELEASE_SAVEPOINT")
    public static final SqlColumn<Long> numberOfReleaseSavepoint = eventsTransactionsHistoryLong.numberOfReleaseSavepoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5522181+08:00", comments="Source field: events_transactions_history_long.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = eventsTransactionsHistoryLong.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5522181+08:00", comments="Source field: events_transactions_history_long.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsTransactionsHistoryLong.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5522181+08:00", comments="Source field: events_transactions_history_long.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsTransactionsHistoryLong.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5512173+08:00", comments="Source Table: events_transactions_history_long")
    public static final class EventsTransactionsHistoryLong extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> eventId = column("EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> endEventId = column("END_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> state = column("STATE", JDBCType.CHAR);

        public final SqlColumn<Long> trxId = column("TRX_ID", JDBCType.BIGINT);

        public final SqlColumn<String> gtid = column("GTID", JDBCType.VARCHAR);

        public final SqlColumn<Integer> xidFormatId = column("XID_FORMAT_ID", JDBCType.INTEGER);

        public final SqlColumn<String> xidGtrid = column("XID_GTRID", JDBCType.VARCHAR);

        public final SqlColumn<String> xidBqual = column("XID_BQUAL", JDBCType.VARCHAR);

        public final SqlColumn<String> xaState = column("XA_STATE", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("SOURCE", JDBCType.VARCHAR);

        public final SqlColumn<Long> timerStart = column("TIMER_START", JDBCType.BIGINT);

        public final SqlColumn<Long> timerEnd = column("TIMER_END", JDBCType.BIGINT);

        public final SqlColumn<Long> timerWait = column("TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<String> accessMode = column("ACCESS_MODE", JDBCType.CHAR);

        public final SqlColumn<String> isolationLevel = column("ISOLATION_LEVEL", JDBCType.VARCHAR);

        public final SqlColumn<String> autocommit = column("AUTOCOMMIT", JDBCType.CHAR);

        public final SqlColumn<Long> numberOfSavepoints = column("NUMBER_OF_SAVEPOINTS", JDBCType.BIGINT);

        public final SqlColumn<Long> numberOfRollbackToSavepoint = column("NUMBER_OF_ROLLBACK_TO_SAVEPOINT", JDBCType.BIGINT);

        public final SqlColumn<Long> numberOfReleaseSavepoint = column("NUMBER_OF_RELEASE_SAVEPOINT", JDBCType.BIGINT);

        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<Long> nestingEventId = column("NESTING_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> nestingEventType = column("NESTING_EVENT_TYPE", JDBCType.CHAR);

        public EventsTransactionsHistoryLong() {
            super("events_transactions_history_long");
        }
    }
}