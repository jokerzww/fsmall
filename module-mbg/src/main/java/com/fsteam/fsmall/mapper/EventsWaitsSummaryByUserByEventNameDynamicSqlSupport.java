package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsWaitsSummaryByUserByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2029009+08:00", comments="Source Table: events_waits_summary_by_user_by_event_name")
    public static final EventsWaitsSummaryByUserByEventName eventsWaitsSummaryByUserByEventName = new EventsWaitsSummaryByUserByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: events_waits_summary_by_user_by_event_name.USER")
    public static final SqlColumn<String> user = eventsWaitsSummaryByUserByEventName.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: events_waits_summary_by_user_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsWaitsSummaryByUserByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: events_waits_summary_by_user_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsWaitsSummaryByUserByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: events_waits_summary_by_user_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsWaitsSummaryByUserByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: events_waits_summary_by_user_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsWaitsSummaryByUserByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: events_waits_summary_by_user_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsWaitsSummaryByUserByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: events_waits_summary_by_user_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsWaitsSummaryByUserByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source Table: events_waits_summary_by_user_by_event_name")
    public static final class EventsWaitsSummaryByUserByEventName extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public EventsWaitsSummaryByUserByEventName() {
            super("events_waits_summary_by_user_by_event_name");
        }
    }
}