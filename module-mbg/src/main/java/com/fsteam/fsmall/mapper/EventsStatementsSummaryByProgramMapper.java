package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsStatementsSummaryByProgramDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.EventsStatementsSummaryByProgram;
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
public interface EventsStatementsSummaryByProgramMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    BasicColumn[] selectList = BasicColumn.columnList(objectType, objectSchema, objectName, countStar, sumTimerWait, minTimerWait, avgTimerWait, maxTimerWait, countStatements, sumStatementsWait, minStatementsWait, avgStatementsWait, maxStatementsWait, sumLockTime, sumErrors, sumWarnings, sumRowsAffected, sumRowsSent, sumRowsExamined, sumCreatedTmpDiskTables, sumCreatedTmpTables, sumSelectFullJoin, sumSelectFullRangeJoin, sumSelectRange, sumSelectRangeCheck, sumSelectScan, sumSortMergePasses, sumSortRange, sumSortRows, sumSortScan, sumNoIndexUsed, sumNoGoodIndexUsed);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4241024+08:00", comments="Source Table: events_statements_summary_by_program")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4241024+08:00", comments="Source Table: events_statements_summary_by_program")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4241024+08:00", comments="Source Table: events_statements_summary_by_program")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsStatementsSummaryByProgram> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4241024+08:00", comments="Source Table: events_statements_summary_by_program")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsStatementsSummaryByProgramResult")
    Optional<EventsStatementsSummaryByProgram> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4241024+08:00", comments="Source Table: events_statements_summary_by_program")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsStatementsSummaryByProgramResult", value = {
        @Result(column="OBJECT_TYPE", property="objectType", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="OBJECT_SCHEMA", property="objectSchema", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COUNT_STAR", property="countStar", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WAIT", property="sumTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WAIT", property="minTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WAIT", property="avgTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WAIT", property="maxTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_STATEMENTS", property="countStatements", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_STATEMENTS_WAIT", property="sumStatementsWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_STATEMENTS_WAIT", property="minStatementsWait", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_STATEMENTS_WAIT", property="avgStatementsWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_STATEMENTS_WAIT", property="maxStatementsWait", jdbcType=JdbcType.BIGINT),
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
        @Result(column="SUM_NO_GOOD_INDEX_USED", property="sumNoGoodIndexUsed", jdbcType=JdbcType.BIGINT)
    })
    List<EventsStatementsSummaryByProgram> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4241024+08:00", comments="Source Table: events_statements_summary_by_program")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4241024+08:00", comments="Source Table: events_statements_summary_by_program")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsStatementsSummaryByProgram, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsStatementsSummaryByProgram, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default int deleteByPrimaryKey(String objectType_, String objectSchema_, String objectName_) {
        return delete(c -> 
            c.where(objectType, isEqualTo(objectType_))
            .and(objectSchema, isEqualTo(objectSchema_))
            .and(objectName, isEqualTo(objectName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default int insert(EventsStatementsSummaryByProgram record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStatementsSummaryByProgram, c ->
            c.map(objectType).toProperty("objectType")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(countStar).toProperty("countStar")
            .map(sumTimerWait).toProperty("sumTimerWait")
            .map(minTimerWait).toProperty("minTimerWait")
            .map(avgTimerWait).toProperty("avgTimerWait")
            .map(maxTimerWait).toProperty("maxTimerWait")
            .map(countStatements).toProperty("countStatements")
            .map(sumStatementsWait).toProperty("sumStatementsWait")
            .map(minStatementsWait).toProperty("minStatementsWait")
            .map(avgStatementsWait).toProperty("avgStatementsWait")
            .map(maxStatementsWait).toProperty("maxStatementsWait")
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
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default int insertSelective(EventsStatementsSummaryByProgram record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStatementsSummaryByProgram, c ->
            c.map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(countStar).toPropertyWhenPresent("countStar", record::getCountStar)
            .map(sumTimerWait).toPropertyWhenPresent("sumTimerWait", record::getSumTimerWait)
            .map(minTimerWait).toPropertyWhenPresent("minTimerWait", record::getMinTimerWait)
            .map(avgTimerWait).toPropertyWhenPresent("avgTimerWait", record::getAvgTimerWait)
            .map(maxTimerWait).toPropertyWhenPresent("maxTimerWait", record::getMaxTimerWait)
            .map(countStatements).toPropertyWhenPresent("countStatements", record::getCountStatements)
            .map(sumStatementsWait).toPropertyWhenPresent("sumStatementsWait", record::getSumStatementsWait)
            .map(minStatementsWait).toPropertyWhenPresent("minStatementsWait", record::getMinStatementsWait)
            .map(avgStatementsWait).toPropertyWhenPresent("avgStatementsWait", record::getAvgStatementsWait)
            .map(maxStatementsWait).toPropertyWhenPresent("maxStatementsWait", record::getMaxStatementsWait)
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
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default Optional<EventsStatementsSummaryByProgram> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsStatementsSummaryByProgram, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default List<EventsStatementsSummaryByProgram> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsStatementsSummaryByProgram, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default List<EventsStatementsSummaryByProgram> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsStatementsSummaryByProgram, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default Optional<EventsStatementsSummaryByProgram> selectByPrimaryKey(String objectType_, String objectSchema_, String objectName_) {
        return selectOne(c ->
            c.where(objectType, isEqualTo(objectType_))
            .and(objectSchema, isEqualTo(objectSchema_))
            .and(objectName, isEqualTo(objectName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsStatementsSummaryByProgram, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsStatementsSummaryByProgram record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectType).equalTo(record::getObjectType)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(countStar).equalTo(record::getCountStar)
                .set(sumTimerWait).equalTo(record::getSumTimerWait)
                .set(minTimerWait).equalTo(record::getMinTimerWait)
                .set(avgTimerWait).equalTo(record::getAvgTimerWait)
                .set(maxTimerWait).equalTo(record::getMaxTimerWait)
                .set(countStatements).equalTo(record::getCountStatements)
                .set(sumStatementsWait).equalTo(record::getSumStatementsWait)
                .set(minStatementsWait).equalTo(record::getMinStatementsWait)
                .set(avgStatementsWait).equalTo(record::getAvgStatementsWait)
                .set(maxStatementsWait).equalTo(record::getMaxStatementsWait)
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
                .set(sumNoGoodIndexUsed).equalTo(record::getSumNoGoodIndexUsed);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsStatementsSummaryByProgram record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectType).equalToWhenPresent(record::getObjectType)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(countStar).equalToWhenPresent(record::getCountStar)
                .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
                .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
                .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
                .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait)
                .set(countStatements).equalToWhenPresent(record::getCountStatements)
                .set(sumStatementsWait).equalToWhenPresent(record::getSumStatementsWait)
                .set(minStatementsWait).equalToWhenPresent(record::getMinStatementsWait)
                .set(avgStatementsWait).equalToWhenPresent(record::getAvgStatementsWait)
                .set(maxStatementsWait).equalToWhenPresent(record::getMaxStatementsWait)
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
                .set(sumNoGoodIndexUsed).equalToWhenPresent(record::getSumNoGoodIndexUsed);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default int updateByPrimaryKey(EventsStatementsSummaryByProgram record) {
        return update(c ->
            c.set(countStar).equalTo(record::getCountStar)
            .set(sumTimerWait).equalTo(record::getSumTimerWait)
            .set(minTimerWait).equalTo(record::getMinTimerWait)
            .set(avgTimerWait).equalTo(record::getAvgTimerWait)
            .set(maxTimerWait).equalTo(record::getMaxTimerWait)
            .set(countStatements).equalTo(record::getCountStatements)
            .set(sumStatementsWait).equalTo(record::getSumStatementsWait)
            .set(minStatementsWait).equalTo(record::getMinStatementsWait)
            .set(avgStatementsWait).equalTo(record::getAvgStatementsWait)
            .set(maxStatementsWait).equalTo(record::getMaxStatementsWait)
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
            .where(objectType, isEqualTo(record::getObjectType))
            .and(objectSchema, isEqualTo(record::getObjectSchema))
            .and(objectName, isEqualTo(record::getObjectName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4251027+08:00", comments="Source Table: events_statements_summary_by_program")
    default int updateByPrimaryKeySelective(EventsStatementsSummaryByProgram record) {
        return update(c ->
            c.set(countStar).equalToWhenPresent(record::getCountStar)
            .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
            .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
            .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
            .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait)
            .set(countStatements).equalToWhenPresent(record::getCountStatements)
            .set(sumStatementsWait).equalToWhenPresent(record::getSumStatementsWait)
            .set(minStatementsWait).equalToWhenPresent(record::getMinStatementsWait)
            .set(avgStatementsWait).equalToWhenPresent(record::getAvgStatementsWait)
            .set(maxStatementsWait).equalToWhenPresent(record::getMaxStatementsWait)
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
            .where(objectType, isEqualTo(record::getObjectType))
            .and(objectSchema, isEqualTo(record::getObjectSchema))
            .and(objectName, isEqualTo(record::getObjectName))
        );
    }
}