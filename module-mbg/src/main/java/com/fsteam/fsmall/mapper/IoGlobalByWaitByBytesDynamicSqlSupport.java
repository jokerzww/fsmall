package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IoGlobalByWaitByBytesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    public static final IoGlobalByWaitByBytes ioGlobalByWaitByBytes = new IoGlobalByWaitByBytes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.event_name")
    public static final SqlColumn<String> eventName = ioGlobalByWaitByBytes.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total")
    public static final SqlColumn<Long> total = ioGlobalByWaitByBytes.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.total_latency")
    public static final SqlColumn<String> totalLatency = ioGlobalByWaitByBytes.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.min_latency")
    public static final SqlColumn<String> minLatency = ioGlobalByWaitByBytes.minLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_latency")
    public static final SqlColumn<String> avgLatency = ioGlobalByWaitByBytes.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.max_latency")
    public static final SqlColumn<String> maxLatency = ioGlobalByWaitByBytes.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source field: io_global_by_wait_by_bytes.count_read")
    public static final SqlColumn<Long> countRead = ioGlobalByWaitByBytes.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source field: io_global_by_wait_by_bytes.total_read")
    public static final SqlColumn<String> totalRead = ioGlobalByWaitByBytes.totalRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_read")
    public static final SqlColumn<String> avgRead = ioGlobalByWaitByBytes.avgRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source field: io_global_by_wait_by_bytes.count_write")
    public static final SqlColumn<Long> countWrite = ioGlobalByWaitByBytes.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source field: io_global_by_wait_by_bytes.total_written")
    public static final SqlColumn<String> totalWritten = ioGlobalByWaitByBytes.totalWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source field: io_global_by_wait_by_bytes.avg_written")
    public static final SqlColumn<String> avgWritten = ioGlobalByWaitByBytes.avgWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source field: io_global_by_wait_by_bytes.total_requested")
    public static final SqlColumn<String> totalRequested = ioGlobalByWaitByBytes.totalRequested;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5091784+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    public static final class IoGlobalByWaitByBytes extends SqlTable {
        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> minLatency = column("min_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> countRead = column("count_read", JDBCType.BIGINT);

        public final SqlColumn<String> totalRead = column("total_read", JDBCType.VARCHAR);

        public final SqlColumn<String> avgRead = column("avg_read", JDBCType.VARCHAR);

        public final SqlColumn<Long> countWrite = column("count_write", JDBCType.BIGINT);

        public final SqlColumn<String> totalWritten = column("total_written", JDBCType.VARCHAR);

        public final SqlColumn<String> avgWritten = column("avg_written", JDBCType.VARCHAR);

        public final SqlColumn<String> totalRequested = column("total_requested", JDBCType.VARCHAR);

        public IoGlobalByWaitByBytes() {
            super("io_global_by_wait_by_bytes");
        }
    }
}