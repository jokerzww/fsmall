package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XHostSummaryByStatementLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source Table: x$host_summary_by_statement_latency")
    public static final XHostSummaryByStatementLatency XHostSummaryByStatementLatency = new XHostSummaryByStatementLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source field: x$host_summary_by_statement_latency.host")
    public static final SqlColumn<String> host = XHostSummaryByStatementLatency.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source field: x$host_summary_by_statement_latency.total")
    public static final SqlColumn<BigDecimal> total = XHostSummaryByStatementLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source field: x$host_summary_by_statement_latency.total_latency")
    public static final SqlColumn<BigDecimal> totalLatency = XHostSummaryByStatementLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source field: x$host_summary_by_statement_latency.max_latency")
    public static final SqlColumn<Long> maxLatency = XHostSummaryByStatementLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source field: x$host_summary_by_statement_latency.lock_latency")
    public static final SqlColumn<BigDecimal> lockLatency = XHostSummaryByStatementLatency.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source field: x$host_summary_by_statement_latency.rows_sent")
    public static final SqlColumn<BigDecimal> rowsSent = XHostSummaryByStatementLatency.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source field: x$host_summary_by_statement_latency.rows_examined")
    public static final SqlColumn<BigDecimal> rowsExamined = XHostSummaryByStatementLatency.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source field: x$host_summary_by_statement_latency.rows_affected")
    public static final SqlColumn<BigDecimal> rowsAffected = XHostSummaryByStatementLatency.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source field: x$host_summary_by_statement_latency.full_scans")
    public static final SqlColumn<BigDecimal> fullScans = XHostSummaryByStatementLatency.fullScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3680507+08:00", comments="Source Table: x$host_summary_by_statement_latency")
    public static final class XHostSummaryByStatementLatency extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> total = column("total", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalLatency = column("total_latency", JDBCType.DECIMAL);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> lockLatency = column("lock_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsSent = column("rows_sent", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsExamined = column("rows_examined", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsAffected = column("rows_affected", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> fullScans = column("full_scans", JDBCType.DECIMAL);

        public XHostSummaryByStatementLatency() {
            super("x$host_summary_by_statement_latency");
        }
    }
}