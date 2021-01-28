package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XStatementsWithErrorsOrWarningsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source Table: x$statements_with_errors_or_warnings")
    public static final XStatementsWithErrorsOrWarnings XStatementsWithErrorsOrWarnings = new XStatementsWithErrorsOrWarnings();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.db")
    public static final SqlColumn<String> db = XStatementsWithErrorsOrWarnings.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.exec_count")
    public static final SqlColumn<Long> execCount = XStatementsWithErrorsOrWarnings.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0457562+08:00", comments="Source field: x$statements_with_errors_or_warnings.errors")
    public static final SqlColumn<Long> errors = XStatementsWithErrorsOrWarnings.errors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0457562+08:00", comments="Source field: x$statements_with_errors_or_warnings.error_pct")
    public static final SqlColumn<BigDecimal> errorPct = XStatementsWithErrorsOrWarnings.errorPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0457562+08:00", comments="Source field: x$statements_with_errors_or_warnings.warnings")
    public static final SqlColumn<Long> warnings = XStatementsWithErrorsOrWarnings.warnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0457562+08:00", comments="Source field: x$statements_with_errors_or_warnings.warning_pct")
    public static final SqlColumn<BigDecimal> warningPct = XStatementsWithErrorsOrWarnings.warningPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0457562+08:00", comments="Source field: x$statements_with_errors_or_warnings.first_seen")
    public static final SqlColumn<Date> firstSeen = XStatementsWithErrorsOrWarnings.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0467572+08:00", comments="Source field: x$statements_with_errors_or_warnings.last_seen")
    public static final SqlColumn<Date> lastSeen = XStatementsWithErrorsOrWarnings.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0467572+08:00", comments="Source field: x$statements_with_errors_or_warnings.digest")
    public static final SqlColumn<String> digest = XStatementsWithErrorsOrWarnings.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0467572+08:00", comments="Source field: x$statements_with_errors_or_warnings.query")
    public static final SqlColumn<String> query = XStatementsWithErrorsOrWarnings.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source Table: x$statements_with_errors_or_warnings")
    public static final class XStatementsWithErrorsOrWarnings extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<Long> execCount = column("exec_count", JDBCType.BIGINT);

        public final SqlColumn<Long> errors = column("errors", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> errorPct = column("error_pct", JDBCType.DECIMAL);

        public final SqlColumn<Long> warnings = column("warnings", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> warningPct = column("warning_pct", JDBCType.DECIMAL);

        public final SqlColumn<Date> firstSeen = column("first_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("last_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<String> digest = column("digest", JDBCType.VARCHAR);

        public final SqlColumn<String> query = column("query", JDBCType.LONGVARCHAR);

        public XStatementsWithErrorsOrWarnings() {
            super("x$statements_with_errors_or_warnings");
        }
    }
}