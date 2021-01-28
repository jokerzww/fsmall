package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XStatementAnalysisDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$statement_analysis")
    public static final XStatementAnalysis XStatementAnalysis = new XStatementAnalysis();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.db")
    public static final SqlColumn<String> db = XStatementAnalysis.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.full_scan")
    public static final SqlColumn<String> fullScan = XStatementAnalysis.fullScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.exec_count")
    public static final SqlColumn<Long> execCount = XStatementAnalysis.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.err_count")
    public static final SqlColumn<Long> errCount = XStatementAnalysis.errCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.warn_count")
    public static final SqlColumn<Long> warnCount = XStatementAnalysis.warnCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.total_latency")
    public static final SqlColumn<Long> totalLatency = XStatementAnalysis.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.max_latency")
    public static final SqlColumn<Long> maxLatency = XStatementAnalysis.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.avg_latency")
    public static final SqlColumn<Long> avgLatency = XStatementAnalysis.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.lock_latency")
    public static final SqlColumn<Long> lockLatency = XStatementAnalysis.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.rows_sent")
    public static final SqlColumn<Long> rowsSent = XStatementAnalysis.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.rows_sent_avg")
    public static final SqlColumn<BigDecimal> rowsSentAvg = XStatementAnalysis.rowsSentAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.rows_examined")
    public static final SqlColumn<Long> rowsExamined = XStatementAnalysis.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.rows_examined_avg")
    public static final SqlColumn<BigDecimal> rowsExaminedAvg = XStatementAnalysis.rowsExaminedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.rows_affected")
    public static final SqlColumn<Long> rowsAffected = XStatementAnalysis.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.rows_affected_avg")
    public static final SqlColumn<BigDecimal> rowsAffectedAvg = XStatementAnalysis.rowsAffectedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.tmp_tables")
    public static final SqlColumn<Long> tmpTables = XStatementAnalysis.tmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.tmp_disk_tables")
    public static final SqlColumn<Long> tmpDiskTables = XStatementAnalysis.tmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.rows_sorted")
    public static final SqlColumn<Long> rowsSorted = XStatementAnalysis.rowsSorted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.sort_merge_passes")
    public static final SqlColumn<Long> sortMergePasses = XStatementAnalysis.sortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.digest")
    public static final SqlColumn<String> digest = XStatementAnalysis.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.first_seen")
    public static final SqlColumn<Date> firstSeen = XStatementAnalysis.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.last_seen")
    public static final SqlColumn<Date> lastSeen = XStatementAnalysis.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4741473+08:00", comments="Source field: x$statement_analysis.query")
    public static final SqlColumn<String> query = XStatementAnalysis.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$statement_analysis")
    public static final class XStatementAnalysis extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<String> fullScan = column("full_scan", JDBCType.VARCHAR);

        public final SqlColumn<Long> execCount = column("exec_count", JDBCType.BIGINT);

        public final SqlColumn<Long> errCount = column("err_count", JDBCType.BIGINT);

        public final SqlColumn<Long> warnCount = column("warn_count", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> avgLatency = column("avg_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> lockLatency = column("lock_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsSent = column("rows_sent", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> rowsSentAvg = column("rows_sent_avg", JDBCType.DECIMAL);

        public final SqlColumn<Long> rowsExamined = column("rows_examined", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> rowsExaminedAvg = column("rows_examined_avg", JDBCType.DECIMAL);

        public final SqlColumn<Long> rowsAffected = column("rows_affected", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> rowsAffectedAvg = column("rows_affected_avg", JDBCType.DECIMAL);

        public final SqlColumn<Long> tmpTables = column("tmp_tables", JDBCType.BIGINT);

        public final SqlColumn<Long> tmpDiskTables = column("tmp_disk_tables", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsSorted = column("rows_sorted", JDBCType.BIGINT);

        public final SqlColumn<Long> sortMergePasses = column("sort_merge_passes", JDBCType.BIGINT);

        public final SqlColumn<String> digest = column("digest", JDBCType.VARCHAR);

        public final SqlColumn<Date> firstSeen = column("first_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("last_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<String> query = column("query", JDBCType.LONGVARCHAR);

        public XStatementAnalysis() {
            super("x$statement_analysis");
        }
    }
}