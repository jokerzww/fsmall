package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.MetadataLocksDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.MetadataLocks;
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
public interface MetadataLocksMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    BasicColumn[] selectList = BasicColumn.columnList(objectInstanceBegin, objectType, objectSchema, objectName, columnName, lockType, lockDuration, lockStatus, source, ownerThreadId, ownerEventId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MetadataLocks> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MetadataLocksResult")
    Optional<MetadataLocks> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MetadataLocksResult", value = {
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="OBJECT_TYPE", property="objectType", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_SCHEMA", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCK_TYPE", property="lockType", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCK_DURATION", property="lockDuration", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCK_STATUS", property="lockStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="OWNER_THREAD_ID", property="ownerThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="OWNER_EVENT_ID", property="ownerEventId", jdbcType=JdbcType.BIGINT)
    })
    List<MetadataLocks> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, metadataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, metadataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default int deleteByPrimaryKey(Long objectInstanceBegin_) {
        return delete(c -> 
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default int insert(MetadataLocks record) {
        return MyBatis3Utils.insert(this::insert, record, metadataLocks, c ->
            c.map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(objectType).toProperty("objectType")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(columnName).toProperty("columnName")
            .map(lockType).toProperty("lockType")
            .map(lockDuration).toProperty("lockDuration")
            .map(lockStatus).toProperty("lockStatus")
            .map(source).toProperty("source")
            .map(ownerThreadId).toProperty("ownerThreadId")
            .map(ownerEventId).toProperty("ownerEventId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default int insertSelective(MetadataLocks record) {
        return MyBatis3Utils.insert(this::insert, record, metadataLocks, c ->
            c.map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(lockType).toPropertyWhenPresent("lockType", record::getLockType)
            .map(lockDuration).toPropertyWhenPresent("lockDuration", record::getLockDuration)
            .map(lockStatus).toPropertyWhenPresent("lockStatus", record::getLockStatus)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(ownerThreadId).toPropertyWhenPresent("ownerThreadId", record::getOwnerThreadId)
            .map(ownerEventId).toPropertyWhenPresent("ownerEventId", record::getOwnerEventId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default Optional<MetadataLocks> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, metadataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default List<MetadataLocks> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, metadataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default List<MetadataLocks> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, metadataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default Optional<MetadataLocks> selectByPrimaryKey(Long objectInstanceBegin_) {
        return selectOne(c ->
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, metadataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    static UpdateDSL<UpdateModel> updateAllColumns(MetadataLocks record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(objectType).equalTo(record::getObjectType)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(columnName).equalTo(record::getColumnName)
                .set(lockType).equalTo(record::getLockType)
                .set(lockDuration).equalTo(record::getLockDuration)
                .set(lockStatus).equalTo(record::getLockStatus)
                .set(source).equalTo(record::getSource)
                .set(ownerThreadId).equalTo(record::getOwnerThreadId)
                .set(ownerEventId).equalTo(record::getOwnerEventId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MetadataLocks record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(objectType).equalToWhenPresent(record::getObjectType)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(lockType).equalToWhenPresent(record::getLockType)
                .set(lockDuration).equalToWhenPresent(record::getLockDuration)
                .set(lockStatus).equalToWhenPresent(record::getLockStatus)
                .set(source).equalToWhenPresent(record::getSource)
                .set(ownerThreadId).equalToWhenPresent(record::getOwnerThreadId)
                .set(ownerEventId).equalToWhenPresent(record::getOwnerEventId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default int updateByPrimaryKey(MetadataLocks record) {
        return update(c ->
            c.set(objectType).equalTo(record::getObjectType)
            .set(objectSchema).equalTo(record::getObjectSchema)
            .set(objectName).equalTo(record::getObjectName)
            .set(columnName).equalTo(record::getColumnName)
            .set(lockType).equalTo(record::getLockType)
            .set(lockDuration).equalTo(record::getLockDuration)
            .set(lockStatus).equalTo(record::getLockStatus)
            .set(source).equalTo(record::getSource)
            .set(ownerThreadId).equalTo(record::getOwnerThreadId)
            .set(ownerEventId).equalTo(record::getOwnerEventId)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source Table: metadata_locks")
    default int updateByPrimaryKeySelective(MetadataLocks record) {
        return update(c ->
            c.set(objectType).equalToWhenPresent(record::getObjectType)
            .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
            .set(objectName).equalToWhenPresent(record::getObjectName)
            .set(columnName).equalToWhenPresent(record::getColumnName)
            .set(lockType).equalToWhenPresent(record::getLockType)
            .set(lockDuration).equalToWhenPresent(record::getLockDuration)
            .set(lockStatus).equalToWhenPresent(record::getLockStatus)
            .set(source).equalToWhenPresent(record::getSource)
            .set(ownerThreadId).equalToWhenPresent(record::getOwnerThreadId)
            .set(ownerEventId).equalToWhenPresent(record::getOwnerEventId)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }
}