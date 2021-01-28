package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XSchemaTablesWithFullTableScansDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source Table: x$schema_tables_with_full_table_scans")
    public static final XSchemaTablesWithFullTableScans XSchemaTablesWithFullTableScans = new XSchemaTablesWithFullTableScans();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: x$schema_tables_with_full_table_scans.object_schema")
    public static final SqlColumn<String> objectSchema = XSchemaTablesWithFullTableScans.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: x$schema_tables_with_full_table_scans.object_name")
    public static final SqlColumn<String> objectName = XSchemaTablesWithFullTableScans.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: x$schema_tables_with_full_table_scans.rows_full_scanned")
    public static final SqlColumn<Long> rowsFullScanned = XSchemaTablesWithFullTableScans.rowsFullScanned;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: x$schema_tables_with_full_table_scans.latency")
    public static final SqlColumn<Long> latency = XSchemaTablesWithFullTableScans.latency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source Table: x$schema_tables_with_full_table_scans")
    public static final class XSchemaTablesWithFullTableScans extends SqlTable {
        public final SqlColumn<String> objectSchema = column("object_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("object_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsFullScanned = column("rows_full_scanned", JDBCType.BIGINT);

        public final SqlColumn<Long> latency = column("latency", JDBCType.BIGINT);

        public XSchemaTablesWithFullTableScans() {
            super("x$schema_tables_with_full_table_scans");
        }
    }
}