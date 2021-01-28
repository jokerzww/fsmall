package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemaAutoIncrementColumnsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source Table: schema_auto_increment_columns")
    public static final SchemaAutoIncrementColumns schemaAutoIncrementColumns = new SchemaAutoIncrementColumns();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.table_schema")
    public static final SqlColumn<String> tableSchema = schemaAutoIncrementColumns.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.table_name")
    public static final SqlColumn<String> tableName = schemaAutoIncrementColumns.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.column_name")
    public static final SqlColumn<String> columnName = schemaAutoIncrementColumns.columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.is_signed")
    public static final SqlColumn<Integer> isSigned = schemaAutoIncrementColumns.isSigned;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.is_unsigned")
    public static final SqlColumn<Integer> isUnsigned = schemaAutoIncrementColumns.isUnsigned;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.max_value")
    public static final SqlColumn<Long> maxValue = schemaAutoIncrementColumns.maxValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.auto_increment")
    public static final SqlColumn<Long> autoIncrement = schemaAutoIncrementColumns.autoIncrement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.auto_increment_ratio")
    public static final SqlColumn<BigDecimal> autoIncrementRatio = schemaAutoIncrementColumns.autoIncrementRatio;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.data_type")
    public static final SqlColumn<String> dataType = schemaAutoIncrementColumns.dataType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.column_type")
    public static final SqlColumn<String> columnType = schemaAutoIncrementColumns.columnType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source Table: schema_auto_increment_columns")
    public static final class SchemaAutoIncrementColumns extends SqlTable {
        public final SqlColumn<String> tableSchema = column("table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> columnName = column("column_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isSigned = column("is_signed", JDBCType.INTEGER);

        public final SqlColumn<Integer> isUnsigned = column("is_unsigned", JDBCType.INTEGER);

        public final SqlColumn<Long> maxValue = column("max_value", JDBCType.BIGINT);

        public final SqlColumn<Long> autoIncrement = column("auto_increment", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> autoIncrementRatio = column("auto_increment_ratio", JDBCType.DECIMAL);

        public final SqlColumn<String> dataType = column("data_type", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> columnType = column("column_type", JDBCType.LONGVARCHAR);

        public SchemaAutoIncrementColumns() {
            super("schema_auto_increment_columns");
        }
    }
}