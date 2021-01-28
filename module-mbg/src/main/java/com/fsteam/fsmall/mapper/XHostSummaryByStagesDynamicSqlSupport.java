package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XHostSummaryByStagesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    public static final XHostSummaryByStages XHostSummaryByStages = new XHostSummaryByStages();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: x$host_summary_by_stages.host")
    public static final SqlColumn<String> host = XHostSummaryByStages.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: x$host_summary_by_stages.event_name")
    public static final SqlColumn<String> eventName = XHostSummaryByStages.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: x$host_summary_by_stages.total")
    public static final SqlColumn<Long> total = XHostSummaryByStages.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: x$host_summary_by_stages.total_latency")
    public static final SqlColumn<Long> totalLatency = XHostSummaryByStages.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: x$host_summary_by_stages.avg_latency")
    public static final SqlColumn<Long> avgLatency = XHostSummaryByStages.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    public static final class XHostSummaryByStages extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> avgLatency = column("avg_latency", JDBCType.BIGINT);

        public XHostSummaryByStages() {
            super("x$host_summary_by_stages");
        }
    }
}