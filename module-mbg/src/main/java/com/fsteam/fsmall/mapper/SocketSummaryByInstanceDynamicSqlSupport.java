package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SocketSummaryByInstanceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source Table: socket_summary_by_instance")
    public static final SocketSummaryByInstance socketSummaryByInstance = new SocketSummaryByInstance();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = socketSummaryByInstance.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.EVENT_NAME")
    public static final SqlColumn<String> eventName = socketSummaryByInstance.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.COUNT_STAR")
    public static final SqlColumn<Long> countStar = socketSummaryByInstance.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = socketSummaryByInstance.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = socketSummaryByInstance.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = socketSummaryByInstance.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = socketSummaryByInstance.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.COUNT_READ")
    public static final SqlColumn<Long> countRead = socketSummaryByInstance.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.SUM_TIMER_READ")
    public static final SqlColumn<Long> sumTimerRead = socketSummaryByInstance.sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.MIN_TIMER_READ")
    public static final SqlColumn<Long> minTimerRead = socketSummaryByInstance.minTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.AVG_TIMER_READ")
    public static final SqlColumn<Long> avgTimerRead = socketSummaryByInstance.avgTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.MAX_TIMER_READ")
    public static final SqlColumn<Long> maxTimerRead = socketSummaryByInstance.maxTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.SUM_NUMBER_OF_BYTES_READ")
    public static final SqlColumn<Long> sumNumberOfBytesRead = socketSummaryByInstance.sumNumberOfBytesRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.COUNT_WRITE")
    public static final SqlColumn<Long> countWrite = socketSummaryByInstance.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.SUM_TIMER_WRITE")
    public static final SqlColumn<Long> sumTimerWrite = socketSummaryByInstance.sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.MIN_TIMER_WRITE")
    public static final SqlColumn<Long> minTimerWrite = socketSummaryByInstance.minTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.AVG_TIMER_WRITE")
    public static final SqlColumn<Long> avgTimerWrite = socketSummaryByInstance.avgTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.MAX_TIMER_WRITE")
    public static final SqlColumn<Long> maxTimerWrite = socketSummaryByInstance.maxTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE")
    public static final SqlColumn<Long> sumNumberOfBytesWrite = socketSummaryByInstance.sumNumberOfBytesWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source field: socket_summary_by_instance.COUNT_MISC")
    public static final SqlColumn<Long> countMisc = socketSummaryByInstance.countMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source field: socket_summary_by_instance.SUM_TIMER_MISC")
    public static final SqlColumn<Long> sumTimerMisc = socketSummaryByInstance.sumTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source field: socket_summary_by_instance.MIN_TIMER_MISC")
    public static final SqlColumn<Long> minTimerMisc = socketSummaryByInstance.minTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source field: socket_summary_by_instance.AVG_TIMER_MISC")
    public static final SqlColumn<Long> avgTimerMisc = socketSummaryByInstance.avgTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source field: socket_summary_by_instance.MAX_TIMER_MISC")
    public static final SqlColumn<Long> maxTimerMisc = socketSummaryByInstance.maxTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1948927+08:00", comments="Source Table: socket_summary_by_instance")
    public static final class SocketSummaryByInstance extends SqlTable {
        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

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

        public SocketSummaryByInstance() {
            super("socket_summary_by_instance");
        }
    }
}