package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsStatementsHistogramByDigestDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0037178+08:00", comments="Source Table: events_statements_histogram_by_digest")
    public static final EventsStatementsHistogramByDigest eventsStatementsHistogramByDigest = new EventsStatementsHistogramByDigest();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0047188+08:00", comments="Source field: events_statements_histogram_by_digest.SCHEMA_NAME")
    public static final SqlColumn<String> schemaName = eventsStatementsHistogramByDigest.schemaName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.00572+08:00", comments="Source field: events_statements_histogram_by_digest.DIGEST")
    public static final SqlColumn<String> digest = eventsStatementsHistogramByDigest.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.00572+08:00", comments="Source field: events_statements_histogram_by_digest.BUCKET_NUMBER")
    public static final SqlColumn<Integer> bucketNumber = eventsStatementsHistogramByDigest.bucketNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.00572+08:00", comments="Source field: events_statements_histogram_by_digest.BUCKET_TIMER_LOW")
    public static final SqlColumn<Long> bucketTimerLow = eventsStatementsHistogramByDigest.bucketTimerLow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.00572+08:00", comments="Source field: events_statements_histogram_by_digest.BUCKET_TIMER_HIGH")
    public static final SqlColumn<Long> bucketTimerHigh = eventsStatementsHistogramByDigest.bucketTimerHigh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0067209+08:00", comments="Source field: events_statements_histogram_by_digest.COUNT_BUCKET")
    public static final SqlColumn<Long> countBucket = eventsStatementsHistogramByDigest.countBucket;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0067209+08:00", comments="Source field: events_statements_histogram_by_digest.COUNT_BUCKET_AND_LOWER")
    public static final SqlColumn<Long> countBucketAndLower = eventsStatementsHistogramByDigest.countBucketAndLower;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0067209+08:00", comments="Source field: events_statements_histogram_by_digest.BUCKET_QUANTILE")
    public static final SqlColumn<Double> bucketQuantile = eventsStatementsHistogramByDigest.bucketQuantile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0047188+08:00", comments="Source Table: events_statements_histogram_by_digest")
    public static final class EventsStatementsHistogramByDigest extends SqlTable {
        public final SqlColumn<String> schemaName = column("SCHEMA_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> digest = column("DIGEST", JDBCType.VARCHAR);

        public final SqlColumn<Integer> bucketNumber = column("BUCKET_NUMBER", JDBCType.INTEGER);

        public final SqlColumn<Long> bucketTimerLow = column("BUCKET_TIMER_LOW", JDBCType.BIGINT);

        public final SqlColumn<Long> bucketTimerHigh = column("BUCKET_TIMER_HIGH", JDBCType.BIGINT);

        public final SqlColumn<Long> countBucket = column("COUNT_BUCKET", JDBCType.BIGINT);

        public final SqlColumn<Long> countBucketAndLower = column("COUNT_BUCKET_AND_LOWER", JDBCType.BIGINT);

        public final SqlColumn<Double> bucketQuantile = column("BUCKET_QUANTILE", JDBCType.DOUBLE);

        public EventsStatementsHistogramByDigest() {
            super("events_statements_histogram_by_digest");
        }
    }
}