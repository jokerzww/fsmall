package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.CondInstancesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.CondInstances;
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
public interface CondInstancesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    BasicColumn[] selectList = BasicColumn.columnList(objectInstanceBegin, name);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CondInstances> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CondInstancesResult")
    Optional<CondInstances> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CondInstancesResult", value = {
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<CondInstances> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, condInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, condInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default int deleteByPrimaryKey(Long objectInstanceBegin_) {
        return delete(c -> 
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default int insert(CondInstances record) {
        return MyBatis3Utils.insert(this::insert, record, condInstances, c ->
            c.map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(name).toProperty("name")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default int insertSelective(CondInstances record) {
        return MyBatis3Utils.insert(this::insert, record, condInstances, c ->
            c.map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(name).toPropertyWhenPresent("name", record::getName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default Optional<CondInstances> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, condInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default List<CondInstances> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, condInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default List<CondInstances> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, condInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default Optional<CondInstances> selectByPrimaryKey(Long objectInstanceBegin_) {
        return selectOne(c ->
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, condInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    static UpdateDSL<UpdateModel> updateAllColumns(CondInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(name).equalTo(record::getName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CondInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(name).equalToWhenPresent(record::getName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default int updateByPrimaryKey(CondInstances record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    default int updateByPrimaryKeySelective(CondInstances record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }
}