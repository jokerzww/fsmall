package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SchemaObjectOverviewDynamicSqlSupport.*;

import com.fsteam.fsmall.model.SchemaObjectOverview;
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
public interface SchemaObjectOverviewMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    BasicColumn[] selectList = BasicColumn.columnList(db, objectType, count);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SchemaObjectOverview> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SchemaObjectOverviewResult")
    Optional<SchemaObjectOverview> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SchemaObjectOverviewResult", value = {
        @Result(column="db", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="object_type", property="objectType", jdbcType=JdbcType.VARCHAR),
        @Result(column="count", property="count", jdbcType=JdbcType.BIGINT)
    })
    List<SchemaObjectOverview> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, schemaObjectOverview, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, schemaObjectOverview, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    default int insert(SchemaObjectOverview record) {
        return MyBatis3Utils.insert(this::insert, record, schemaObjectOverview, c ->
            c.map(db).toProperty("db")
            .map(objectType).toProperty("objectType")
            .map(count).toProperty("count")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    default int insertSelective(SchemaObjectOverview record) {
        return MyBatis3Utils.insert(this::insert, record, schemaObjectOverview, c ->
            c.map(db).toPropertyWhenPresent("db", record::getDb)
            .map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
            .map(count).toPropertyWhenPresent("count", record::getCount)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    default Optional<SchemaObjectOverview> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, schemaObjectOverview, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    default List<SchemaObjectOverview> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, schemaObjectOverview, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    default List<SchemaObjectOverview> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, schemaObjectOverview, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, schemaObjectOverview, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    static UpdateDSL<UpdateModel> updateAllColumns(SchemaObjectOverview record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalTo(record::getDb)
                .set(objectType).equalTo(record::getObjectType)
                .set(count).equalTo(record::getCount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SchemaObjectOverview record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalToWhenPresent(record::getDb)
                .set(objectType).equalToWhenPresent(record::getObjectType)
                .set(count).equalToWhenPresent(record::getCount);
    }
}