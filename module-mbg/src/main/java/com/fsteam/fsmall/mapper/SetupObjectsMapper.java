package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SetupObjectsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.SetupObjects;
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
public interface SetupObjectsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    BasicColumn[] selectList = BasicColumn.columnList(objectType, objectSchema, objectName, enabled, timed);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SetupObjects> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SetupObjectsResult")
    Optional<SetupObjects> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SetupObjectsResult", value = {
        @Result(column="OBJECT_TYPE", property="objectType", jdbcType=JdbcType.CHAR),
        @Result(column="OBJECT_SCHEMA", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENABLED", property="enabled", jdbcType=JdbcType.CHAR),
        @Result(column="TIMED", property="timed", jdbcType=JdbcType.CHAR)
    })
    List<SetupObjects> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, setupObjects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, setupObjects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    default int insert(SetupObjects record) {
        return MyBatis3Utils.insert(this::insert, record, setupObjects, c ->
            c.map(objectType).toProperty("objectType")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(enabled).toProperty("enabled")
            .map(timed).toProperty("timed")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    default int insertSelective(SetupObjects record) {
        return MyBatis3Utils.insert(this::insert, record, setupObjects, c ->
            c.map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(enabled).toPropertyWhenPresent("enabled", record::getEnabled)
            .map(timed).toPropertyWhenPresent("timed", record::getTimed)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    default Optional<SetupObjects> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, setupObjects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    default List<SetupObjects> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, setupObjects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    default List<SetupObjects> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, setupObjects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, setupObjects, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    static UpdateDSL<UpdateModel> updateAllColumns(SetupObjects record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectType).equalTo(record::getObjectType)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(enabled).equalTo(record::getEnabled)
                .set(timed).equalTo(record::getTimed);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: setup_objects")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SetupObjects record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectType).equalToWhenPresent(record::getObjectType)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(enabled).equalToWhenPresent(record::getEnabled)
                .set(timed).equalToWhenPresent(record::getTimed);
    }
}