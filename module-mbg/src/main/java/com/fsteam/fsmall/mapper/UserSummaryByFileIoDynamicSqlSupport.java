package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserSummaryByFileIoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source Table: user_summary_by_file_io")
    public static final UserSummaryByFileIo userSummaryByFileIo = new UserSummaryByFileIo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.user")
    public static final SqlColumn<String> user = userSummaryByFileIo.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.ios")
    public static final SqlColumn<BigDecimal> ios = userSummaryByFileIo.ios;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.io_latency")
    public static final SqlColumn<String> ioLatency = userSummaryByFileIo.ioLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source Table: user_summary_by_file_io")
    public static final class UserSummaryByFileIo extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> ios = column("ios", JDBCType.DECIMAL);

        public final SqlColumn<String> ioLatency = column("io_latency", JDBCType.VARCHAR);

        public UserSummaryByFileIo() {
            super("user_summary_by_file_io");
        }
    }
}