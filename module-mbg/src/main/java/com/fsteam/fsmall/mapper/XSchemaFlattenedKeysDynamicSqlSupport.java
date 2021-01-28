package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XSchemaFlattenedKeysDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: x$schema_flattened_keys")
    public static final XSchemaFlattenedKeys XSchemaFlattenedKeys = new XSchemaFlattenedKeys();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.table_schema")
    public static final SqlColumn<String> tableSchema = XSchemaFlattenedKeys.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: x$schema_flattened_keys.table_name")
    public static final SqlColumn<String> tableName = XSchemaFlattenedKeys.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: x$schema_flattened_keys.index_name")
    public static final SqlColumn<String> indexName = XSchemaFlattenedKeys.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: x$schema_flattened_keys.non_unique")
    public static final SqlColumn<Integer> nonUnique = XSchemaFlattenedKeys.nonUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: x$schema_flattened_keys.subpart_exists")
    public static final SqlColumn<Long> subpartExists = XSchemaFlattenedKeys.subpartExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: x$schema_flattened_keys.index_columns")
    public static final SqlColumn<String> indexColumns = XSchemaFlattenedKeys.indexColumns;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: x$schema_flattened_keys")
    public static final class XSchemaFlattenedKeys extends SqlTable {
        public final SqlColumn<String> tableSchema = column("table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("index_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> nonUnique = column("non_unique", JDBCType.INTEGER);

        public final SqlColumn<Long> subpartExists = column("subpart_exists", JDBCType.BIGINT);

        public final SqlColumn<String> indexColumns = column("index_columns", JDBCType.LONGVARCHAR);

        public XSchemaFlattenedKeys() {
            super("x$schema_flattened_keys");
        }
    }
}