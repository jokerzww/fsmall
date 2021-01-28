package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XWaitsByUserByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
    public static final XWaitsByUserByLatency XWaitsByUserByLatency = new XWaitsByUserByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.user")
    public static final SqlColumn<String> user = XWaitsByUserByLatency.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.event")
    public static final SqlColumn<String> event = XWaitsByUserByLatency.event;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.total")
    public static final SqlColumn<Long> total = XWaitsByUserByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.total_latency")
    public static final SqlColumn<Long> totalLatency = XWaitsByUserByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.avg_latency")
    public static final SqlColumn<Long> avgLatency = XWaitsByUserByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source field: x$waits_by_user_by_latency.max_latency")
    public static final SqlColumn<Long> maxLatency = XWaitsByUserByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
    public static final class XWaitsByUserByLatency extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<String> event = column("event", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> avgLatency = column("avg_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public XWaitsByUserByLatency() {
            super("x$waits_by_user_by_latency");
        }
    }
}