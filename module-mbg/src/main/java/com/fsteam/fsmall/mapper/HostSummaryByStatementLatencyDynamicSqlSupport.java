package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HostSummaryByStatementLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source Table: host_summary_by_statement_latency")
    public static final HostSummaryByStatementLatency hostSummaryByStatementLatency = new HostSummaryByStatementLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source field: host_summary_by_statement_latency.host")
    public static final SqlColumn<String> host = hostSummaryByStatementLatency.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source field: host_summary_by_statement_latency.total")
    public static final SqlColumn<BigDecimal> total = hostSummaryByStatementLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source field: host_summary_by_statement_latency.total_latency")
    public static final SqlColumn<String> totalLatency = hostSummaryByStatementLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source field: host_summary_by_statement_latency.max_latency")
    public static final SqlColumn<String> maxLatency = hostSummaryByStatementLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source field: host_summary_by_statement_latency.lock_latency")
    public static final SqlColumn<String> lockLatency = hostSummaryByStatementLatency.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source field: host_summary_by_statement_latency.rows_sent")
    public static final SqlColumn<BigDecimal> rowsSent = hostSummaryByStatementLatency.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source field: host_summary_by_statement_latency.rows_examined")
    public static final SqlColumn<BigDecimal> rowsExamined = hostSummaryByStatementLatency.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source field: host_summary_by_statement_latency.rows_affected")
    public static final SqlColumn<BigDecimal> rowsAffected = hostSummaryByStatementLatency.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source field: host_summary_by_statement_latency.full_scans")
    public static final SqlColumn<BigDecimal> fullScans = hostSummaryByStatementLatency.fullScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3119986+08:00", comments="Source Table: host_summary_by_statement_latency")
    public static final class HostSummaryByStatementLatency extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> total = column("total", JDBCType.DECIMAL);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> lockLatency = column("lock_latency", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> rowsSent = column("rows_sent", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsExamined = column("rows_examined", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsAffected = column("rows_affected", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> fullScans = column("full_scans", JDBCType.DECIMAL);

        public HostSummaryByStatementLatency() {
            super("host_summary_by_statement_latency");
        }
    }
}