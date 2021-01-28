package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LatestFileIoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    public static final LatestFileIo latestFileIo = new LatestFileIo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: latest_file_io.thread")
    public static final SqlColumn<String> thread = latestFileIo.thread;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: latest_file_io.file")
    public static final SqlColumn<String> file = latestFileIo.file;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: latest_file_io.latency")
    public static final SqlColumn<String> latency = latestFileIo.latency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: latest_file_io.operation")
    public static final SqlColumn<String> operation = latestFileIo.operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: latest_file_io.requested")
    public static final SqlColumn<String> requested = latestFileIo.requested;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    public static final class LatestFileIo extends SqlTable {
        public final SqlColumn<String> thread = column("thread", JDBCType.VARCHAR);

        public final SqlColumn<String> file = column("file", JDBCType.VARCHAR);

        public final SqlColumn<String> latency = column("latency", JDBCType.VARCHAR);

        public final SqlColumn<String> operation = column("operation", JDBCType.VARCHAR);

        public final SqlColumn<String> requested = column("requested", JDBCType.VARCHAR);

        public LatestFileIo() {
            super("latest_file_io");
        }
    }
}