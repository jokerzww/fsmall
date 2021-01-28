package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsWaitsSummaryByInstanceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_waits_summary_by_instance")
    public static final EventsWaitsSummaryByInstance eventsWaitsSummaryByInstance = new EventsWaitsSummaryByInstance();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source field: events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = eventsWaitsSummaryByInstance.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source field: events_waits_summary_by_instance.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsWaitsSummaryByInstance.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3029911+08:00", comments="Source field: events_waits_summary_by_instance.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsWaitsSummaryByInstance.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3029911+08:00", comments="Source field: events_waits_summary_by_instance.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsWaitsSummaryByInstance.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3029911+08:00", comments="Source field: events_waits_summary_by_instance.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsWaitsSummaryByInstance.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3029911+08:00", comments="Source field: events_waits_summary_by_instance.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsWaitsSummaryByInstance.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3029911+08:00", comments="Source field: events_waits_summary_by_instance.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsWaitsSummaryByInstance.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_waits_summary_by_instance")
    public static final class EventsWaitsSummaryByInstance extends SqlTable {
        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public EventsWaitsSummaryByInstance() {
            super("events_waits_summary_by_instance");
        }
    }
}