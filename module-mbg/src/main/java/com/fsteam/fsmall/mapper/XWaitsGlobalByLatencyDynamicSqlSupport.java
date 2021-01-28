package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XWaitsGlobalByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source Table: x$waits_global_by_latency")
    public static final XWaitsGlobalByLatency XWaitsGlobalByLatency = new XWaitsGlobalByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source field: x$waits_global_by_latency.events")
    public static final SqlColumn<String> events = XWaitsGlobalByLatency.events;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source field: x$waits_global_by_latency.total")
    public static final SqlColumn<Long> total = XWaitsGlobalByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source field: x$waits_global_by_latency.total_latency")
    public static final SqlColumn<Long> totalLatency = XWaitsGlobalByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source field: x$waits_global_by_latency.avg_latency")
    public static final SqlColumn<Long> avgLatency = XWaitsGlobalByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source field: x$waits_global_by_latency.max_latency")
    public static final SqlColumn<Long> maxLatency = XWaitsGlobalByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source Table: x$waits_global_by_latency")
    public static final class XWaitsGlobalByLatency extends SqlTable {
        public final SqlColumn<String> events = column("events", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> avgLatency = column("avg_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public XWaitsGlobalByLatency() {
            super("x$waits_global_by_latency");
        }
    }
}