package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStagesHistoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source Table: events_stages_history")
    public static final EventsStagesHistory eventsStagesHistory = new EventsStagesHistory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsStagesHistory.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsStagesHistory.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsStagesHistory.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsStagesHistory.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.SOURCE")
    public static final SqlColumn<String> source = eventsStagesHistory.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsStagesHistory.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsStagesHistory.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsStagesHistory.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.WORK_COMPLETED")
    public static final SqlColumn<Long> workCompleted = eventsStagesHistory.workCompleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.WORK_ESTIMATED")
    public static final SqlColumn<Long> workEstimated = eventsStagesHistory.workEstimated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsStagesHistory.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source field: events_stages_history.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsStagesHistory.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source Table: events_stages_history")
    public static final class EventsStagesHistory extends SqlTable {
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

        public EventsStagesHistory() {
            super("events_stages_history");
        }
    }
}