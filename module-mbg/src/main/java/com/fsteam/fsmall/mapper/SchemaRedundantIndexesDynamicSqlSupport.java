package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemaRedundantIndexesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source Table: schema_redundant_indexes")
    public static final SchemaRedundantIndexes schemaRedundantIndexes = new SchemaRedundantIndexes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.table_schema")
    public static final SqlColumn<String> tableSchema = schemaRedundantIndexes.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.table_name")
    public static final SqlColumn<String> tableName = schemaRedundantIndexes.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.redundant_index_name")
    public static final SqlColumn<String> redundantIndexName = schemaRedundantIndexes.redundantIndexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source field: schema_redundant_indexes.redundant_index_non_unique")
    public static final SqlColumn<Integer> redundantIndexNonUnique = schemaRedundantIndexes.redundantIndexNonUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source field: schema_redundant_indexes.dominant_index_name")
    public static final SqlColumn<String> dominantIndexName = schemaRedundantIndexes.dominantIndexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source field: schema_redundant_indexes.dominant_index_non_unique")
    public static final SqlColumn<Integer> dominantIndexNonUnique = schemaRedundantIndexes.dominantIndexNonUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source field: schema_redundant_indexes.subpart_exists")
    public static final SqlColumn<Integer> subpartExists = schemaRedundantIndexes.subpartExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source field: schema_redundant_indexes.sql_drop_index")
    public static final SqlColumn<String> sqlDropIndex = schemaRedundantIndexes.sqlDropIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source field: schema_redundant_indexes.redundant_index_columns")
    public static final SqlColumn<String> redundantIndexColumns = schemaRedundantIndexes.redundantIndexColumns;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source field: schema_redundant_indexes.dominant_index_columns")
    public static final SqlColumn<String> dominantIndexColumns = schemaRedundantIndexes.dominantIndexColumns;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source Table: schema_redundant_indexes")
    public static final class SchemaRedundantIndexes extends SqlTable {
        public final SqlColumn<String> tableSchema = column("table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> redundantIndexName = column("redundant_index_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> redundantIndexNonUnique = column("redundant_index_non_unique", JDBCType.INTEGER);

        public final SqlColumn<String> dominantIndexName = column("dominant_index_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> dominantIndexNonUnique = column("dominant_index_non_unique", JDBCType.INTEGER);

        public final SqlColumn<Integer> subpartExists = column("subpart_exists", JDBCType.INTEGER);

        public final SqlColumn<String> sqlDropIndex = column("sql_drop_index", JDBCType.VARCHAR);

        public final SqlColumn<String> redundantIndexColumns = column("redundant_index_columns", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> dominantIndexColumns = column("dominant_index_columns", JDBCType.LONGVARCHAR);

        public SchemaRedundantIndexes() {
            super("schema_redundant_indexes");
        }
    }
}