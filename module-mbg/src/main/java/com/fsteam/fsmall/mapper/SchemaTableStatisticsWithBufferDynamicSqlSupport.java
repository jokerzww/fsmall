package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemaTableStatisticsWithBufferDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.124828+08:00", comments="Source Table: schema_table_statistics_with_buffer")
    public static final SchemaTableStatisticsWithBuffer schemaTableStatisticsWithBuffer = new SchemaTableStatisticsWithBuffer();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.124828+08:00", comments="Source field: schema_table_statistics_with_buffer.table_schema")
    public static final SqlColumn<String> tableSchema = schemaTableStatisticsWithBuffer.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.124828+08:00", comments="Source field: schema_table_statistics_with_buffer.table_name")
    public static final SqlColumn<String> tableName = schemaTableStatisticsWithBuffer.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.124828+08:00", comments="Source field: schema_table_statistics_with_buffer.rows_fetched")
    public static final SqlColumn<Long> rowsFetched = schemaTableStatisticsWithBuffer.rowsFetched;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.124828+08:00", comments="Source field: schema_table_statistics_with_buffer.fetch_latency")
    public static final SqlColumn<String> fetchLatency = schemaTableStatisticsWithBuffer.fetchLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.124828+08:00", comments="Source field: schema_table_statistics_with_buffer.rows_inserted")
    public static final SqlColumn<Long> rowsInserted = schemaTableStatisticsWithBuffer.rowsInserted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.insert_latency")
    public static final SqlColumn<String> insertLatency = schemaTableStatisticsWithBuffer.insertLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.rows_updated")
    public static final SqlColumn<Long> rowsUpdated = schemaTableStatisticsWithBuffer.rowsUpdated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.update_latency")
    public static final SqlColumn<String> updateLatency = schemaTableStatisticsWithBuffer.updateLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.rows_deleted")
    public static final SqlColumn<Long> rowsDeleted = schemaTableStatisticsWithBuffer.rowsDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.delete_latency")
    public static final SqlColumn<String> deleteLatency = schemaTableStatisticsWithBuffer.deleteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.io_read_requests")
    public static final SqlColumn<BigDecimal> ioReadRequests = schemaTableStatisticsWithBuffer.ioReadRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.io_read")
    public static final SqlColumn<String> ioRead = schemaTableStatisticsWithBuffer.ioRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.io_read_latency")
    public static final SqlColumn<String> ioReadLatency = schemaTableStatisticsWithBuffer.ioReadLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.io_write_requests")
    public static final SqlColumn<BigDecimal> ioWriteRequests = schemaTableStatisticsWithBuffer.ioWriteRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.io_write")
    public static final SqlColumn<String> ioWrite = schemaTableStatisticsWithBuffer.ioWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.io_write_latency")
    public static final SqlColumn<String> ioWriteLatency = schemaTableStatisticsWithBuffer.ioWriteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.io_misc_requests")
    public static final SqlColumn<BigDecimal> ioMiscRequests = schemaTableStatisticsWithBuffer.ioMiscRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.io_misc_latency")
    public static final SqlColumn<String> ioMiscLatency = schemaTableStatisticsWithBuffer.ioMiscLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.innodb_buffer_allocated")
    public static final SqlColumn<String> innodbBufferAllocated = schemaTableStatisticsWithBuffer.innodbBufferAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.innodb_buffer_data")
    public static final SqlColumn<String> innodbBufferData = schemaTableStatisticsWithBuffer.innodbBufferData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.innodb_buffer_free")
    public static final SqlColumn<String> innodbBufferFree = schemaTableStatisticsWithBuffer.innodbBufferFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.125829+08:00", comments="Source field: schema_table_statistics_with_buffer.innodb_buffer_pages")
    public static final SqlColumn<Long> innodbBufferPages = schemaTableStatisticsWithBuffer.innodbBufferPages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1268299+08:00", comments="Source field: schema_table_statistics_with_buffer.innodb_buffer_pages_hashed")
    public static final SqlColumn<Long> innodbBufferPagesHashed = schemaTableStatisticsWithBuffer.innodbBufferPagesHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1268299+08:00", comments="Source field: schema_table_statistics_with_buffer.innodb_buffer_pages_old")
    public static final SqlColumn<Long> innodbBufferPagesOld = schemaTableStatisticsWithBuffer.innodbBufferPagesOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1268299+08:00", comments="Source field: schema_table_statistics_with_buffer.innodb_buffer_rows_cached")
    public static final SqlColumn<BigDecimal> innodbBufferRowsCached = schemaTableStatisticsWithBuffer.innodbBufferRowsCached;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.124828+08:00", comments="Source Table: schema_table_statistics_with_buffer")
    public static final class SchemaTableStatisticsWithBuffer extends SqlTable {
        public final SqlColumn<String> tableSchema = column("table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsFetched = column("rows_fetched", JDBCType.BIGINT);

        public final SqlColumn<String> fetchLatency = column("fetch_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsInserted = column("rows_inserted", JDBCType.BIGINT);

        public final SqlColumn<String> insertLatency = column("insert_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsUpdated = column("rows_updated", JDBCType.BIGINT);

        public final SqlColumn<String> updateLatency = column("update_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsDeleted = column("rows_deleted", JDBCType.BIGINT);

        public final SqlColumn<String> deleteLatency = column("delete_latency", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> ioReadRequests = column("io_read_requests", JDBCType.DECIMAL);

        public final SqlColumn<String> ioRead = column("io_read", JDBCType.VARCHAR);

        public final SqlColumn<String> ioReadLatency = column("io_read_latency", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> ioWriteRequests = column("io_write_requests", JDBCType.DECIMAL);

        public final SqlColumn<String> ioWrite = column("io_write", JDBCType.VARCHAR);

        public final SqlColumn<String> ioWriteLatency = column("io_write_latency", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> ioMiscRequests = column("io_misc_requests", JDBCType.DECIMAL);

        public final SqlColumn<String> ioMiscLatency = column("io_misc_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> innodbBufferAllocated = column("innodb_buffer_allocated", JDBCType.VARCHAR);

        public final SqlColumn<String> innodbBufferData = column("innodb_buffer_data", JDBCType.VARCHAR);

        public final SqlColumn<String> innodbBufferFree = column("innodb_buffer_free", JDBCType.VARCHAR);

        public final SqlColumn<Long> innodbBufferPages = column("innodb_buffer_pages", JDBCType.BIGINT);

        public final SqlColumn<Long> innodbBufferPagesHashed = column("innodb_buffer_pages_hashed", JDBCType.BIGINT);

        public final SqlColumn<Long> innodbBufferPagesOld = column("innodb_buffer_pages_old", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> innodbBufferRowsCached = column("innodb_buffer_rows_cached", JDBCType.DECIMAL);

        public SchemaTableStatisticsWithBuffer() {
            super("schema_table_statistics_with_buffer");
        }
    }
}