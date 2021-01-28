package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FileSummaryByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0857933+08:00", comments="Source Table: file_summary_by_event_name")
    public static final FileSummaryByEventName fileSummaryByEventName = new FileSummaryByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0857933+08:00", comments="Source field: file_summary_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = fileSummaryByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0857933+08:00", comments="Source field: file_summary_by_event_name.COUNT_STAR")
    public static final SqlColumn<Long> countStar = fileSummaryByEventName.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0857933+08:00", comments="Source field: file_summary_by_event_name.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = fileSummaryByEventName.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0857933+08:00", comments="Source field: file_summary_by_event_name.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = fileSummaryByEventName.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = fileSummaryByEventName.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = fileSummaryByEventName.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.COUNT_READ")
    public static final SqlColumn<Long> countRead = fileSummaryByEventName.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.SUM_TIMER_READ")
    public static final SqlColumn<Long> sumTimerRead = fileSummaryByEventName.sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.MIN_TIMER_READ")
    public static final SqlColumn<Long> minTimerRead = fileSummaryByEventName.minTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.AVG_TIMER_READ")
    public static final SqlColumn<Long> avgTimerRead = fileSummaryByEventName.avgTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.MAX_TIMER_READ")
    public static final SqlColumn<Long> maxTimerRead = fileSummaryByEventName.maxTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ")
    public static final SqlColumn<Long> sumNumberOfBytesRead = fileSummaryByEventName.sumNumberOfBytesRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.COUNT_WRITE")
    public static final SqlColumn<Long> countWrite = fileSummaryByEventName.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.SUM_TIMER_WRITE")
    public static final SqlColumn<Long> sumTimerWrite = fileSummaryByEventName.sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.MIN_TIMER_WRITE")
    public static final SqlColumn<Long> minTimerWrite = fileSummaryByEventName.minTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0867941+08:00", comments="Source field: file_summary_by_event_name.AVG_TIMER_WRITE")
    public static final SqlColumn<Long> avgTimerWrite = fileSummaryByEventName.avgTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0877958+08:00", comments="Source field: file_summary_by_event_name.MAX_TIMER_WRITE")
    public static final SqlColumn<Long> maxTimerWrite = fileSummaryByEventName.maxTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0877958+08:00", comments="Source field: file_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE")
    public static final SqlColumn<Long> sumNumberOfBytesWrite = fileSummaryByEventName.sumNumberOfBytesWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0877958+08:00", comments="Source field: file_summary_by_event_name.COUNT_MISC")
    public static final SqlColumn<Long> countMisc = fileSummaryByEventName.countMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0877958+08:00", comments="Source field: file_summary_by_event_name.SUM_TIMER_MISC")
    public static final SqlColumn<Long> sumTimerMisc = fileSummaryByEventName.sumTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0877958+08:00", comments="Source field: file_summary_by_event_name.MIN_TIMER_MISC")
    public static final SqlColumn<Long> minTimerMisc = fileSummaryByEventName.minTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0877958+08:00", comments="Source field: file_summary_by_event_name.AVG_TIMER_MISC")
    public static final SqlColumn<Long> avgTimerMisc = fileSummaryByEventName.avgTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0877958+08:00", comments="Source field: file_summary_by_event_name.MAX_TIMER_MISC")
    public static final SqlColumn<Long> maxTimerMisc = fileSummaryByEventName.maxTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0857933+08:00", comments="Source Table: file_summary_by_event_name")
    public static final class FileSummaryByEventName extends SqlTable {
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

        public FileSummaryByEventName() {
            super("file_summary_by_event_name");
        }
    }
}