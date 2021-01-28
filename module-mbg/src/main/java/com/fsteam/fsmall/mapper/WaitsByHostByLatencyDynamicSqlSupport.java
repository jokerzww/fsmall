package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WaitsByHostByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2469402+08:00", comments="Source Table: waits_by_host_by_latency")
    public static final WaitsByHostByLatency waitsByHostByLatency = new WaitsByHostByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2469402+08:00", comments="Source field: waits_by_host_by_latency.host")
    public static final SqlColumn<String> host = waitsByHostByLatency.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2469402+08:00", comments="Source field: waits_by_host_by_latency.event")
    public static final SqlColumn<String> event = waitsByHostByLatency.event;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2469402+08:00", comments="Source field: waits_by_host_by_latency.total")
    public static final SqlColumn<Long> total = waitsByHostByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2469402+08:00", comments="Source field: waits_by_host_by_latency.total_latency")
    public static final SqlColumn<String> totalLatency = waitsByHostByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2479412+08:00", comments="Source field: waits_by_host_by_latency.avg_latency")
    public static final SqlColumn<String> avgLatency = waitsByHostByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2479412+08:00", comments="Source field: waits_by_host_by_latency.max_latency")
    public static final SqlColumn<String> maxLatency = waitsByHostByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2469402+08:00", comments="Source Table: waits_by_host_by_latency")
    public static final class WaitsByHostByLatency extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<String> event = column("event", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public WaitsByHostByLatency() {
            super("waits_by_host_by_latency");
        }
    }
}