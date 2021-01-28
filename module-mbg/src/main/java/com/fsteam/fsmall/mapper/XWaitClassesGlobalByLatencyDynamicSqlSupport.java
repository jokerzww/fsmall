package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XWaitClassesGlobalByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3380224+08:00", comments="Source Table: x$wait_classes_global_by_latency")
    public static final XWaitClassesGlobalByLatency XWaitClassesGlobalByLatency = new XWaitClassesGlobalByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3380224+08:00", comments="Source field: x$wait_classes_global_by_latency.event_class")
    public static final SqlColumn<String> eventClass = XWaitClassesGlobalByLatency.eventClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3380224+08:00", comments="Source field: x$wait_classes_global_by_latency.total")
    public static final SqlColumn<BigDecimal> total = XWaitClassesGlobalByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3380224+08:00", comments="Source field: x$wait_classes_global_by_latency.total_latency")
    public static final SqlColumn<BigDecimal> totalLatency = XWaitClassesGlobalByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3380224+08:00", comments="Source field: x$wait_classes_global_by_latency.min_latency")
    public static final SqlColumn<Long> minLatency = XWaitClassesGlobalByLatency.minLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3380224+08:00", comments="Source field: x$wait_classes_global_by_latency.avg_latency")
    public static final SqlColumn<BigDecimal> avgLatency = XWaitClassesGlobalByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3380224+08:00", comments="Source field: x$wait_classes_global_by_latency.max_latency")
    public static final SqlColumn<Long> maxLatency = XWaitClassesGlobalByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3380224+08:00", comments="Source Table: x$wait_classes_global_by_latency")
    public static final class XWaitClassesGlobalByLatency extends SqlTable {
        public final SqlColumn<String> eventClass = column("event_class", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> total = column("total", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalLatency = column("total_latency", JDBCType.DECIMAL);

        public final SqlColumn<Long> minLatency = column("min_latency", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgLatency = column("avg_latency", JDBCType.DECIMAL);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public XWaitClassesGlobalByLatency() {
            super("x$wait_classes_global_by_latency");
        }
    }
}