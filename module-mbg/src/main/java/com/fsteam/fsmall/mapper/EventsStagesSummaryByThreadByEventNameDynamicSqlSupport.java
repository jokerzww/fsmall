package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStagesSummaryByThreadByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source Table: events_stages_summary_by_thread_by_event_name")
    public static final EventsStagesSummaryByThreadByEventName eventsStagesSummaryByThreadByEventName = new EventsStagesSummaryByThreadByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsStagesSummaryByThreadByEventName.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsStagesSummaryByThreadByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsStagesSummaryByThreadByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsStagesSummaryByThreadByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2029009+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsStagesSummaryByThreadByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2029009+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsStagesSummaryByThreadByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2029009+08:00", comments="Source field: events_stages_summary_by_thread_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsStagesSummaryByThreadByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2018986+08:00", comments="Source Table: events_stages_summary_by_thread_by_event_name")
    public static final class EventsStagesSummaryByThreadByEventName extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public EventsStagesSummaryByThreadByEventName() {
            super("events_stages_summary_by_thread_by_event_name");
        }
    }
}