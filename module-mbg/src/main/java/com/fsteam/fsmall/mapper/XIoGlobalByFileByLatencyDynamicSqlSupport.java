package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XIoGlobalByFileByLatencyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.486158+08:00", comments="Source Table: x$io_global_by_file_by_latency")
    public static final XIoGlobalByFileByLatency XIoGlobalByFileByLatency = new XIoGlobalByFileByLatency();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.486158+08:00", comments="Source field: x$io_global_by_file_by_latency.file")
    public static final SqlColumn<String> file = XIoGlobalByFileByLatency.file;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.486158+08:00", comments="Source field: x$io_global_by_file_by_latency.total")
    public static final SqlColumn<Long> total = XIoGlobalByFileByLatency.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.486158+08:00", comments="Source field: x$io_global_by_file_by_latency.total_latency")
    public static final SqlColumn<Long> totalLatency = XIoGlobalByFileByLatency.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.486158+08:00", comments="Source field: x$io_global_by_file_by_latency.count_read")
    public static final SqlColumn<Long> countRead = XIoGlobalByFileByLatency.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.486158+08:00", comments="Source field: x$io_global_by_file_by_latency.read_latency")
    public static final SqlColumn<Long> readLatency = XIoGlobalByFileByLatency.readLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.486158+08:00", comments="Source field: x$io_global_by_file_by_latency.count_write")
    public static final SqlColumn<Long> countWrite = XIoGlobalByFileByLatency.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.486158+08:00", comments="Source field: x$io_global_by_file_by_latency.write_latency")
    public static final SqlColumn<Long> writeLatency = XIoGlobalByFileByLatency.writeLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.486158+08:00", comments="Source field: x$io_global_by_file_by_latency.count_misc")
    public static final SqlColumn<Long> countMisc = XIoGlobalByFileByLatency.countMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: x$io_global_by_file_by_latency.misc_latency")
    public static final SqlColumn<Long> miscLatency = XIoGlobalByFileByLatency.miscLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.486158+08:00", comments="Source Table: x$io_global_by_file_by_latency")
    public static final class XIoGlobalByFileByLatency extends SqlTable {
        public final SqlColumn<String> file = column("file", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> countRead = column("count_read", JDBCType.BIGINT);

        public final SqlColumn<Long> readLatency = column("read_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> countWrite = column("count_write", JDBCType.BIGINT);

        public final SqlColumn<Long> writeLatency = column("write_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> countMisc = column("count_misc", JDBCType.BIGINT);

        public final SqlColumn<Long> miscLatency = column("misc_latency", JDBCType.BIGINT);

        public XIoGlobalByFileByLatency() {
            super("x$io_global_by_file_by_latency");
        }
    }
}