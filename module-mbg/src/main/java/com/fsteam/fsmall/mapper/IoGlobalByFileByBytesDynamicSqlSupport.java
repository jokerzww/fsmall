package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IoGlobalByFileByBytesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source Table: io_global_by_file_by_bytes")
    public static final IoGlobalByFileByBytes ioGlobalByFileByBytes = new IoGlobalByFileByBytes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source field: io_global_by_file_by_bytes.file")
    public static final SqlColumn<String> file = ioGlobalByFileByBytes.file;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source field: io_global_by_file_by_bytes.count_read")
    public static final SqlColumn<Long> countRead = ioGlobalByFileByBytes.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source field: io_global_by_file_by_bytes.total_read")
    public static final SqlColumn<String> totalRead = ioGlobalByFileByBytes.totalRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source field: io_global_by_file_by_bytes.avg_read")
    public static final SqlColumn<String> avgRead = ioGlobalByFileByBytes.avgRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source field: io_global_by_file_by_bytes.count_write")
    public static final SqlColumn<Long> countWrite = ioGlobalByFileByBytes.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source field: io_global_by_file_by_bytes.total_written")
    public static final SqlColumn<String> totalWritten = ioGlobalByFileByBytes.totalWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3340194+08:00", comments="Source field: io_global_by_file_by_bytes.avg_write")
    public static final SqlColumn<String> avgWrite = ioGlobalByFileByBytes.avgWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3340194+08:00", comments="Source field: io_global_by_file_by_bytes.total")
    public static final SqlColumn<String> total = ioGlobalByFileByBytes.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3340194+08:00", comments="Source field: io_global_by_file_by_bytes.write_pct")
    public static final SqlColumn<BigDecimal> writePct = ioGlobalByFileByBytes.writePct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source Table: io_global_by_file_by_bytes")
    public static final class IoGlobalByFileByBytes extends SqlTable {
        public final SqlColumn<String> file = column("file", JDBCType.VARCHAR);

        public final SqlColumn<Long> countRead = column("count_read", JDBCType.BIGINT);

        public final SqlColumn<String> totalRead = column("total_read", JDBCType.VARCHAR);

        public final SqlColumn<String> avgRead = column("avg_read", JDBCType.VARCHAR);

        public final SqlColumn<Long> countWrite = column("count_write", JDBCType.BIGINT);

        public final SqlColumn<String> totalWritten = column("total_written", JDBCType.VARCHAR);

        public final SqlColumn<String> avgWrite = column("avg_write", JDBCType.VARCHAR);

        public final SqlColumn<String> total = column("total", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> writePct = column("write_pct", JDBCType.DECIMAL);

        public IoGlobalByFileByBytes() {
            super("io_global_by_file_by_bytes");
        }
    }
}