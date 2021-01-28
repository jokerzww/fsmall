package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsWaitsSummaryByThreadByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0978039+08:00", comments="Source Table: events_waits_summary_by_thread_by_event_name")
    public static final EventsWaitsSummaryByThreadByEventName eventsWaitsSummaryByThreadByEventName = new EventsWaitsSummaryByThreadByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0978039+08:00", comments="Source field: events_waits_summary_by_thread_by_event_name.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsWaitsSummaryByThreadByEventName.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0978039+08:00", comments="Source field: events_waits_summary_by_thread_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsWaitsSummaryByThreadByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.098805+08:00", comments="Source field: events_waits_summary_by_thread_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsWaitsSummaryByThreadByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.098805+08:00", comments="Source field: events_waits_summary_by_thread_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsWaitsSummaryByThreadByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.098805+08:00", comments="Source field: events_waits_summary_by_thread_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsWaitsSummaryByThreadByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.098805+08:00", comments="Source field: events_waits_summary_by_thread_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsWaitsSummaryByThreadByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.098805+08:00", comments="Source field: events_waits_summary_by_thread_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsWaitsSummaryByThreadByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0978039+08:00", comments="Source Table: events_waits_summary_by_thread_by_event_name")
    public static final class EventsWaitsSummaryByThreadByEventName extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public EventsWaitsSummaryByThreadByEventName() {
            super("events_waits_summary_by_thread_by_event_name");
        }
    }
}