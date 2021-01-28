package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XSchemaIndexStatisticsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    public static final XSchemaIndexStatistics XSchemaIndexStatistics = new XSchemaIndexStatistics();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.table_schema")
    public static final SqlColumn<String> tableSchema = XSchemaIndexStatistics.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.table_name")
    public static final SqlColumn<String> tableName = XSchemaIndexStatistics.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.index_name")
    public static final SqlColumn<String> indexName = XSchemaIndexStatistics.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.rows_selected")
    public static final SqlColumn<Long> rowsSelected = XSchemaIndexStatistics.rowsSelected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.select_latency")
    public static final SqlColumn<Long> selectLatency = XSchemaIndexStatistics.selectLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.rows_inserted")
    public static final SqlColumn<Long> rowsInserted = XSchemaIndexStatistics.rowsInserted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.insert_latency")
    public static final SqlColumn<Long> insertLatency = XSchemaIndexStatistics.insertLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.rows_updated")
    public static final SqlColumn<Long> rowsUpdated = XSchemaIndexStatistics.rowsUpdated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.update_latency")
    public static final SqlColumn<Long> updateLatency = XSchemaIndexStatistics.updateLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.rows_deleted")
    public static final SqlColumn<Long> rowsDeleted = XSchemaIndexStatistics.rowsDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source field: x$schema_index_statistics.delete_latency")
    public static final SqlColumn<Long> deleteLatency = XSchemaIndexStatistics.deleteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    public static final class XSchemaIndexStatistics extends SqlTable {
        public final SqlColumn<String> tableSchema = column("table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("index_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsSelected = column("rows_selected", JDBCType.BIGINT);

        public final SqlColumn<Long> selectLatency = column("select_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsInserted = column("rows_inserted", JDBCType.BIGINT);

        public final SqlColumn<Long> insertLatency = column("insert_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsUpdated = column("rows_updated", JDBCType.BIGINT);

        public final SqlColumn<Long> updateLatency = column("update_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsDeleted = column("rows_deleted", JDBCType.BIGINT);

        public final SqlColumn<Long> deleteLatency = column("delete_latency", JDBCType.BIGINT);

        public XSchemaIndexStatistics() {
            super("x$schema_index_statistics");
        }
    }
}