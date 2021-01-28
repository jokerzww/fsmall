package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStagesCurrentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: events_stages_current")
    public static final EventsStagesCurrent eventsStagesCurrent = new EventsStagesCurrent();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsStagesCurrent.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.EVENT_ID")
    public static final SqlColumn<Long> eventId = eventsStagesCurrent.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.END_EVENT_ID")
    public static final SqlColumn<Long> endEventId = eventsStagesCurrent.endEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsStagesCurrent.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.SOURCE")
    public static final SqlColumn<String> source = eventsStagesCurrent.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.TIMER_START")
    public static final SqlColumn<Long> timerStart = eventsStagesCurrent.timerStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.TIMER_END")
    public static final SqlColumn<Long> timerEnd = eventsStagesCurrent.timerEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.TIMER_WAIT")
    public static final SqlColumn<Long> timerWait = eventsStagesCurrent.timerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.WORK_COMPLETED")
    public static final SqlColumn<Long> workCompleted = eventsStagesCurrent.workCompleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.WORK_ESTIMATED")
    public static final SqlColumn<Long> workEstimated = eventsStagesCurrent.workEstimated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.NESTING_EVENT_ID")
    public static final SqlColumn<Long> nestingEventId = eventsStagesCurrent.nestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5211895+08:00", comments="Source field: events_stages_current.NESTING_EVENT_TYPE")
    public static final SqlColumn<String> nestingEventType = eventsStagesCurrent.nestingEventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: events_stages_current")
    public static final class EventsStagesCurrent extends SqlTable {
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

        public EventsStagesCurrent() {
            super("events_stages_current");
        }
    }
}