package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XHostSummaryByFileIoTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5041758+08:00", comments="Source Table: x$host_summary_by_file_io_type")
    public static final XHostSummaryByFileIoType XHostSummaryByFileIoType = new XHostSummaryByFileIoType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5041758+08:00", comments="Source field: x$host_summary_by_file_io_type.host")
    public static final SqlColumn<String> host = XHostSummaryByFileIoType.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5041758+08:00", comments="Source field: x$host_summary_by_file_io_type.event_name")
    public static final SqlColumn<String> eventName = XHostSummaryByFileIoType.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5041758+08:00", comments="Source field: x$host_summary_by_file_io_type.total")
    public static final SqlColumn<Long> total = XHostSummaryByFileIoType.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5041758+08:00", comments="Source field: x$host_summary_by_file_io_type.total_latency")
    public static final SqlColumn<Long> totalLatency = XHostSummaryByFileIoType.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5041758+08:00", comments="Source field: x$host_summary_by_file_io_type.max_latency")
    public static final SqlColumn<Long> maxLatency = XHostSummaryByFileIoType.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5041758+08:00", comments="Source Table: x$host_summary_by_file_io_type")
    public static final class XHostSummaryByFileIoType extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public XHostSummaryByFileIoType() {
            super("x$host_summary_by_file_io_type");
        }
    }
}