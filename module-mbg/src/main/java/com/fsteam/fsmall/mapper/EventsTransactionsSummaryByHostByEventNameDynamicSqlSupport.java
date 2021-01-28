package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsTransactionsSummaryByHostByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source Table: events_transactions_summary_by_host_by_event_name")
    public static final EventsTransactionsSummaryByHostByEventName eventsTransactionsSummaryByHostByEventName = new EventsTransactionsSummaryByHostByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.HOST")
    public static final SqlColumn<String> host = eventsTransactionsSummaryByHostByEventName.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsTransactionsSummaryByHostByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsTransactionsSummaryByHostByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsTransactionsSummaryByHostByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsTransactionsSummaryByHostByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsTransactionsSummaryByHostByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsTransactionsSummaryByHostByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.COUNT_READ_WRITE")
    public static final SqlColumn<Long> countReadWrite = eventsTransactionsSummaryByHostByEventName.countReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.SUM_TIMER_READ_WRITE")
    public static final SqlColumn<Long> sumTimerReadWrite = eventsTransactionsSummaryByHostByEventName.sumTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.MIN_TIMER_READ_WRITE")
    public static final SqlColumn<Long> minTimerReadWrite = eventsTransactionsSummaryByHostByEventName.minTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.AVG_TIMER_READ_WRITE")
    public static final SqlColumn<Long> avgTimerReadWrite = eventsTransactionsSummaryByHostByEventName.avgTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.MAX_TIMER_READ_WRITE")
    public static final SqlColumn<Long> maxTimerReadWrite = eventsTransactionsSummaryByHostByEventName.maxTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.COUNT_READ_ONLY")
    public static final SqlColumn<Long> countReadOnly = eventsTransactionsSummaryByHostByEventName.countReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.SUM_TIMER_READ_ONLY")
    public static final SqlColumn<Long> sumTimerReadOnly = eventsTransactionsSummaryByHostByEventName.sumTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.15986+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.MIN_TIMER_READ_ONLY")
    public static final SqlColumn<Long> minTimerReadOnly = eventsTransactionsSummaryByHostByEventName.minTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.15986+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.AVG_TIMER_READ_ONLY")
    public static final SqlColumn<Long> avgTimerReadOnly = eventsTransactionsSummaryByHostByEventName.avgTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.15986+08:00", comments="Source field: events_transactions_summary_by_host_by_event_name.MAX_TIMER_READ_ONLY")
    public static final SqlColumn<Long> maxTimerReadOnly = eventsTransactionsSummaryByHostByEventName.maxTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1588602+08:00", comments="Source Table: events_transactions_summary_by_host_by_event_name")
    public static final class EventsTransactionsSummaryByHostByEventName extends SqlTable {
        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> countReadWrite = column("COUNT_READ_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerReadWrite = column("SUM_TIMER_READ_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerReadWrite = column("MIN_TIMER_READ_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerReadWrite = column("AVG_TIMER_READ_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerReadWrite = column("MAX_TIMER_READ_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> countReadOnly = column("COUNT_READ_ONLY", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerReadOnly = column("SUM_TIMER_READ_ONLY", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerReadOnly = column("MIN_TIMER_READ_ONLY", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerReadOnly = column("AVG_TIMER_READ_ONLY", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerReadOnly = column("MAX_TIMER_READ_ONLY", JDBCType.BIGINT);

        public EventsTransactionsSummaryByHostByEventName() {
            super("events_transactions_summary_by_host_by_event_name");
        }
    }
}