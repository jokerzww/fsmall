package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HostSummaryByStagesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    public static final HostSummaryByStages hostSummaryByStages = new HostSummaryByStages();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source field: host_summary_by_stages.host")
    public static final SqlColumn<String> host = hostSummaryByStages.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source field: host_summary_by_stages.event_name")
    public static final SqlColumn<String> eventName = hostSummaryByStages.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source field: host_summary_by_stages.total")
    public static final SqlColumn<Long> total = hostSummaryByStages.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source field: host_summary_by_stages.total_latency")
    public static final SqlColumn<String> totalLatency = hostSummaryByStages.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source field: host_summary_by_stages.avg_latency")
    public static final SqlColumn<String> avgLatency = hostSummaryByStages.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    public static final class HostSummaryByStages extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public HostSummaryByStages() {
            super("host_summary_by_stages");
        }
    }
}