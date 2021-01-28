package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsTransactionsSummaryByThreadByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    public static final EventsTransactionsSummaryByThreadByEventName eventsTransactionsSummaryByThreadByEventName = new EventsTransactionsSummaryByThreadByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.THREAD_ID")
    public static final SqlColumn<Long> threadId = eventsTransactionsSummaryByThreadByEventName.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsTransactionsSummaryByThreadByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsTransactionsSummaryByThreadByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsTransactionsSummaryByThreadByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsTransactionsSummaryByThreadByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsTransactionsSummaryByThreadByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsTransactionsSummaryByThreadByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.COUNT_READ_WRITE")
    public static final SqlColumn<Long> countReadWrite = eventsTransactionsSummaryByThreadByEventName.countReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.SUM_TIMER_READ_WRITE")
    public static final SqlColumn<Long> sumTimerReadWrite = eventsTransactionsSummaryByThreadByEventName.sumTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.MIN_TIMER_READ_WRITE")
    public static final SqlColumn<Long> minTimerReadWrite = eventsTransactionsSummaryByThreadByEventName.minTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.AVG_TIMER_READ_WRITE")
    public static final SqlColumn<Long> avgTimerReadWrite = eventsTransactionsSummaryByThreadByEventName.avgTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.MAX_TIMER_READ_WRITE")
    public static final SqlColumn<Long> maxTimerReadWrite = eventsTransactionsSummaryByThreadByEventName.maxTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.COUNT_READ_ONLY")
    public static final SqlColumn<Long> countReadOnly = eventsTransactionsSummaryByThreadByEventName.countReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.SUM_TIMER_READ_ONLY")
    public static final SqlColumn<Long> sumTimerReadOnly = eventsTransactionsSummaryByThreadByEventName.sumTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.MIN_TIMER_READ_ONLY")
    public static final SqlColumn<Long> minTimerReadOnly = eventsTransactionsSummaryByThreadByEventName.minTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.AVG_TIMER_READ_ONLY")
    public static final SqlColumn<Long> avgTimerReadOnly = eventsTransactionsSummaryByThreadByEventName.avgTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source field: events_transactions_summary_by_thread_by_event_name.MAX_TIMER_READ_ONLY")
    public static final SqlColumn<Long> maxTimerReadOnly = eventsTransactionsSummaryByThreadByEventName.maxTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2799702+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    public static final class EventsTransactionsSummaryByThreadByEventName extends SqlTable {
        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

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

        public EventsTransactionsSummaryByThreadByEventName() {
            super("events_transactions_summary_by_thread_by_event_name");
        }
    }
}