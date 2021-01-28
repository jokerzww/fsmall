package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsErrorsSummaryByHostByErrorDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: events_errors_summary_by_host_by_error")
    public static final EventsErrorsSummaryByHostByError eventsErrorsSummaryByHostByError = new EventsErrorsSummaryByHostByError();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: events_errors_summary_by_host_by_error.HOST")
    public static final SqlColumn<String> host = eventsErrorsSummaryByHostByError.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5281973+08:00", comments="Source field: events_errors_summary_by_host_by_error.ERROR_NUMBER")
    public static final SqlColumn<Integer> errorNumber = eventsErrorsSummaryByHostByError.errorNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5281973+08:00", comments="Source field: events_errors_summary_by_host_by_error.ERROR_NAME")
    public static final SqlColumn<String> errorName = eventsErrorsSummaryByHostByError.errorName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5281973+08:00", comments="Source field: events_errors_summary_by_host_by_error.SQL_STATE")
    public static final SqlColumn<String> sqlState = eventsErrorsSummaryByHostByError.sqlState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5281973+08:00", comments="Source field: events_errors_summary_by_host_by_error.SUM_ERROR_RAISED")
    public static final SqlColumn<Long> sumErrorRaised = eventsErrorsSummaryByHostByError.sumErrorRaised;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5281973+08:00", comments="Source field: events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED")
    public static final SqlColumn<Long> sumErrorHandled = eventsErrorsSummaryByHostByError.sumErrorHandled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5281973+08:00", comments="Source field: events_errors_summary_by_host_by_error.FIRST_SEEN")
    public static final SqlColumn<Date> firstSeen = eventsErrorsSummaryByHostByError.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5281973+08:00", comments="Source field: events_errors_summary_by_host_by_error.LAST_SEEN")
    public static final SqlColumn<Date> lastSeen = eventsErrorsSummaryByHostByError.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: events_errors_summary_by_host_by_error")
    public static final class EventsErrorsSummaryByHostByError extends SqlTable {
        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<Integer> errorNumber = column("ERROR_NUMBER", JDBCType.INTEGER);

        public final SqlColumn<String> errorName = column("ERROR_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> sqlState = column("SQL_STATE", JDBCType.VARCHAR);

        public final SqlColumn<Long> sumErrorRaised = column("SUM_ERROR_RAISED", JDBCType.BIGINT);

        public final SqlColumn<Long> sumErrorHandled = column("SUM_ERROR_HANDLED", JDBCType.BIGINT);

        public final SqlColumn<Date> firstSeen = column("FIRST_SEEN", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("LAST_SEEN", JDBCType.TIMESTAMP);

        public EventsErrorsSummaryByHostByError() {
            super("events_errors_summary_by_host_by_error");
        }
    }
}