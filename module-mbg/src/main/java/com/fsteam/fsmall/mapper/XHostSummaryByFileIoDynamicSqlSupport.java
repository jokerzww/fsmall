package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XHostSummaryByFileIoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: x$host_summary_by_file_io")
    public static final XHostSummaryByFileIo XHostSummaryByFileIo = new XHostSummaryByFileIo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source field: x$host_summary_by_file_io.host")
    public static final SqlColumn<String> host = XHostSummaryByFileIo.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source field: x$host_summary_by_file_io.ios")
    public static final SqlColumn<BigDecimal> ios = XHostSummaryByFileIo.ios;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source field: x$host_summary_by_file_io.io_latency")
    public static final SqlColumn<BigDecimal> ioLatency = XHostSummaryByFileIo.ioLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: x$host_summary_by_file_io")
    public static final class XHostSummaryByFileIo extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> ios = column("ios", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> ioLatency = column("io_latency", JDBCType.DECIMAL);

        public XHostSummaryByFileIo() {
            super("x$host_summary_by_file_io");
        }
    }
}