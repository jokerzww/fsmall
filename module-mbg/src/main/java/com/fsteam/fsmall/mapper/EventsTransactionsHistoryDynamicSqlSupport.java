package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsTransactionsHistoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source Table: events_transactions_history")
    public static final EventsTransactionsHistory eventsTransactionsHistory = new EventsTransactionsHistory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source field: events_transactions_history.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsTransactionsHistory.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source field: events_transactions_history.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsTransactionsHistory.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source field: events_transactions_history.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsTransactionsHistory.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source field: events_transactions_history.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsTransactionsHistory.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source field: events_transactions_history.STATE")
    public static final SqlColumn<String> state = eventsTransactionsHistory.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source field: events_transactions_history.TRX_ID")
    public static final SqlColumn<Long> trxId = eventsTransactionsHistory.trxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source field: events_transactions_history.GTID")
    public static final SqlColumn<String> gtid = eventsTransactionsHistory.gtid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source field: events_transactions_history.XID_FORMAT_ID")
    public static final SqlColumn<Integer> xidFormatId = eventsTransactionsHistory.xidFormatId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source field: events_transactions_history.XID_GTRID")
    public static final SqlColumn<String> xidGtrid = eventsTransactionsHistory.xidGtrid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source field: events_transactions_history.XID_BQUAL")
    public static final SqlColumn<String> xidBqual = eventsTransactionsHistory.xidBqual;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.XA_STATE")
    public static final SqlColumn<String> xaState = eventsTransactionsHistory.xaState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.SOURCE")
    public static final SqlColumn<String> source = eventsTransactionsHistory.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsTransactionsHistory.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsTransactionsHistory.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsTransactionsHistory.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.ACCESS_MODE")
    public static final SqlColumn<String> accessMode = eventsTransactionsHistory.accessMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.ISOLATION_LEVEL")
    public static final SqlColumn<String> isolationLevel = eventsTransactionsHistory.isolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.AUTOCOMMIT")
    public static final SqlColumn<String> autocommit = eventsTransactionsHistory.autocommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.NUMBER_OF_SAVEPOINTS")
    public static final SqlColumn<Long> numberOfSavepoints = eventsTransactionsHistory.numberOfSavepoints;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.NUMBER_OF_ROLLBACK_TO_SAVEPOINT")
    public static final SqlColumn<Long> numberOfRollbackToSavepoint = eventsTransactionsHistory.numberOfRollbackToSavepoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.NUMBER_OF_RELEASE_SAVEPOINT")
    public static final SqlColumn<Long> numberOfReleaseSavepoint = eventsTransactionsHistory.numberOfReleaseSavepoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = eventsTransactionsHistory.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsTransactionsHistory.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source field: events_transactions_history.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsTransactionsHistory.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3089969+08:00", comments="Source Table: events_transactions_history")
    public static final class EventsTransactionsHistory extends SqlTable {
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

        public EventsTransactionsHistory() {
            super("events_transactions_history");
        }
    }
}