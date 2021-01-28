package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsWaitsSummaryByHostByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0697777+08:00", comments="Source Table: events_waits_summary_by_host_by_event_name")
    public static final EventsWaitsSummaryByHostByEventName eventsWaitsSummaryByHostByEventName = new EventsWaitsSummaryByHostByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0697777+08:00", comments="Source field: events_waits_summary_by_host_by_event_name.HOST")
    public static final SqlColumn<String> host = eventsWaitsSummaryByHostByEventName.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0697777+08:00", comments="Source field: events_waits_summary_by_host_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsWaitsSummaryByHostByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0697777+08:00", comments="Source field: events_waits_summary_by_host_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsWaitsSummaryByHostByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0697777+08:00", comments="Source field: events_waits_summary_by_host_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsWaitsSummaryByHostByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0697777+08:00", comments="Source field: events_waits_summary_by_host_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsWaitsSummaryByHostByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0707788+08:00", comments="Source field: events_waits_summary_by_host_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsWaitsSummaryByHostByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0707788+08:00", comments="Source field: events_waits_summary_by_host_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsWaitsSummaryByHostByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0697777+08:00", comments="Source Table: events_waits_summary_by_host_by_event_name")
    public static final class EventsWaitsSummaryByHostByEventName extends SqlTable {
        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public EventsWaitsSummaryByHostByEventName() {
            super("events_waits_summary_by_host_by_event_name");
        }
    }
}