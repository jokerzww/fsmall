package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemaUnusedIndexesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source Table: schema_unused_indexes")
    public static final SchemaUnusedIndexes schemaUnusedIndexes = new SchemaUnusedIndexes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.object_schema")
    public static final SqlColumn<String> objectSchema = schemaUnusedIndexes.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.object_name")
    public static final SqlColumn<String> objectName = schemaUnusedIndexes.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: schema_unused_indexes.index_name")
    public static final SqlColumn<String> indexName = schemaUnusedIndexes.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source Table: schema_unused_indexes")
    public static final class SchemaUnusedIndexes extends SqlTable {
        public final SqlColumn<String> objectSchema = column("object_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("object_name", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("index_name", JDBCType.VARCHAR);

        public SchemaUnusedIndexes() {
            super("schema_unused_indexes");
        }
    }
}