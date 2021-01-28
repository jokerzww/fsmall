package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserSummaryByStatementTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0948012+08:00", comments="Source Table: user_summary_by_statement_type")
    public static final UserSummaryByStatementType userSummaryByStatementType = new UserSummaryByStatementType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0948012+08:00", comments="Source field: user_summary_by_statement_type.user")
    public static final SqlColumn<String> user = userSummaryByStatementType.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0948012+08:00", comments="Source field: user_summary_by_statement_type.statement")
    public static final SqlColumn<String> statement = userSummaryByStatementType.statement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0958018+08:00", comments="Source field: user_summary_by_statement_type.total")
    public static final SqlColumn<Long> total = userSummaryByStatementType.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0958018+08:00", comments="Source field: user_summary_by_statement_type.total_latency")
    public static final SqlColumn<String> totalLatency = userSummaryByStatementType.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0958018+08:00", comments="Source field: user_summary_by_statement_type.max_latency")
    public static final SqlColumn<String> maxLatency = userSummaryByStatementType.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0958018+08:00", comments="Source field: user_summary_by_statement_type.lock_latency")
    public static final SqlColumn<String> lockLatency = userSummaryByStatementType.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0958018+08:00", comments="Source field: user_summary_by_statement_type.rows_sent")
    public static final SqlColumn<Long> rowsSent = userSummaryByStatementType.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0958018+08:00", comments="Source field: user_summary_by_statement_type.rows_examined")
    public static final SqlColumn<Long> rowsExamined = userSummaryByStatementType.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0958018+08:00", comments="Source field: user_summary_by_statement_type.rows_affected")
    public static final SqlColumn<Long> rowsAffected = userSummaryByStatementType.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0958018+08:00", comments="Source field: user_summary_by_statement_type.full_scans")
    public static final SqlColumn<Long> fullScans = userSummaryByStatementType.fullScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0948012+08:00", comments="Source Table: user_summary_by_statement_type")
    public static final class UserSummaryByStatementType extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<String> statement = column("statement", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> lockLatency = column("lock_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsSent = column("rows_sent", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsExamined = column("rows_examined", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsAffected = column("rows_affected", JDBCType.BIGINT);

        public final SqlColumn<Long> fullScans = column("full_scans", JDBCType.BIGINT);

        public UserSummaryByStatementType() {
            super("user_summary_by_statement_type");
        }
    }
}