package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.InnodbLockWaitsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.InnodbLockWaits;
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
public interface InnodbLockWaitsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    BasicColumn[] selectList = BasicColumn.columnList(waitStarted, waitAge, waitAgeSecs, lockedTableSchema, lockedTableName, lockedTablePartition, lockedTableSubpartition, lockedIndex, lockedType, waitingTrxId, waitingTrxStarted, waitingTrxAge, waitingTrxRowsLocked, waitingTrxRowsModified, waitingPid, waitingLockId, waitingLockMode, blockingTrxId, blockingPid, blockingLockId, blockingLockMode, blockingTrxStarted, blockingTrxAge, blockingTrxRowsLocked, blockingTrxRowsModified, sqlKillBlockingQuery, sqlKillBlockingConnection, lockedTable, waitingQuery, blockingQuery);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbLockWaits> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbLockWaitsResult")
    Optional<InnodbLockWaits> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbLockWaitsResult", value = {
        @Result(column="wait_started", property="waitStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="wait_age", property="waitAge", jdbcType=JdbcType.TIME),
        @Result(column="wait_age_secs", property="waitAgeSecs", jdbcType=JdbcType.BIGINT),
        @Result(column="locked_table_schema", property="lockedTableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="locked_table_name", property="lockedTableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="locked_table_partition", property="lockedTablePartition", jdbcType=JdbcType.VARCHAR),
        @Result(column="locked_table_subpartition", property="lockedTableSubpartition", jdbcType=JdbcType.VARCHAR),
        @Result(column="locked_index", property="lockedIndex", jdbcType=JdbcType.VARCHAR),
        @Result(column="locked_type", property="lockedType", jdbcType=JdbcType.VARCHAR),
        @Result(column="waiting_trx_id", property="waitingTrxId", jdbcType=JdbcType.BIGINT),
        @Result(column="waiting_trx_started", property="waitingTrxStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="waiting_trx_age", property="waitingTrxAge", jdbcType=JdbcType.TIME),
        @Result(column="waiting_trx_rows_locked", property="waitingTrxRowsLocked", jdbcType=JdbcType.BIGINT),
        @Result(column="waiting_trx_rows_modified", property="waitingTrxRowsModified", jdbcType=JdbcType.BIGINT),
        @Result(column="waiting_pid", property="waitingPid", jdbcType=JdbcType.BIGINT),
        @Result(column="waiting_lock_id", property="waitingLockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="waiting_lock_mode", property="waitingLockMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocking_trx_id", property="blockingTrxId", jdbcType=JdbcType.BIGINT),
        @Result(column="blocking_pid", property="blockingPid", jdbcType=JdbcType.BIGINT),
        @Result(column="blocking_lock_id", property="blockingLockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocking_lock_mode", property="blockingLockMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocking_trx_started", property="blockingTrxStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="blocking_trx_age", property="blockingTrxAge", jdbcType=JdbcType.TIME),
        @Result(column="blocking_trx_rows_locked", property="blockingTrxRowsLocked", jdbcType=JdbcType.BIGINT),
        @Result(column="blocking_trx_rows_modified", property="blockingTrxRowsModified", jdbcType=JdbcType.BIGINT),
        @Result(column="sql_kill_blocking_query", property="sqlKillBlockingQuery", jdbcType=JdbcType.VARCHAR),
        @Result(column="sql_kill_blocking_connection", property="sqlKillBlockingConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="locked_table", property="lockedTable", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="waiting_query", property="waitingQuery", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="blocking_query", property="blockingQuery", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<InnodbLockWaits> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    default int insert(InnodbLockWaits record) {
        return MyBatis3Utils.insert(this::insert, record, innodbLockWaits, c ->
            c.map(waitStarted).toProperty("waitStarted")
            .map(waitAge).toProperty("waitAge")
            .map(waitAgeSecs).toProperty("waitAgeSecs")
            .map(lockedTableSchema).toProperty("lockedTableSchema")
            .map(lockedTableName).toProperty("lockedTableName")
            .map(lockedTablePartition).toProperty("lockedTablePartition")
            .map(lockedTableSubpartition).toProperty("lockedTableSubpartition")
            .map(lockedIndex).toProperty("lockedIndex")
            .map(lockedType).toProperty("lockedType")
            .map(waitingTrxId).toProperty("waitingTrxId")
            .map(waitingTrxStarted).toProperty("waitingTrxStarted")
            .map(waitingTrxAge).toProperty("waitingTrxAge")
            .map(waitingTrxRowsLocked).toProperty("waitingTrxRowsLocked")
            .map(waitingTrxRowsModified).toProperty("waitingTrxRowsModified")
            .map(waitingPid).toProperty("waitingPid")
            .map(waitingLockId).toProperty("waitingLockId")
            .map(waitingLockMode).toProperty("waitingLockMode")
            .map(blockingTrxId).toProperty("blockingTrxId")
            .map(blockingPid).toProperty("blockingPid")
            .map(blockingLockId).toProperty("blockingLockId")
            .map(blockingLockMode).toProperty("blockingLockMode")
            .map(blockingTrxStarted).toProperty("blockingTrxStarted")
            .map(blockingTrxAge).toProperty("blockingTrxAge")
            .map(blockingTrxRowsLocked).toProperty("blockingTrxRowsLocked")
            .map(blockingTrxRowsModified).toProperty("blockingTrxRowsModified")
            .map(sqlKillBlockingQuery).toProperty("sqlKillBlockingQuery")
            .map(sqlKillBlockingConnection).toProperty("sqlKillBlockingConnection")
            .map(lockedTable).toProperty("lockedTable")
            .map(waitingQuery).toProperty("waitingQuery")
            .map(blockingQuery).toProperty("blockingQuery")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    default int insertSelective(InnodbLockWaits record) {
        return MyBatis3Utils.insert(this::insert, record, innodbLockWaits, c ->
            c.map(waitStarted).toPropertyWhenPresent("waitStarted", record::getWaitStarted)
            .map(waitAge).toPropertyWhenPresent("waitAge", record::getWaitAge)
            .map(waitAgeSecs).toPropertyWhenPresent("waitAgeSecs", record::getWaitAgeSecs)
            .map(lockedTableSchema).toPropertyWhenPresent("lockedTableSchema", record::getLockedTableSchema)
            .map(lockedTableName).toPropertyWhenPresent("lockedTableName", record::getLockedTableName)
            .map(lockedTablePartition).toPropertyWhenPresent("lockedTablePartition", record::getLockedTablePartition)
            .map(lockedTableSubpartition).toPropertyWhenPresent("lockedTableSubpartition", record::getLockedTableSubpartition)
            .map(lockedIndex).toPropertyWhenPresent("lockedIndex", record::getLockedIndex)
            .map(lockedType).toPropertyWhenPresent("lockedType", record::getLockedType)
            .map(waitingTrxId).toPropertyWhenPresent("waitingTrxId", record::getWaitingTrxId)
            .map(waitingTrxStarted).toPropertyWhenPresent("waitingTrxStarted", record::getWaitingTrxStarted)
            .map(waitingTrxAge).toPropertyWhenPresent("waitingTrxAge", record::getWaitingTrxAge)
            .map(waitingTrxRowsLocked).toPropertyWhenPresent("waitingTrxRowsLocked", record::getWaitingTrxRowsLocked)
            .map(waitingTrxRowsModified).toPropertyWhenPresent("waitingTrxRowsModified", record::getWaitingTrxRowsModified)
            .map(waitingPid).toPropertyWhenPresent("waitingPid", record::getWaitingPid)
            .map(waitingLockId).toPropertyWhenPresent("waitingLockId", record::getWaitingLockId)
            .map(waitingLockMode).toPropertyWhenPresent("waitingLockMode", record::getWaitingLockMode)
            .map(blockingTrxId).toPropertyWhenPresent("blockingTrxId", record::getBlockingTrxId)
            .map(blockingPid).toPropertyWhenPresent("blockingPid", record::getBlockingPid)
            .map(blockingLockId).toPropertyWhenPresent("blockingLockId", record::getBlockingLockId)
            .map(blockingLockMode).toPropertyWhenPresent("blockingLockMode", record::getBlockingLockMode)
            .map(blockingTrxStarted).toPropertyWhenPresent("blockingTrxStarted", record::getBlockingTrxStarted)
            .map(blockingTrxAge).toPropertyWhenPresent("blockingTrxAge", record::getBlockingTrxAge)
            .map(blockingTrxRowsLocked).toPropertyWhenPresent("blockingTrxRowsLocked", record::getBlockingTrxRowsLocked)
            .map(blockingTrxRowsModified).toPropertyWhenPresent("blockingTrxRowsModified", record::getBlockingTrxRowsModified)
            .map(sqlKillBlockingQuery).toPropertyWhenPresent("sqlKillBlockingQuery", record::getSqlKillBlockingQuery)
            .map(sqlKillBlockingConnection).toPropertyWhenPresent("sqlKillBlockingConnection", record::getSqlKillBlockingConnection)
            .map(lockedTable).toPropertyWhenPresent("lockedTable", record::getLockedTable)
            .map(waitingQuery).toPropertyWhenPresent("waitingQuery", record::getWaitingQuery)
            .map(blockingQuery).toPropertyWhenPresent("blockingQuery", record::getBlockingQuery)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    default Optional<InnodbLockWaits> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    default List<InnodbLockWaits> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    default List<InnodbLockWaits> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2619531+08:00", comments="Source Table: innodb_lock_waits")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbLockWaits record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(waitStarted).equalTo(record::getWaitStarted)
                .set(waitAge).equalTo(record::getWaitAge)
                .set(waitAgeSecs).equalTo(record::getWaitAgeSecs)
                .set(lockedTableSchema).equalTo(record::getLockedTableSchema)
                .set(lockedTableName).equalTo(record::getLockedTableName)
                .set(lockedTablePartition).equalTo(record::getLockedTablePartition)
                .set(lockedTableSubpartition).equalTo(record::getLockedTableSubpartition)
                .set(lockedIndex).equalTo(record::getLockedIndex)
                .set(lockedType).equalTo(record::getLockedType)
                .set(waitingTrxId).equalTo(record::getWaitingTrxId)
                .set(waitingTrxStarted).equalTo(record::getWaitingTrxStarted)
                .set(waitingTrxAge).equalTo(record::getWaitingTrxAge)
                .set(waitingTrxRowsLocked).equalTo(record::getWaitingTrxRowsLocked)
                .set(waitingTrxRowsModified).equalTo(record::getWaitingTrxRowsModified)
                .set(waitingPid).equalTo(record::getWaitingPid)
                .set(waitingLockId).equalTo(record::getWaitingLockId)
                .set(waitingLockMode).equalTo(record::getWaitingLockMode)
                .set(blockingTrxId).equalTo(record::getBlockingTrxId)
                .set(blockingPid).equalTo(record::getBlockingPid)
                .set(blockingLockId).equalTo(record::getBlockingLockId)
                .set(blockingLockMode).equalTo(record::getBlockingLockMode)
                .set(blockingTrxStarted).equalTo(record::getBlockingTrxStarted)
                .set(blockingTrxAge).equalTo(record::getBlockingTrxAge)
                .set(blockingTrxRowsLocked).equalTo(record::getBlockingTrxRowsLocked)
                .set(blockingTrxRowsModified).equalTo(record::getBlockingTrxRowsModified)
                .set(sqlKillBlockingQuery).equalTo(record::getSqlKillBlockingQuery)
                .set(sqlKillBlockingConnection).equalTo(record::getSqlKillBlockingConnection)
                .set(lockedTable).equalTo(record::getLockedTable)
                .set(waitingQuery).equalTo(record::getWaitingQuery)
                .set(blockingQuery).equalTo(record::getBlockingQuery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source Table: innodb_lock_waits")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbLockWaits record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(waitStarted).equalToWhenPresent(record::getWaitStarted)
                .set(waitAge).equalToWhenPresent(record::getWaitAge)
                .set(waitAgeSecs).equalToWhenPresent(record::getWaitAgeSecs)
                .set(lockedTableSchema).equalToWhenPresent(record::getLockedTableSchema)
                .set(lockedTableName).equalToWhenPresent(record::getLockedTableName)
                .set(lockedTablePartition).equalToWhenPresent(record::getLockedTablePartition)
                .set(lockedTableSubpartition).equalToWhenPresent(record::getLockedTableSubpartition)
                .set(lockedIndex).equalToWhenPresent(record::getLockedIndex)
                .set(lockedType).equalToWhenPresent(record::getLockedType)
                .set(waitingTrxId).equalToWhenPresent(record::getWaitingTrxId)
                .set(waitingTrxStarted).equalToWhenPresent(record::getWaitingTrxStarted)
                .set(waitingTrxAge).equalToWhenPresent(record::getWaitingTrxAge)
                .set(waitingTrxRowsLocked).equalToWhenPresent(record::getWaitingTrxRowsLocked)
                .set(waitingTrxRowsModified).equalToWhenPresent(record::getWaitingTrxRowsModified)
                .set(waitingPid).equalToWhenPresent(record::getWaitingPid)
                .set(waitingLockId).equalToWhenPresent(record::getWaitingLockId)
                .set(waitingLockMode).equalToWhenPresent(record::getWaitingLockMode)
                .set(blockingTrxId).equalToWhenPresent(record::getBlockingTrxId)
                .set(blockingPid).equalToWhenPresent(record::getBlockingPid)
                .set(blockingLockId).equalToWhenPresent(record::getBlockingLockId)
                .set(blockingLockMode).equalToWhenPresent(record::getBlockingLockMode)
                .set(blockingTrxStarted).equalToWhenPresent(record::getBlockingTrxStarted)
                .set(blockingTrxAge).equalToWhenPresent(record::getBlockingTrxAge)
                .set(blockingTrxRowsLocked).equalToWhenPresent(record::getBlockingTrxRowsLocked)
                .set(blockingTrxRowsModified).equalToWhenPresent(record::getBlockingTrxRowsModified)
                .set(sqlKillBlockingQuery).equalToWhenPresent(record::getSqlKillBlockingQuery)
                .set(sqlKillBlockingConnection).equalToWhenPresent(record::getSqlKillBlockingConnection)
                .set(lockedTable).equalToWhenPresent(record::getLockedTable)
                .set(waitingQuery).equalToWhenPresent(record::getWaitingQuery)
                .set(blockingQuery).equalToWhenPresent(record::getBlockingQuery);
    }
}