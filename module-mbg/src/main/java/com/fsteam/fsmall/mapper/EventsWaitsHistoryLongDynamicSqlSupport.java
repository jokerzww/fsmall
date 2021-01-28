package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsWaitsHistoryLongDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source Table: events_waits_history_long")
    public static final EventsWaitsHistoryLong eventsWaitsHistoryLong = new EventsWaitsHistoryLong();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsWaitsHistoryLong.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsWaitsHistoryLong.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsWaitsHistoryLong.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsWaitsHistoryLong.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.SOURCE")
    public static final SqlColumn<String> source = eventsWaitsHistoryLong.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsWaitsHistoryLong.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsWaitsHistoryLong.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsWaitsHistoryLong.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.SPINS")
    public static final SqlColumn<Integer> spins = eventsWaitsHistoryLong.spins;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = eventsWaitsHistoryLong.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source field: events_waits_history_long.OBJECT_NAME")
    public static final SqlColumn<String> objectName = eventsWaitsHistoryLong.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source field: events_waits_history_long.INDEX_NAME")
    public static final SqlColumn<String> indexName = eventsWaitsHistoryLong.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source field: events_waits_history_long.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = eventsWaitsHistoryLong.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source field: events_waits_history_long.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = eventsWaitsHistoryLong.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source field: events_waits_history_long.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsWaitsHistoryLong.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source field: events_waits_history_long.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsWaitsHistoryLong.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source field: events_waits_history_long.OPERATION")
    public static final SqlColumn<String> operation = eventsWaitsHistoryLong.operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source field: events_waits_history_long.NUMBER_OF_BYTES")
    public static final SqlColumn<Long> numberOfBytes = eventsWaitsHistoryLong.numberOfBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source field: events_waits_history_long.FLAGS")
    public static final SqlColumn<Integer> flags = eventsWaitsHistoryLong.flags;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2099077+08:00", comments="Source Table: events_waits_history_long")
    public static final class EventsWaitsHistoryLong extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> eventId = column("EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> endEventId = column("END_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("SOURCE", JDBCType.VARCHAR);

        public final SqlColumn<Long> timerStart = column("TIMER_START", JDBCType.BIGINT);

        public final SqlColumn<Long> timerEnd = column("TIMER_END", JDBCType.BIGINT);

        public final SqlColumn<Long> timerWait = column("TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Integer> spins = column("SPINS", JDBCType.INTEGER);

        public final SqlColumn<String> objectSchema = column("OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("OBJECT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("INDEX_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> objectType = column("OBJECT_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<Long> nestingEventId = column("NESTING_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> nestingEventType = column("NESTING_EVENT_TYPE", JDBCType.CHAR);

        public final SqlColumn<String> operation = column("OPERATION", JDBCType.VARCHAR);

        public final SqlColumn<Long> numberOfBytes = column("NUMBER_OF_BYTES", JDBCType.BIGINT);

        public final SqlColumn<Integer> flags = column("FLAGS", JDBCType.INTEGER);

        public EventsWaitsHistoryLong() {
            super("events_waits_history_long");
        }
    }
}