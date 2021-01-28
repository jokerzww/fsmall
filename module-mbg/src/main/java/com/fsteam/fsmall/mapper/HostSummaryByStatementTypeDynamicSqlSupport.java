package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HostSummaryByStatementTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source Table: host_summary_by_statement_type")
    public static final HostSummaryByStatementType hostSummaryByStatementType = new HostSummaryByStatementType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source field: host_summary_by_statement_type.host")
    public static final SqlColumn<String> host = hostSummaryByStatementType.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source field: host_summary_by_statement_type.statement")
    public static final SqlColumn<String> statement = hostSummaryByStatementType.statement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source field: host_summary_by_statement_type.total")
    public static final SqlColumn<Long> total = hostSummaryByStatementType.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source field: host_summary_by_statement_type.total_latency")
    public static final SqlColumn<String> totalLatency = hostSummaryByStatementType.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source field: host_summary_by_statement_type.max_latency")
    public static final SqlColumn<String> maxLatency = hostSummaryByStatementType.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source field: host_summary_by_statement_type.lock_latency")
    public static final SqlColumn<String> lockLatency = hostSummaryByStatementType.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source field: host_summary_by_statement_type.rows_sent")
    public static final SqlColumn<Long> rowsSent = hostSummaryByStatementType.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source field: host_summary_by_statement_type.rows_examined")
    public static final SqlColumn<Long> rowsExamined = hostSummaryByStatementType.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source field: host_summary_by_statement_type.rows_affected")
    public static final SqlColumn<Long> rowsAffected = hostSummaryByStatementType.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source field: host_summary_by_statement_type.full_scans")
    public static final SqlColumn<Long> fullScans = hostSummaryByStatementType.fullScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2849746+08:00", comments="Source Table: host_summary_by_statement_type")
    public static final class HostSummaryByStatementType extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<String> statement = column("statement", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> lockLatency = column("lock_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsSent = column("rows_sent", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsExamined = column("rows_examined", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsAffected = column("rows_affected", JDBCType.BIGINT);

        public final SqlColumn<Long> fullScans = column("full_scans", JDBCType.BIGINT);

        public HostSummaryByStatementType() {
            super("host_summary_by_statement_type");
        }
    }
}