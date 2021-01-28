package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SchemaAutoIncrementColumnsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.SchemaAutoIncrementColumns;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SchemaAutoIncrementColumnsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    BasicColumn[] selectList = BasicColumn.columnList(tableSchema, tableName, columnName, isSigned, isUnsigned, maxValue, autoIncrement, autoIncrementRatio, dataType, columnType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SchemaAutoIncrementColumns> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SchemaAutoIncrementColumnsResult")
    Optional<SchemaAutoIncrementColumns> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SchemaAutoIncrementColumnsResult", value = {
        @Result(column="table_schema", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="column_name", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_signed", property="isSigned", jdbcType=JdbcType.INTEGER),
        @Result(column="is_unsigned", property="isUnsigned", jdbcType=JdbcType.INTEGER),
        @Result(column="max_value", property="maxValue", jdbcType=JdbcType.BIGINT),
        @Result(column="auto_increment", property="autoIncrement", jdbcType=JdbcType.BIGINT),
        @Result(column="auto_increment_ratio", property="autoIncrementRatio", jdbcType=JdbcType.DECIMAL),
        @Result(column="data_type", property="dataType", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="column_type", property="columnType", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SchemaAutoIncrementColumns> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, schemaAutoIncrementColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, schemaAutoIncrementColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    default int insert(SchemaAutoIncrementColumns record) {
        return MyBatis3Utils.insert(this::insert, record, schemaAutoIncrementColumns, c ->
            c.map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(isSigned).toProperty("isSigned")
            .map(isUnsigned).toProperty("isUnsigned")
            .map(maxValue).toProperty("maxValue")
            .map(autoIncrement).toProperty("autoIncrement")
            .map(autoIncrementRatio).toProperty("autoIncrementRatio")
            .map(dataType).toProperty("dataType")
            .map(columnType).toProperty("columnType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    default int insertSelective(SchemaAutoIncrementColumns record) {
        return MyBatis3Utils.insert(this::insert, record, schemaAutoIncrementColumns, c ->
            c.map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(isSigned).toPropertyWhenPresent("isSigned", record::getIsSigned)
            .map(isUnsigned).toPropertyWhenPresent("isUnsigned", record::getIsUnsigned)
            .map(maxValue).toPropertyWhenPresent("maxValue", record::getMaxValue)
            .map(autoIncrement).toPropertyWhenPresent("autoIncrement", record::getAutoIncrement)
            .map(autoIncrementRatio).toPropertyWhenPresent("autoIncrementRatio", record::getAutoIncrementRatio)
            .map(dataType).toPropertyWhenPresent("dataType", record::getDataType)
            .map(columnType).toPropertyWhenPresent("columnType", record::getColumnType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    default Optional<SchemaAutoIncrementColumns> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, schemaAutoIncrementColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    default List<SchemaAutoIncrementColumns> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, schemaAutoIncrementColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    default List<SchemaAutoIncrementColumns> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, schemaAutoIncrementColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, schemaAutoIncrementColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    static UpdateDSL<UpdateModel> updateAllColumns(SchemaAutoIncrementColumns record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(columnName).equalTo(record::getColumnName)
                .set(isSigned).equalTo(record::getIsSigned)
                .set(isUnsigned).equalTo(record::getIsUnsigned)
                .set(maxValue).equalTo(record::getMaxValue)
                .set(autoIncrement).equalTo(record::getAutoIncrement)
                .set(autoIncrementRatio).equalTo(record::getAutoIncrementRatio)
                .set(dataType).equalTo(record::getDataType)
                .set(columnType).equalTo(record::getColumnType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: schema_auto_increment_columns")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SchemaAutoIncrementColumns record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(isSigned).equalToWhenPresent(record::getIsSigned)
                .set(isUnsigned).equalToWhenPresent(record::getIsUnsigned)
                .set(maxValue).equalToWhenPresent(record::getMaxValue)
                .set(autoIncrement).equalToWhenPresent(record::getAutoIncrement)
                .set(autoIncrementRatio).equalToWhenPresent(record::getAutoIncrementRatio)
                .set(dataType).equalToWhenPresent(record::getDataType)
                .set(columnType).equalToWhenPresent(record::getColumnType);
    }
}