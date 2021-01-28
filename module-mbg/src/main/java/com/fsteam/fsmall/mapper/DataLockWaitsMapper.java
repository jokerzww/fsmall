package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.DataLockWaitsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.DataLockWaits;
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
public interface DataLockWaitsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    BasicColumn[] selectList = BasicColumn.columnList(engine, requestingEngineLockId, requestingEngineTransactionId, requestingThreadId, requestingEventId, requestingObjectInstanceBegin, blockingEngineLockId, blockingEngineTransactionId, blockingThreadId, blockingEventId, blockingObjectInstanceBegin);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DataLockWaits> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DataLockWaitsResult")
    Optional<DataLockWaits> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DataLockWaitsResult", value = {
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQUESTING_ENGINE_LOCK_ID", property="requestingEngineLockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQUESTING_ENGINE_TRANSACTION_ID", property="requestingEngineTransactionId", jdbcType=JdbcType.BIGINT),
        @Result(column="REQUESTING_THREAD_ID", property="requestingThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="REQUESTING_EVENT_ID", property="requestingEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="REQUESTING_OBJECT_INSTANCE_BEGIN", property="requestingObjectInstanceBegin", jdbcType=JdbcType.BIGINT),
        @Result(column="BLOCKING_ENGINE_LOCK_ID", property="blockingEngineLockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="BLOCKING_ENGINE_TRANSACTION_ID", property="blockingEngineTransactionId", jdbcType=JdbcType.BIGINT),
        @Result(column="BLOCKING_THREAD_ID", property="blockingThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="BLOCKING_EVENT_ID", property="blockingEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="BLOCKING_OBJECT_INSTANCE_BEGIN", property="blockingObjectInstanceBegin", jdbcType=JdbcType.BIGINT)
    })
    List<DataLockWaits> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dataLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dataLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    default int insert(DataLockWaits record) {
        return MyBatis3Utils.insert(this::insert, record, dataLockWaits, c ->
            c.map(engine).toProperty("engine")
            .map(requestingEngineLockId).toProperty("requestingEngineLockId")
            .map(requestingEngineTransactionId).toProperty("requestingEngineTransactionId")
            .map(requestingThreadId).toProperty("requestingThreadId")
            .map(requestingEventId).toProperty("requestingEventId")
            .map(requestingObjectInstanceBegin).toProperty("requestingObjectInstanceBegin")
            .map(blockingEngineLockId).toProperty("blockingEngineLockId")
            .map(blockingEngineTransactionId).toProperty("blockingEngineTransactionId")
            .map(blockingThreadId).toProperty("blockingThreadId")
            .map(blockingEventId).toProperty("blockingEventId")
            .map(blockingObjectInstanceBegin).toProperty("blockingObjectInstanceBegin")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    default int insertSelective(DataLockWaits record) {
        return MyBatis3Utils.insert(this::insert, record, dataLockWaits, c ->
            c.map(engine).toPropertyWhenPresent("engine", record::getEngine)
            .map(requestingEngineLockId).toPropertyWhenPresent("requestingEngineLockId", record::getRequestingEngineLockId)
            .map(requestingEngineTransactionId).toPropertyWhenPresent("requestingEngineTransactionId", record::getRequestingEngineTransactionId)
            .map(requestingThreadId).toPropertyWhenPresent("requestingThreadId", record::getRequestingThreadId)
            .map(requestingEventId).toPropertyWhenPresent("requestingEventId", record::getRequestingEventId)
            .map(requestingObjectInstanceBegin).toPropertyWhenPresent("requestingObjectInstanceBegin", record::getRequestingObjectInstanceBegin)
            .map(blockingEngineLockId).toPropertyWhenPresent("blockingEngineLockId", record::getBlockingEngineLockId)
            .map(blockingEngineTransactionId).toPropertyWhenPresent("blockingEngineTransactionId", record::getBlockingEngineTransactionId)
            .map(blockingThreadId).toPropertyWhenPresent("blockingThreadId", record::getBlockingThreadId)
            .map(blockingEventId).toPropertyWhenPresent("blockingEventId", record::getBlockingEventId)
            .map(blockingObjectInstanceBegin).toPropertyWhenPresent("blockingObjectInstanceBegin", record::getBlockingObjectInstanceBegin)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    default Optional<DataLockWaits> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, dataLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    default List<DataLockWaits> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, dataLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    default List<DataLockWaits> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, dataLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dataLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    static UpdateDSL<UpdateModel> updateAllColumns(DataLockWaits record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(engine).equalTo(record::getEngine)
                .set(requestingEngineLockId).equalTo(record::getRequestingEngineLockId)
                .set(requestingEngineTransactionId).equalTo(record::getRequestingEngineTransactionId)
                .set(requestingThreadId).equalTo(record::getRequestingThreadId)
                .set(requestingEventId).equalTo(record::getRequestingEventId)
                .set(requestingObjectInstanceBegin).equalTo(record::getRequestingObjectInstanceBegin)
                .set(blockingEngineLockId).equalTo(record::getBlockingEngineLockId)
                .set(blockingEngineTransactionId).equalTo(record::getBlockingEngineTransactionId)
                .set(blockingThreadId).equalTo(record::getBlockingThreadId)
                .set(blockingEventId).equalTo(record::getBlockingEventId)
                .set(blockingObjectInstanceBegin).equalTo(record::getBlockingObjectInstanceBegin);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source Table: data_lock_waits")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DataLockWaits record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(engine).equalToWhenPresent(record::getEngine)
                .set(requestingEngineLockId).equalToWhenPresent(record::getRequestingEngineLockId)
                .set(requestingEngineTransactionId).equalToWhenPresent(record::getRequestingEngineTransactionId)
                .set(requestingThreadId).equalToWhenPresent(record::getRequestingThreadId)
                .set(requestingEventId).equalToWhenPresent(record::getRequestingEventId)
                .set(requestingObjectInstanceBegin).equalToWhenPresent(record::getRequestingObjectInstanceBegin)
                .set(blockingEngineLockId).equalToWhenPresent(record::getBlockingEngineLockId)
                .set(blockingEngineTransactionId).equalToWhenPresent(record::getBlockingEngineTransactionId)
                .set(blockingThreadId).equalToWhenPresent(record::getBlockingThreadId)
                .set(blockingEventId).equalToWhenPresent(record::getBlockingEventId)
                .set(blockingObjectInstanceBegin).equalToWhenPresent(record::getBlockingObjectInstanceBegin);
    }
}