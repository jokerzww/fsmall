package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsTransactionsCurrentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0657742+08:00", comments="Source Table: events_transactions_current")
    public static final EventsTransactionsCurrent eventsTransactionsCurrent = new EventsTransactionsCurrent();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0657742+08:00", comments="Source field: events_transactions_current.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsTransactionsCurrent.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0657742+08:00", comments="Source field: events_transactions_current.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsTransactionsCurrent.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0657742+08:00", comments="Source field: events_transactions_current.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsTransactionsCurrent.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0657742+08:00", comments="Source field: events_transactions_current.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsTransactionsCurrent.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.STATE")
    public static final SqlColumn<String> state = eventsTransactionsCurrent.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.TRX_ID")
    public static final SqlColumn<Long> trxId = eventsTransactionsCurrent.trxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.GTID")
    public static final SqlColumn<String> gtid = eventsTransactionsCurrent.gtid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.XID_FORMAT_ID")
    public static final SqlColumn<Integer> xidFormatId = eventsTransactionsCurrent.xidFormatId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.XID_GTRID")
    public static final SqlColumn<String> xidGtrid = eventsTransactionsCurrent.xidGtrid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.XID_BQUAL")
    public static final SqlColumn<String> xidBqual = eventsTransactionsCurrent.xidBqual;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.XA_STATE")
    public static final SqlColumn<String> xaState = eventsTransactionsCurrent.xaState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.SOURCE")
    public static final SqlColumn<String> source = eventsTransactionsCurrent.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsTransactionsCurrent.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsTransactionsCurrent.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0667759+08:00", comments="Source field: events_transactions_current.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsTransactionsCurrent.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0677763+08:00", comments="Source field: events_transactions_current.ACCESS_MODE")
    public static final SqlColumn<String> accessMode = eventsTransactionsCurrent.accessMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0677763+08:00", comments="Source field: events_transactions_current.ISOLATION_LEVEL")
    public static final SqlColumn<String> isolationLevel = eventsTransactionsCurrent.isolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0677763+08:00", comments="Source field: events_transactions_current.AUTOCOMMIT")
    public static final SqlColumn<String> autocommit = eventsTransactionsCurrent.autocommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0677763+08:00", comments="Source field: events_transactions_current.NUMBER_OF_SAVEPOINTS")
    public static final SqlColumn<Long> numberOfSavepoints = eventsTransactionsCurrent.numberOfSavepoints;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0677763+08:00", comments="Source field: events_transactions_current.NUMBER_OF_ROLLBACK_TO_SAVEPOINT")
    public static final SqlColumn<Long> numberOfRollbackToSavepoint = eventsTransactionsCurrent.numberOfRollbackToSavepoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0677763+08:00", comments="Source field: events_transactions_current.NUMBER_OF_RELEASE_SAVEPOINT")
    public static final SqlColumn<Long> numberOfReleaseSavepoint = eventsTransactionsCurrent.numberOfReleaseSavepoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0677763+08:00", comments="Source field: events_transactions_current.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = eventsTransactionsCurrent.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0677763+08:00", comments="Source field: events_transactions_current.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsTransactionsCurrent.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0677763+08:00", comments="Source field: events_transactions_current.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsTransactionsCurrent.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0657742+08:00", comments="Source Table: events_transactions_current")
    public static final class EventsTransactionsCurrent extends SqlTable {
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

        public EventsTransactionsCurrent() {
            super("events_transactions_current");
        }
    }
}