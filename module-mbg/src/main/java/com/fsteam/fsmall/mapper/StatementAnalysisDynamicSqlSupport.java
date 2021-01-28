package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatementAnalysisDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2699609+08:00", comments="Source Table: statement_analysis")
    public static final StatementAnalysis statementAnalysis = new StatementAnalysis();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2699609+08:00", comments="Source field: statement_analysis.db")
    public static final SqlColumn<String> db = statementAnalysis.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2699609+08:00", comments="Source field: statement_analysis.full_scan")
    public static final SqlColumn<String> fullScan = statementAnalysis.fullScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2699609+08:00", comments="Source field: statement_analysis.exec_count")
    public static final SqlColumn<Long> execCount = statementAnalysis.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2699609+08:00", comments="Source field: statement_analysis.err_count")
    public static final SqlColumn<Long> errCount = statementAnalysis.errCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2699609+08:00", comments="Source field: statement_analysis.warn_count")
    public static final SqlColumn<Long> warnCount = statementAnalysis.warnCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2699609+08:00", comments="Source field: statement_analysis.total_latency")
    public static final SqlColumn<String> totalLatency = statementAnalysis.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2699609+08:00", comments="Source field: statement_analysis.max_latency")
    public static final SqlColumn<String> maxLatency = statementAnalysis.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2699609+08:00", comments="Source field: statement_analysis.avg_latency")
    public static final SqlColumn<String> avgLatency = statementAnalysis.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.lock_latency")
    public static final SqlColumn<String> lockLatency = statementAnalysis.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.rows_sent")
    public static final SqlColumn<Long> rowsSent = statementAnalysis.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.rows_sent_avg")
    public static final SqlColumn<BigDecimal> rowsSentAvg = statementAnalysis.rowsSentAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.rows_examined")
    public static final SqlColumn<Long> rowsExamined = statementAnalysis.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.rows_examined_avg")
    public static final SqlColumn<BigDecimal> rowsExaminedAvg = statementAnalysis.rowsExaminedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.rows_affected")
    public static final SqlColumn<Long> rowsAffected = statementAnalysis.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.rows_affected_avg")
    public static final SqlColumn<BigDecimal> rowsAffectedAvg = statementAnalysis.rowsAffectedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.tmp_tables")
    public static final SqlColumn<Long> tmpTables = statementAnalysis.tmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.tmp_disk_tables")
    public static final SqlColumn<Long> tmpDiskTables = statementAnalysis.tmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.rows_sorted")
    public static final SqlColumn<Long> rowsSorted = statementAnalysis.rowsSorted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.sort_merge_passes")
    public static final SqlColumn<Long> sortMergePasses = statementAnalysis.sortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.digest")
    public static final SqlColumn<String> digest = statementAnalysis.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.first_seen")
    public static final SqlColumn<Date> firstSeen = statementAnalysis.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.last_seen")
    public static final SqlColumn<Date> lastSeen = statementAnalysis.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2709612+08:00", comments="Source field: statement_analysis.query")
    public static final SqlColumn<String> query = statementAnalysis.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2699609+08:00", comments="Source Table: statement_analysis")
    public static final class StatementAnalysis extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<String> fullScan = column("full_scan", JDBCType.VARCHAR);

        public final SqlColumn<Long> execCount = column("exec_count", JDBCType.BIGINT);

        public final SqlColumn<Long> errCount = column("err_count", JDBCType.BIGINT);

        public final SqlColumn<Long> warnCount = column("warn_count", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> lockLatency = column("lock_latency", JDBCType.VARCHAR);

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

        public StatementAnalysis() {
            super("statement_analysis");
        }
    }
}