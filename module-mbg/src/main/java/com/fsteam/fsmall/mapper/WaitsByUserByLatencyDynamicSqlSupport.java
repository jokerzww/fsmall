package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WaitsByUserByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: waits_by_user_by_latency")
    public static final WaitsByUserByLatency waitsByUserByLatency = new WaitsByUserByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source field: waits_by_user_by_latency.user")
    public static final SqlColumn<String> user = waitsByUserByLatency.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: waits_by_user_by_latency.event")
    public static final SqlColumn<String> event = waitsByUserByLatency.event;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: waits_by_user_by_latency.total")
    public static final SqlColumn<Long> total = waitsByUserByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: waits_by_user_by_latency.total_latency")
    public static final SqlColumn<String> totalLatency = waitsByUserByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: waits_by_user_by_latency.avg_latency")
    public static final SqlColumn<String> avgLatency = waitsByUserByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: waits_by_user_by_latency.max_latency")
    public static final SqlColumn<String> maxLatency = waitsByUserByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: waits_by_user_by_latency")
    public static final class WaitsByUserByLatency extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<String> event = column("event", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public WaitsByUserByLatency() {
            super("waits_by_user_by_latency");
        }
    }
}