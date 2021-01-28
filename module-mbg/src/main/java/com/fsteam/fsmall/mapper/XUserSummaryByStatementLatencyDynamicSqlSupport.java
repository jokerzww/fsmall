package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XUserSummaryByStatementLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source Table: x$user_summary_by_statement_latency")
    public static final XUserSummaryByStatementLatency XUserSummaryByStatementLatency = new XUserSummaryByStatementLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.user")
    public static final SqlColumn<String> user = XUserSummaryByStatementLatency.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.total")
    public static final SqlColumn<BigDecimal> total = XUserSummaryByStatementLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.total_latency")
    public static final SqlColumn<BigDecimal> totalLatency = XUserSummaryByStatementLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.max_latency")
    public static final SqlColumn<BigDecimal> maxLatency = XUserSummaryByStatementLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.lock_latency")
    public static final SqlColumn<BigDecimal> lockLatency = XUserSummaryByStatementLatency.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_sent")
    public static final SqlColumn<BigDecimal> rowsSent = XUserSummaryByStatementLatency.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_examined")
    public static final SqlColumn<BigDecimal> rowsExamined = XUserSummaryByStatementLatency.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_affected")
    public static final SqlColumn<BigDecimal> rowsAffected = XUserSummaryByStatementLatency.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3290146+08:00", comments="Source field: x$user_summary_by_statement_latency.full_scans")
    public static final SqlColumn<BigDecimal> fullScans = XUserSummaryByStatementLatency.fullScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source Table: x$user_summary_by_statement_latency")
    public static final class XUserSummaryByStatementLatency extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> total = column("total", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalLatency = column("total_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> maxLatency = column("max_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> lockLatency = column("lock_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsSent = column("rows_sent", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsExamined = column("rows_examined", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsAffected = column("rows_affected", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> fullScans = column("full_scans", JDBCType.DECIMAL);

        public XUserSummaryByStatementLatency() {
            super("x$user_summary_by_statement_latency");
        }
    }
}