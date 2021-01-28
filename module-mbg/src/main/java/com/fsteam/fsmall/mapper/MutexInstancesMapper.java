package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.MutexInstancesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.MutexInstances;
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
public interface MutexInstancesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    BasicColumn[] selectList = BasicColumn.columnList(objectInstanceBegin, name, lockedByThreadId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MutexInstances> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MutexInstancesResult")
    Optional<MutexInstances> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MutexInstancesResult", value = {
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCKED_BY_THREAD_ID", property="lockedByThreadId", jdbcType=JdbcType.BIGINT)
    })
    List<MutexInstances> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mutexInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mutexInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default int deleteByPrimaryKey(Long objectInstanceBegin_) {
        return delete(c -> 
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default int insert(MutexInstances record) {
        return MyBatis3Utils.insert(this::insert, record, mutexInstances, c ->
            c.map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(name).toProperty("name")
            .map(lockedByThreadId).toProperty("lockedByThreadId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default int insertSelective(MutexInstances record) {
        return MyBatis3Utils.insert(this::insert, record, mutexInstances, c ->
            c.map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(lockedByThreadId).toPropertyWhenPresent("lockedByThreadId", record::getLockedByThreadId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default Optional<MutexInstances> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mutexInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default List<MutexInstances> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mutexInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default List<MutexInstances> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mutexInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default Optional<MutexInstances> selectByPrimaryKey(Long objectInstanceBegin_) {
        return selectOne(c ->
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mutexInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    static UpdateDSL<UpdateModel> updateAllColumns(MutexInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(name).equalTo(record::getName)
                .set(lockedByThreadId).equalTo(record::getLockedByThreadId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MutexInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(name).equalToWhenPresent(record::getName)
                .set(lockedByThreadId).equalToWhenPresent(record::getLockedByThreadId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    default int updateByPrimaryKey(MutexInstances record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(lockedByThreadId).equalTo(record::getLockedByThreadId)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1208244+08:00", comments="Source Table: mutex_instances")
    default int updateByPrimaryKeySelective(MutexInstances record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(lockedByThreadId).equalToWhenPresent(record::getLockedByThreadId)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }
}