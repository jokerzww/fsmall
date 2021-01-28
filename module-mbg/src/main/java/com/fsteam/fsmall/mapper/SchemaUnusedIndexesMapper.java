package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SchemaUnusedIndexesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.SchemaUnusedIndexes;
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
public interface SchemaUnusedIndexesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    BasicColumn[] selectList = BasicColumn.columnList(objectSchema, objectName, indexName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SchemaUnusedIndexes> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SchemaUnusedIndexesResult")
    Optional<SchemaUnusedIndexes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SchemaUnusedIndexesResult", value = {
        @Result(column="object_schema", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="object_name", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="index_name", property="indexName", jdbcType=JdbcType.VARCHAR)
    })
    List<SchemaUnusedIndexes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, schemaUnusedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, schemaUnusedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    default int insert(SchemaUnusedIndexes record) {
        return MyBatis3Utils.insert(this::insert, record, schemaUnusedIndexes, c ->
            c.map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(indexName).toProperty("indexName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    default int insertSelective(SchemaUnusedIndexes record) {
        return MyBatis3Utils.insert(this::insert, record, schemaUnusedIndexes, c ->
            c.map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(indexName).toPropertyWhenPresent("indexName", record::getIndexName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    default Optional<SchemaUnusedIndexes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, schemaUnusedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    default List<SchemaUnusedIndexes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, schemaUnusedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    default List<SchemaUnusedIndexes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, schemaUnusedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, schemaUnusedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    static UpdateDSL<UpdateModel> updateAllColumns(SchemaUnusedIndexes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(indexName).equalTo(record::getIndexName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: schema_unused_indexes")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SchemaUnusedIndexes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(indexName).equalToWhenPresent(record::getIndexName);
    }
}