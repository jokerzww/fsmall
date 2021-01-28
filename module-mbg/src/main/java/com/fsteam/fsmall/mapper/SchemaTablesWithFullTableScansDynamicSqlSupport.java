package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemaTablesWithFullTableScansDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    public static final SchemaTablesWithFullTableScans schemaTablesWithFullTableScans = new SchemaTablesWithFullTableScans();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source field: schema_tables_with_full_table_scans.object_schema")
    public static final SqlColumn<String> objectSchema = schemaTablesWithFullTableScans.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source field: schema_tables_with_full_table_scans.object_name")
    public static final SqlColumn<String> objectName = schemaTablesWithFullTableScans.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source field: schema_tables_with_full_table_scans.rows_full_scanned")
    public static final SqlColumn<Long> rowsFullScanned = schemaTablesWithFullTableScans.rowsFullScanned;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source field: schema_tables_with_full_table_scans.latency")
    public static final SqlColumn<String> latency = schemaTablesWithFullTableScans.latency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    public static final class SchemaTablesWithFullTableScans extends SqlTable {
        public final SqlColumn<String> objectSchema = column("object_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("object_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsFullScanned = column("rows_full_scanned", JDBCType.BIGINT);

        public final SqlColumn<String> latency = column("latency", JDBCType.VARCHAR);

        public SchemaTablesWithFullTableScans() {
            super("schema_tables_with_full_table_scans");
        }
    }
}