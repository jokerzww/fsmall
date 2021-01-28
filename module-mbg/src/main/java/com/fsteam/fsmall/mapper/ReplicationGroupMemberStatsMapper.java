package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ReplicationGroupMemberStatsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.ReplicationGroupMemberStats;
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
public interface ReplicationGroupMemberStatsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, viewId, memberId, countTransactionsInQueue, countTransactionsChecked, countConflictsDetected, countTransactionsRowsValidating, countTransactionsRemoteInApplierQueue, countTransactionsRemoteApplied, countTransactionsLocalProposed, countTransactionsLocalRollback, transactionsCommittedAllMembers, lastConflictFreeTransaction);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReplicationGroupMemberStats> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReplicationGroupMemberStatsResult")
    Optional<ReplicationGroupMemberStats> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReplicationGroupMemberStatsResult", value = {
        @Result(column="CHANNEL_NAME", property="channelName", jdbcType=JdbcType.CHAR),
        @Result(column="VIEW_ID", property="viewId", jdbcType=JdbcType.CHAR),
        @Result(column="MEMBER_ID", property="memberId", jdbcType=JdbcType.CHAR),
        @Result(column="COUNT_TRANSACTIONS_IN_QUEUE", property="countTransactionsInQueue", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_TRANSACTIONS_CHECKED", property="countTransactionsChecked", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_CONFLICTS_DETECTED", property="countConflictsDetected", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_TRANSACTIONS_ROWS_VALIDATING", property="countTransactionsRowsValidating", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE", property="countTransactionsRemoteInApplierQueue", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_TRANSACTIONS_REMOTE_APPLIED", property="countTransactionsRemoteApplied", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_TRANSACTIONS_LOCAL_PROPOSED", property="countTransactionsLocalProposed", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_TRANSACTIONS_LOCAL_ROLLBACK", property="countTransactionsLocalRollback", jdbcType=JdbcType.BIGINT),
        @Result(column="TRANSACTIONS_COMMITTED_ALL_MEMBERS", property="transactionsCommittedAllMembers", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="LAST_CONFLICT_FREE_TRANSACTION", property="lastConflictFreeTransaction", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ReplicationGroupMemberStats> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, replicationGroupMemberStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, replicationGroupMemberStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    default int insert(ReplicationGroupMemberStats record) {
        return MyBatis3Utils.insert(this::insert, record, replicationGroupMemberStats, c ->
            c.map(channelName).toProperty("channelName")
            .map(viewId).toProperty("viewId")
            .map(memberId).toProperty("memberId")
            .map(countTransactionsInQueue).toProperty("countTransactionsInQueue")
            .map(countTransactionsChecked).toProperty("countTransactionsChecked")
            .map(countConflictsDetected).toProperty("countConflictsDetected")
            .map(countTransactionsRowsValidating).toProperty("countTransactionsRowsValidating")
            .map(countTransactionsRemoteInApplierQueue).toProperty("countTransactionsRemoteInApplierQueue")
            .map(countTransactionsRemoteApplied).toProperty("countTransactionsRemoteApplied")
            .map(countTransactionsLocalProposed).toProperty("countTransactionsLocalProposed")
            .map(countTransactionsLocalRollback).toProperty("countTransactionsLocalRollback")
            .map(transactionsCommittedAllMembers).toProperty("transactionsCommittedAllMembers")
            .map(lastConflictFreeTransaction).toProperty("lastConflictFreeTransaction")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    default int insertSelective(ReplicationGroupMemberStats record) {
        return MyBatis3Utils.insert(this::insert, record, replicationGroupMemberStats, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(viewId).toPropertyWhenPresent("viewId", record::getViewId)
            .map(memberId).toPropertyWhenPresent("memberId", record::getMemberId)
            .map(countTransactionsInQueue).toPropertyWhenPresent("countTransactionsInQueue", record::getCountTransactionsInQueue)
            .map(countTransactionsChecked).toPropertyWhenPresent("countTransactionsChecked", record::getCountTransactionsChecked)
            .map(countConflictsDetected).toPropertyWhenPresent("countConflictsDetected", record::getCountConflictsDetected)
            .map(countTransactionsRowsValidating).toPropertyWhenPresent("countTransactionsRowsValidating", record::getCountTransactionsRowsValidating)
            .map(countTransactionsRemoteInApplierQueue).toPropertyWhenPresent("countTransactionsRemoteInApplierQueue", record::getCountTransactionsRemoteInApplierQueue)
            .map(countTransactionsRemoteApplied).toPropertyWhenPresent("countTransactionsRemoteApplied", record::getCountTransactionsRemoteApplied)
            .map(countTransactionsLocalProposed).toPropertyWhenPresent("countTransactionsLocalProposed", record::getCountTransactionsLocalProposed)
            .map(countTransactionsLocalRollback).toPropertyWhenPresent("countTransactionsLocalRollback", record::getCountTransactionsLocalRollback)
            .map(transactionsCommittedAllMembers).toPropertyWhenPresent("transactionsCommittedAllMembers", record::getTransactionsCommittedAllMembers)
            .map(lastConflictFreeTransaction).toPropertyWhenPresent("lastConflictFreeTransaction", record::getLastConflictFreeTransaction)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    default Optional<ReplicationGroupMemberStats> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, replicationGroupMemberStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    default List<ReplicationGroupMemberStats> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, replicationGroupMemberStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    default List<ReplicationGroupMemberStats> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, replicationGroupMemberStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, replicationGroupMemberStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    static UpdateDSL<UpdateModel> updateAllColumns(ReplicationGroupMemberStats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(viewId).equalTo(record::getViewId)
                .set(memberId).equalTo(record::getMemberId)
                .set(countTransactionsInQueue).equalTo(record::getCountTransactionsInQueue)
                .set(countTransactionsChecked).equalTo(record::getCountTransactionsChecked)
                .set(countConflictsDetected).equalTo(record::getCountConflictsDetected)
                .set(countTransactionsRowsValidating).equalTo(record::getCountTransactionsRowsValidating)
                .set(countTransactionsRemoteInApplierQueue).equalTo(record::getCountTransactionsRemoteInApplierQueue)
                .set(countTransactionsRemoteApplied).equalTo(record::getCountTransactionsRemoteApplied)
                .set(countTransactionsLocalProposed).equalTo(record::getCountTransactionsLocalProposed)
                .set(countTransactionsLocalRollback).equalTo(record::getCountTransactionsLocalRollback)
                .set(transactionsCommittedAllMembers).equalTo(record::getTransactionsCommittedAllMembers)
                .set(lastConflictFreeTransaction).equalTo(record::getLastConflictFreeTransaction);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source Table: replication_group_member_stats")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReplicationGroupMemberStats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(viewId).equalToWhenPresent(record::getViewId)
                .set(memberId).equalToWhenPresent(record::getMemberId)
                .set(countTransactionsInQueue).equalToWhenPresent(record::getCountTransactionsInQueue)
                .set(countTransactionsChecked).equalToWhenPresent(record::getCountTransactionsChecked)
                .set(countConflictsDetected).equalToWhenPresent(record::getCountConflictsDetected)
                .set(countTransactionsRowsValidating).equalToWhenPresent(record::getCountTransactionsRowsValidating)
                .set(countTransactionsRemoteInApplierQueue).equalToWhenPresent(record::getCountTransactionsRemoteInApplierQueue)
                .set(countTransactionsRemoteApplied).equalToWhenPresent(record::getCountTransactionsRemoteApplied)
                .set(countTransactionsLocalProposed).equalToWhenPresent(record::getCountTransactionsLocalProposed)
                .set(countTransactionsLocalRollback).equalToWhenPresent(record::getCountTransactionsLocalRollback)
                .set(transactionsCommittedAllMembers).equalToWhenPresent(record::getTransactionsCommittedAllMembers)
                .set(lastConflictFreeTransaction).equalToWhenPresent(record::getLastConflictFreeTransaction);
    }
}