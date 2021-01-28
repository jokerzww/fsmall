package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IoGlobalByWaitByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1438456+08:00", comments="Source Table: io_global_by_wait_by_latency")
    public static final IoGlobalByWaitByLatency ioGlobalByWaitByLatency = new IoGlobalByWaitByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1438456+08:00", comments="Source field: io_global_by_wait_by_latency.event_name")
    public static final SqlColumn<String> eventName = ioGlobalByWaitByLatency.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1438456+08:00", comments="Source field: io_global_by_wait_by_latency.total")
    public static final SqlColumn<Long> total = ioGlobalByWaitByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1438456+08:00", comments="Source field: io_global_by_wait_by_latency.total_latency")
    public static final SqlColumn<String> totalLatency = ioGlobalByWaitByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1438456+08:00", comments="Source field: io_global_by_wait_by_latency.avg_latency")
    public static final SqlColumn<String> avgLatency = ioGlobalByWaitByLatency.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1438456+08:00", comments="Source field: io_global_by_wait_by_latency.max_latency")
    public static final SqlColumn<String> maxLatency = ioGlobalByWaitByLatency.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1438456+08:00", comments="Source field: io_global_by_wait_by_latency.read_latency")
    public static final SqlColumn<String> readLatency = ioGlobalByWaitByLatency.readLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1448466+08:00", comments="Source field: io_global_by_wait_by_latency.write_latency")
    public static final SqlColumn<String> writeLatency = ioGlobalByWaitByLatency.writeLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1448466+08:00", comments="Source field: io_global_by_wait_by_latency.misc_latency")
    public static final SqlColumn<String> miscLatency = ioGlobalByWaitByLatency.miscLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1448466+08:00", comments="Source field: io_global_by_wait_by_latency.count_read")
    public static final SqlColumn<Long> countRead = ioGlobalByWaitByLatency.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1448466+08:00", comments="Source field: io_global_by_wait_by_latency.total_read")
    public static final SqlColumn<String> totalRead = ioGlobalByWaitByLatency.totalRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1448466+08:00", comments="Source field: io_global_by_wait_by_latency.avg_read")
    public static final SqlColumn<String> avgRead = ioGlobalByWaitByLatency.avgRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1448466+08:00", comments="Source field: io_global_by_wait_by_latency.count_write")
    public static final SqlColumn<Long> countWrite = ioGlobalByWaitByLatency.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1448466+08:00", comments="Source field: io_global_by_wait_by_latency.total_written")
    public static final SqlColumn<String> totalWritten = ioGlobalByWaitByLatency.totalWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1448466+08:00", comments="Source field: io_global_by_wait_by_latency.avg_written")
    public static final SqlColumn<String> avgWritten = ioGlobalByWaitByLatency.avgWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1438456+08:00", comments="Source Table: io_global_by_wait_by_latency")
    public static final class IoGlobalByWaitByLatency extends SqlTable {
        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> readLatency = column("read_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> writeLatency = column("write_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> miscLatency = column("misc_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> countRead = column("count_read", JDBCType.BIGINT);

        public final SqlColumn<String> totalRead = column("total_read", JDBCType.VARCHAR);

        public final SqlColumn<String> avgRead = column("avg_read", JDBCType.VARCHAR);

        public final SqlColumn<Long> countWrite = column("count_write", JDBCType.BIGINT);

        public final SqlColumn<String> totalWritten = column("total_written", JDBCType.VARCHAR);

        public final SqlColumn<String> avgWritten = column("avg_written", JDBCType.VARCHAR);

        public IoGlobalByWaitByLatency() {
            super("io_global_by_wait_by_latency");
        }
    }
}