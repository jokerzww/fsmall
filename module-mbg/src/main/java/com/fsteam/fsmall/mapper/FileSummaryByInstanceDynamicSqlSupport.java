package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FileSummaryByInstanceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source Table: file_summary_by_instance")
    public static final FileSummaryByInstance fileSummaryByInstance = new FileSummaryByInstance();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = fileSummaryByInstance.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.FILE_NAME")
    public static final SqlColumn<String> fileName = fileSummaryByInstance.fileName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.EVENT_NAME")
    public static final SqlColumn<String> eventName = fileSummaryByInstance.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.COUNT_STAR")
    public static final SqlColumn<Long> countStar = fileSummaryByInstance.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = fileSummaryByInstance.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = fileSummaryByInstance.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = fileSummaryByInstance.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = fileSummaryByInstance.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.COUNT_READ")
    public static final SqlColumn<Long> countRead = fileSummaryByInstance.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.SUM_TIMER_READ")
    public static final SqlColumn<Long> sumTimerRead = fileSummaryByInstance.sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.MIN_TIMER_READ")
    public static final SqlColumn<Long> minTimerRead = fileSummaryByInstance.minTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.AVG_TIMER_READ")
    public static final SqlColumn<Long> avgTimerRead = fileSummaryByInstance.avgTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.MAX_TIMER_READ")
    public static final SqlColumn<Long> maxTimerRead = fileSummaryByInstance.maxTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source field: file_summary_by_instance.SUM_NUMBER_OF_BYTES_READ")
    public static final SqlColumn<Long> sumNumberOfBytesRead = fileSummaryByInstance.sumNumberOfBytesRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.COUNT_WRITE")
    public static final SqlColumn<Long> countWrite = fileSummaryByInstance.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.SUM_TIMER_WRITE")
    public static final SqlColumn<Long> sumTimerWrite = fileSummaryByInstance.sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.MIN_TIMER_WRITE")
    public static final SqlColumn<Long> minTimerWrite = fileSummaryByInstance.minTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.AVG_TIMER_WRITE")
    public static final SqlColumn<Long> avgTimerWrite = fileSummaryByInstance.avgTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.MAX_TIMER_WRITE")
    public static final SqlColumn<Long> maxTimerWrite = fileSummaryByInstance.maxTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE")
    public static final SqlColumn<Long> sumNumberOfBytesWrite = fileSummaryByInstance.sumNumberOfBytesWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.COUNT_MISC")
    public static final SqlColumn<Long> countMisc = fileSummaryByInstance.countMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.SUM_TIMER_MISC")
    public static final SqlColumn<Long> sumTimerMisc = fileSummaryByInstance.sumTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.MIN_TIMER_MISC")
    public static final SqlColumn<Long> minTimerMisc = fileSummaryByInstance.minTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.AVG_TIMER_MISC")
    public static final SqlColumn<Long> avgTimerMisc = fileSummaryByInstance.avgTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2579497+08:00", comments="Source field: file_summary_by_instance.MAX_TIMER_MISC")
    public static final SqlColumn<Long> maxTimerMisc = fileSummaryByInstance.maxTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2569486+08:00", comments="Source Table: file_summary_by_instance")
    public static final class FileSummaryByInstance extends SqlTable {
        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<String> fileName = column("FILE_NAME", JDBCType.VARCHAR);

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

        public FileSummaryByInstance() {
            super("file_summary_by_instance");
        }
    }
}