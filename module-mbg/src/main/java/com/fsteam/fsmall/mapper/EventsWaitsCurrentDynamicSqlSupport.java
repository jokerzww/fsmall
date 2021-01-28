package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsWaitsCurrentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source Table: events_waits_current")
    public static final EventsWaitsCurrent eventsWaitsCurrent = new EventsWaitsCurrent();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsWaitsCurrent.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsWaitsCurrent.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsWaitsCurrent.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsWaitsCurrent.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.SOURCE")
    public static final SqlColumn<String> source = eventsWaitsCurrent.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source field: events_waits_current.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsWaitsCurrent.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsWaitsCurrent.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsWaitsCurrent.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.SPINS")
    public static final SqlColumn<Integer> spins = eventsWaitsCurrent.spins;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = eventsWaitsCurrent.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.OBJECT_NAME")
    public static final SqlColumn<String> objectName = eventsWaitsCurrent.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.INDEX_NAME")
    public static final SqlColumn<String> indexName = eventsWaitsCurrent.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = eventsWaitsCurrent.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = eventsWaitsCurrent.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsWaitsCurrent.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsWaitsCurrent.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.OPERATION")
    public static final SqlColumn<String> operation = eventsWaitsCurrent.operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.NUMBER_OF_BYTES")
    public static final SqlColumn<Long> numberOfBytes = eventsWaitsCurrent.numberOfBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2149108+08:00", comments="Source field: events_waits_current.FLAGS")
    public static final SqlColumn<Integer> flags = eventsWaitsCurrent.flags;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2139094+08:00", comments="Source Table: events_waits_current")
    public static final class EventsWaitsCurrent extends SqlTable {
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

        public EventsWaitsCurrent() {
            super("events_waits_current");
        }
    }
}