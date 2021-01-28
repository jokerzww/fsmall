package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsErrorsSummaryByAccountByErrorDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0747824+08:00", comments="Source Table: events_errors_summary_by_account_by_error")
    public static final EventsErrorsSummaryByAccountByError eventsErrorsSummaryByAccountByError = new EventsErrorsSummaryByAccountByError();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0757832+08:00", comments="Source field: events_errors_summary_by_account_by_error.USER")
    public static final SqlColumn<String> user = eventsErrorsSummaryByAccountByError.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0757832+08:00", comments="Source field: events_errors_summary_by_account_by_error.HOST")
    public static final SqlColumn<String> host = eventsErrorsSummaryByAccountByError.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0757832+08:00", comments="Source field: events_errors_summary_by_account_by_error.ERROR_NUMBER")
    public static final SqlColumn<Integer> errorNumber = eventsErrorsSummaryByAccountByError.errorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0757832+08:00", comments="Source field: events_errors_summary_by_account_by_error.ERROR_NAME")
    public static final SqlColumn<String> errorName = eventsErrorsSummaryByAccountByError.errorName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0757832+08:00", comments="Source field: events_errors_summary_by_account_by_error.SQL_STATE")
    public static final SqlColumn<String> sqlState = eventsErrorsSummaryByAccountByError.sqlState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0757832+08:00", comments="Source field: events_errors_summary_by_account_by_error.SUM_ERROR_RAISED")
    public static final SqlColumn<Long> sumErrorRaised = eventsErrorsSummaryByAccountByError.sumErrorRaised;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0757832+08:00", comments="Source field: events_errors_summary_by_account_by_error.SUM_ERROR_HANDLED")
    public static final SqlColumn<Long> sumErrorHandled = eventsErrorsSummaryByAccountByError.sumErrorHandled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0757832+08:00", comments="Source field: events_errors_summary_by_account_by_error.FIRST_SEEN")
    public static final SqlColumn<Date> firstSeen = eventsErrorsSummaryByAccountByError.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0757832+08:00", comments="Source field: events_errors_summary_by_account_by_error.LAST_SEEN")
    public static final SqlColumn<Date> lastSeen = eventsErrorsSummaryByAccountByError.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0747824+08:00", comments="Source Table: events_errors_summary_by_account_by_error")
    public static final class EventsErrorsSummaryByAccountByError extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<Integer> errorNumber = column("ERROR_NUMBER", JDBCType.INTEGER);

        public final SqlColumn<String> errorName = column("ERROR_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> sqlState = column("SQL_STATE", JDBCType.VARCHAR);

        public final SqlColumn<Long> sumErrorRaised = column("SUM_ERROR_RAISED", JDBCType.BIGINT);

        public final SqlColumn<Long> sumErrorHandled = column("SUM_ERROR_HANDLED", JDBCType.BIGINT);

        public final SqlColumn<Date> firstSeen = column("FIRST_SEEN", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("LAST_SEEN", JDBCType.TIMESTAMP);

        public EventsErrorsSummaryByAccountByError() {
            super("events_errors_summary_by_account_by_error");
        }
    }
}