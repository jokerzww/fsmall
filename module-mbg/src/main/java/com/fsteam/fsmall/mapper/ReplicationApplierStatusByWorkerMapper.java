package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ReplicationApplierStatusByWorkerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ReplicationApplierStatusByWorker;
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
public interface ReplicationApplierStatusByWorkerMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, workerId, threadId, serviceState, lastErrorNumber, lastErrorMessage, lastErrorTimestamp, lastAppliedTransaction, lastAppliedTransactionOriginalCommitTimestamp, lastAppliedTransactionImmediateCommitTimestamp, lastAppliedTransactionStartApplyTimestamp, lastAppliedTransactionEndApplyTimestamp, applyingTransaction, applyingTransactionOriginalCommitTimestamp, applyingTransactionImmediateCommitTimestamp, applyingTransactionStartApplyTimestamp, lastAppliedTransactionRetriesCount, lastAppliedTransactionLastTransientErrorNumber, lastAppliedTransactionLastTransientErrorMessage, lastAppliedTransactionLastTransientErrorTimestamp, applyingTransactionRetriesCount, applyingTransactionLastTransientErrorNumber, applyingTransactionLastTransientErrorMessage, applyingTransactionLastTransientErrorTimestamp);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source Table: replication_applier_status_by_worker")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source Table: replication_applier_status_by_worker")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source Table: replication_applier_status_by_worker")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReplicationApplierStatusByWorker> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source Table: replication_applier_status_by_worker")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReplicationApplierStatusByWorkerResult")
    Optional<ReplicationApplierStatusByWorker> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source Table: replication_applier_status_by_worker")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReplicationApplierStatusByWorkerResult", value = {
        @Result(column="CHANNEL_NAME", property="channelName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="WORKER_ID", property="workerId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="SERVICE_STATE", property="serviceState", jdbcType=JdbcType.CHAR),
        @Result(column="LAST_ERROR_NUMBER", property="lastErrorNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_ERROR_MESSAGE", property="lastErrorMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_ERROR_TIMESTAMP", property="lastErrorTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_APPLIED_TRANSACTION", property="lastAppliedTransaction", jdbcType=JdbcType.CHAR),
        @Result(column="LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", property="lastAppliedTransactionOriginalCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", property="lastAppliedTransactionImmediateCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP", property="lastAppliedTransactionStartApplyTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP", property="lastAppliedTransactionEndApplyTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="APPLYING_TRANSACTION", property="applyingTransaction", jdbcType=JdbcType.CHAR),
        @Result(column="APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", property="applyingTransactionOriginalCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", property="applyingTransactionImmediateCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="APPLYING_TRANSACTION_START_APPLY_TIMESTAMP", property="applyingTransactionStartApplyTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_APPLIED_TRANSACTION_RETRIES_COUNT", property="lastAppliedTransactionRetriesCount", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER", property="lastAppliedTransactionLastTransientErrorNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE", property="lastAppliedTransactionLastTransientErrorMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP", property="lastAppliedTransactionLastTransientErrorTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="APPLYING_TRANSACTION_RETRIES_COUNT", property="applyingTransactionRetriesCount", jdbcType=JdbcType.BIGINT),
        @Result(column="APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER", property="applyingTransactionLastTransientErrorNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE", property="applyingTransactionLastTransientErrorMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP", property="applyingTransactionLastTransientErrorTimestamp", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ReplicationApplierStatusByWorker> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2739641+08:00", comments="Source Table: replication_applier_status_by_worker")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, replicationApplierStatusByWorker, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, replicationApplierStatusByWorker, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default int deleteByPrimaryKey(String channelName_, Long workerId_) {
        return delete(c -> 
            c.where(channelName, isEqualTo(channelName_))
            .and(workerId, isEqualTo(workerId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default int insert(ReplicationApplierStatusByWorker record) {
        return MyBatis3Utils.insert(this::insert, record, replicationApplierStatusByWorker, c ->
            c.map(channelName).toProperty("channelName")
            .map(workerId).toProperty("workerId")
            .map(threadId).toProperty("threadId")
            .map(serviceState).toProperty("serviceState")
            .map(lastErrorNumber).toProperty("lastErrorNumber")
            .map(lastErrorMessage).toProperty("lastErrorMessage")
            .map(lastErrorTimestamp).toProperty("lastErrorTimestamp")
            .map(lastAppliedTransaction).toProperty("lastAppliedTransaction")
            .map(lastAppliedTransactionOriginalCommitTimestamp).toProperty("lastAppliedTransactionOriginalCommitTimestamp")
            .map(lastAppliedTransactionImmediateCommitTimestamp).toProperty("lastAppliedTransactionImmediateCommitTimestamp")
            .map(lastAppliedTransactionStartApplyTimestamp).toProperty("lastAppliedTransactionStartApplyTimestamp")
            .map(lastAppliedTransactionEndApplyTimestamp).toProperty("lastAppliedTransactionEndApplyTimestamp")
            .map(applyingTransaction).toProperty("applyingTransaction")
            .map(applyingTransactionOriginalCommitTimestamp).toProperty("applyingTransactionOriginalCommitTimestamp")
            .map(applyingTransactionImmediateCommitTimestamp).toProperty("applyingTransactionImmediateCommitTimestamp")
            .map(applyingTransactionStartApplyTimestamp).toProperty("applyingTransactionStartApplyTimestamp")
            .map(lastAppliedTransactionRetriesCount).toProperty("lastAppliedTransactionRetriesCount")
            .map(lastAppliedTransactionLastTransientErrorNumber).toProperty("lastAppliedTransactionLastTransientErrorNumber")
            .map(lastAppliedTransactionLastTransientErrorMessage).toProperty("lastAppliedTransactionLastTransientErrorMessage")
            .map(lastAppliedTransactionLastTransientErrorTimestamp).toProperty("lastAppliedTransactionLastTransientErrorTimestamp")
            .map(applyingTransactionRetriesCount).toProperty("applyingTransactionRetriesCount")
            .map(applyingTransactionLastTransientErrorNumber).toProperty("applyingTransactionLastTransientErrorNumber")
            .map(applyingTransactionLastTransientErrorMessage).toProperty("applyingTransactionLastTransientErrorMessage")
            .map(applyingTransactionLastTransientErrorTimestamp).toProperty("applyingTransactionLastTransientErrorTimestamp")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default int insertSelective(ReplicationApplierStatusByWorker record) {
        return MyBatis3Utils.insert(this::insert, record, replicationApplierStatusByWorker, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(workerId).toPropertyWhenPresent("workerId", record::getWorkerId)
            .map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(serviceState).toPropertyWhenPresent("serviceState", record::getServiceState)
            .map(lastErrorNumber).toPropertyWhenPresent("lastErrorNumber", record::getLastErrorNumber)
            .map(lastErrorMessage).toPropertyWhenPresent("lastErrorMessage", record::getLastErrorMessage)
            .map(lastErrorTimestamp).toPropertyWhenPresent("lastErrorTimestamp", record::getLastErrorTimestamp)
            .map(lastAppliedTransaction).toPropertyWhenPresent("lastAppliedTransaction", record::getLastAppliedTransaction)
            .map(lastAppliedTransactionOriginalCommitTimestamp).toPropertyWhenPresent("lastAppliedTransactionOriginalCommitTimestamp", record::getLastAppliedTransactionOriginalCommitTimestamp)
            .map(lastAppliedTransactionImmediateCommitTimestamp).toPropertyWhenPresent("lastAppliedTransactionImmediateCommitTimestamp", record::getLastAppliedTransactionImmediateCommitTimestamp)
            .map(lastAppliedTransactionStartApplyTimestamp).toPropertyWhenPresent("lastAppliedTransactionStartApplyTimestamp", record::getLastAppliedTransactionStartApplyTimestamp)
            .map(lastAppliedTransactionEndApplyTimestamp).toPropertyWhenPresent("lastAppliedTransactionEndApplyTimestamp", record::getLastAppliedTransactionEndApplyTimestamp)
            .map(applyingTransaction).toPropertyWhenPresent("applyingTransaction", record::getApplyingTransaction)
            .map(applyingTransactionOriginalCommitTimestamp).toPropertyWhenPresent("applyingTransactionOriginalCommitTimestamp", record::getApplyingTransactionOriginalCommitTimestamp)
            .map(applyingTransactionImmediateCommitTimestamp).toPropertyWhenPresent("applyingTransactionImmediateCommitTimestamp", record::getApplyingTransactionImmediateCommitTimestamp)
            .map(applyingTransactionStartApplyTimestamp).toPropertyWhenPresent("applyingTransactionStartApplyTimestamp", record::getApplyingTransactionStartApplyTimestamp)
            .map(lastAppliedTransactionRetriesCount).toPropertyWhenPresent("lastAppliedTransactionRetriesCount", record::getLastAppliedTransactionRetriesCount)
            .map(lastAppliedTransactionLastTransientErrorNumber).toPropertyWhenPresent("lastAppliedTransactionLastTransientErrorNumber", record::getLastAppliedTransactionLastTransientErrorNumber)
            .map(lastAppliedTransactionLastTransientErrorMessage).toPropertyWhenPresent("lastAppliedTransactionLastTransientErrorMessage", record::getLastAppliedTransactionLastTransientErrorMessage)
            .map(lastAppliedTransactionLastTransientErrorTimestamp).toPropertyWhenPresent("lastAppliedTransactionLastTransientErrorTimestamp", record::getLastAppliedTransactionLastTransientErrorTimestamp)
            .map(applyingTransactionRetriesCount).toPropertyWhenPresent("applyingTransactionRetriesCount", record::getApplyingTransactionRetriesCount)
            .map(applyingTransactionLastTransientErrorNumber).toPropertyWhenPresent("applyingTransactionLastTransientErrorNumber", record::getApplyingTransactionLastTransientErrorNumber)
            .map(applyingTransactionLastTransientErrorMessage).toPropertyWhenPresent("applyingTransactionLastTransientErrorMessage", record::getApplyingTransactionLastTransientErrorMessage)
            .map(applyingTransactionLastTransientErrorTimestamp).toPropertyWhenPresent("applyingTransactionLastTransientErrorTimestamp", record::getApplyingTransactionLastTransientErrorTimestamp)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default Optional<ReplicationApplierStatusByWorker> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, replicationApplierStatusByWorker, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default List<ReplicationApplierStatusByWorker> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, replicationApplierStatusByWorker, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default List<ReplicationApplierStatusByWorker> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, replicationApplierStatusByWorker, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default Optional<ReplicationApplierStatusByWorker> selectByPrimaryKey(String channelName_, Long workerId_) {
        return selectOne(c ->
            c.where(channelName, isEqualTo(channelName_))
            .and(workerId, isEqualTo(workerId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, replicationApplierStatusByWorker, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    static UpdateDSL<UpdateModel> updateAllColumns(ReplicationApplierStatusByWorker record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(workerId).equalTo(record::getWorkerId)
                .set(threadId).equalTo(record::getThreadId)
                .set(serviceState).equalTo(record::getServiceState)
                .set(lastErrorNumber).equalTo(record::getLastErrorNumber)
                .set(lastErrorMessage).equalTo(record::getLastErrorMessage)
                .set(lastErrorTimestamp).equalTo(record::getLastErrorTimestamp)
                .set(lastAppliedTransaction).equalTo(record::getLastAppliedTransaction)
                .set(lastAppliedTransactionOriginalCommitTimestamp).equalTo(record::getLastAppliedTransactionOriginalCommitTimestamp)
                .set(lastAppliedTransactionImmediateCommitTimestamp).equalTo(record::getLastAppliedTransactionImmediateCommitTimestamp)
                .set(lastAppliedTransactionStartApplyTimestamp).equalTo(record::getLastAppliedTransactionStartApplyTimestamp)
                .set(lastAppliedTransactionEndApplyTimestamp).equalTo(record::getLastAppliedTransactionEndApplyTimestamp)
                .set(applyingTransaction).equalTo(record::getApplyingTransaction)
                .set(applyingTransactionOriginalCommitTimestamp).equalTo(record::getApplyingTransactionOriginalCommitTimestamp)
                .set(applyingTransactionImmediateCommitTimestamp).equalTo(record::getApplyingTransactionImmediateCommitTimestamp)
                .set(applyingTransactionStartApplyTimestamp).equalTo(record::getApplyingTransactionStartApplyTimestamp)
                .set(lastAppliedTransactionRetriesCount).equalTo(record::getLastAppliedTransactionRetriesCount)
                .set(lastAppliedTransactionLastTransientErrorNumber).equalTo(record::getLastAppliedTransactionLastTransientErrorNumber)
                .set(lastAppliedTransactionLastTransientErrorMessage).equalTo(record::getLastAppliedTransactionLastTransientErrorMessage)
                .set(lastAppliedTransactionLastTransientErrorTimestamp).equalTo(record::getLastAppliedTransactionLastTransientErrorTimestamp)
                .set(applyingTransactionRetriesCount).equalTo(record::getApplyingTransactionRetriesCount)
                .set(applyingTransactionLastTransientErrorNumber).equalTo(record::getApplyingTransactionLastTransientErrorNumber)
                .set(applyingTransactionLastTransientErrorMessage).equalTo(record::getApplyingTransactionLastTransientErrorMessage)
                .set(applyingTransactionLastTransientErrorTimestamp).equalTo(record::getApplyingTransactionLastTransientErrorTimestamp);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReplicationApplierStatusByWorker record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(workerId).equalToWhenPresent(record::getWorkerId)
                .set(threadId).equalToWhenPresent(record::getThreadId)
                .set(serviceState).equalToWhenPresent(record::getServiceState)
                .set(lastErrorNumber).equalToWhenPresent(record::getLastErrorNumber)
                .set(lastErrorMessage).equalToWhenPresent(record::getLastErrorMessage)
                .set(lastErrorTimestamp).equalToWhenPresent(record::getLastErrorTimestamp)
                .set(lastAppliedTransaction).equalToWhenPresent(record::getLastAppliedTransaction)
                .set(lastAppliedTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getLastAppliedTransactionOriginalCommitTimestamp)
                .set(lastAppliedTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getLastAppliedTransactionImmediateCommitTimestamp)
                .set(lastAppliedTransactionStartApplyTimestamp).equalToWhenPresent(record::getLastAppliedTransactionStartApplyTimestamp)
                .set(lastAppliedTransactionEndApplyTimestamp).equalToWhenPresent(record::getLastAppliedTransactionEndApplyTimestamp)
                .set(applyingTransaction).equalToWhenPresent(record::getApplyingTransaction)
                .set(applyingTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getApplyingTransactionOriginalCommitTimestamp)
                .set(applyingTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getApplyingTransactionImmediateCommitTimestamp)
                .set(applyingTransactionStartApplyTimestamp).equalToWhenPresent(record::getApplyingTransactionStartApplyTimestamp)
                .set(lastAppliedTransactionRetriesCount).equalToWhenPresent(record::getLastAppliedTransactionRetriesCount)
                .set(lastAppliedTransactionLastTransientErrorNumber).equalToWhenPresent(record::getLastAppliedTransactionLastTransientErrorNumber)
                .set(lastAppliedTransactionLastTransientErrorMessage).equalToWhenPresent(record::getLastAppliedTransactionLastTransientErrorMessage)
                .set(lastAppliedTransactionLastTransientErrorTimestamp).equalToWhenPresent(record::getLastAppliedTransactionLastTransientErrorTimestamp)
                .set(applyingTransactionRetriesCount).equalToWhenPresent(record::getApplyingTransactionRetriesCount)
                .set(applyingTransactionLastTransientErrorNumber).equalToWhenPresent(record::getApplyingTransactionLastTransientErrorNumber)
                .set(applyingTransactionLastTransientErrorMessage).equalToWhenPresent(record::getApplyingTransactionLastTransientErrorMessage)
                .set(applyingTransactionLastTransientErrorTimestamp).equalToWhenPresent(record::getApplyingTransactionLastTransientErrorTimestamp);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default int updateByPrimaryKey(ReplicationApplierStatusByWorker record) {
        return update(c ->
            c.set(threadId).equalTo(record::getThreadId)
            .set(serviceState).equalTo(record::getServiceState)
            .set(lastErrorNumber).equalTo(record::getLastErrorNumber)
            .set(lastErrorMessage).equalTo(record::getLastErrorMessage)
            .set(lastErrorTimestamp).equalTo(record::getLastErrorTimestamp)
            .set(lastAppliedTransaction).equalTo(record::getLastAppliedTransaction)
            .set(lastAppliedTransactionOriginalCommitTimestamp).equalTo(record::getLastAppliedTransactionOriginalCommitTimestamp)
            .set(lastAppliedTransactionImmediateCommitTimestamp).equalTo(record::getLastAppliedTransactionImmediateCommitTimestamp)
            .set(lastAppliedTransactionStartApplyTimestamp).equalTo(record::getLastAppliedTransactionStartApplyTimestamp)
            .set(lastAppliedTransactionEndApplyTimestamp).equalTo(record::getLastAppliedTransactionEndApplyTimestamp)
            .set(applyingTransaction).equalTo(record::getApplyingTransaction)
            .set(applyingTransactionOriginalCommitTimestamp).equalTo(record::getApplyingTransactionOriginalCommitTimestamp)
            .set(applyingTransactionImmediateCommitTimestamp).equalTo(record::getApplyingTransactionImmediateCommitTimestamp)
            .set(applyingTransactionStartApplyTimestamp).equalTo(record::getApplyingTransactionStartApplyTimestamp)
            .set(lastAppliedTransactionRetriesCount).equalTo(record::getLastAppliedTransactionRetriesCount)
            .set(lastAppliedTransactionLastTransientErrorNumber).equalTo(record::getLastAppliedTransactionLastTransientErrorNumber)
            .set(lastAppliedTransactionLastTransientErrorMessage).equalTo(record::getLastAppliedTransactionLastTransientErrorMessage)
            .set(lastAppliedTransactionLastTransientErrorTimestamp).equalTo(record::getLastAppliedTransactionLastTransientErrorTimestamp)
            .set(applyingTransactionRetriesCount).equalTo(record::getApplyingTransactionRetriesCount)
            .set(applyingTransactionLastTransientErrorNumber).equalTo(record::getApplyingTransactionLastTransientErrorNumber)
            .set(applyingTransactionLastTransientErrorMessage).equalTo(record::getApplyingTransactionLastTransientErrorMessage)
            .set(applyingTransactionLastTransientErrorTimestamp).equalTo(record::getApplyingTransactionLastTransientErrorTimestamp)
            .where(channelName, isEqualTo(record::getChannelName))
            .and(workerId, isEqualTo(record::getWorkerId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: replication_applier_status_by_worker")
    default int updateByPrimaryKeySelective(ReplicationApplierStatusByWorker record) {
        return update(c ->
            c.set(threadId).equalToWhenPresent(record::getThreadId)
            .set(serviceState).equalToWhenPresent(record::getServiceState)
            .set(lastErrorNumber).equalToWhenPresent(record::getLastErrorNumber)
            .set(lastErrorMessage).equalToWhenPresent(record::getLastErrorMessage)
            .set(lastErrorTimestamp).equalToWhenPresent(record::getLastErrorTimestamp)
            .set(lastAppliedTransaction).equalToWhenPresent(record::getLastAppliedTransaction)
            .set(lastAppliedTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getLastAppliedTransactionOriginalCommitTimestamp)
            .set(lastAppliedTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getLastAppliedTransactionImmediateCommitTimestamp)
            .set(lastAppliedTransactionStartApplyTimestamp).equalToWhenPresent(record::getLastAppliedTransactionStartApplyTimestamp)
            .set(lastAppliedTransactionEndApplyTimestamp).equalToWhenPresent(record::getLastAppliedTransactionEndApplyTimestamp)
            .set(applyingTransaction).equalToWhenPresent(record::getApplyingTransaction)
            .set(applyingTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getApplyingTransactionOriginalCommitTimestamp)
            .set(applyingTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getApplyingTransactionImmediateCommitTimestamp)
            .set(applyingTransactionStartApplyTimestamp).equalToWhenPresent(record::getApplyingTransactionStartApplyTimestamp)
            .set(lastAppliedTransactionRetriesCount).equalToWhenPresent(record::getLastAppliedTransactionRetriesCount)
            .set(lastAppliedTransactionLastTransientErrorNumber).equalToWhenPresent(record::getLastAppliedTransactionLastTransientErrorNumber)
            .set(lastAppliedTransactionLastTransientErrorMessage).equalToWhenPresent(record::getLastAppliedTransactionLastTransientErrorMessage)
            .set(lastAppliedTransactionLastTransientErrorTimestamp).equalToWhenPresent(record::getLastAppliedTransactionLastTransientErrorTimestamp)
            .set(applyingTransactionRetriesCount).equalToWhenPresent(record::getApplyingTransactionRetriesCount)
            .set(applyingTransactionLastTransientErrorNumber).equalToWhenPresent(record::getApplyingTransactionLastTransientErrorNumber)
            .set(applyingTransactionLastTransientErrorMessage).equalToWhenPresent(record::getApplyingTransactionLastTransientErrorMessage)
            .set(applyingTransactionLastTransientErrorTimestamp).equalToWhenPresent(record::getApplyingTransactionLastTransientErrorTimestamp)
            .where(channelName, isEqualTo(record::getChannelName))
            .and(workerId, isEqualTo(record::getWorkerId))
        );
    }
}