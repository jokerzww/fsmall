package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.PreparedStatementsInstancesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.PreparedStatementsInstances;
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
public interface PreparedStatementsInstancesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    BasicColumn[] selectList = BasicColumn.columnList(objectInstanceBegin, statementId, statementName, ownerThreadId, ownerEventId, ownerObjectType, ownerObjectSchema, ownerObjectName, timerPrepare, countReprepare, countExecute, sumTimerExecute, minTimerExecute, avgTimerExecute, maxTimerExecute, sumLockTime, sumErrors, sumWarnings, sumRowsAffected, sumRowsSent, sumRowsExamined, sumCreatedTmpDiskTables, sumCreatedTmpTables, sumSelectFullJoin, sumSelectFullRangeJoin, sumSelectRange, sumSelectRangeCheck, sumSelectScan, sumSortMergePasses, sumSortRange, sumSortRows, sumSortScan, sumNoIndexUsed, sumNoGoodIndexUsed, sqlText);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source Table: prepared_statements_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source Table: prepared_statements_instances")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source Table: prepared_statements_instances")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PreparedStatementsInstances> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source Table: prepared_statements_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PreparedStatementsInstancesResult")
    Optional<PreparedStatementsInstances> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source Table: prepared_statements_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PreparedStatementsInstancesResult", value = {
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="STATEMENT_ID", property="statementId", jdbcType=JdbcType.BIGINT),
        @Result(column="STATEMENT_NAME", property="statementName", jdbcType=JdbcType.VARCHAR),
        @Result(column="OWNER_THREAD_ID", property="ownerThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="OWNER_EVENT_ID", property="ownerEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="OWNER_OBJECT_TYPE", property="ownerObjectType", jdbcType=JdbcType.CHAR),
        @Result(column="OWNER_OBJECT_SCHEMA", property="ownerObjectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OWNER_OBJECT_NAME", property="ownerObjectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIMER_PREPARE", property="timerPrepare", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_REPREPARE", property="countReprepare", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_EXECUTE", property="countExecute", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_EXECUTE", property="sumTimerExecute", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_EXECUTE", property="minTimerExecute", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_EXECUTE", property="avgTimerExecute", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_EXECUTE", property="maxTimerExecute", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_LOCK_TIME", property="sumLockTime", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_ERRORS", property="sumErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_WARNINGS", property="sumWarnings", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_ROWS_AFFECTED", property="sumRowsAffected", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_ROWS_SENT", property="sumRowsSent", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_ROWS_EXAMINED", property="sumRowsExamined", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_CREATED_TMP_DISK_TABLES", property="sumCreatedTmpDiskTables", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_CREATED_TMP_TABLES", property="sumCreatedTmpTables", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SELECT_FULL_JOIN", property="sumSelectFullJoin", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SELECT_FULL_RANGE_JOIN", property="sumSelectFullRangeJoin", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SELECT_RANGE", property="sumSelectRange", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SELECT_RANGE_CHECK", property="sumSelectRangeCheck", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SELECT_SCAN", property="sumSelectScan", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SORT_MERGE_PASSES", property="sumSortMergePasses", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SORT_RANGE", property="sumSortRange", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SORT_ROWS", property="sumSortRows", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SORT_SCAN", property="sumSortScan", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_NO_INDEX_USED", property="sumNoIndexUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_NO_GOOD_INDEX_USED", property="sumNoGoodIndexUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="SQL_TEXT", property="sqlText", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PreparedStatementsInstances> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source Table: prepared_statements_instances")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source Table: prepared_statements_instances")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, preparedStatementsInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source Table: prepared_statements_instances")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, preparedStatementsInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source Table: prepared_statements_instances")
    default int deleteByPrimaryKey(Long objectInstanceBegin_) {
        return delete(c -> 
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source Table: prepared_statements_instances")
    default int insert(PreparedStatementsInstances record) {
        return MyBatis3Utils.insert(this::insert, record, preparedStatementsInstances, c ->
            c.map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(statementId).toProperty("statementId")
            .map(statementName).toProperty("statementName")
            .map(ownerThreadId).toProperty("ownerThreadId")
            .map(ownerEventId).toProperty("ownerEventId")
            .map(ownerObjectType).toProperty("ownerObjectType")
            .map(ownerObjectSchema).toProperty("ownerObjectSchema")
            .map(ownerObjectName).toProperty("ownerObjectName")
            .map(timerPrepare).toProperty("timerPrepare")
            .map(countReprepare).toProperty("countReprepare")
            .map(countExecute).toProperty("countExecute")
            .map(sumTimerExecute).toProperty("sumTimerExecute")
            .map(minTimerExecute).toProperty("minTimerExecute")
            .map(avgTimerExecute).toProperty("avgTimerExecute")
            .map(maxTimerExecute).toProperty("maxTimerExecute")
            .map(sumLockTime).toProperty("sumLockTime")
            .map(sumErrors).toProperty("sumErrors")
            .map(sumWarnings).toProperty("sumWarnings")
            .map(sumRowsAffected).toProperty("sumRowsAffected")
            .map(sumRowsSent).toProperty("sumRowsSent")
            .map(sumRowsExamined).toProperty("sumRowsExamined")
            .map(sumCreatedTmpDiskTables).toProperty("sumCreatedTmpDiskTables")
            .map(sumCreatedTmpTables).toProperty("sumCreatedTmpTables")
            .map(sumSelectFullJoin).toProperty("sumSelectFullJoin")
            .map(sumSelectFullRangeJoin).toProperty("sumSelectFullRangeJoin")
            .map(sumSelectRange).toProperty("sumSelectRange")
            .map(sumSelectRangeCheck).toProperty("sumSelectRangeCheck")
            .map(sumSelectScan).toProperty("sumSelectScan")
            .map(sumSortMergePasses).toProperty("sumSortMergePasses")
            .map(sumSortRange).toProperty("sumSortRange")
            .map(sumSortRows).toProperty("sumSortRows")
            .map(sumSortScan).toProperty("sumSortScan")
            .map(sumNoIndexUsed).toProperty("sumNoIndexUsed")
            .map(sumNoGoodIndexUsed).toProperty("sumNoGoodIndexUsed")
            .map(sqlText).toProperty("sqlText")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    default int insertSelective(PreparedStatementsInstances record) {
        return MyBatis3Utils.insert(this::insert, record, preparedStatementsInstances, c ->
            c.map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(statementId).toPropertyWhenPresent("statementId", record::getStatementId)
            .map(statementName).toPropertyWhenPresent("statementName", record::getStatementName)
            .map(ownerThreadId).toPropertyWhenPresent("ownerThreadId", record::getOwnerThreadId)
            .map(ownerEventId).toPropertyWhenPresent("ownerEventId", record::getOwnerEventId)
            .map(ownerObjectType).toPropertyWhenPresent("ownerObjectType", record::getOwnerObjectType)
            .map(ownerObjectSchema).toPropertyWhenPresent("ownerObjectSchema", record::getOwnerObjectSchema)
            .map(ownerObjectName).toPropertyWhenPresent("ownerObjectName", record::getOwnerObjectName)
            .map(timerPrepare).toPropertyWhenPresent("timerPrepare", record::getTimerPrepare)
            .map(countReprepare).toPropertyWhenPresent("countReprepare", record::getCountReprepare)
            .map(countExecute).toPropertyWhenPresent("countExecute", record::getCountExecute)
            .map(sumTimerExecute).toPropertyWhenPresent("sumTimerExecute", record::getSumTimerExecute)
            .map(minTimerExecute).toPropertyWhenPresent("minTimerExecute", record::getMinTimerExecute)
            .map(avgTimerExecute).toPropertyWhenPresent("avgTimerExecute", record::getAvgTimerExecute)
            .map(maxTimerExecute).toPropertyWhenPresent("maxTimerExecute", record::getMaxTimerExecute)
            .map(sumLockTime).toPropertyWhenPresent("sumLockTime", record::getSumLockTime)
            .map(sumErrors).toPropertyWhenPresent("sumErrors", record::getSumErrors)
            .map(sumWarnings).toPropertyWhenPresent("sumWarnings", record::getSumWarnings)
            .map(sumRowsAffected).toPropertyWhenPresent("sumRowsAffected", record::getSumRowsAffected)
            .map(sumRowsSent).toPropertyWhenPresent("sumRowsSent", record::getSumRowsSent)
            .map(sumRowsExamined).toPropertyWhenPresent("sumRowsExamined", record::getSumRowsExamined)
            .map(sumCreatedTmpDiskTables).toPropertyWhenPresent("sumCreatedTmpDiskTables", record::getSumCreatedTmpDiskTables)
            .map(sumCreatedTmpTables).toPropertyWhenPresent("sumCreatedTmpTables", record::getSumCreatedTmpTables)
            .map(sumSelectFullJoin).toPropertyWhenPresent("sumSelectFullJoin", record::getSumSelectFullJoin)
            .map(sumSelectFullRangeJoin).toPropertyWhenPresent("sumSelectFullRangeJoin", record::getSumSelectFullRangeJoin)
            .map(sumSelectRange).toPropertyWhenPresent("sumSelectRange", record::getSumSelectRange)
            .map(sumSelectRangeCheck).toPropertyWhenPresent("sumSelectRangeCheck", record::getSumSelectRangeCheck)
            .map(sumSelectScan).toPropertyWhenPresent("sumSelectScan", record::getSumSelectScan)
            .map(sumSortMergePasses).toPropertyWhenPresent("sumSortMergePasses", record::getSumSortMergePasses)
            .map(sumSortRange).toPropertyWhenPresent("sumSortRange", record::getSumSortRange)
            .map(sumSortRows).toPropertyWhenPresent("sumSortRows", record::getSumSortRows)
            .map(sumSortScan).toPropertyWhenPresent("sumSortScan", record::getSumSortScan)
            .map(sumNoIndexUsed).toPropertyWhenPresent("sumNoIndexUsed", record::getSumNoIndexUsed)
            .map(sumNoGoodIndexUsed).toPropertyWhenPresent("sumNoGoodIndexUsed", record::getSumNoGoodIndexUsed)
            .map(sqlText).toPropertyWhenPresent("sqlText", record::getSqlText)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    default Optional<PreparedStatementsInstances> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, preparedStatementsInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    default List<PreparedStatementsInstances> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, preparedStatementsInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    default List<PreparedStatementsInstances> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, preparedStatementsInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    default Optional<PreparedStatementsInstances> selectByPrimaryKey(Long objectInstanceBegin_) {
        return selectOne(c ->
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, preparedStatementsInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    static UpdateDSL<UpdateModel> updateAllColumns(PreparedStatementsInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(statementId).equalTo(record::getStatementId)
                .set(statementName).equalTo(record::getStatementName)
                .set(ownerThreadId).equalTo(record::getOwnerThreadId)
                .set(ownerEventId).equalTo(record::getOwnerEventId)
                .set(ownerObjectType).equalTo(record::getOwnerObjectType)
                .set(ownerObjectSchema).equalTo(record::getOwnerObjectSchema)
                .set(ownerObjectName).equalTo(record::getOwnerObjectName)
                .set(timerPrepare).equalTo(record::getTimerPrepare)
                .set(countReprepare).equalTo(record::getCountReprepare)
                .set(countExecute).equalTo(record::getCountExecute)
                .set(sumTimerExecute).equalTo(record::getSumTimerExecute)
                .set(minTimerExecute).equalTo(record::getMinTimerExecute)
                .set(avgTimerExecute).equalTo(record::getAvgTimerExecute)
                .set(maxTimerExecute).equalTo(record::getMaxTimerExecute)
                .set(sumLockTime).equalTo(record::getSumLockTime)
                .set(sumErrors).equalTo(record::getSumErrors)
                .set(sumWarnings).equalTo(record::getSumWarnings)
                .set(sumRowsAffected).equalTo(record::getSumRowsAffected)
                .set(sumRowsSent).equalTo(record::getSumRowsSent)
                .set(sumRowsExamined).equalTo(record::getSumRowsExamined)
                .set(sumCreatedTmpDiskTables).equalTo(record::getSumCreatedTmpDiskTables)
                .set(sumCreatedTmpTables).equalTo(record::getSumCreatedTmpTables)
                .set(sumSelectFullJoin).equalTo(record::getSumSelectFullJoin)
                .set(sumSelectFullRangeJoin).equalTo(record::getSumSelectFullRangeJoin)
                .set(sumSelectRange).equalTo(record::getSumSelectRange)
                .set(sumSelectRangeCheck).equalTo(record::getSumSelectRangeCheck)
                .set(sumSelectScan).equalTo(record::getSumSelectScan)
                .set(sumSortMergePasses).equalTo(record::getSumSortMergePasses)
                .set(sumSortRange).equalTo(record::getSumSortRange)
                .set(sumSortRows).equalTo(record::getSumSortRows)
                .set(sumSortScan).equalTo(record::getSumSortScan)
                .set(sumNoIndexUsed).equalTo(record::getSumNoIndexUsed)
                .set(sumNoGoodIndexUsed).equalTo(record::getSumNoGoodIndexUsed)
                .set(sqlText).equalTo(record::getSqlText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PreparedStatementsInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(statementId).equalToWhenPresent(record::getStatementId)
                .set(statementName).equalToWhenPresent(record::getStatementName)
                .set(ownerThreadId).equalToWhenPresent(record::getOwnerThreadId)
                .set(ownerEventId).equalToWhenPresent(record::getOwnerEventId)
                .set(ownerObjectType).equalToWhenPresent(record::getOwnerObjectType)
                .set(ownerObjectSchema).equalToWhenPresent(record::getOwnerObjectSchema)
                .set(ownerObjectName).equalToWhenPresent(record::getOwnerObjectName)
                .set(timerPrepare).equalToWhenPresent(record::getTimerPrepare)
                .set(countReprepare).equalToWhenPresent(record::getCountReprepare)
                .set(countExecute).equalToWhenPresent(record::getCountExecute)
                .set(sumTimerExecute).equalToWhenPresent(record::getSumTimerExecute)
                .set(minTimerExecute).equalToWhenPresent(record::getMinTimerExecute)
                .set(avgTimerExecute).equalToWhenPresent(record::getAvgTimerExecute)
                .set(maxTimerExecute).equalToWhenPresent(record::getMaxTimerExecute)
                .set(sumLockTime).equalToWhenPresent(record::getSumLockTime)
                .set(sumErrors).equalToWhenPresent(record::getSumErrors)
                .set(sumWarnings).equalToWhenPresent(record::getSumWarnings)
                .set(sumRowsAffected).equalToWhenPresent(record::getSumRowsAffected)
                .set(sumRowsSent).equalToWhenPresent(record::getSumRowsSent)
                .set(sumRowsExamined).equalToWhenPresent(record::getSumRowsExamined)
                .set(sumCreatedTmpDiskTables).equalToWhenPresent(record::getSumCreatedTmpDiskTables)
                .set(sumCreatedTmpTables).equalToWhenPresent(record::getSumCreatedTmpTables)
                .set(sumSelectFullJoin).equalToWhenPresent(record::getSumSelectFullJoin)
                .set(sumSelectFullRangeJoin).equalToWhenPresent(record::getSumSelectFullRangeJoin)
                .set(sumSelectRange).equalToWhenPresent(record::getSumSelectRange)
                .set(sumSelectRangeCheck).equalToWhenPresent(record::getSumSelectRangeCheck)
                .set(sumSelectScan).equalToWhenPresent(record::getSumSelectScan)
                .set(sumSortMergePasses).equalToWhenPresent(record::getSumSortMergePasses)
                .set(sumSortRange).equalToWhenPresent(record::getSumSortRange)
                .set(sumSortRows).equalToWhenPresent(record::getSumSortRows)
                .set(sumSortScan).equalToWhenPresent(record::getSumSortScan)
                .set(sumNoIndexUsed).equalToWhenPresent(record::getSumNoIndexUsed)
                .set(sumNoGoodIndexUsed).equalToWhenPresent(record::getSumNoGoodIndexUsed)
                .set(sqlText).equalToWhenPresent(record::getSqlText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    default int updateByPrimaryKey(PreparedStatementsInstances record) {
        return update(c ->
            c.set(statementId).equalTo(record::getStatementId)
            .set(statementName).equalTo(record::getStatementName)
            .set(ownerThreadId).equalTo(record::getOwnerThreadId)
            .set(ownerEventId).equalTo(record::getOwnerEventId)
            .set(ownerObjectType).equalTo(record::getOwnerObjectType)
            .set(ownerObjectSchema).equalTo(record::getOwnerObjectSchema)
            .set(ownerObjectName).equalTo(record::getOwnerObjectName)
            .set(timerPrepare).equalTo(record::getTimerPrepare)
            .set(countReprepare).equalTo(record::getCountReprepare)
            .set(countExecute).equalTo(record::getCountExecute)
            .set(sumTimerExecute).equalTo(record::getSumTimerExecute)
            .set(minTimerExecute).equalTo(record::getMinTimerExecute)
            .set(avgTimerExecute).equalTo(record::getAvgTimerExecute)
            .set(maxTimerExecute).equalTo(record::getMaxTimerExecute)
            .set(sumLockTime).equalTo(record::getSumLockTime)
            .set(sumErrors).equalTo(record::getSumErrors)
            .set(sumWarnings).equalTo(record::getSumWarnings)
            .set(sumRowsAffected).equalTo(record::getSumRowsAffected)
            .set(sumRowsSent).equalTo(record::getSumRowsSent)
            .set(sumRowsExamined).equalTo(record::getSumRowsExamined)
            .set(sumCreatedTmpDiskTables).equalTo(record::getSumCreatedTmpDiskTables)
            .set(sumCreatedTmpTables).equalTo(record::getSumCreatedTmpTables)
            .set(sumSelectFullJoin).equalTo(record::getSumSelectFullJoin)
            .set(sumSelectFullRangeJoin).equalTo(record::getSumSelectFullRangeJoin)
            .set(sumSelectRange).equalTo(record::getSumSelectRange)
            .set(sumSelectRangeCheck).equalTo(record::getSumSelectRangeCheck)
            .set(sumSelectScan).equalTo(record::getSumSelectScan)
            .set(sumSortMergePasses).equalTo(record::getSumSortMergePasses)
            .set(sumSortRange).equalTo(record::getSumSortRange)
            .set(sumSortRows).equalTo(record::getSumSortRows)
            .set(sumSortScan).equalTo(record::getSumSortScan)
            .set(sumNoIndexUsed).equalTo(record::getSumNoIndexUsed)
            .set(sumNoGoodIndexUsed).equalTo(record::getSumNoGoodIndexUsed)
            .set(sqlText).equalTo(record::getSqlText)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3930725+08:00", comments="Source Table: prepared_statements_instances")
    default int updateByPrimaryKeySelective(PreparedStatementsInstances record) {
        return update(c ->
            c.set(statementId).equalToWhenPresent(record::getStatementId)
            .set(statementName).equalToWhenPresent(record::getStatementName)
            .set(ownerThreadId).equalToWhenPresent(record::getOwnerThreadId)
            .set(ownerEventId).equalToWhenPresent(record::getOwnerEventId)
            .set(ownerObjectType).equalToWhenPresent(record::getOwnerObjectType)
            .set(ownerObjectSchema).equalToWhenPresent(record::getOwnerObjectSchema)
            .set(ownerObjectName).equalToWhenPresent(record::getOwnerObjectName)
            .set(timerPrepare).equalToWhenPresent(record::getTimerPrepare)
            .set(countReprepare).equalToWhenPresent(record::getCountReprepare)
            .set(countExecute).equalToWhenPresent(record::getCountExecute)
            .set(sumTimerExecute).equalToWhenPresent(record::getSumTimerExecute)
            .set(minTimerExecute).equalToWhenPresent(record::getMinTimerExecute)
            .set(avgTimerExecute).equalToWhenPresent(record::getAvgTimerExecute)
            .set(maxTimerExecute).equalToWhenPresent(record::getMaxTimerExecute)
            .set(sumLockTime).equalToWhenPresent(record::getSumLockTime)
            .set(sumErrors).equalToWhenPresent(record::getSumErrors)
            .set(sumWarnings).equalToWhenPresent(record::getSumWarnings)
            .set(sumRowsAffected).equalToWhenPresent(record::getSumRowsAffected)
            .set(sumRowsSent).equalToWhenPresent(record::getSumRowsSent)
            .set(sumRowsExamined).equalToWhenPresent(record::getSumRowsExamined)
            .set(sumCreatedTmpDiskTables).equalToWhenPresent(record::getSumCreatedTmpDiskTables)
            .set(sumCreatedTmpTables).equalToWhenPresent(record::getSumCreatedTmpTables)
            .set(sumSelectFullJoin).equalToWhenPresent(record::getSumSelectFullJoin)
            .set(sumSelectFullRangeJoin).equalToWhenPresent(record::getSumSelectFullRangeJoin)
            .set(sumSelectRange).equalToWhenPresent(record::getSumSelectRange)
            .set(sumSelectRangeCheck).equalToWhenPresent(record::getSumSelectRangeCheck)
            .set(sumSelectScan).equalToWhenPresent(record::getSumSelectScan)
            .set(sumSortMergePasses).equalToWhenPresent(record::getSumSortMergePasses)
            .set(sumSortRange).equalToWhenPresent(record::getSumSortRange)
            .set(sumSortRows).equalToWhenPresent(record::getSumSortRows)
            .set(sumSortScan).equalToWhenPresent(record::getSumSortScan)
            .set(sumNoIndexUsed).equalToWhenPresent(record::getSumNoIndexUsed)
            .set(sumNoGoodIndexUsed).equalToWhenPresent(record::getSumNoGoodIndexUsed)
            .set(sqlText).equalToWhenPresent(record::getSqlText)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }
}