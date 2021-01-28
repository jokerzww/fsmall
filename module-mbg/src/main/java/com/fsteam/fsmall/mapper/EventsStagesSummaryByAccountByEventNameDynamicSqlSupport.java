package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStagesSummaryByAccountByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2959842+08:00", comments="Source Table: events_stages_summary_by_account_by_event_name")
    public static final EventsStagesSummaryByAccountByEventName eventsStagesSummaryByAccountByEventName = new EventsStagesSummaryByAccountByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2959842+08:00", comments="Source field: events_stages_summary_by_account_by_event_name.USER")
    public static final SqlColumn<String> user = eventsStagesSummaryByAccountByEventName.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2959842+08:00", comments="Source field: events_stages_summary_by_account_by_event_name.HOST")
    public static final SqlColumn<String> host = eventsStagesSummaryByAccountByEventName.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2959842+08:00", comments="Source field: events_stages_summary_by_account_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsStagesSummaryByAccountByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2959842+08:00", comments="Source field: events_stages_summary_by_account_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsStagesSummaryByAccountByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2959842+08:00", comments="Source field: events_stages_summary_by_account_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsStagesSummaryByAccountByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2959842+08:00", comments="Source field: events_stages_summary_by_account_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsStagesSummaryByAccountByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2959842+08:00", comments="Source field: events_stages_summary_by_account_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsStagesSummaryByAccountByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2959842+08:00", comments="Source field: events_stages_summary_by_account_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsStagesSummaryByAccountByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2959842+08:00", comments="Source Table: events_stages_summary_by_account_by_event_name")
    public static final class EventsStagesSummaryByAccountByEventName extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public EventsStagesSummaryByAccountByEventName() {
            super("events_stages_summary_by_account_by_event_name");
        }
    }
}