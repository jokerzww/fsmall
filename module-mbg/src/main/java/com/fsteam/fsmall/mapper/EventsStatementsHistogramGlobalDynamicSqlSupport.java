package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStatementsHistogramGlobalDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: events_statements_histogram_global")
    public static final EventsStatementsHistogramGlobal eventsStatementsHistogramGlobal = new EventsStatementsHistogramGlobal();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_NUMBER")
    public static final SqlColumn<Integer> bucketNumber = eventsStatementsHistogramGlobal.bucketNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_TIMER_LOW")
    public static final SqlColumn<Long> bucketTimerLow = eventsStatementsHistogramGlobal.bucketTimerLow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_TIMER_HIGH")
    public static final SqlColumn<Long> bucketTimerHigh = eventsStatementsHistogramGlobal.bucketTimerHigh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.COUNT_BUCKET")
    public static final SqlColumn<Long> countBucket = eventsStatementsHistogramGlobal.countBucket;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.COUNT_BUCKET_AND_LOWER")
    public static final SqlColumn<Long> countBucketAndLower = eventsStatementsHistogramGlobal.countBucketAndLower;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_QUANTILE")
    public static final SqlColumn<Double> bucketQuantile = eventsStatementsHistogramGlobal.bucketQuantile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: events_statements_histogram_global")
    public static final class EventsStatementsHistogramGlobal extends SqlTable {
        public final SqlColumn<Integer> bucketNumber = column("BUCKET_NUMBER", JDBCType.INTEGER);

        public final SqlColumn<Long> bucketTimerLow = column("BUCKET_TIMER_LOW", JDBCType.BIGINT);

        public final SqlColumn<Long> bucketTimerHigh = column("BUCKET_TIMER_HIGH", JDBCType.BIGINT);

        public final SqlColumn<Long> countBucket = column("COUNT_BUCKET", JDBCType.BIGINT);

        public final SqlColumn<Long> countBucketAndLower = column("COUNT_BUCKET_AND_LOWER", JDBCType.BIGINT);

        public final SqlColumn<Double> bucketQuantile = column("BUCKET_QUANTILE", JDBCType.DOUBLE);

        public EventsStatementsHistogramGlobal() {
            super("events_statements_histogram_global");
        }
    }
}