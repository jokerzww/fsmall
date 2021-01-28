package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.RwlockInstancesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.RwlockInstances;
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
public interface RwlockInstancesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    BasicColumn[] selectList = BasicColumn.columnList(objectInstanceBegin, name, writeLockedByThreadId, readLockedByCount);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RwlockInstances> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RwlockInstancesResult")
    Optional<RwlockInstances> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RwlockInstancesResult", value = {
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="WRITE_LOCKED_BY_THREAD_ID", property="writeLockedByThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="READ_LOCKED_BY_COUNT", property="readLockedByCount", jdbcType=JdbcType.INTEGER)
    })
    List<RwlockInstances> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, rwlockInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, rwlockInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default int deleteByPrimaryKey(Long objectInstanceBegin_) {
        return delete(c -> 
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default int insert(RwlockInstances record) {
        return MyBatis3Utils.insert(this::insert, record, rwlockInstances, c ->
            c.map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(name).toProperty("name")
            .map(writeLockedByThreadId).toProperty("writeLockedByThreadId")
            .map(readLockedByCount).toProperty("readLockedByCount")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default int insertSelective(RwlockInstances record) {
        return MyBatis3Utils.insert(this::insert, record, rwlockInstances, c ->
            c.map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(writeLockedByThreadId).toPropertyWhenPresent("writeLockedByThreadId", record::getWriteLockedByThreadId)
            .map(readLockedByCount).toPropertyWhenPresent("readLockedByCount", record::getReadLockedByCount)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default Optional<RwlockInstances> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, rwlockInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default List<RwlockInstances> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, rwlockInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default List<RwlockInstances> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, rwlockInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default Optional<RwlockInstances> selectByPrimaryKey(Long objectInstanceBegin_) {
        return selectOne(c ->
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, rwlockInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    static UpdateDSL<UpdateModel> updateAllColumns(RwlockInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(name).equalTo(record::getName)
                .set(writeLockedByThreadId).equalTo(record::getWriteLockedByThreadId)
                .set(readLockedByCount).equalTo(record::getReadLockedByCount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RwlockInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(name).equalToWhenPresent(record::getName)
                .set(writeLockedByThreadId).equalToWhenPresent(record::getWriteLockedByThreadId)
                .set(readLockedByCount).equalToWhenPresent(record::getReadLockedByCount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default int updateByPrimaryKey(RwlockInstances record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(writeLockedByThreadId).equalTo(record::getWriteLockedByThreadId)
            .set(readLockedByCount).equalTo(record::getReadLockedByCount)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: rwlock_instances")
    default int updateByPrimaryKeySelective(RwlockInstances record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(writeLockedByThreadId).equalToWhenPresent(record::getWriteLockedByThreadId)
            .set(readLockedByCount).equalToWhenPresent(record::getReadLockedByCount)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }
}