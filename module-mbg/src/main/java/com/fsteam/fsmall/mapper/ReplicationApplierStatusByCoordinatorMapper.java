package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ReplicationApplierStatusByCoordinatorDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ReplicationApplierStatusByCoordinator;
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
public interface ReplicationApplierStatusByCoordinatorMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, threadId, serviceState, lastErrorNumber, lastErrorMessage, lastErrorTimestamp, lastProcessedTransaction, lastProcessedTransactionOriginalCommitTimestamp, lastProcessedTransactionImmediateCommitTimestamp, lastProcessedTransactionStartBufferTimestamp, lastProcessedTransactionEndBufferTimestamp, processingTransaction, processingTransactionOriginalCommitTimestamp, processingTransactionImmediateCommitTimestamp, processingTransactionStartBufferTimestamp);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReplicationApplierStatusByCoordinator> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5191892+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReplicationApplierStatusByCoordinatorResult")
    Optional<ReplicationApplierStatusByCoordinator> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReplicationApplierStatusByCoordinatorResult", value = {
        @Result(column="CHANNEL_NAME", property="channelName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="SERVICE_STATE", property="serviceState", jdbcType=JdbcType.CHAR),
        @Result(column="LAST_ERROR_NUMBER", property="lastErrorNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_ERROR_MESSAGE", property="lastErrorMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_ERROR_TIMESTAMP", property="lastErrorTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_PROCESSED_TRANSACTION", property="lastProcessedTransaction", jdbcType=JdbcType.CHAR),
        @Result(column="LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", property="lastProcessedTransactionOriginalCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", property="lastProcessedTransactionImmediateCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP", property="lastProcessedTransactionStartBufferTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP", property="lastProcessedTransactionEndBufferTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROCESSING_TRANSACTION", property="processingTransaction", jdbcType=JdbcType.CHAR),
        @Result(column="PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", property="processingTransactionOriginalCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", property="processingTransactionImmediateCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP", property="processingTransactionStartBufferTimestamp", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ReplicationApplierStatusByCoordinator> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, replicationApplierStatusByCoordinator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, replicationApplierStatusByCoordinator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default int deleteByPrimaryKey(String channelName_) {
        return delete(c -> 
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default int insert(ReplicationApplierStatusByCoordinator record) {
        return MyBatis3Utils.insert(this::insert, record, replicationApplierStatusByCoordinator, c ->
            c.map(channelName).toProperty("channelName")
            .map(threadId).toProperty("threadId")
            .map(serviceState).toProperty("serviceState")
            .map(lastErrorNumber).toProperty("lastErrorNumber")
            .map(lastErrorMessage).toProperty("lastErrorMessage")
            .map(lastErrorTimestamp).toProperty("lastErrorTimestamp")
            .map(lastProcessedTransaction).toProperty("lastProcessedTransaction")
            .map(lastProcessedTransactionOriginalCommitTimestamp).toProperty("lastProcessedTransactionOriginalCommitTimestamp")
            .map(lastProcessedTransactionImmediateCommitTimestamp).toProperty("lastProcessedTransactionImmediateCommitTimestamp")
            .map(lastProcessedTransactionStartBufferTimestamp).toProperty("lastProcessedTransactionStartBufferTimestamp")
            .map(lastProcessedTransactionEndBufferTimestamp).toProperty("lastProcessedTransactionEndBufferTimestamp")
            .map(processingTransaction).toProperty("processingTransaction")
            .map(processingTransactionOriginalCommitTimestamp).toProperty("processingTransactionOriginalCommitTimestamp")
            .map(processingTransactionImmediateCommitTimestamp).toProperty("processingTransactionImmediateCommitTimestamp")
            .map(processingTransactionStartBufferTimestamp).toProperty("processingTransactionStartBufferTimestamp")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default int insertSelective(ReplicationApplierStatusByCoordinator record) {
        return MyBatis3Utils.insert(this::insert, record, replicationApplierStatusByCoordinator, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(serviceState).toPropertyWhenPresent("serviceState", record::getServiceState)
            .map(lastErrorNumber).toPropertyWhenPresent("lastErrorNumber", record::getLastErrorNumber)
            .map(lastErrorMessage).toPropertyWhenPresent("lastErrorMessage", record::getLastErrorMessage)
            .map(lastErrorTimestamp).toPropertyWhenPresent("lastErrorTimestamp", record::getLastErrorTimestamp)
            .map(lastProcessedTransaction).toPropertyWhenPresent("lastProcessedTransaction", record::getLastProcessedTransaction)
            .map(lastProcessedTransactionOriginalCommitTimestamp).toPropertyWhenPresent("lastProcessedTransactionOriginalCommitTimestamp", record::getLastProcessedTransactionOriginalCommitTimestamp)
            .map(lastProcessedTransactionImmediateCommitTimestamp).toPropertyWhenPresent("lastProcessedTransactionImmediateCommitTimestamp", record::getLastProcessedTransactionImmediateCommitTimestamp)
            .map(lastProcessedTransactionStartBufferTimestamp).toPropertyWhenPresent("lastProcessedTransactionStartBufferTimestamp", record::getLastProcessedTransactionStartBufferTimestamp)
            .map(lastProcessedTransactionEndBufferTimestamp).toPropertyWhenPresent("lastProcessedTransactionEndBufferTimestamp", record::getLastProcessedTransactionEndBufferTimestamp)
            .map(processingTransaction).toPropertyWhenPresent("processingTransaction", record::getProcessingTransaction)
            .map(processingTransactionOriginalCommitTimestamp).toPropertyWhenPresent("processingTransactionOriginalCommitTimestamp", record::getProcessingTransactionOriginalCommitTimestamp)
            .map(processingTransactionImmediateCommitTimestamp).toPropertyWhenPresent("processingTransactionImmediateCommitTimestamp", record::getProcessingTransactionImmediateCommitTimestamp)
            .map(processingTransactionStartBufferTimestamp).toPropertyWhenPresent("processingTransactionStartBufferTimestamp", record::getProcessingTransactionStartBufferTimestamp)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default Optional<ReplicationApplierStatusByCoordinator> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, replicationApplierStatusByCoordinator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default List<ReplicationApplierStatusByCoordinator> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, replicationApplierStatusByCoordinator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default List<ReplicationApplierStatusByCoordinator> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, replicationApplierStatusByCoordinator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default Optional<ReplicationApplierStatusByCoordinator> selectByPrimaryKey(String channelName_) {
        return selectOne(c ->
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, replicationApplierStatusByCoordinator, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    static UpdateDSL<UpdateModel> updateAllColumns(ReplicationApplierStatusByCoordinator record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(threadId).equalTo(record::getThreadId)
                .set(serviceState).equalTo(record::getServiceState)
                .set(lastErrorNumber).equalTo(record::getLastErrorNumber)
                .set(lastErrorMessage).equalTo(record::getLastErrorMessage)
                .set(lastErrorTimestamp).equalTo(record::getLastErrorTimestamp)
                .set(lastProcessedTransaction).equalTo(record::getLastProcessedTransaction)
                .set(lastProcessedTransactionOriginalCommitTimestamp).equalTo(record::getLastProcessedTransactionOriginalCommitTimestamp)
                .set(lastProcessedTransactionImmediateCommitTimestamp).equalTo(record::getLastProcessedTransactionImmediateCommitTimestamp)
                .set(lastProcessedTransactionStartBufferTimestamp).equalTo(record::getLastProcessedTransactionStartBufferTimestamp)
                .set(lastProcessedTransactionEndBufferTimestamp).equalTo(record::getLastProcessedTransactionEndBufferTimestamp)
                .set(processingTransaction).equalTo(record::getProcessingTransaction)
                .set(processingTransactionOriginalCommitTimestamp).equalTo(record::getProcessingTransactionOriginalCommitTimestamp)
                .set(processingTransactionImmediateCommitTimestamp).equalTo(record::getProcessingTransactionImmediateCommitTimestamp)
                .set(processingTransactionStartBufferTimestamp).equalTo(record::getProcessingTransactionStartBufferTimestamp);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReplicationApplierStatusByCoordinator record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(threadId).equalToWhenPresent(record::getThreadId)
                .set(serviceState).equalToWhenPresent(record::getServiceState)
                .set(lastErrorNumber).equalToWhenPresent(record::getLastErrorNumber)
                .set(lastErrorMessage).equalToWhenPresent(record::getLastErrorMessage)
                .set(lastErrorTimestamp).equalToWhenPresent(record::getLastErrorTimestamp)
                .set(lastProcessedTransaction).equalToWhenPresent(record::getLastProcessedTransaction)
                .set(lastProcessedTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getLastProcessedTransactionOriginalCommitTimestamp)
                .set(lastProcessedTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getLastProcessedTransactionImmediateCommitTimestamp)
                .set(lastProcessedTransactionStartBufferTimestamp).equalToWhenPresent(record::getLastProcessedTransactionStartBufferTimestamp)
                .set(lastProcessedTransactionEndBufferTimestamp).equalToWhenPresent(record::getLastProcessedTransactionEndBufferTimestamp)
                .set(processingTransaction).equalToWhenPresent(record::getProcessingTransaction)
                .set(processingTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getProcessingTransactionOriginalCommitTimestamp)
                .set(processingTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getProcessingTransactionImmediateCommitTimestamp)
                .set(processingTransactionStartBufferTimestamp).equalToWhenPresent(record::getProcessingTransactionStartBufferTimestamp);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default int updateByPrimaryKey(ReplicationApplierStatusByCoordinator record) {
        return update(c ->
            c.set(threadId).equalTo(record::getThreadId)
            .set(serviceState).equalTo(record::getServiceState)
            .set(lastErrorNumber).equalTo(record::getLastErrorNumber)
            .set(lastErrorMessage).equalTo(record::getLastErrorMessage)
            .set(lastErrorTimestamp).equalTo(record::getLastErrorTimestamp)
            .set(lastProcessedTransaction).equalTo(record::getLastProcessedTransaction)
            .set(lastProcessedTransactionOriginalCommitTimestamp).equalTo(record::getLastProcessedTransactionOriginalCommitTimestamp)
            .set(lastProcessedTransactionImmediateCommitTimestamp).equalTo(record::getLastProcessedTransactionImmediateCommitTimestamp)
            .set(lastProcessedTransactionStartBufferTimestamp).equalTo(record::getLastProcessedTransactionStartBufferTimestamp)
            .set(lastProcessedTransactionEndBufferTimestamp).equalTo(record::getLastProcessedTransactionEndBufferTimestamp)
            .set(processingTransaction).equalTo(record::getProcessingTransaction)
            .set(processingTransactionOriginalCommitTimestamp).equalTo(record::getProcessingTransactionOriginalCommitTimestamp)
            .set(processingTransactionImmediateCommitTimestamp).equalTo(record::getProcessingTransactionImmediateCommitTimestamp)
            .set(processingTransactionStartBufferTimestamp).equalTo(record::getProcessingTransactionStartBufferTimestamp)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.520189+08:00", comments="Source Table: replication_applier_status_by_coordinator")
    default int updateByPrimaryKeySelective(ReplicationApplierStatusByCoordinator record) {
        return update(c ->
            c.set(threadId).equalToWhenPresent(record::getThreadId)
            .set(serviceState).equalToWhenPresent(record::getServiceState)
            .set(lastErrorNumber).equalToWhenPresent(record::getLastErrorNumber)
            .set(lastErrorMessage).equalToWhenPresent(record::getLastErrorMessage)
            .set(lastErrorTimestamp).equalToWhenPresent(record::getLastErrorTimestamp)
            .set(lastProcessedTransaction).equalToWhenPresent(record::getLastProcessedTransaction)
            .set(lastProcessedTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getLastProcessedTransactionOriginalCommitTimestamp)
            .set(lastProcessedTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getLastProcessedTransactionImmediateCommitTimestamp)
            .set(lastProcessedTransactionStartBufferTimestamp).equalToWhenPresent(record::getLastProcessedTransactionStartBufferTimestamp)
            .set(lastProcessedTransactionEndBufferTimestamp).equalToWhenPresent(record::getLastProcessedTransactionEndBufferTimestamp)
            .set(processingTransaction).equalToWhenPresent(record::getProcessingTransaction)
            .set(processingTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getProcessingTransactionOriginalCommitTimestamp)
            .set(processingTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getProcessingTransactionImmediateCommitTimestamp)
            .set(processingTransactionStartBufferTimestamp).equalToWhenPresent(record::getProcessingTransactionStartBufferTimestamp)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }
}