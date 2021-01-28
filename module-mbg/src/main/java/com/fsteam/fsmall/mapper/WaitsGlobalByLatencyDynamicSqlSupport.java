package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WaitsGlobalByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.019733+08:00", comments="Source Table: waits_global_by_latency")
    public static final WaitsGlobalByLatency waitsGlobalByLatency = new WaitsGlobalByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0207338+08:00", comments="Source field: waits_global_by_latency.events")
    public static final SqlColumn<String> events = waitsGlobalByLatency.events;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0207338+08:00", comments="Source field: waits_global_by_latency.total")
    public static final SqlColumn<Long> total = waitsGlobalByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0207338+08:00", comments="Source field: waits_global_by_latency.total_latency")
    public static final SqlColumn<String> totalLatency = waitsGlobalByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0207338+08:00", comments="Source field: waits_global_by_latency.avg_latency")
    public static final SqlColumn<String> avgLatency = waitsGlobalByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0207338+08:00", comments="Source field: waits_global_by_latency.max_latency")
    public static final SqlColumn<String> maxLatency = waitsGlobalByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0207338+08:00", comments="Source Table: waits_global_by_latency")
    public static final class WaitsGlobalByLatency extends SqlTable {
        public final SqlColumn<String> events = column("events", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public WaitsGlobalByLatency() {
            super("waits_global_by_latency");
        }
    }
}