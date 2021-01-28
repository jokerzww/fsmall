package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XUserSummaryByStatementTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4050841+08:00", comments="Source Table: x$user_summary_by_statement_type")
    public static final XUserSummaryByStatementType XUserSummaryByStatementType = new XUserSummaryByStatementType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4050841+08:00", comments="Source field: x$user_summary_by_statement_type.user")
    public static final SqlColumn<String> user = XUserSummaryByStatementType.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4050841+08:00", comments="Source field: x$user_summary_by_statement_type.statement")
    public static final SqlColumn<String> statement = XUserSummaryByStatementType.statement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.406085+08:00", comments="Source field: x$user_summary_by_statement_type.total")
    public static final SqlColumn<Long> total = XUserSummaryByStatementType.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.406085+08:00", comments="Source field: x$user_summary_by_statement_type.total_latency")
    public static final SqlColumn<Long> totalLatency = XUserSummaryByStatementType.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.406085+08:00", comments="Source field: x$user_summary_by_statement_type.max_latency")
    public static final SqlColumn<Long> maxLatency = XUserSummaryByStatementType.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.406085+08:00", comments="Source field: x$user_summary_by_statement_type.lock_latency")
    public static final SqlColumn<Long> lockLatency = XUserSummaryByStatementType.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.406085+08:00", comments="Source field: x$user_summary_by_statement_type.rows_sent")
    public static final SqlColumn<Long> rowsSent = XUserSummaryByStatementType.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.406085+08:00", comments="Source field: x$user_summary_by_statement_type.rows_examined")
    public static final SqlColumn<Long> rowsExamined = XUserSummaryByStatementType.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.406085+08:00", comments="Source field: x$user_summary_by_statement_type.rows_affected")
    public static final SqlColumn<Long> rowsAffected = XUserSummaryByStatementType.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.406085+08:00", comments="Source field: x$user_summary_by_statement_type.full_scans")
    public static final SqlColumn<Long> fullScans = XUserSummaryByStatementType.fullScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4050841+08:00", comments="Source Table: x$user_summary_by_statement_type")
    public static final class XUserSummaryByStatementType extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<String> statement = column("statement", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> lockLatency = column("lock_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsSent = column("rows_sent", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsExamined = column("rows_examined", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsAffected = column("rows_affected", JDBCType.BIGINT);

        public final SqlColumn<Long> fullScans = column("full_scans", JDBCType.BIGINT);

        public XUserSummaryByStatementType() {
            super("x$user_summary_by_statement_type");
        }
    }
}