package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XIoGlobalByWaitByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    public static final XIoGlobalByWaitByLatency XIoGlobalByWaitByLatency = new XIoGlobalByWaitByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.event_name")
    public static final SqlColumn<String> eventName = XIoGlobalByWaitByLatency.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.total")
    public static final SqlColumn<Long> total = XIoGlobalByWaitByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.total_latency")
    public static final SqlColumn<Long> totalLatency = XIoGlobalByWaitByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.avg_latency")
    public static final SqlColumn<Long> avgLatency = XIoGlobalByWaitByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.max_latency")
    public static final SqlColumn<Long> maxLatency = XIoGlobalByWaitByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.read_latency")
    public static final SqlColumn<Long> readLatency = XIoGlobalByWaitByLatency.readLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.write_latency")
    public static final SqlColumn<Long> writeLatency = XIoGlobalByWaitByLatency.writeLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.misc_latency")
    public static final SqlColumn<Long> miscLatency = XIoGlobalByWaitByLatency.miscLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.count_read")
    public static final SqlColumn<Long> countRead = XIoGlobalByWaitByLatency.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.total_read")
    public static final SqlColumn<Long> totalRead = XIoGlobalByWaitByLatency.totalRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.avg_read")
    public static final SqlColumn<BigDecimal> avgRead = XIoGlobalByWaitByLatency.avgRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.count_write")
    public static final SqlColumn<Long> countWrite = XIoGlobalByWaitByLatency.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source field: x$io_global_by_wait_by_latency.total_written")
    public static final SqlColumn<Long> totalWritten = XIoGlobalByWaitByLatency.totalWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source field: x$io_global_by_wait_by_latency.avg_written")
    public static final SqlColumn<BigDecimal> avgWritten = XIoGlobalByWaitByLatency.avgWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2549465+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    public static final class XIoGlobalByWaitByLatency extends SqlTable {
        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> avgLatency = column("avg_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> readLatency = column("read_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> writeLatency = column("write_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> miscLatency = column("misc_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> countRead = column("count_read", JDBCType.BIGINT);

        public final SqlColumn<Long> totalRead = column("total_read", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgRead = column("avg_read", JDBCType.DECIMAL);

        public final SqlColumn<Long> countWrite = column("count_write", JDBCType.BIGINT);

        public final SqlColumn<Long> totalWritten = column("total_written", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgWritten = column("avg_written", JDBCType.DECIMAL);

        public XIoGlobalByWaitByLatency() {
            super("x$io_global_by_wait_by_latency");
        }
    }
}