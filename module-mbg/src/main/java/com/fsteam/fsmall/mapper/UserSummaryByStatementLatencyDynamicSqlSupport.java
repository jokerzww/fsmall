package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserSummaryByStatementLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5442102+08:00", comments="Source Table: user_summary_by_statement_latency")
    public static final UserSummaryByStatementLatency userSummaryByStatementLatency = new UserSummaryByStatementLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5442102+08:00", comments="Source field: user_summary_by_statement_latency.user")
    public static final SqlColumn<String> user = userSummaryByStatementLatency.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5442102+08:00", comments="Source field: user_summary_by_statement_latency.total")
    public static final SqlColumn<BigDecimal> total = userSummaryByStatementLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5442102+08:00", comments="Source field: user_summary_by_statement_latency.total_latency")
    public static final SqlColumn<String> totalLatency = userSummaryByStatementLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5442102+08:00", comments="Source field: user_summary_by_statement_latency.max_latency")
    public static final SqlColumn<String> maxLatency = userSummaryByStatementLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5442102+08:00", comments="Source field: user_summary_by_statement_latency.lock_latency")
    public static final SqlColumn<String> lockLatency = userSummaryByStatementLatency.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5442102+08:00", comments="Source field: user_summary_by_statement_latency.rows_sent")
    public static final SqlColumn<BigDecimal> rowsSent = userSummaryByStatementLatency.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source field: user_summary_by_statement_latency.rows_examined")
    public static final SqlColumn<BigDecimal> rowsExamined = userSummaryByStatementLatency.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source field: user_summary_by_statement_latency.rows_affected")
    public static final SqlColumn<BigDecimal> rowsAffected = userSummaryByStatementLatency.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source field: user_summary_by_statement_latency.full_scans")
    public static final SqlColumn<BigDecimal> fullScans = userSummaryByStatementLatency.fullScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5442102+08:00", comments="Source Table: user_summary_by_statement_latency")
    public static final class UserSummaryByStatementLatency extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> total = column("total", JDBCType.DECIMAL);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> lockLatency = column("lock_latency", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> rowsSent = column("rows_sent", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsExamined = column("rows_examined", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsAffected = column("rows_affected", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> fullScans = column("full_scans", JDBCType.DECIMAL);

        public UserSummaryByStatementLatency() {
            super("user_summary_by_statement_latency");
        }
    }
}