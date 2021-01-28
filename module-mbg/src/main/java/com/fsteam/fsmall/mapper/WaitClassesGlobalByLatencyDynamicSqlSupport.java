package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WaitClassesGlobalByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0827898+08:00", comments="Source Table: wait_classes_global_by_latency")
    public static final WaitClassesGlobalByLatency waitClassesGlobalByLatency = new WaitClassesGlobalByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0827898+08:00", comments="Source field: wait_classes_global_by_latency.event_class")
    public static final SqlColumn<String> eventClass = waitClassesGlobalByLatency.eventClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0827898+08:00", comments="Source field: wait_classes_global_by_latency.total")
    public static final SqlColumn<BigDecimal> total = waitClassesGlobalByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source field: wait_classes_global_by_latency.total_latency")
    public static final SqlColumn<String> totalLatency = waitClassesGlobalByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source field: wait_classes_global_by_latency.min_latency")
    public static final SqlColumn<String> minLatency = waitClassesGlobalByLatency.minLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source field: wait_classes_global_by_latency.avg_latency")
    public static final SqlColumn<String> avgLatency = waitClassesGlobalByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source field: wait_classes_global_by_latency.max_latency")
    public static final SqlColumn<String> maxLatency = waitClassesGlobalByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0827898+08:00", comments="Source Table: wait_classes_global_by_latency")
    public static final class WaitClassesGlobalByLatency extends SqlTable {
        public final SqlColumn<String> eventClass = column("event_class", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> total = column("total", JDBCType.DECIMAL);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> minLatency = column("min_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public WaitClassesGlobalByLatency() {
            super("wait_classes_global_by_latency");
        }
    }
}