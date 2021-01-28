package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IoByThreadByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0717795+08:00", comments="Source Table: io_by_thread_by_latency")
    public static final IoByThreadByLatency ioByThreadByLatency = new IoByThreadByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0717795+08:00", comments="Source field: io_by_thread_by_latency.user")
    public static final SqlColumn<String> user = ioByThreadByLatency.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0717795+08:00", comments="Source field: io_by_thread_by_latency.total")
    public static final SqlColumn<BigDecimal> total = ioByThreadByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0717795+08:00", comments="Source field: io_by_thread_by_latency.total_latency")
    public static final SqlColumn<String> totalLatency = ioByThreadByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0717795+08:00", comments="Source field: io_by_thread_by_latency.min_latency")
    public static final SqlColumn<String> minLatency = ioByThreadByLatency.minLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0717795+08:00", comments="Source field: io_by_thread_by_latency.avg_latency")
    public static final SqlColumn<String> avgLatency = ioByThreadByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0717795+08:00", comments="Source field: io_by_thread_by_latency.max_latency")
    public static final SqlColumn<String> maxLatency = ioByThreadByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0727807+08:00", comments="Source field: io_by_thread_by_latency.thread_id")
    public static final SqlColumn<Long> threadId = ioByThreadByLatency.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0727807+08:00", comments="Source field: io_by_thread_by_latency.processlist_id")
    public static final SqlColumn<Long> processlistId = ioByThreadByLatency.processlistId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0717795+08:00", comments="Source Table: io_by_thread_by_latency")
    public static final class IoByThreadByLatency extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> total = column("total", JDBCType.DECIMAL);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> minLatency = column("min_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> threadId = column("thread_id", JDBCType.BIGINT);

        public final SqlColumn<Long> processlistId = column("processlist_id", JDBCType.BIGINT);

        public IoByThreadByLatency() {
            super("io_by_thread_by_latency");
        }
    }
}