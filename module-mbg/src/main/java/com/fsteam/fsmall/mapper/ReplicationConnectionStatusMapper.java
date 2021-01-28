package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ReplicationConnectionStatusDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ReplicationConnectionStatus;
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
public interface ReplicationConnectionStatusMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, groupName, sourceUuid, threadId, serviceState, countReceivedHeartbeats, lastHeartbeatTimestamp, lastErrorNumber, lastErrorMessage, lastErrorTimestamp, lastQueuedTransaction, lastQueuedTransactionOriginalCommitTimestamp, lastQueuedTransactionImmediateCommitTimestamp, lastQueuedTransactionStartQueueTimestamp, lastQueuedTransactionEndQueueTimestamp, queueingTransaction, queueingTransactionOriginalCommitTimestamp, queueingTransactionImmediateCommitTimestamp, queueingTransactionStartQueueTimestamp, receivedTransactionSet);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReplicationConnectionStatus> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReplicationConnectionStatusResult")
    Optional<ReplicationConnectionStatus> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReplicationConnectionStatusResult", value = {
        @Result(column="CHANNEL_NAME", property="channelName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="GROUP_NAME", property="groupName", jdbcType=JdbcType.CHAR),
        @Result(column="SOURCE_UUID", property="sourceUuid", jdbcType=JdbcType.CHAR),
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="SERVICE_STATE", property="serviceState", jdbcType=JdbcType.CHAR),
        @Result(column="COUNT_RECEIVED_HEARTBEATS", property="countReceivedHeartbeats", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_HEARTBEAT_TIMESTAMP", property="lastHeartbeatTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_ERROR_NUMBER", property="lastErrorNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_ERROR_MESSAGE", property="lastErrorMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_ERROR_TIMESTAMP", property="lastErrorTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_QUEUED_TRANSACTION", property="lastQueuedTransaction", jdbcType=JdbcType.CHAR),
        @Result(column="LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", property="lastQueuedTransactionOriginalCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", property="lastQueuedTransactionImmediateCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP", property="lastQueuedTransactionStartQueueTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP", property="lastQueuedTransactionEndQueueTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="QUEUEING_TRANSACTION", property="queueingTransaction", jdbcType=JdbcType.CHAR),
        @Result(column="QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP", property="queueingTransactionOriginalCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP", property="queueingTransactionImmediateCommitTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP", property="queueingTransactionStartQueueTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RECEIVED_TRANSACTION_SET", property="receivedTransactionSet", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ReplicationConnectionStatus> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, replicationConnectionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, replicationConnectionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    default int deleteByPrimaryKey(String channelName_) {
        return delete(c -> 
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    default int insert(ReplicationConnectionStatus record) {
        return MyBatis3Utils.insert(this::insert, record, replicationConnectionStatus, c ->
            c.map(channelName).toProperty("channelName")
            .map(groupName).toProperty("groupName")
            .map(sourceUuid).toProperty("sourceUuid")
            .map(threadId).toProperty("threadId")
            .map(serviceState).toProperty("serviceState")
            .map(countReceivedHeartbeats).toProperty("countReceivedHeartbeats")
            .map(lastHeartbeatTimestamp).toProperty("lastHeartbeatTimestamp")
            .map(lastErrorNumber).toProperty("lastErrorNumber")
            .map(lastErrorMessage).toProperty("lastErrorMessage")
            .map(lastErrorTimestamp).toProperty("lastErrorTimestamp")
            .map(lastQueuedTransaction).toProperty("lastQueuedTransaction")
            .map(lastQueuedTransactionOriginalCommitTimestamp).toProperty("lastQueuedTransactionOriginalCommitTimestamp")
            .map(lastQueuedTransactionImmediateCommitTimestamp).toProperty("lastQueuedTransactionImmediateCommitTimestamp")
            .map(lastQueuedTransactionStartQueueTimestamp).toProperty("lastQueuedTransactionStartQueueTimestamp")
            .map(lastQueuedTransactionEndQueueTimestamp).toProperty("lastQueuedTransactionEndQueueTimestamp")
            .map(queueingTransaction).toProperty("queueingTransaction")
            .map(queueingTransactionOriginalCommitTimestamp).toProperty("queueingTransactionOriginalCommitTimestamp")
            .map(queueingTransactionImmediateCommitTimestamp).toProperty("queueingTransactionImmediateCommitTimestamp")
            .map(queueingTransactionStartQueueTimestamp).toProperty("queueingTransactionStartQueueTimestamp")
            .map(receivedTransactionSet).toProperty("receivedTransactionSet")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    default int insertSelective(ReplicationConnectionStatus record) {
        return MyBatis3Utils.insert(this::insert, record, replicationConnectionStatus, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(groupName).toPropertyWhenPresent("groupName", record::getGroupName)
            .map(sourceUuid).toPropertyWhenPresent("sourceUuid", record::getSourceUuid)
            .map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(serviceState).toPropertyWhenPresent("serviceState", record::getServiceState)
            .map(countReceivedHeartbeats).toPropertyWhenPresent("countReceivedHeartbeats", record::getCountReceivedHeartbeats)
            .map(lastHeartbeatTimestamp).toPropertyWhenPresent("lastHeartbeatTimestamp", record::getLastHeartbeatTimestamp)
            .map(lastErrorNumber).toPropertyWhenPresent("lastErrorNumber", record::getLastErrorNumber)
            .map(lastErrorMessage).toPropertyWhenPresent("lastErrorMessage", record::getLastErrorMessage)
            .map(lastErrorTimestamp).toPropertyWhenPresent("lastErrorTimestamp", record::getLastErrorTimestamp)
            .map(lastQueuedTransaction).toPropertyWhenPresent("lastQueuedTransaction", record::getLastQueuedTransaction)
            .map(lastQueuedTransactionOriginalCommitTimestamp).toPropertyWhenPresent("lastQueuedTransactionOriginalCommitTimestamp", record::getLastQueuedTransactionOriginalCommitTimestamp)
            .map(lastQueuedTransactionImmediateCommitTimestamp).toPropertyWhenPresent("lastQueuedTransactionImmediateCommitTimestamp", record::getLastQueuedTransactionImmediateCommitTimestamp)
            .map(lastQueuedTransactionStartQueueTimestamp).toPropertyWhenPresent("lastQueuedTransactionStartQueueTimestamp", record::getLastQueuedTransactionStartQueueTimestamp)
            .map(lastQueuedTransactionEndQueueTimestamp).toPropertyWhenPresent("lastQueuedTransactionEndQueueTimestamp", record::getLastQueuedTransactionEndQueueTimestamp)
            .map(queueingTransaction).toPropertyWhenPresent("queueingTransaction", record::getQueueingTransaction)
            .map(queueingTransactionOriginalCommitTimestamp).toPropertyWhenPresent("queueingTransactionOriginalCommitTimestamp", record::getQueueingTransactionOriginalCommitTimestamp)
            .map(queueingTransactionImmediateCommitTimestamp).toPropertyWhenPresent("queueingTransactionImmediateCommitTimestamp", record::getQueueingTransactionImmediateCommitTimestamp)
            .map(queueingTransactionStartQueueTimestamp).toPropertyWhenPresent("queueingTransactionStartQueueTimestamp", record::getQueueingTransactionStartQueueTimestamp)
            .map(receivedTransactionSet).toPropertyWhenPresent("receivedTransactionSet", record::getReceivedTransactionSet)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    default Optional<ReplicationConnectionStatus> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, replicationConnectionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    default List<ReplicationConnectionStatus> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, replicationConnectionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    default List<ReplicationConnectionStatus> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, replicationConnectionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    default Optional<ReplicationConnectionStatus> selectByPrimaryKey(String channelName_) {
        return selectOne(c ->
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, replicationConnectionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2439369+08:00", comments="Source Table: replication_connection_status")
    static UpdateDSL<UpdateModel> updateAllColumns(ReplicationConnectionStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(groupName).equalTo(record::getGroupName)
                .set(sourceUuid).equalTo(record::getSourceUuid)
                .set(threadId).equalTo(record::getThreadId)
                .set(serviceState).equalTo(record::getServiceState)
                .set(countReceivedHeartbeats).equalTo(record::getCountReceivedHeartbeats)
                .set(lastHeartbeatTimestamp).equalTo(record::getLastHeartbeatTimestamp)
                .set(lastErrorNumber).equalTo(record::getLastErrorNumber)
                .set(lastErrorMessage).equalTo(record::getLastErrorMessage)
                .set(lastErrorTimestamp).equalTo(record::getLastErrorTimestamp)
                .set(lastQueuedTransaction).equalTo(record::getLastQueuedTransaction)
                .set(lastQueuedTransactionOriginalCommitTimestamp).equalTo(record::getLastQueuedTransactionOriginalCommitTimestamp)
                .set(lastQueuedTransactionImmediateCommitTimestamp).equalTo(record::getLastQueuedTransactionImmediateCommitTimestamp)
                .set(lastQueuedTransactionStartQueueTimestamp).equalTo(record::getLastQueuedTransactionStartQueueTimestamp)
                .set(lastQueuedTransactionEndQueueTimestamp).equalTo(record::getLastQueuedTransactionEndQueueTimestamp)
                .set(queueingTransaction).equalTo(record::getQueueingTransaction)
                .set(queueingTransactionOriginalCommitTimestamp).equalTo(record::getQueueingTransactionOriginalCommitTimestamp)
                .set(queueingTransactionImmediateCommitTimestamp).equalTo(record::getQueueingTransactionImmediateCommitTimestamp)
                .set(queueingTransactionStartQueueTimestamp).equalTo(record::getQueueingTransactionStartQueueTimestamp)
                .set(receivedTransactionSet).equalTo(record::getReceivedTransactionSet);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source Table: replication_connection_status")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReplicationConnectionStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(groupName).equalToWhenPresent(record::getGroupName)
                .set(sourceUuid).equalToWhenPresent(record::getSourceUuid)
                .set(threadId).equalToWhenPresent(record::getThreadId)
                .set(serviceState).equalToWhenPresent(record::getServiceState)
                .set(countReceivedHeartbeats).equalToWhenPresent(record::getCountReceivedHeartbeats)
                .set(lastHeartbeatTimestamp).equalToWhenPresent(record::getLastHeartbeatTimestamp)
                .set(lastErrorNumber).equalToWhenPresent(record::getLastErrorNumber)
                .set(lastErrorMessage).equalToWhenPresent(record::getLastErrorMessage)
                .set(lastErrorTimestamp).equalToWhenPresent(record::getLastErrorTimestamp)
                .set(lastQueuedTransaction).equalToWhenPresent(record::getLastQueuedTransaction)
                .set(lastQueuedTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getLastQueuedTransactionOriginalCommitTimestamp)
                .set(lastQueuedTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getLastQueuedTransactionImmediateCommitTimestamp)
                .set(lastQueuedTransactionStartQueueTimestamp).equalToWhenPresent(record::getLastQueuedTransactionStartQueueTimestamp)
                .set(lastQueuedTransactionEndQueueTimestamp).equalToWhenPresent(record::getLastQueuedTransactionEndQueueTimestamp)
                .set(queueingTransaction).equalToWhenPresent(record::getQueueingTransaction)
                .set(queueingTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getQueueingTransactionOriginalCommitTimestamp)
                .set(queueingTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getQueueingTransactionImmediateCommitTimestamp)
                .set(queueingTransactionStartQueueTimestamp).equalToWhenPresent(record::getQueueingTransactionStartQueueTimestamp)
                .set(receivedTransactionSet).equalToWhenPresent(record::getReceivedTransactionSet);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source Table: replication_connection_status")
    default int updateByPrimaryKey(ReplicationConnectionStatus record) {
        return update(c ->
            c.set(groupName).equalTo(record::getGroupName)
            .set(sourceUuid).equalTo(record::getSourceUuid)
            .set(threadId).equalTo(record::getThreadId)
            .set(serviceState).equalTo(record::getServiceState)
            .set(countReceivedHeartbeats).equalTo(record::getCountReceivedHeartbeats)
            .set(lastHeartbeatTimestamp).equalTo(record::getLastHeartbeatTimestamp)
            .set(lastErrorNumber).equalTo(record::getLastErrorNumber)
            .set(lastErrorMessage).equalTo(record::getLastErrorMessage)
            .set(lastErrorTimestamp).equalTo(record::getLastErrorTimestamp)
            .set(lastQueuedTransaction).equalTo(record::getLastQueuedTransaction)
            .set(lastQueuedTransactionOriginalCommitTimestamp).equalTo(record::getLastQueuedTransactionOriginalCommitTimestamp)
            .set(lastQueuedTransactionImmediateCommitTimestamp).equalTo(record::getLastQueuedTransactionImmediateCommitTimestamp)
            .set(lastQueuedTransactionStartQueueTimestamp).equalTo(record::getLastQueuedTransactionStartQueueTimestamp)
            .set(lastQueuedTransactionEndQueueTimestamp).equalTo(record::getLastQueuedTransactionEndQueueTimestamp)
            .set(queueingTransaction).equalTo(record::getQueueingTransaction)
            .set(queueingTransactionOriginalCommitTimestamp).equalTo(record::getQueueingTransactionOriginalCommitTimestamp)
            .set(queueingTransactionImmediateCommitTimestamp).equalTo(record::getQueueingTransactionImmediateCommitTimestamp)
            .set(queueingTransactionStartQueueTimestamp).equalTo(record::getQueueingTransactionStartQueueTimestamp)
            .set(receivedTransactionSet).equalTo(record::getReceivedTransactionSet)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source Table: replication_connection_status")
    default int updateByPrimaryKeySelective(ReplicationConnectionStatus record) {
        return update(c ->
            c.set(groupName).equalToWhenPresent(record::getGroupName)
            .set(sourceUuid).equalToWhenPresent(record::getSourceUuid)
            .set(threadId).equalToWhenPresent(record::getThreadId)
            .set(serviceState).equalToWhenPresent(record::getServiceState)
            .set(countReceivedHeartbeats).equalToWhenPresent(record::getCountReceivedHeartbeats)
            .set(lastHeartbeatTimestamp).equalToWhenPresent(record::getLastHeartbeatTimestamp)
            .set(lastErrorNumber).equalToWhenPresent(record::getLastErrorNumber)
            .set(lastErrorMessage).equalToWhenPresent(record::getLastErrorMessage)
            .set(lastErrorTimestamp).equalToWhenPresent(record::getLastErrorTimestamp)
            .set(lastQueuedTransaction).equalToWhenPresent(record::getLastQueuedTransaction)
            .set(lastQueuedTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getLastQueuedTransactionOriginalCommitTimestamp)
            .set(lastQueuedTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getLastQueuedTransactionImmediateCommitTimestamp)
            .set(lastQueuedTransactionStartQueueTimestamp).equalToWhenPresent(record::getLastQueuedTransactionStartQueueTimestamp)
            .set(lastQueuedTransactionEndQueueTimestamp).equalToWhenPresent(record::getLastQueuedTransactionEndQueueTimestamp)
            .set(queueingTransaction).equalToWhenPresent(record::getQueueingTransaction)
            .set(queueingTransactionOriginalCommitTimestamp).equalToWhenPresent(record::getQueueingTransactionOriginalCommitTimestamp)
            .set(queueingTransactionImmediateCommitTimestamp).equalToWhenPresent(record::getQueueingTransactionImmediateCommitTimestamp)
            .set(queueingTransactionStartQueueTimestamp).equalToWhenPresent(record::getQueueingTransactionStartQueueTimestamp)
            .set(receivedTransactionSet).equalToWhenPresent(record::getReceivedTransactionSet)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }
}