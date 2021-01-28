package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SocketSummaryByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source Table: socket_summary_by_event_name")
    public static final SocketSummaryByEventName socketSummaryByEventName = new SocketSummaryByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = socketSummaryByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = socketSummaryByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = socketSummaryByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = socketSummaryByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = socketSummaryByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = socketSummaryByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.COUNT_READ")
    public static final SqlColumn<Long> countRead = socketSummaryByEventName.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_READ")
    public static final SqlColumn<Long> sumTimerRead = socketSummaryByEventName.sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_READ")
    public static final SqlColumn<Long> minTimerRead = socketSummaryByEventName.minTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_READ")
    public static final SqlColumn<Long> avgTimerRead = socketSummaryByEventName.avgTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_READ")
    public static final SqlColumn<Long> maxTimerRead = socketSummaryByEventName.maxTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ")
    public static final SqlColumn<Long> sumNumberOfBytesRead = socketSummaryByEventName.sumNumberOfBytesRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.COUNT_WRITE")
    public static final SqlColumn<Long> countWrite = socketSummaryByEventName.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_WRITE")
    public static final SqlColumn<Long> sumTimerWrite = socketSummaryByEventName.sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_WRITE")
    public static final SqlColumn<Long> minTimerWrite = socketSummaryByEventName.minTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_WRITE")
    public static final SqlColumn<Long> avgTimerWrite = socketSummaryByEventName.avgTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_WRITE")
    public static final SqlColumn<Long> maxTimerWrite = socketSummaryByEventName.maxTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE")
    public static final SqlColumn<Long> sumNumberOfBytesWrite = socketSummaryByEventName.sumNumberOfBytesWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.COUNT_MISC")
    public static final SqlColumn<Long> countMisc = socketSummaryByEventName.countMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_MISC")
    public static final SqlColumn<Long> sumTimerMisc = socketSummaryByEventName.sumTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_MISC")
    public static final SqlColumn<Long> minTimerMisc = socketSummaryByEventName.minTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_MISC")
    public static final SqlColumn<Long> avgTimerMisc = socketSummaryByEventName.avgTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_MISC")
    public static final SqlColumn<Long> maxTimerMisc = socketSummaryByEventName.maxTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source Table: socket_summary_by_event_name")
    public static final class SocketSummaryByEventName extends SqlTable {
        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> countRead = column("COUNT_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerRead = column("SUM_TIMER_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerRead = column("MIN_TIMER_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerRead = column("AVG_TIMER_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerRead = column("MAX_TIMER_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> sumNumberOfBytesRead = column("SUM_NUMBER_OF_BYTES_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> countWrite = column("COUNT_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWrite = column("SUM_TIMER_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWrite = column("MIN_TIMER_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWrite = column("AVG_TIMER_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWrite = column("MAX_TIMER_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumNumberOfBytesWrite = column("SUM_NUMBER_OF_BYTES_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> countMisc = column("COUNT_MISC", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerMisc = column("SUM_TIMER_MISC", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerMisc = column("MIN_TIMER_MISC", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerMisc = column("AVG_TIMER_MISC", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerMisc = column("MAX_TIMER_MISC", JDBCType.BIGINT);

        public SocketSummaryByEventName() {
            super("socket_summary_by_event_name");
        }
    }
}