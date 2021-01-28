package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WaitClassesGlobalByAvgLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: wait_classes_global_by_avg_latency")
    public static final WaitClassesGlobalByAvgLatency waitClassesGlobalByAvgLatency = new WaitClassesGlobalByAvgLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source field: wait_classes_global_by_avg_latency.event_class")
    public static final SqlColumn<String> eventClass = waitClassesGlobalByAvgLatency.eventClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source field: wait_classes_global_by_avg_latency.total")
    public static final SqlColumn<BigDecimal> total = waitClassesGlobalByAvgLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source field: wait_classes_global_by_avg_latency.total_latency")
    public static final SqlColumn<String> totalLatency = waitClassesGlobalByAvgLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source field: wait_classes_global_by_avg_latency.min_latency")
    public static final SqlColumn<String> minLatency = waitClassesGlobalByAvgLatency.minLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source field: wait_classes_global_by_avg_latency.avg_latency")
    public static final SqlColumn<String> avgLatency = waitClassesGlobalByAvgLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source field: wait_classes_global_by_avg_latency.max_latency")
    public static final SqlColumn<String> maxLatency = waitClassesGlobalByAvgLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: wait_classes_global_by_avg_latency")
    public static final class WaitClassesGlobalByAvgLatency extends SqlTable {
        public final SqlColumn<String> eventClass = column("event_class", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> total = column("total", JDBCType.DECIMAL);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> minLatency = column("min_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public WaitClassesGlobalByAvgLatency() {
            super("wait_classes_global_by_avg_latency");
        }
    }
}