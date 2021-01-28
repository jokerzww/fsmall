package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsTransactionsSummaryGlobalByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source Table: events_transactions_summary_global_by_event_name")
    public static final EventsTransactionsSummaryGlobalByEventName eventsTransactionsSummaryGlobalByEventName = new EventsTransactionsSummaryGlobalByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source field: events_transactions_summary_global_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsTransactionsSummaryGlobalByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source field: events_transactions_summary_global_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsTransactionsSummaryGlobalByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source field: events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsTransactionsSummaryGlobalByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source field: events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsTransactionsSummaryGlobalByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source field: events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsTransactionsSummaryGlobalByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source field: events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsTransactionsSummaryGlobalByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source field: events_transactions_summary_global_by_event_name.COUNT_READ_WRITE")
    public static final SqlColumn<Long> countReadWrite = eventsTransactionsSummaryGlobalByEventName.countReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source field: events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE")
    public static final SqlColumn<Long> sumTimerReadWrite = eventsTransactionsSummaryGlobalByEventName.sumTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source field: events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE")
    public static final SqlColumn<Long> minTimerReadWrite = eventsTransactionsSummaryGlobalByEventName.minTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source field: events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE")
    public static final SqlColumn<Long> avgTimerReadWrite = eventsTransactionsSummaryGlobalByEventName.avgTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.212909+08:00", comments="Source field: events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE")
    public static final SqlColumn<Long> maxTimerReadWrite = eventsTransactionsSummaryGlobalByEventName.maxTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.212909+08:00", comments="Source field: events_transactions_summary_global_by_event_name.COUNT_READ_ONLY")
    public static final SqlColumn<Long> countReadOnly = eventsTransactionsSummaryGlobalByEventName.countReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.212909+08:00", comments="Source field: events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY")
    public static final SqlColumn<Long> sumTimerReadOnly = eventsTransactionsSummaryGlobalByEventName.sumTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.212909+08:00", comments="Source field: events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY")
    public static final SqlColumn<Long> minTimerReadOnly = eventsTransactionsSummaryGlobalByEventName.minTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.212909+08:00", comments="Source field: events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY")
    public static final SqlColumn<Long> avgTimerReadOnly = eventsTransactionsSummaryGlobalByEventName.avgTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.212909+08:00", comments="Source field: events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY")
    public static final SqlColumn<Long> maxTimerReadOnly = eventsTransactionsSummaryGlobalByEventName.maxTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2119076+08:00", comments="Source Table: events_transactions_summary_global_by_event_name")
    public static final class EventsTransactionsSummaryGlobalByEventName extends SqlTable {
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

        public EventsTransactionsSummaryGlobalByEventName() {
            super("events_transactions_summary_global_by_event_name");
        }
    }
}