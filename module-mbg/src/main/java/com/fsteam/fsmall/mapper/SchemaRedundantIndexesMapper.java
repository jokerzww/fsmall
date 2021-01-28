package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SchemaRedundantIndexesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.SchemaRedundantIndexes;
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
public interface SchemaRedundantIndexesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1488509+08:00", comments="Source Table: schema_redundant_indexes")
    BasicColumn[] selectList = BasicColumn.columnList(tableSchema, tableName, redundantIndexName, redundantIndexNonUnique, dominantIndexName, dominantIndexNonUnique, subpartExists, sqlDropIndex, redundantIndexColumns, dominantIndexColumns);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source Table: schema_redundant_indexes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source Table: schema_redundant_indexes")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source Table: schema_redundant_indexes")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SchemaRedundantIndexes> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source Table: schema_redundant_indexes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SchemaRedundantIndexesResult")
    Optional<SchemaRedundantIndexes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source Table: schema_redundant_indexes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SchemaRedundantIndexesResult", value = {
        @Result(column="table_schema", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="redundant_index_name", property="redundantIndexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="redundant_index_non_unique", property="redundantIndexNonUnique", jdbcType=JdbcType.INTEGER),
        @Result(column="dominant_index_name", property="dominantIndexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="dominant_index_non_unique", property="dominantIndexNonUnique", jdbcType=JdbcType.INTEGER),
        @Result(column="subpart_exists", property="subpartExists", jdbcType=JdbcType.INTEGER),
        @Result(column="sql_drop_index", property="sqlDropIndex", jdbcType=JdbcType.VARCHAR),
        @Result(column="redundant_index_columns", property="redundantIndexColumns", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="dominant_index_columns", property="dominantIndexColumns", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SchemaRedundantIndexes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source Table: schema_redundant_indexes")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source Table: schema_redundant_indexes")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, schemaRedundantIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source Table: schema_redundant_indexes")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, schemaRedundantIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source Table: schema_redundant_indexes")
    default int insert(SchemaRedundantIndexes record) {
        return MyBatis3Utils.insert(this::insert, record, schemaRedundantIndexes, c ->
            c.map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(redundantIndexName).toProperty("redundantIndexName")
            .map(redundantIndexNonUnique).toProperty("redundantIndexNonUnique")
            .map(dominantIndexName).toProperty("dominantIndexName")
            .map(dominantIndexNonUnique).toProperty("dominantIndexNonUnique")
            .map(subpartExists).toProperty("subpartExists")
            .map(sqlDropIndex).toProperty("sqlDropIndex")
            .map(redundantIndexColumns).toProperty("redundantIndexColumns")
            .map(dominantIndexColumns).toProperty("dominantIndexColumns")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1478499+08:00", comments="Source Table: schema_redundant_indexes")
    default int insertSelective(SchemaRedundantIndexes record) {
        return MyBatis3Utils.insert(this::insert, record, schemaRedundantIndexes, c ->
            c.map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(redundantIndexName).toPropertyWhenPresent("redundantIndexName", record::getRedundantIndexName)
            .map(redundantIndexNonUnique).toPropertyWhenPresent("redundantIndexNonUnique", record::getRedundantIndexNonUnique)
            .map(dominantIndexName).toPropertyWhenPresent("dominantIndexName", record::getDominantIndexName)
            .map(dominantIndexNonUnique).toPropertyWhenPresent("dominantIndexNonUnique", record::getDominantIndexNonUnique)
            .map(subpartExists).toPropertyWhenPresent("subpartExists", record::getSubpartExists)
            .map(sqlDropIndex).toPropertyWhenPresent("sqlDropIndex", record::getSqlDropIndex)
            .map(redundantIndexColumns).toPropertyWhenPresent("redundantIndexColumns", record::getRedundantIndexColumns)
            .map(dominantIndexColumns).toPropertyWhenPresent("dominantIndexColumns", record::getDominantIndexColumns)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1488509+08:00", comments="Source Table: schema_redundant_indexes")
    default Optional<SchemaRedundantIndexes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, schemaRedundantIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1488509+08:00", comments="Source Table: schema_redundant_indexes")
    default List<SchemaRedundantIndexes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, schemaRedundantIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1488509+08:00", comments="Source Table: schema_redundant_indexes")
    default List<SchemaRedundantIndexes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, schemaRedundantIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1488509+08:00", comments="Source Table: schema_redundant_indexes")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, schemaRedundantIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1488509+08:00", comments="Source Table: schema_redundant_indexes")
    static UpdateDSL<UpdateModel> updateAllColumns(SchemaRedundantIndexes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(redundantIndexName).equalTo(record::getRedundantIndexName)
                .set(redundantIndexNonUnique).equalTo(record::getRedundantIndexNonUnique)
                .set(dominantIndexName).equalTo(record::getDominantIndexName)
                .set(dominantIndexNonUnique).equalTo(record::getDominantIndexNonUnique)
                .set(subpartExists).equalTo(record::getSubpartExists)
                .set(sqlDropIndex).equalTo(record::getSqlDropIndex)
                .set(redundantIndexColumns).equalTo(record::getRedundantIndexColumns)
                .set(dominantIndexColumns).equalTo(record::getDominantIndexColumns);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1488509+08:00", comments="Source Table: schema_redundant_indexes")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SchemaRedundantIndexes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(redundantIndexName).equalToWhenPresent(record::getRedundantIndexName)
                .set(redundantIndexNonUnique).equalToWhenPresent(record::getRedundantIndexNonUnique)
                .set(dominantIndexName).equalToWhenPresent(record::getDominantIndexName)
                .set(dominantIndexNonUnique).equalToWhenPresent(record::getDominantIndexNonUnique)
                .set(subpartExists).equalToWhenPresent(record::getSubpartExists)
                .set(sqlDropIndex).equalToWhenPresent(record::getSqlDropIndex)
                .set(redundantIndexColumns).equalToWhenPresent(record::getRedundantIndexColumns)
                .set(dominantIndexColumns).equalToWhenPresent(record::getDominantIndexColumns);
    }
}