package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatementsWithErrorsOrWarningsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3049926+08:00", comments="Source Table: statements_with_errors_or_warnings")
    public static final StatementsWithErrorsOrWarnings statementsWithErrorsOrWarnings = new StatementsWithErrorsOrWarnings();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source field: statements_with_errors_or_warnings.db")
    public static final SqlColumn<String> db = statementsWithErrorsOrWarnings.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source field: statements_with_errors_or_warnings.exec_count")
    public static final SqlColumn<Long> execCount = statementsWithErrorsOrWarnings.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source field: statements_with_errors_or_warnings.errors")
    public static final SqlColumn<Long> errors = statementsWithErrorsOrWarnings.errors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source field: statements_with_errors_or_warnings.error_pct")
    public static final SqlColumn<BigDecimal> errorPct = statementsWithErrorsOrWarnings.errorPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source field: statements_with_errors_or_warnings.warnings")
    public static final SqlColumn<Long> warnings = statementsWithErrorsOrWarnings.warnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source field: statements_with_errors_or_warnings.warning_pct")
    public static final SqlColumn<BigDecimal> warningPct = statementsWithErrorsOrWarnings.warningPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source field: statements_with_errors_or_warnings.first_seen")
    public static final SqlColumn<Date> firstSeen = statementsWithErrorsOrWarnings.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source field: statements_with_errors_or_warnings.last_seen")
    public static final SqlColumn<Date> lastSeen = statementsWithErrorsOrWarnings.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source field: statements_with_errors_or_warnings.digest")
    public static final SqlColumn<String> digest = statementsWithErrorsOrWarnings.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source field: statements_with_errors_or_warnings.query")
    public static final SqlColumn<String> query = statementsWithErrorsOrWarnings.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3049926+08:00", comments="Source Table: statements_with_errors_or_warnings")
    public static final class StatementsWithErrorsOrWarnings extends SqlTable {
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

        public StatementsWithErrorsOrWarnings() {
            super("statements_with_errors_or_warnings");
        }
    }
}