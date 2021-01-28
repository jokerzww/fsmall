package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XSchemaTableLockWaitsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XSchemaTableLockWaits;
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
public interface XSchemaTableLockWaitsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: x$schema_table_lock_waits")
    BasicColumn[] selectList = BasicColumn.columnList(objectSchema, objectName, waitingThreadId, waitingPid, waitingLockType, waitingLockDuration, waitingQuerySecs, waitingQueryRowsAffected, waitingQueryRowsExamined, blockingThreadId, blockingPid, blockingLockType, blockingLockDuration, sqlKillBlockingQuery, sqlKillBlockingConnection, waitingAccount, waitingQuery, blockingAccount);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source Table: x$schema_table_lock_waits")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source Table: x$schema_table_lock_waits")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source Table: x$schema_table_lock_waits")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XSchemaTableLockWaits> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source Table: x$schema_table_lock_waits")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XSchemaTableLockWaitsResult")
    Optional<XSchemaTableLockWaits> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source Table: x$schema_table_lock_waits")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XSchemaTableLockWaitsResult", value = {
        @Result(column="object_schema", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="object_name", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="waiting_thread_id", property="waitingThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="waiting_pid", property="waitingPid", jdbcType=JdbcType.BIGINT),
        @Result(column="waiting_lock_type", property="waitingLockType", jdbcType=JdbcType.VARCHAR),
        @Result(column="waiting_lock_duration", property="waitingLockDuration", jdbcType=JdbcType.VARCHAR),
        @Result(column="waiting_query_secs", property="waitingQuerySecs", jdbcType=JdbcType.BIGINT),
        @Result(column="waiting_query_rows_affected", property="waitingQueryRowsAffected", jdbcType=JdbcType.BIGINT),
        @Result(column="waiting_query_rows_examined", property="waitingQueryRowsExamined", jdbcType=JdbcType.BIGINT),
        @Result(column="blocking_thread_id", property="blockingThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="blocking_pid", property="blockingPid", jdbcType=JdbcType.BIGINT),
        @Result(column="blocking_lock_type", property="blockingLockType", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocking_lock_duration", property="blockingLockDuration", jdbcType=JdbcType.VARCHAR),
        @Result(column="sql_kill_blocking_query", property="sqlKillBlockingQuery", jdbcType=JdbcType.VARCHAR),
        @Result(column="sql_kill_blocking_connection", property="sqlKillBlockingConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="waiting_account", property="waitingAccount", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="waiting_query", property="waitingQuery", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="blocking_account", property="blockingAccount", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<XSchemaTableLockWaits> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source Table: x$schema_table_lock_waits")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source Table: x$schema_table_lock_waits")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XSchemaTableLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3220079+08:00", comments="Source Table: x$schema_table_lock_waits")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XSchemaTableLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: x$schema_table_lock_waits")
    default int insert(XSchemaTableLockWaits record) {
        return MyBatis3Utils.insert(this::insert, record, XSchemaTableLockWaits, c ->
            c.map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(waitingThreadId).toProperty("waitingThreadId")
            .map(waitingPid).toProperty("waitingPid")
            .map(waitingLockType).toProperty("waitingLockType")
            .map(waitingLockDuration).toProperty("waitingLockDuration")
            .map(waitingQuerySecs).toProperty("waitingQuerySecs")
            .map(waitingQueryRowsAffected).toProperty("waitingQueryRowsAffected")
            .map(waitingQueryRowsExamined).toProperty("waitingQueryRowsExamined")
            .map(blockingThreadId).toProperty("blockingThreadId")
            .map(blockingPid).toProperty("blockingPid")
            .map(blockingLockType).toProperty("blockingLockType")
            .map(blockingLockDuration).toProperty("blockingLockDuration")
            .map(sqlKillBlockingQuery).toProperty("sqlKillBlockingQuery")
            .map(sqlKillBlockingConnection).toProperty("sqlKillBlockingConnection")
            .map(waitingAccount).toProperty("waitingAccount")
            .map(waitingQuery).toProperty("waitingQuery")
            .map(blockingAccount).toProperty("blockingAccount")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: x$schema_table_lock_waits")
    default int insertSelective(XSchemaTableLockWaits record) {
        return MyBatis3Utils.insert(this::insert, record, XSchemaTableLockWaits, c ->
            c.map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(waitingThreadId).toPropertyWhenPresent("waitingThreadId", record::getWaitingThreadId)
            .map(waitingPid).toPropertyWhenPresent("waitingPid", record::getWaitingPid)
            .map(waitingLockType).toPropertyWhenPresent("waitingLockType", record::getWaitingLockType)
            .map(waitingLockDuration).toPropertyWhenPresent("waitingLockDuration", record::getWaitingLockDuration)
            .map(waitingQuerySecs).toPropertyWhenPresent("waitingQuerySecs", record::getWaitingQuerySecs)
            .map(waitingQueryRowsAffected).toPropertyWhenPresent("waitingQueryRowsAffected", record::getWaitingQueryRowsAffected)
            .map(waitingQueryRowsExamined).toPropertyWhenPresent("waitingQueryRowsExamined", record::getWaitingQueryRowsExamined)
            .map(blockingThreadId).toPropertyWhenPresent("blockingThreadId", record::getBlockingThreadId)
            .map(blockingPid).toPropertyWhenPresent("blockingPid", record::getBlockingPid)
            .map(blockingLockType).toPropertyWhenPresent("blockingLockType", record::getBlockingLockType)
            .map(blockingLockDuration).toPropertyWhenPresent("blockingLockDuration", record::getBlockingLockDuration)
            .map(sqlKillBlockingQuery).toPropertyWhenPresent("sqlKillBlockingQuery", record::getSqlKillBlockingQuery)
            .map(sqlKillBlockingConnection).toPropertyWhenPresent("sqlKillBlockingConnection", record::getSqlKillBlockingConnection)
            .map(waitingAccount).toPropertyWhenPresent("waitingAccount", record::getWaitingAccount)
            .map(waitingQuery).toPropertyWhenPresent("waitingQuery", record::getWaitingQuery)
            .map(blockingAccount).toPropertyWhenPresent("blockingAccount", record::getBlockingAccount)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: x$schema_table_lock_waits")
    default Optional<XSchemaTableLockWaits> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XSchemaTableLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: x$schema_table_lock_waits")
    default List<XSchemaTableLockWaits> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XSchemaTableLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: x$schema_table_lock_waits")
    default List<XSchemaTableLockWaits> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XSchemaTableLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: x$schema_table_lock_waits")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XSchemaTableLockWaits, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: x$schema_table_lock_waits")
    static UpdateDSL<UpdateModel> updateAllColumns(XSchemaTableLockWaits record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(waitingThreadId).equalTo(record::getWaitingThreadId)
                .set(waitingPid).equalTo(record::getWaitingPid)
                .set(waitingLockType).equalTo(record::getWaitingLockType)
                .set(waitingLockDuration).equalTo(record::getWaitingLockDuration)
                .set(waitingQuerySecs).equalTo(record::getWaitingQuerySecs)
                .set(waitingQueryRowsAffected).equalTo(record::getWaitingQueryRowsAffected)
                .set(waitingQueryRowsExamined).equalTo(record::getWaitingQueryRowsExamined)
                .set(blockingThreadId).equalTo(record::getBlockingThreadId)
                .set(blockingPid).equalTo(record::getBlockingPid)
                .set(blockingLockType).equalTo(record::getBlockingLockType)
                .set(blockingLockDuration).equalTo(record::getBlockingLockDuration)
                .set(sqlKillBlockingQuery).equalTo(record::getSqlKillBlockingQuery)
                .set(sqlKillBlockingConnection).equalTo(record::getSqlKillBlockingConnection)
                .set(waitingAccount).equalTo(record::getWaitingAccount)
                .set(waitingQuery).equalTo(record::getWaitingQuery)
                .set(blockingAccount).equalTo(record::getBlockingAccount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: x$schema_table_lock_waits")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XSchemaTableLockWaits record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(waitingThreadId).equalToWhenPresent(record::getWaitingThreadId)
                .set(waitingPid).equalToWhenPresent(record::getWaitingPid)
                .set(waitingLockType).equalToWhenPresent(record::getWaitingLockType)
                .set(waitingLockDuration).equalToWhenPresent(record::getWaitingLockDuration)
                .set(waitingQuerySecs).equalToWhenPresent(record::getWaitingQuerySecs)
                .set(waitingQueryRowsAffected).equalToWhenPresent(record::getWaitingQueryRowsAffected)
                .set(waitingQueryRowsExamined).equalToWhenPresent(record::getWaitingQueryRowsExamined)
                .set(blockingThreadId).equalToWhenPresent(record::getBlockingThreadId)
                .set(blockingPid).equalToWhenPresent(record::getBlockingPid)
                .set(blockingLockType).equalToWhenPresent(record::getBlockingLockType)
                .set(blockingLockDuration).equalToWhenPresent(record::getBlockingLockDuration)
                .set(sqlKillBlockingQuery).equalToWhenPresent(record::getSqlKillBlockingQuery)
                .set(sqlKillBlockingConnection).equalToWhenPresent(record::getSqlKillBlockingConnection)
                .set(waitingAccount).equalToWhenPresent(record::getWaitingAccount)
                .set(waitingQuery).equalToWhenPresent(record::getWaitingQuery)
                .set(blockingAccount).equalToWhenPresent(record::getBlockingAccount);
    }
}