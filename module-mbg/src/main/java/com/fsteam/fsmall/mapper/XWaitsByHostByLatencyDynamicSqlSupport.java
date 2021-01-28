package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XWaitsByHostByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4671412+08:00", comments="Source Table: x$waits_by_host_by_latency")
    public static final XWaitsByHostByLatency XWaitsByHostByLatency = new XWaitsByHostByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4671412+08:00", comments="Source field: x$waits_by_host_by_latency.host")
    public static final SqlColumn<String> host = XWaitsByHostByLatency.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4681414+08:00", comments="Source field: x$waits_by_host_by_latency.event")
    public static final SqlColumn<String> event = XWaitsByHostByLatency.event;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4681414+08:00", comments="Source field: x$waits_by_host_by_latency.total")
    public static final SqlColumn<Long> total = XWaitsByHostByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4681414+08:00", comments="Source field: x$waits_by_host_by_latency.total_latency")
    public static final SqlColumn<Long> totalLatency = XWaitsByHostByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4681414+08:00", comments="Source field: x$waits_by_host_by_latency.avg_latency")
    public static final SqlColumn<Long> avgLatency = XWaitsByHostByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4681414+08:00", comments="Source field: x$waits_by_host_by_latency.max_latency")
    public static final SqlColumn<Long> maxLatency = XWaitsByHostByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4671412+08:00", comments="Source Table: x$waits_by_host_by_latency")
    public static final class XWaitsByHostByLatency extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<String> event = column("event", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> avgLatency = column("avg_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public XWaitsByHostByLatency() {
            super("x$waits_by_host_by_latency");
        }
    }
}