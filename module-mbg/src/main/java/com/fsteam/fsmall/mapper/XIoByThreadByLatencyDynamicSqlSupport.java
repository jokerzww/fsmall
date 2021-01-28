package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XIoByThreadByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    public static final XIoByThreadByLatency XIoByThreadByLatency = new XIoByThreadByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.user")
    public static final SqlColumn<String> user = XIoByThreadByLatency.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.total")
    public static final SqlColumn<BigDecimal> total = XIoByThreadByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.total_latency")
    public static final SqlColumn<BigDecimal> totalLatency = XIoByThreadByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.min_latency")
    public static final SqlColumn<Long> minLatency = XIoByThreadByLatency.minLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.avg_latency")
    public static final SqlColumn<BigDecimal> avgLatency = XIoByThreadByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.max_latency")
    public static final SqlColumn<Long> maxLatency = XIoByThreadByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.thread_id")
    public static final SqlColumn<Long> threadId = XIoByThreadByLatency.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source field: x$io_by_thread_by_latency.processlist_id")
    public static final SqlColumn<Long> processlistId = XIoByThreadByLatency.processlistId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    public static final class XIoByThreadByLatency extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> total = column("total", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalLatency = column("total_latency", JDBCType.DECIMAL);

        public final SqlColumn<Long> minLatency = column("min_latency", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgLatency = column("avg_latency", JDBCType.DECIMAL);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> threadId = column("thread_id", JDBCType.BIGINT);

        public final SqlColumn<Long> processlistId = column("processlist_id", JDBCType.BIGINT);

        public XIoByThreadByLatency() {
            super("x$io_by_thread_by_latency");
        }
    }
}