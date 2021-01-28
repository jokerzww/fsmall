package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStagesHistoryLongDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source Table: events_stages_history_long")
    public static final EventsStagesHistoryLong eventsStagesHistoryLong = new EventsStagesHistoryLong();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsStagesHistoryLong.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsStagesHistoryLong.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsStagesHistoryLong.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsStagesHistoryLong.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.SOURCE")
    public static final SqlColumn<String> source = eventsStagesHistoryLong.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsStagesHistoryLong.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsStagesHistoryLong.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsStagesHistoryLong.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.WORK_COMPLETED")
    public static final SqlColumn<Long> workCompleted = eventsStagesHistoryLong.workCompleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.WORK_ESTIMATED")
    public static final SqlColumn<Long> workEstimated = eventsStagesHistoryLong.workEstimated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsStagesHistoryLong.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source field: events_stages_history_long.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsStagesHistoryLong.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source Table: events_stages_history_long")
    public static final class EventsStagesHistoryLong extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> eventId = column("EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> endEventId = column("END_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("SOURCE", JDBCType.VARCHAR);

        public final SqlColumn<Long> timerStart = column("TIMER_START", JDBCType.BIGINT);

        public final SqlColumn<Long> timerEnd = column("TIMER_END", JDBCType.BIGINT);

        public final SqlColumn<Long> timerWait = column("TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> workCompleted = column("WORK_COMPLETED", JDBCType.BIGINT);

        public final SqlColumn<Long> workEstimated = column("WORK_ESTIMATED", JDBCType.BIGINT);

        public final SqlColumn<Long> nestingEventId = column("NESTING_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> nestingEventType = column("NESTING_EVENT_TYPE", JDBCType.CHAR);

        public EventsStagesHistoryLong() {
            super("events_stages_history_long");
        }
    }
}