package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XUserSummaryByFileIoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3360205+08:00", comments="Source Table: x$user_summary_by_file_io")
    public static final XUserSummaryByFileIo XUserSummaryByFileIo = new XUserSummaryByFileIo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source field: x$user_summary_by_file_io.user")
    public static final SqlColumn<String> user = XUserSummaryByFileIo.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source field: x$user_summary_by_file_io.ios")
    public static final SqlColumn<BigDecimal> ios = XUserSummaryByFileIo.ios;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source field: x$user_summary_by_file_io.io_latency")
    public static final SqlColumn<BigDecimal> ioLatency = XUserSummaryByFileIo.ioLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    public static final class XUserSummaryByFileIo extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> ios = column("ios", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> ioLatency = column("io_latency", JDBCType.DECIMAL);

        public XUserSummaryByFileIo() {
            super("x$user_summary_by_file_io");
        }
    }
}