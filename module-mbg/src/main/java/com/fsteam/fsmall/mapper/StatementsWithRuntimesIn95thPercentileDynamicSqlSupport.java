package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatementsWithRuntimesIn95thPercentileDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    public static final StatementsWithRuntimesIn95thPercentile statementsWithRuntimesIn95thPercentile = new StatementsWithRuntimesIn95thPercentile();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.db")
    public static final SqlColumn<String> db = statementsWithRuntimesIn95thPercentile.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.full_scan")
    public static final SqlColumn<String> fullScan = statementsWithRuntimesIn95thPercentile.fullScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.exec_count")
    public static final SqlColumn<Long> execCount = statementsWithRuntimesIn95thPercentile.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.err_count")
    public static final SqlColumn<Long> errCount = statementsWithRuntimesIn95thPercentile.errCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.warn_count")
    public static final SqlColumn<Long> warnCount = statementsWithRuntimesIn95thPercentile.warnCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.total_latency")
    public static final SqlColumn<String> totalLatency = statementsWithRuntimesIn95thPercentile.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.max_latency")
    public static final SqlColumn<String> maxLatency = statementsWithRuntimesIn95thPercentile.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.avg_latency")
    public static final SqlColumn<String> avgLatency = statementsWithRuntimesIn95thPercentile.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.rows_sent")
    public static final SqlColumn<Long> rowsSent = statementsWithRuntimesIn95thPercentile.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.rows_sent_avg")
    public static final SqlColumn<BigDecimal> rowsSentAvg = statementsWithRuntimesIn95thPercentile.rowsSentAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.rows_examined")
    public static final SqlColumn<Long> rowsExamined = statementsWithRuntimesIn95thPercentile.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.rows_examined_avg")
    public static final SqlColumn<BigDecimal> rowsExaminedAvg = statementsWithRuntimesIn95thPercentile.rowsExaminedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.first_seen")
    public static final SqlColumn<Date> firstSeen = statementsWithRuntimesIn95thPercentile.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.last_seen")
    public static final SqlColumn<Date> lastSeen = statementsWithRuntimesIn95thPercentile.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.digest")
    public static final SqlColumn<String> digest = statementsWithRuntimesIn95thPercentile.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: statements_with_runtimes_in_95th_percentile.query")
    public static final SqlColumn<String> query = statementsWithRuntimesIn95thPercentile.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4331101+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    public static final class StatementsWithRuntimesIn95thPercentile extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<String> fullScan = column("full_scan", JDBCType.VARCHAR);

        public final SqlColumn<Long> execCount = column("exec_count", JDBCType.BIGINT);

        public final SqlColumn<Long> errCount = column("err_count", JDBCType.BIGINT);

        public final SqlColumn<Long> warnCount = column("warn_count", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsSent = column("rows_sent", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> rowsSentAvg = column("rows_sent_avg", JDBCType.DECIMAL);

        public final SqlColumn<Long> rowsExamined = column("rows_examined", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> rowsExaminedAvg = column("rows_examined_avg", JDBCType.DECIMAL);

        public final SqlColumn<Date> firstSeen = column("first_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("last_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<String> digest = column("digest", JDBCType.VARCHAR);

        public final SqlColumn<String> query = column("query", JDBCType.LONGVARCHAR);

        public StatementsWithRuntimesIn95thPercentile() {
            super("statements_with_runtimes_in_95th_percentile");
        }
    }
}