package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemaTableStatisticsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source Table: schema_table_statistics")
    public static final SchemaTableStatistics schemaTableStatistics = new SchemaTableStatistics();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.table_schema")
    public static final SqlColumn<String> tableSchema = schemaTableStatistics.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.table_name")
    public static final SqlColumn<String> tableName = schemaTableStatistics.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.total_latency")
    public static final SqlColumn<String> totalLatency = schemaTableStatistics.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.rows_fetched")
    public static final SqlColumn<Long> rowsFetched = schemaTableStatistics.rowsFetched;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.fetch_latency")
    public static final SqlColumn<String> fetchLatency = schemaTableStatistics.fetchLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.rows_inserted")
    public static final SqlColumn<Long> rowsInserted = schemaTableStatistics.rowsInserted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.insert_latency")
    public static final SqlColumn<String> insertLatency = schemaTableStatistics.insertLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.rows_updated")
    public static final SqlColumn<Long> rowsUpdated = schemaTableStatistics.rowsUpdated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.update_latency")
    public static final SqlColumn<String> updateLatency = schemaTableStatistics.updateLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.rows_deleted")
    public static final SqlColumn<Long> rowsDeleted = schemaTableStatistics.rowsDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.delete_latency")
    public static final SqlColumn<String> deleteLatency = schemaTableStatistics.deleteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.io_read_requests")
    public static final SqlColumn<BigDecimal> ioReadRequests = schemaTableStatistics.ioReadRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.io_read")
    public static final SqlColumn<String> ioRead = schemaTableStatistics.ioRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.io_read_latency")
    public static final SqlColumn<String> ioReadLatency = schemaTableStatistics.ioReadLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.io_write_requests")
    public static final SqlColumn<BigDecimal> ioWriteRequests = schemaTableStatistics.ioWriteRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.io_write")
    public static final SqlColumn<String> ioWrite = schemaTableStatistics.ioWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source field: schema_table_statistics.io_write_latency")
    public static final SqlColumn<String> ioWriteLatency = schemaTableStatistics.ioWriteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: schema_table_statistics.io_misc_requests")
    public static final SqlColumn<BigDecimal> ioMiscRequests = schemaTableStatistics.ioMiscRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: schema_table_statistics.io_misc_latency")
    public static final SqlColumn<String> ioMiscLatency = schemaTableStatistics.ioMiscLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3710537+08:00", comments="Source Table: schema_table_statistics")
    public static final class SchemaTableStatistics extends SqlTable {
        public final SqlColumn<String> tableSchema = column("table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

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

        public SchemaTableStatistics() {
            super("schema_table_statistics");
        }
    }
}