package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemaIndexStatisticsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: schema_index_statistics")
    public static final SchemaIndexStatistics schemaIndexStatistics = new SchemaIndexStatistics();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.table_schema")
    public static final SqlColumn<String> tableSchema = schemaIndexStatistics.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.table_name")
    public static final SqlColumn<String> tableName = schemaIndexStatistics.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.index_name")
    public static final SqlColumn<String> indexName = schemaIndexStatistics.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_selected")
    public static final SqlColumn<Long> rowsSelected = schemaIndexStatistics.rowsSelected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.select_latency")
    public static final SqlColumn<String> selectLatency = schemaIndexStatistics.selectLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1088137+08:00", comments="Source field: schema_index_statistics.rows_inserted")
    public static final SqlColumn<Long> rowsInserted = schemaIndexStatistics.rowsInserted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1088137+08:00", comments="Source field: schema_index_statistics.insert_latency")
    public static final SqlColumn<String> insertLatency = schemaIndexStatistics.insertLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1088137+08:00", comments="Source field: schema_index_statistics.rows_updated")
    public static final SqlColumn<Long> rowsUpdated = schemaIndexStatistics.rowsUpdated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1088137+08:00", comments="Source field: schema_index_statistics.update_latency")
    public static final SqlColumn<String> updateLatency = schemaIndexStatistics.updateLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1088137+08:00", comments="Source field: schema_index_statistics.rows_deleted")
    public static final SqlColumn<Long> rowsDeleted = schemaIndexStatistics.rowsDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1088137+08:00", comments="Source field: schema_index_statistics.delete_latency")
    public static final SqlColumn<String> deleteLatency = schemaIndexStatistics.deleteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: schema_index_statistics")
    public static final class SchemaIndexStatistics extends SqlTable {
        public final SqlColumn<String> tableSchema = column("table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("index_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsSelected = column("rows_selected", JDBCType.BIGINT);

        public final SqlColumn<String> selectLatency = column("select_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsInserted = column("rows_inserted", JDBCType.BIGINT);

        public final SqlColumn<String> insertLatency = column("insert_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsUpdated = column("rows_updated", JDBCType.BIGINT);

        public final SqlColumn<String> updateLatency = column("update_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsDeleted = column("rows_deleted", JDBCType.BIGINT);

        public final SqlColumn<String> deleteLatency = column("delete_latency", JDBCType.VARCHAR);

        public SchemaIndexStatistics() {
            super("schema_index_statistics");
        }
    }
}