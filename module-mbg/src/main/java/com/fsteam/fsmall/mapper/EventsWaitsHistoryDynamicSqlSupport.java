package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsWaitsHistoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: events_waits_history")
    public static final EventsWaitsHistory eventsWaitsHistory = new EventsWaitsHistory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source field: events_waits_history.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsWaitsHistory.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsWaitsHistory.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsWaitsHistory.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsWaitsHistory.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.SOURCE")
    public static final SqlColumn<String> source = eventsWaitsHistory.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsWaitsHistory.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsWaitsHistory.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsWaitsHistory.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.SPINS")
    public static final SqlColumn<Integer> spins = eventsWaitsHistory.spins;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = eventsWaitsHistory.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.OBJECT_NAME")
    public static final SqlColumn<String> objectName = eventsWaitsHistory.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.INDEX_NAME")
    public static final SqlColumn<String> indexName = eventsWaitsHistory.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = eventsWaitsHistory.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = eventsWaitsHistory.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsWaitsHistory.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsWaitsHistory.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.OPERATION")
    public static final SqlColumn<String> operation = eventsWaitsHistory.operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.NUMBER_OF_BYTES")
    public static final SqlColumn<Long> numberOfBytes = eventsWaitsHistory.numberOfBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4931646+08:00", comments="Source field: events_waits_history.FLAGS")
    public static final SqlColumn<Integer> flags = eventsWaitsHistory.flags;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: events_waits_history")
    public static final class EventsWaitsHistory extends SqlTable {
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

        public EventsWaitsHistory() {
            super("events_waits_history");
        }
    }
}