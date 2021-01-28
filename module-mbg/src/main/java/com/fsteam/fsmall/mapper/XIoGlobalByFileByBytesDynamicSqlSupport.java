package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XIoGlobalByFileByBytesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    public static final XIoGlobalByFileByBytes XIoGlobalByFileByBytes = new XIoGlobalByFileByBytes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.file")
    public static final SqlColumn<String> file = XIoGlobalByFileByBytes.file;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.count_read")
    public static final SqlColumn<Long> countRead = XIoGlobalByFileByBytes.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.total_read")
    public static final SqlColumn<Long> totalRead = XIoGlobalByFileByBytes.totalRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.avg_read")
    public static final SqlColumn<BigDecimal> avgRead = XIoGlobalByFileByBytes.avgRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.count_write")
    public static final SqlColumn<Long> countWrite = XIoGlobalByFileByBytes.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.total_written")
    public static final SqlColumn<Long> totalWritten = XIoGlobalByFileByBytes.totalWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.avg_write")
    public static final SqlColumn<BigDecimal> avgWrite = XIoGlobalByFileByBytes.avgWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.total")
    public static final SqlColumn<Long> total = XIoGlobalByFileByBytes.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.write_pct")
    public static final SqlColumn<BigDecimal> writePct = XIoGlobalByFileByBytes.writePct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    public static final class XIoGlobalByFileByBytes extends SqlTable {
        public final SqlColumn<String> file = column("file", JDBCType.VARCHAR);

        public final SqlColumn<Long> countRead = column("count_read", JDBCType.BIGINT);

        public final SqlColumn<Long> totalRead = column("total_read", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgRead = column("avg_read", JDBCType.DECIMAL);

        public final SqlColumn<Long> countWrite = column("count_write", JDBCType.BIGINT);

        public final SqlColumn<Long> totalWritten = column("total_written", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgWrite = column("avg_write", JDBCType.DECIMAL);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> writePct = column("write_pct", JDBCType.DECIMAL);

        public XIoGlobalByFileByBytes() {
            super("x$io_global_by_file_by_bytes");
        }
    }
}