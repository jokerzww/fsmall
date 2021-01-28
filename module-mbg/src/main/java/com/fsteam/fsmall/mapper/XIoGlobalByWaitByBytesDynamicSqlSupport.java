package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XIoGlobalByWaitByBytesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1728744+08:00", comments="Source Table: x$io_global_by_wait_by_bytes")
    public static final XIoGlobalByWaitByBytes XIoGlobalByWaitByBytes = new XIoGlobalByWaitByBytes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1728744+08:00", comments="Source field: x$io_global_by_wait_by_bytes.event_name")
    public static final SqlColumn<String> eventName = XIoGlobalByWaitByBytes.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1728744+08:00", comments="Source field: x$io_global_by_wait_by_bytes.total")
    public static final SqlColumn<Long> total = XIoGlobalByWaitByBytes.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1728744+08:00", comments="Source field: x$io_global_by_wait_by_bytes.total_latency")
    public static final SqlColumn<Long> totalLatency = XIoGlobalByWaitByBytes.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1728744+08:00", comments="Source field: x$io_global_by_wait_by_bytes.min_latency")
    public static final SqlColumn<Long> minLatency = XIoGlobalByWaitByBytes.minLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1728744+08:00", comments="Source field: x$io_global_by_wait_by_bytes.avg_latency")
    public static final SqlColumn<Long> avgLatency = XIoGlobalByWaitByBytes.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1728744+08:00", comments="Source field: x$io_global_by_wait_by_bytes.max_latency")
    public static final SqlColumn<Long> maxLatency = XIoGlobalByWaitByBytes.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1728744+08:00", comments="Source field: x$io_global_by_wait_by_bytes.count_read")
    public static final SqlColumn<Long> countRead = XIoGlobalByWaitByBytes.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source field: x$io_global_by_wait_by_bytes.total_read")
    public static final SqlColumn<Long> totalRead = XIoGlobalByWaitByBytes.totalRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source field: x$io_global_by_wait_by_bytes.avg_read")
    public static final SqlColumn<BigDecimal> avgRead = XIoGlobalByWaitByBytes.avgRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source field: x$io_global_by_wait_by_bytes.count_write")
    public static final SqlColumn<Long> countWrite = XIoGlobalByWaitByBytes.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source field: x$io_global_by_wait_by_bytes.total_written")
    public static final SqlColumn<Long> totalWritten = XIoGlobalByWaitByBytes.totalWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source field: x$io_global_by_wait_by_bytes.avg_written")
    public static final SqlColumn<BigDecimal> avgWritten = XIoGlobalByWaitByBytes.avgWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source field: x$io_global_by_wait_by_bytes.total_requested")
    public static final SqlColumn<Long> totalRequested = XIoGlobalByWaitByBytes.totalRequested;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1728744+08:00", comments="Source Table: x$io_global_by_wait_by_bytes")
    public static final class XIoGlobalByWaitByBytes extends SqlTable {
        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> minLatency = column("min_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> avgLatency = column("avg_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> maxLatency = column("max_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> countRead = column("count_read", JDBCType.BIGINT);

        public final SqlColumn<Long> totalRead = column("total_read", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgRead = column("avg_read", JDBCType.DECIMAL);

        public final SqlColumn<Long> countWrite = column("count_write", JDBCType.BIGINT);

        public final SqlColumn<Long> totalWritten = column("total_written", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgWritten = column("avg_written", JDBCType.DECIMAL);

        public final SqlColumn<Long> totalRequested = column("total_requested", JDBCType.BIGINT);

        public XIoGlobalByWaitByBytes() {
            super("x$io_global_by_wait_by_bytes");
        }
    }
}