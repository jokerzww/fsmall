package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XHostSummaryByStatementTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: x$host_summary_by_statement_type")
    public static final XHostSummaryByStatementType XHostSummaryByStatementType = new XHostSummaryByStatementType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.host")
    public static final SqlColumn<String> host = XHostSummaryByStatementType.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.statement")
    public static final SqlColumn<String> statement = XHostSummaryByStatementType.statement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.total")
    public static final SqlColumn<Long> total = XHostSummaryByStatementType.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.total_latency")
    public static final SqlColumn<Long> totalLatency = XHostSummaryByStatementType.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.max_latency")
    public static final SqlColumn<Long> maxLatency = XHostSummaryByStatementType.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: x$host_summary_by_statement_type.lock_latency")
    public static final SqlColumn<Long> lockLatency = XHostSummaryByStatementType.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: x$host_summary_by_statement_type.rows_sent")
    public static final SqlColumn<Long> rowsSent = XHostSummaryByStatementType.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: x$host_summary_by_statement_type.rows_examined")
    public static final SqlColumn<Long> rowsExamined = XHostSummaryByStatementType.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: x$host_summary_by_statement_type.rows_affected")
    public static final SqlColumn<Long> rowsAffected = XHostSummaryByStatementType.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: x$host_summary_by_statement_type.full_scans")
    public static final SqlColumn<Long> fullScans = XHostSummaryByStatementType.fullScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: x$host_summary_by_statement_type")
    public static final class XHostSummaryByStatementType extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<String> statement = column("statement", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> lockLatency = column("lock_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsSent = column("rows_sent", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsExamined = column("rows_examined", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsAffected = column("rows_affected", JDBCType.BIGINT);

        public final SqlColumn<Long> fullScans = column("full_scans", JDBCType.BIGINT);

        public XHostSummaryByStatementType() {
            super("x$host_summary_by_statement_type");
        }
    }
}