package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XLatestFileIoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source Table: x$latest_file_io")
    public static final XLatestFileIo XLatestFileIo = new XLatestFileIo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.thread")
    public static final SqlColumn<String> thread = XLatestFileIo.thread;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.file")
    public static final SqlColumn<String> file = XLatestFileIo.file;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.latency")
    public static final SqlColumn<Long> latency = XLatestFileIo.latency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.operation")
    public static final SqlColumn<String> operation = XLatestFileIo.operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.requested")
    public static final SqlColumn<Long> requested = XLatestFileIo.requested;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source Table: x$latest_file_io")
    public static final class XLatestFileIo extends SqlTable {
        public final SqlColumn<String> thread = column("thread", JDBCType.VARCHAR);

        public final SqlColumn<String> file = column("file", JDBCType.VARCHAR);

        public final SqlColumn<Long> latency = column("latency", JDBCType.BIGINT);

        public final SqlColumn<String> operation = column("operation", JDBCType.VARCHAR);

        public final SqlColumn<Long> requested = column("requested", JDBCType.BIGINT);

        public XLatestFileIo() {
            super("x$latest_file_io");
        }
    }
}