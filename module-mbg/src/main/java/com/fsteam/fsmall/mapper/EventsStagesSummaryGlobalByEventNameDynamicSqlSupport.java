package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStagesSummaryGlobalByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4291057+08:00", comments="Source Table: events_stages_summary_global_by_event_name")
    public static final EventsStagesSummaryGlobalByEventName eventsStagesSummaryGlobalByEventName = new EventsStagesSummaryGlobalByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4301077+08:00", comments="Source field: events_stages_summary_global_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsStagesSummaryGlobalByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4301077+08:00", comments="Source field: events_stages_summary_global_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsStagesSummaryGlobalByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4301077+08:00", comments="Source field: events_stages_summary_global_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsStagesSummaryGlobalByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4301077+08:00", comments="Source field: events_stages_summary_global_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsStagesSummaryGlobalByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4301077+08:00", comments="Source field: events_stages_summary_global_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsStagesSummaryGlobalByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4301077+08:00", comments="Source field: events_stages_summary_global_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsStagesSummaryGlobalByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4301077+08:00", comments="Source Table: events_stages_summary_global_by_event_name")
    public static final class EventsStagesSummaryGlobalByEventName extends SqlTable {
        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public EventsStagesSummaryGlobalByEventName() {
            super("events_stages_summary_global_by_event_name");
        }
    }
}