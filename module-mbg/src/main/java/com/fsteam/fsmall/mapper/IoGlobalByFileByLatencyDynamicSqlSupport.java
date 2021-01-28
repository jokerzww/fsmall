package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IoGlobalByFileByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: io_global_by_file_by_latency")
    public static final IoGlobalByFileByLatency ioGlobalByFileByLatency = new IoGlobalByFileByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: io_global_by_file_by_latency.file")
    public static final SqlColumn<String> file = ioGlobalByFileByLatency.file;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: io_global_by_file_by_latency.total")
    public static final SqlColumn<Long> total = ioGlobalByFileByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: io_global_by_file_by_latency.total_latency")
    public static final SqlColumn<String> totalLatency = ioGlobalByFileByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: io_global_by_file_by_latency.count_read")
    public static final SqlColumn<Long> countRead = ioGlobalByFileByLatency.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: io_global_by_file_by_latency.read_latency")
    public static final SqlColumn<String> readLatency = ioGlobalByFileByLatency.readLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: io_global_by_file_by_latency.count_write")
    public static final SqlColumn<Long> countWrite = ioGlobalByFileByLatency.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: io_global_by_file_by_latency.write_latency")
    public static final SqlColumn<String> writeLatency = ioGlobalByFileByLatency.writeLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: io_global_by_file_by_latency.count_misc")
    public static final SqlColumn<Long> countMisc = ioGlobalByFileByLatency.countMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: io_global_by_file_by_latency.misc_latency")
    public static final SqlColumn<String> miscLatency = ioGlobalByFileByLatency.miscLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    public static final class IoGlobalByFileByLatency extends SqlTable {
        public final SqlColumn<String> file = column("file", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> countRead = column("count_read", JDBCType.BIGINT);

        public final SqlColumn<String> readLatency = column("read_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> countWrite = column("count_write", JDBCType.BIGINT);

        public final SqlColumn<String> writeLatency = column("write_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> countMisc = column("count_misc", JDBCType.BIGINT);

        public final SqlColumn<String> miscLatency = column("misc_latency", JDBCType.VARCHAR);

        public IoGlobalByFileByLatency() {
            super("io_global_by_file_by_latency");
        }
    }
}