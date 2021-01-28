package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XSchemaTableStatisticsWithBufferDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    public static final XSchemaTableStatisticsWithBuffer XSchemaTableStatisticsWithBuffer = new XSchemaTableStatisticsWithBuffer();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.table_schema")
    public static final SqlColumn<String> tableSchema = XSchemaTableStatisticsWithBuffer.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.table_name")
    public static final SqlColumn<String> tableName = XSchemaTableStatisticsWithBuffer.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_fetched")
    public static final SqlColumn<Long> rowsFetched = XSchemaTableStatisticsWithBuffer.rowsFetched;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.fetch_latency")
    public static final SqlColumn<Long> fetchLatency = XSchemaTableStatisticsWithBuffer.fetchLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_inserted")
    public static final SqlColumn<Long> rowsInserted = XSchemaTableStatisticsWithBuffer.rowsInserted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.insert_latency")
    public static final SqlColumn<Long> insertLatency = XSchemaTableStatisticsWithBuffer.insertLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_updated")
    public static final SqlColumn<Long> rowsUpdated = XSchemaTableStatisticsWithBuffer.rowsUpdated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.update_latency")
    public static final SqlColumn<Long> updateLatency = XSchemaTableStatisticsWithBuffer.updateLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_deleted")
    public static final SqlColumn<Long> rowsDeleted = XSchemaTableStatisticsWithBuffer.rowsDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.delete_latency")
    public static final SqlColumn<Long> deleteLatency = XSchemaTableStatisticsWithBuffer.deleteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read_requests")
    public static final SqlColumn<BigDecimal> ioReadRequests = XSchemaTableStatisticsWithBuffer.ioReadRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read")
    public static final SqlColumn<BigDecimal> ioRead = XSchemaTableStatisticsWithBuffer.ioRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read_latency")
    public static final SqlColumn<BigDecimal> ioReadLatency = XSchemaTableStatisticsWithBuffer.ioReadLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write_requests")
    public static final SqlColumn<BigDecimal> ioWriteRequests = XSchemaTableStatisticsWithBuffer.ioWriteRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write")
    public static final SqlColumn<BigDecimal> ioWrite = XSchemaTableStatisticsWithBuffer.ioWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write_latency")
    public static final SqlColumn<BigDecimal> ioWriteLatency = XSchemaTableStatisticsWithBuffer.ioWriteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_misc_requests")
    public static final SqlColumn<BigDecimal> ioMiscRequests = XSchemaTableStatisticsWithBuffer.ioMiscRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_misc_latency")
    public static final SqlColumn<BigDecimal> ioMiscLatency = XSchemaTableStatisticsWithBuffer.ioMiscLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_allocated")
    public static final SqlColumn<BigDecimal> innodbBufferAllocated = XSchemaTableStatisticsWithBuffer.innodbBufferAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_data")
    public static final SqlColumn<BigDecimal> innodbBufferData = XSchemaTableStatisticsWithBuffer.innodbBufferData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_free")
    public static final SqlColumn<BigDecimal> innodbBufferFree = XSchemaTableStatisticsWithBuffer.innodbBufferFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages")
    public static final SqlColumn<Long> innodbBufferPages = XSchemaTableStatisticsWithBuffer.innodbBufferPages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed")
    public static final SqlColumn<Long> innodbBufferPagesHashed = XSchemaTableStatisticsWithBuffer.innodbBufferPagesHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages_old")
    public static final SqlColumn<Long> innodbBufferPagesOld = XSchemaTableStatisticsWithBuffer.innodbBufferPagesOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached")
    public static final SqlColumn<BigDecimal> innodbBufferRowsCached = XSchemaTableStatisticsWithBuffer.innodbBufferRowsCached;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    public static final class XSchemaTableStatisticsWithBuffer extends SqlTable {
        public final SqlColumn<String> tableSchema = column("table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsFetched = column("rows_fetched", JDBCType.BIGINT);

        public final SqlColumn<Long> fetchLatency = column("fetch_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsInserted = column("rows_inserted", JDBCType.BIGINT);

        public final SqlColumn<Long> insertLatency = column("insert_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsUpdated = column("rows_updated", JDBCType.BIGINT);

        public final SqlColumn<Long> updateLatency = column("update_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsDeleted = column("rows_deleted", JDBCType.BIGINT);

        public final SqlColumn<Long> deleteLatency = column("delete_latency", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> ioReadRequests = column("io_read_requests", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> ioRead = column("io_read", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> ioReadLatency = column("io_read_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> ioWriteRequests = column("io_write_requests", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> ioWrite = column("io_write", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> ioWriteLatency = column("io_write_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> ioMiscRequests = column("io_misc_requests", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> ioMiscLatency = column("io_misc_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> innodbBufferAllocated = column("innodb_buffer_allocated", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> innodbBufferData = column("innodb_buffer_data", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> innodbBufferFree = column("innodb_buffer_free", JDBCType.DECIMAL);

        public final SqlColumn<Long> innodbBufferPages = column("innodb_buffer_pages", JDBCType.BIGINT);

        public final SqlColumn<Long> innodbBufferPagesHashed = column("innodb_buffer_pages_hashed", JDBCType.BIGINT);

        public final SqlColumn<Long> innodbBufferPagesOld = column("innodb_buffer_pages_old", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> innodbBufferRowsCached = column("innodb_buffer_rows_cached", JDBCType.DECIMAL);

        public XSchemaTableStatisticsWithBuffer() {
            super("x$schema_table_statistics_with_buffer");
        }
    }
}