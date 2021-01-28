package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XUserSummaryByFileIoTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2999878+08:00", comments="Source Table: x$user_summary_by_file_io_type")
    public static final XUserSummaryByFileIoType XUserSummaryByFileIoType = new XUserSummaryByFileIoType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2999878+08:00", comments="Source field: x$user_summary_by_file_io_type.user")
    public static final SqlColumn<String> user = XUserSummaryByFileIoType.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2999878+08:00", comments="Source field: x$user_summary_by_file_io_type.event_name")
    public static final SqlColumn<String> eventName = XUserSummaryByFileIoType.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2999878+08:00", comments="Source field: x$user_summary_by_file_io_type.total")
    public static final SqlColumn<Long> total = XUserSummaryByFileIoType.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2999878+08:00", comments="Source field: x$user_summary_by_file_io_type.latency")
    public static final SqlColumn<Long> latency = XUserSummaryByFileIoType.latency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2999878+08:00", comments="Source field: x$user_summary_by_file_io_type.max_latency")
    public static final SqlColumn<Long> maxLatency = XUserSummaryByFileIoType.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2999878+08:00", comments="Source Table: x$user_summary_by_file_io_type")
    public static final class XUserSummaryByFileIoType extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> latency = column("latency", JDBCType.BIGINT);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public XUserSummaryByFileIoType() {
            super("x$user_summary_by_file_io_type");
        }
    }
}