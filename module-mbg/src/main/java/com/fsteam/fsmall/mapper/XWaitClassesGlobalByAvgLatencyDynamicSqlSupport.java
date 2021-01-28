package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XWaitClassesGlobalByAvgLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0287407+08:00", comments="Source Table: x$wait_classes_global_by_avg_latency")
    public static final XWaitClassesGlobalByAvgLatency XWaitClassesGlobalByAvgLatency = new XWaitClassesGlobalByAvgLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0287407+08:00", comments="Source field: x$wait_classes_global_by_avg_latency.event_class")
    public static final SqlColumn<String> eventClass = XWaitClassesGlobalByAvgLatency.eventClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0287407+08:00", comments="Source field: x$wait_classes_global_by_avg_latency.total")
    public static final SqlColumn<BigDecimal> total = XWaitClassesGlobalByAvgLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0287407+08:00", comments="Source field: x$wait_classes_global_by_avg_latency.total_latency")
    public static final SqlColumn<BigDecimal> totalLatency = XWaitClassesGlobalByAvgLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0287407+08:00", comments="Source field: x$wait_classes_global_by_avg_latency.min_latency")
    public static final SqlColumn<Long> minLatency = XWaitClassesGlobalByAvgLatency.minLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0287407+08:00", comments="Source field: x$wait_classes_global_by_avg_latency.avg_latency")
    public static final SqlColumn<BigDecimal> avgLatency = XWaitClassesGlobalByAvgLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0297421+08:00", comments="Source field: x$wait_classes_global_by_avg_latency.max_latency")
    public static final SqlColumn<Long> maxLatency = XWaitClassesGlobalByAvgLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0287407+08:00", comments="Source Table: x$wait_classes_global_by_avg_latency")
    public static final class XWaitClassesGlobalByAvgLatency extends SqlTable {
        public final SqlColumn<String> eventClass = column("event_class", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> total = column("total", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalLatency = column("total_latency", JDBCType.DECIMAL);

        public final SqlColumn<Long> minLatency = column("min_latency", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgLatency = column("avg_latency", JDBCType.DECIMAL);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public XWaitClassesGlobalByAvgLatency() {
            super("x$wait_classes_global_by_avg_latency");
        }
    }
}