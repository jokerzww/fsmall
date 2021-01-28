package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XSchemaTableStatisticsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source Table: x$schema_table_statistics")
    public static final XSchemaTableStatistics XSchemaTableStatistics = new XSchemaTableStatistics();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source field: x$schema_table_statistics.table_schema")
    public static final SqlColumn<String> tableSchema = XSchemaTableStatistics.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source field: x$schema_table_statistics.table_name")
    public static final SqlColumn<String> tableName = XSchemaTableStatistics.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source field: x$schema_table_statistics.total_latency")
    public static final SqlColumn<Long> totalLatency = XSchemaTableStatistics.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source field: x$schema_table_statistics.rows_fetched")
    public static final SqlColumn<Long> rowsFetched = XSchemaTableStatistics.rowsFetched;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source field: x$schema_table_statistics.fetch_latency")
    public static final SqlColumn<Long> fetchLatency = XSchemaTableStatistics.fetchLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source field: x$schema_table_statistics.rows_inserted")
    public static final SqlColumn<Long> rowsInserted = XSchemaTableStatistics.rowsInserted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source field: x$schema_table_statistics.insert_latency")
    public static final SqlColumn<Long> insertLatency = XSchemaTableStatistics.insertLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source field: x$schema_table_statistics.rows_updated")
    public static final SqlColumn<Long> rowsUpdated = XSchemaTableStatistics.rowsUpdated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source field: x$schema_table_statistics.update_latency")
    public static final SqlColumn<Long> updateLatency = XSchemaTableStatistics.updateLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source field: x$schema_table_statistics.rows_deleted")
    public static final SqlColumn<Long> rowsDeleted = XSchemaTableStatistics.rowsDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source field: x$schema_table_statistics.delete_latency")
    public static final SqlColumn<Long> deleteLatency = XSchemaTableStatistics.deleteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source field: x$schema_table_statistics.io_read_requests")
    public static final SqlColumn<BigDecimal> ioReadRequests = XSchemaTableStatistics.ioReadRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source field: x$schema_table_statistics.io_read")
    public static final SqlColumn<BigDecimal> ioRead = XSchemaTableStatistics.ioRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source field: x$schema_table_statistics.io_read_latency")
    public static final SqlColumn<BigDecimal> ioReadLatency = XSchemaTableStatistics.ioReadLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source field: x$schema_table_statistics.io_write_requests")
    public static final SqlColumn<BigDecimal> ioWriteRequests = XSchemaTableStatistics.ioWriteRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source field: x$schema_table_statistics.io_write")
    public static final SqlColumn<BigDecimal> ioWrite = XSchemaTableStatistics.ioWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source field: x$schema_table_statistics.io_write_latency")
    public static final SqlColumn<BigDecimal> ioWriteLatency = XSchemaTableStatistics.ioWriteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source field: x$schema_table_statistics.io_misc_requests")
    public static final SqlColumn<BigDecimal> ioMiscRequests = XSchemaTableStatistics.ioMiscRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source field: x$schema_table_statistics.io_misc_latency")
    public static final SqlColumn<BigDecimal> ioMiscLatency = XSchemaTableStatistics.ioMiscLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1898885+08:00", comments="Source Table: x$schema_table_statistics")
    public static final class XSchemaTableStatistics extends SqlTable {
        public final SqlColumn<String> tableSchema = column("table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

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

        public XSchemaTableStatistics() {
            super("x$schema_table_statistics");
        }
    }
}