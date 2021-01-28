package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HostSummaryByFileIoTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    public static final HostSummaryByFileIoType hostSummaryByFileIoType = new HostSummaryByFileIoType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source field: host_summary_by_file_io_type.host")
    public static final SqlColumn<String> host = hostSummaryByFileIoType.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source field: host_summary_by_file_io_type.event_name")
    public static final SqlColumn<String> eventName = hostSummaryByFileIoType.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source field: host_summary_by_file_io_type.total")
    public static final SqlColumn<Long> total = hostSummaryByFileIoType.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source field: host_summary_by_file_io_type.total_latency")
    public static final SqlColumn<String> totalLatency = hostSummaryByFileIoType.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source field: host_summary_by_file_io_type.max_latency")
    public static final SqlColumn<String> maxLatency = hostSummaryByFileIoType.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    public static final class HostSummaryByFileIoType extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public HostSummaryByFileIoType() {
            super("host_summary_by_file_io_type");
        }
    }
}