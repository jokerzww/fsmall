package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HostSummaryByFileIoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0427533+08:00", comments="Source Table: host_summary_by_file_io")
    public static final HostSummaryByFileIo hostSummaryByFileIo = new HostSummaryByFileIo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0427533+08:00", comments="Source field: host_summary_by_file_io.host")
    public static final SqlColumn<String> host = hostSummaryByFileIo.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0427533+08:00", comments="Source field: host_summary_by_file_io.ios")
    public static final SqlColumn<BigDecimal> ios = hostSummaryByFileIo.ios;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0427533+08:00", comments="Source field: host_summary_by_file_io.io_latency")
    public static final SqlColumn<String> ioLatency = hostSummaryByFileIo.ioLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0427533+08:00", comments="Source Table: host_summary_by_file_io")
    public static final class HostSummaryByFileIo extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> ios = column("ios", JDBCType.DECIMAL);

        public final SqlColumn<String> ioLatency = column("io_latency", JDBCType.VARCHAR);

        public HostSummaryByFileIo() {
            super("host_summary_by_file_io");
        }
    }
}