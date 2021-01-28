package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XSchemaFlattenedKeysDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XSchemaFlattenedKeys;
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
public interface XSchemaFlattenedKeysMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    BasicColumn[] selectList = BasicColumn.columnList(tableSchema, tableName, indexName, nonUnique, subpartExists, indexColumns);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XSchemaFlattenedKeys> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XSchemaFlattenedKeysResult")
    Optional<XSchemaFlattenedKeys> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XSchemaFlattenedKeysResult", value = {
        @Result(column="table_schema", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="index_name", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="non_unique", property="nonUnique", jdbcType=JdbcType.INTEGER),
        @Result(column="subpart_exists", property="subpartExists", jdbcType=JdbcType.BIGINT),
        @Result(column="index_columns", property="indexColumns", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<XSchemaFlattenedKeys> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XSchemaFlattenedKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XSchemaFlattenedKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    default int insert(XSchemaFlattenedKeys record) {
        return MyBatis3Utils.insert(this::insert, record, XSchemaFlattenedKeys, c ->
            c.map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(indexName).toProperty("indexName")
            .map(nonUnique).toProperty("nonUnique")
            .map(subpartExists).toProperty("subpartExists")
            .map(indexColumns).toProperty("indexColumns")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    default int insertSelective(XSchemaFlattenedKeys record) {
        return MyBatis3Utils.insert(this::insert, record, XSchemaFlattenedKeys, c ->
            c.map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(indexName).toPropertyWhenPresent("indexName", record::getIndexName)
            .map(nonUnique).toPropertyWhenPresent("nonUnique", record::getNonUnique)
            .map(subpartExists).toPropertyWhenPresent("subpartExists", record::getSubpartExists)
            .map(indexColumns).toPropertyWhenPresent("indexColumns", record::getIndexColumns)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    default Optional<XSchemaFlattenedKeys> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XSchemaFlattenedKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    default List<XSchemaFlattenedKeys> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XSchemaFlattenedKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    default List<XSchemaFlattenedKeys> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XSchemaFlattenedKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XSchemaFlattenedKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    static UpdateDSL<UpdateModel> updateAllColumns(XSchemaFlattenedKeys record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(indexName).equalTo(record::getIndexName)
                .set(nonUnique).equalTo(record::getNonUnique)
                .set(subpartExists).equalTo(record::getSubpartExists)
                .set(indexColumns).equalTo(record::getIndexColumns);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source Table: x$schema_flattened_keys")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XSchemaFlattenedKeys record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(indexName).equalToWhenPresent(record::getIndexName)
                .set(nonUnique).equalToWhenPresent(record::getNonUnique)
                .set(subpartExists).equalToWhenPresent(record::getSubpartExists)
                .set(indexColumns).equalToWhenPresent(record::getIndexColumns);
    }
}