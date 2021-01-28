package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsTransactionsSummaryByUserByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source Table: events_transactions_summary_by_user_by_event_name")
    public static final EventsTransactionsSummaryByUserByEventName eventsTransactionsSummaryByUserByEventName = new EventsTransactionsSummaryByUserByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.USER")
    public static final SqlColumn<String> user = eventsTransactionsSummaryByUserByEventName.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = eventsTransactionsSummaryByUserByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = eventsTransactionsSummaryByUserByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = eventsTransactionsSummaryByUserByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = eventsTransactionsSummaryByUserByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = eventsTransactionsSummaryByUserByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = eventsTransactionsSummaryByUserByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.COUNT_READ_WRITE")
    public static final SqlColumn<Long> countReadWrite = eventsTransactionsSummaryByUserByEventName.countReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_WRITE")
    public static final SqlColumn<Long> sumTimerReadWrite = eventsTransactionsSummaryByUserByEventName.sumTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_WRITE")
    public static final SqlColumn<Long> minTimerReadWrite = eventsTransactionsSummaryByUserByEventName.minTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_WRITE")
    public static final SqlColumn<Long> avgTimerReadWrite = eventsTransactionsSummaryByUserByEventName.avgTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_WRITE")
    public static final SqlColumn<Long> maxTimerReadWrite = eventsTransactionsSummaryByUserByEventName.maxTimerReadWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.COUNT_READ_ONLY")
    public static final SqlColumn<Long> countReadOnly = eventsTransactionsSummaryByUserByEventName.countReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_ONLY")
    public static final SqlColumn<Long> sumTimerReadOnly = eventsTransactionsSummaryByUserByEventName.sumTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_ONLY")
    public static final SqlColumn<Long> minTimerReadOnly = eventsTransactionsSummaryByUserByEventName.minTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_ONLY")
    public static final SqlColumn<Long> avgTimerReadOnly = eventsTransactionsSummaryByUserByEventName.avgTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4050841+08:00", comments="Source field: events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_ONLY")
    public static final SqlColumn<Long> maxTimerReadOnly = eventsTransactionsSummaryByUserByEventName.maxTimerReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4040831+08:00", comments="Source Table: events_transactions_summary_by_user_by_event_name")
    public static final class EventsTransactionsSummaryByUserByEventName extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

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

        public EventsTransactionsSummaryByUserByEventName() {
            super("events_transactions_summary_by_user_by_event_name");
        }
    }
}