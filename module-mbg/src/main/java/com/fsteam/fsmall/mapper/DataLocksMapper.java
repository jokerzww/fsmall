package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.DataLocksDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.DataLocks;
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
public interface DataLocksMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    BasicColumn[] selectList = BasicColumn.columnList(engineLockId, engine, engineTransactionId, threadId, eventId, objectSchema, objectName, partitionName, subpartitionName, indexName, objectInstanceBegin, lockType, lockMode, lockStatus, lockData);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source Table: data_locks")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DataLocks> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DataLocksResult")
    Optional<DataLocks> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DataLocksResult", value = {
        @Result(column="ENGINE_LOCK_ID", property="engineLockId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ENGINE_TRANSACTION_ID", property="engineTransactionId", jdbcType=JdbcType.BIGINT),
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="EVENT_ID", property="eventId", jdbcType=JdbcType.BIGINT),
        @Result(column="OBJECT_SCHEMA", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_NAME", property="partitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_NAME", property="subpartitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEX_NAME", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT),
        @Result(column="LOCK_TYPE", property="lockType", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCK_MODE", property="lockMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCK_STATUS", property="lockStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCK_DATA", property="lockData", jdbcType=JdbcType.VARCHAR)
    })
    List<DataLocks> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default int deleteByPrimaryKey(String engineLockId_, String engine_) {
        return delete(c -> 
            c.where(engineLockId, isEqualTo(engineLockId_))
            .and(engine, isEqualTo(engine_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default int insert(DataLocks record) {
        return MyBatis3Utils.insert(this::insert, record, dataLocks, c ->
            c.map(engineLockId).toProperty("engineLockId")
            .map(engine).toProperty("engine")
            .map(engineTransactionId).toProperty("engineTransactionId")
            .map(threadId).toProperty("threadId")
            .map(eventId).toProperty("eventId")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(partitionName).toProperty("partitionName")
            .map(subpartitionName).toProperty("subpartitionName")
            .map(indexName).toProperty("indexName")
            .map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(lockType).toProperty("lockType")
            .map(lockMode).toProperty("lockMode")
            .map(lockStatus).toProperty("lockStatus")
            .map(lockData).toProperty("lockData")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default int insertSelective(DataLocks record) {
        return MyBatis3Utils.insert(this::insert, record, dataLocks, c ->
            c.map(engineLockId).toPropertyWhenPresent("engineLockId", record::getEngineLockId)
            .map(engine).toPropertyWhenPresent("engine", record::getEngine)
            .map(engineTransactionId).toPropertyWhenPresent("engineTransactionId", record::getEngineTransactionId)
            .map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(eventId).toPropertyWhenPresent("eventId", record::getEventId)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(partitionName).toPropertyWhenPresent("partitionName", record::getPartitionName)
            .map(subpartitionName).toPropertyWhenPresent("subpartitionName", record::getSubpartitionName)
            .map(indexName).toPropertyWhenPresent("indexName", record::getIndexName)
            .map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(lockType).toPropertyWhenPresent("lockType", record::getLockType)
            .map(lockMode).toPropertyWhenPresent("lockMode", record::getLockMode)
            .map(lockStatus).toPropertyWhenPresent("lockStatus", record::getLockStatus)
            .map(lockData).toPropertyWhenPresent("lockData", record::getLockData)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default Optional<DataLocks> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, dataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default List<DataLocks> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, dataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default List<DataLocks> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, dataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default Optional<DataLocks> selectByPrimaryKey(String engineLockId_, String engine_) {
        return selectOne(c ->
            c.where(engineLockId, isEqualTo(engineLockId_))
            .and(engine, isEqualTo(engine_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dataLocks, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    static UpdateDSL<UpdateModel> updateAllColumns(DataLocks record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(engineLockId).equalTo(record::getEngineLockId)
                .set(engine).equalTo(record::getEngine)
                .set(engineTransactionId).equalTo(record::getEngineTransactionId)
                .set(threadId).equalTo(record::getThreadId)
                .set(eventId).equalTo(record::getEventId)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(partitionName).equalTo(record::getPartitionName)
                .set(subpartitionName).equalTo(record::getSubpartitionName)
                .set(indexName).equalTo(record::getIndexName)
                .set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(lockType).equalTo(record::getLockType)
                .set(lockMode).equalTo(record::getLockMode)
                .set(lockStatus).equalTo(record::getLockStatus)
                .set(lockData).equalTo(record::getLockData);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DataLocks record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(engineLockId).equalToWhenPresent(record::getEngineLockId)
                .set(engine).equalToWhenPresent(record::getEngine)
                .set(engineTransactionId).equalToWhenPresent(record::getEngineTransactionId)
                .set(threadId).equalToWhenPresent(record::getThreadId)
                .set(eventId).equalToWhenPresent(record::getEventId)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(partitionName).equalToWhenPresent(record::getPartitionName)
                .set(subpartitionName).equalToWhenPresent(record::getSubpartitionName)
                .set(indexName).equalToWhenPresent(record::getIndexName)
                .set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(lockType).equalToWhenPresent(record::getLockType)
                .set(lockMode).equalToWhenPresent(record::getLockMode)
                .set(lockStatus).equalToWhenPresent(record::getLockStatus)
                .set(lockData).equalToWhenPresent(record::getLockData);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default int updateByPrimaryKey(DataLocks record) {
        return update(c ->
            c.set(engineTransactionId).equalTo(record::getEngineTransactionId)
            .set(threadId).equalTo(record::getThreadId)
            .set(eventId).equalTo(record::getEventId)
            .set(objectSchema).equalTo(record::getObjectSchema)
            .set(objectName).equalTo(record::getObjectName)
            .set(partitionName).equalTo(record::getPartitionName)
            .set(subpartitionName).equalTo(record::getSubpartitionName)
            .set(indexName).equalTo(record::getIndexName)
            .set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
            .set(lockType).equalTo(record::getLockType)
            .set(lockMode).equalTo(record::getLockMode)
            .set(lockStatus).equalTo(record::getLockStatus)
            .set(lockData).equalTo(record::getLockData)
            .where(engineLockId, isEqualTo(record::getEngineLockId))
            .and(engine, isEqualTo(record::getEngine))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: data_locks")
    default int updateByPrimaryKeySelective(DataLocks record) {
        return update(c ->
            c.set(engineTransactionId).equalToWhenPresent(record::getEngineTransactionId)
            .set(threadId).equalToWhenPresent(record::getThreadId)
            .set(eventId).equalToWhenPresent(record::getEventId)
            .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
            .set(objectName).equalToWhenPresent(record::getObjectName)
            .set(partitionName).equalToWhenPresent(record::getPartitionName)
            .set(subpartitionName).equalToWhenPresent(record::getSubpartitionName)
            .set(indexName).equalToWhenPresent(record::getIndexName)
            .set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
            .set(lockType).equalToWhenPresent(record::getLockType)
            .set(lockMode).equalToWhenPresent(record::getLockMode)
            .set(lockStatus).equalToWhenPresent(record::getLockStatus)
            .set(lockData).equalToWhenPresent(record::getLockData)
            .where(engineLockId, isEqualTo(record::getEngineLockId))
            .and(engine, isEqualTo(record::getEngine))
        );
    }
}