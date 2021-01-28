package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsStatementsCurrentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.EventsStatementsCurrent;
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
public interface EventsStatementsCurrentMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, eventId, endEventId, eventName, source, timerStart, timerEnd, timerWait, lockTime, digest, currentSchema, objectType, objectSchema, objectName, objectInstanceBegin, mysqlErrno, returnedSqlstate, messageText, errors, warnings, rowsAffected, rowsSent, rowsExamined, createdTmpDiskTables, createdTmpTables, selectFullJoin, selectFullRangeJoin, selectRange, selectRangeCheck, selectScan, sortMergePasses, sortRange, sortRows, sortScan, noIndexUsed, noGoodIndexUsed, nestingEventId, nestingEventType, nestingEventLevel, statementId, sqlText, digestText);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source Table: events_statements_current")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source Table: events_statements_current")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source Table: events_statements_current")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsStatementsCurrent> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source Table: events_statements_current")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsStatementsCurrentResult")
    Optional<EventsStatementsCurrent> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source Table: events_statements_current")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsStatementsCurrentResult", value = {
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="EVENT_ID", property="eventId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="END_EVENT_ID", property="endEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIMER_START", property="timerStart", jdbcType=JdbcType.BIGINT),
        @Result(column="TIMER_END", property="timerEnd", jdbcType=JdbcType.BIGINT),
        @Result(column="TIMER_WAIT", property="timerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="LOCK_TIME", property="lockTime", jdbcType=JdbcType.BIGINT),
        @Result(column="DIGEST", property="digest", jdbcType=JdbcType.VARCHAR),
        @Result(column="CURRENT_SCHEMA", property="currentSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_TYPE", property="objectType", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_SCHEMA", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT),
        @Result(column="MYSQL_ERRNO", property="mysqlErrno", jdbcType=JdbcType.INTEGER),
        @Result(column="RETURNED_SQLSTATE", property="returnedSqlstate", jdbcType=JdbcType.VARCHAR),
        @Result(column="MESSAGE_TEXT", property="messageText", jdbcType=JdbcType.VARCHAR),
        @Result(column="ERRORS", property="errors", jdbcType=JdbcType.BIGINT),
        @Result(column="WARNINGS", property="warnings", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_AFFECTED", property="rowsAffected", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_SENT", property="rowsSent", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_EXAMINED", property="rowsExamined", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATED_TMP_DISK_TABLES", property="createdTmpDiskTables", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATED_TMP_TABLES", property="createdTmpTables", jdbcType=JdbcType.BIGINT),
        @Result(column="SELECT_FULL_JOIN", property="selectFullJoin", jdbcType=JdbcType.BIGINT),
        @Result(column="SELECT_FULL_RANGE_JOIN", property="selectFullRangeJoin", jdbcType=JdbcType.BIGINT),
        @Result(column="SELECT_RANGE", property="selectRange", jdbcType=JdbcType.BIGINT),
        @Result(column="SELECT_RANGE_CHECK", property="selectRangeCheck", jdbcType=JdbcType.BIGINT),
        @Result(column="SELECT_SCAN", property="selectScan", jdbcType=JdbcType.BIGINT),
        @Result(column="SORT_MERGE_PASSES", property="sortMergePasses", jdbcType=JdbcType.BIGINT),
        @Result(column="SORT_RANGE", property="sortRange", jdbcType=JdbcType.BIGINT),
        @Result(column="SORT_ROWS", property="sortRows", jdbcType=JdbcType.BIGINT),
        @Result(column="SORT_SCAN", property="sortScan", jdbcType=JdbcType.BIGINT),
        @Result(column="NO_INDEX_USED", property="noIndexUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="NO_GOOD_INDEX_USED", property="noGoodIndexUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="NESTING_EVENT_ID", property="nestingEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="NESTING_EVENT_TYPE", property="nestingEventType", jdbcType=JdbcType.CHAR),
        @Result(column="NESTING_EVENT_LEVEL", property="nestingEventLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="STATEMENT_ID", property="statementId", jdbcType=JdbcType.BIGINT),
        @Result(column="SQL_TEXT", property="sqlText", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="DIGEST_TEXT", property="digestText", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<EventsStatementsCurrent> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source Table: events_statements_current")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source Table: events_statements_current")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsStatementsCurrent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2209169+08:00", comments="Source Table: events_statements_current")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsStatementsCurrent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    default int deleteByPrimaryKey(Long threadId_, Long eventId_) {
        return delete(c -> 
            c.where(threadId, isEqualTo(threadId_))
            .and(eventId, isEqualTo(eventId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    default int insert(EventsStatementsCurrent record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStatementsCurrent, c ->
            c.map(threadId).toProperty("threadId")
            .map(eventId).toProperty("eventId")
            .map(endEventId).toProperty("endEventId")
            .map(eventName).toProperty("eventName")
            .map(source).toProperty("source")
            .map(timerStart).toProperty("timerStart")
            .map(timerEnd).toProperty("timerEnd")
            .map(timerWait).toProperty("timerWait")
            .map(lockTime).toProperty("lockTime")
            .map(digest).toProperty("digest")
            .map(currentSchema).toProperty("currentSchema")
            .map(objectType).toProperty("objectType")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(mysqlErrno).toProperty("mysqlErrno")
            .map(returnedSqlstate).toProperty("returnedSqlstate")
            .map(messageText).toProperty("messageText")
            .map(errors).toProperty("errors")
            .map(warnings).toProperty("warnings")
            .map(rowsAffected).toProperty("rowsAffected")
            .map(rowsSent).toProperty("rowsSent")
            .map(rowsExamined).toProperty("rowsExamined")
            .map(createdTmpDiskTables).toProperty("createdTmpDiskTables")
            .map(createdTmpTables).toProperty("createdTmpTables")
            .map(selectFullJoin).toProperty("selectFullJoin")
            .map(selectFullRangeJoin).toProperty("selectFullRangeJoin")
            .map(selectRange).toProperty("selectRange")
            .map(selectRangeCheck).toProperty("selectRangeCheck")
            .map(selectScan).toProperty("selectScan")
            .map(sortMergePasses).toProperty("sortMergePasses")
            .map(sortRange).toProperty("sortRange")
            .map(sortRows).toProperty("sortRows")
            .map(sortScan).toProperty("sortScan")
            .map(noIndexUsed).toProperty("noIndexUsed")
            .map(noGoodIndexUsed).toProperty("noGoodIndexUsed")
            .map(nestingEventId).toProperty("nestingEventId")
            .map(nestingEventType).toProperty("nestingEventType")
            .map(nestingEventLevel).toProperty("nestingEventLevel")
            .map(statementId).toProperty("statementId")
            .map(sqlText).toProperty("sqlText")
            .map(digestText).toProperty("digestText")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    default int insertSelective(EventsStatementsCurrent record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStatementsCurrent, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(eventId).toPropertyWhenPresent("eventId", record::getEventId)
            .map(endEventId).toPropertyWhenPresent("endEventId", record::getEndEventId)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(timerStart).toPropertyWhenPresent("timerStart", record::getTimerStart)
            .map(timerEnd).toPropertyWhenPresent("timerEnd", record::getTimerEnd)
            .map(timerWait).toPropertyWhenPresent("timerWait", record::getTimerWait)
            .map(lockTime).toPropertyWhenPresent("lockTime", record::getLockTime)
            .map(digest).toPropertyWhenPresent("digest", record::getDigest)
            .map(currentSchema).toPropertyWhenPresent("currentSchema", record::getCurrentSchema)
            .map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(mysqlErrno).toPropertyWhenPresent("mysqlErrno", record::getMysqlErrno)
            .map(returnedSqlstate).toPropertyWhenPresent("returnedSqlstate", record::getReturnedSqlstate)
            .map(messageText).toPropertyWhenPresent("messageText", record::getMessageText)
            .map(errors).toPropertyWhenPresent("errors", record::getErrors)
            .map(warnings).toPropertyWhenPresent("warnings", record::getWarnings)
            .map(rowsAffected).toPropertyWhenPresent("rowsAffected", record::getRowsAffected)
            .map(rowsSent).toPropertyWhenPresent("rowsSent", record::getRowsSent)
            .map(rowsExamined).toPropertyWhenPresent("rowsExamined", record::getRowsExamined)
            .map(createdTmpDiskTables).toPropertyWhenPresent("createdTmpDiskTables", record::getCreatedTmpDiskTables)
            .map(createdTmpTables).toPropertyWhenPresent("createdTmpTables", record::getCreatedTmpTables)
            .map(selectFullJoin).toPropertyWhenPresent("selectFullJoin", record::getSelectFullJoin)
            .map(selectFullRangeJoin).toPropertyWhenPresent("selectFullRangeJoin", record::getSelectFullRangeJoin)
            .map(selectRange).toPropertyWhenPresent("selectRange", record::getSelectRange)
            .map(selectRangeCheck).toPropertyWhenPresent("selectRangeCheck", record::getSelectRangeCheck)
            .map(selectScan).toPropertyWhenPresent("selectScan", record::getSelectScan)
            .map(sortMergePasses).toPropertyWhenPresent("sortMergePasses", record::getSortMergePasses)
            .map(sortRange).toPropertyWhenPresent("sortRange", record::getSortRange)
            .map(sortRows).toPropertyWhenPresent("sortRows", record::getSortRows)
            .map(sortScan).toPropertyWhenPresent("sortScan", record::getSortScan)
            .map(noIndexUsed).toPropertyWhenPresent("noIndexUsed", record::getNoIndexUsed)
            .map(noGoodIndexUsed).toPropertyWhenPresent("noGoodIndexUsed", record::getNoGoodIndexUsed)
            .map(nestingEventId).toPropertyWhenPresent("nestingEventId", record::getNestingEventId)
            .map(nestingEventType).toPropertyWhenPresent("nestingEventType", record::getNestingEventType)
            .map(nestingEventLevel).toPropertyWhenPresent("nestingEventLevel", record::getNestingEventLevel)
            .map(statementId).toPropertyWhenPresent("statementId", record::getStatementId)
            .map(sqlText).toPropertyWhenPresent("sqlText", record::getSqlText)
            .map(digestText).toPropertyWhenPresent("digestText", record::getDigestText)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    default Optional<EventsStatementsCurrent> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsStatementsCurrent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    default List<EventsStatementsCurrent> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsStatementsCurrent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    default List<EventsStatementsCurrent> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsStatementsCurrent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    default Optional<EventsStatementsCurrent> selectByPrimaryKey(Long threadId_, Long eventId_) {
        return selectOne(c ->
            c.where(threadId, isEqualTo(threadId_))
            .and(eventId, isEqualTo(eventId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsStatementsCurrent, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsStatementsCurrent record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(eventId).equalTo(record::getEventId)
                .set(endEventId).equalTo(record::getEndEventId)
                .set(eventName).equalTo(record::getEventName)
                .set(source).equalTo(record::getSource)
                .set(timerStart).equalTo(record::getTimerStart)
                .set(timerEnd).equalTo(record::getTimerEnd)
                .set(timerWait).equalTo(record::getTimerWait)
                .set(lockTime).equalTo(record::getLockTime)
                .set(digest).equalTo(record::getDigest)
                .set(currentSchema).equalTo(record::getCurrentSchema)
                .set(objectType).equalTo(record::getObjectType)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(mysqlErrno).equalTo(record::getMysqlErrno)
                .set(returnedSqlstate).equalTo(record::getReturnedSqlstate)
                .set(messageText).equalTo(record::getMessageText)
                .set(errors).equalTo(record::getErrors)
                .set(warnings).equalTo(record::getWarnings)
                .set(rowsAffected).equalTo(record::getRowsAffected)
                .set(rowsSent).equalTo(record::getRowsSent)
                .set(rowsExamined).equalTo(record::getRowsExamined)
                .set(createdTmpDiskTables).equalTo(record::getCreatedTmpDiskTables)
                .set(createdTmpTables).equalTo(record::getCreatedTmpTables)
                .set(selectFullJoin).equalTo(record::getSelectFullJoin)
                .set(selectFullRangeJoin).equalTo(record::getSelectFullRangeJoin)
                .set(selectRange).equalTo(record::getSelectRange)
                .set(selectRangeCheck).equalTo(record::getSelectRangeCheck)
                .set(selectScan).equalTo(record::getSelectScan)
                .set(sortMergePasses).equalTo(record::getSortMergePasses)
                .set(sortRange).equalTo(record::getSortRange)
                .set(sortRows).equalTo(record::getSortRows)
                .set(sortScan).equalTo(record::getSortScan)
                .set(noIndexUsed).equalTo(record::getNoIndexUsed)
                .set(noGoodIndexUsed).equalTo(record::getNoGoodIndexUsed)
                .set(nestingEventId).equalTo(record::getNestingEventId)
                .set(nestingEventType).equalTo(record::getNestingEventType)
                .set(nestingEventLevel).equalTo(record::getNestingEventLevel)
                .set(statementId).equalTo(record::getStatementId)
                .set(sqlText).equalTo(record::getSqlText)
                .set(digestText).equalTo(record::getDigestText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsStatementsCurrent record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(eventId).equalToWhenPresent(record::getEventId)
                .set(endEventId).equalToWhenPresent(record::getEndEventId)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(source).equalToWhenPresent(record::getSource)
                .set(timerStart).equalToWhenPresent(record::getTimerStart)
                .set(timerEnd).equalToWhenPresent(record::getTimerEnd)
                .set(timerWait).equalToWhenPresent(record::getTimerWait)
                .set(lockTime).equalToWhenPresent(record::getLockTime)
                .set(digest).equalToWhenPresent(record::getDigest)
                .set(currentSchema).equalToWhenPresent(record::getCurrentSchema)
                .set(objectType).equalToWhenPresent(record::getObjectType)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(mysqlErrno).equalToWhenPresent(record::getMysqlErrno)
                .set(returnedSqlstate).equalToWhenPresent(record::getReturnedSqlstate)
                .set(messageText).equalToWhenPresent(record::getMessageText)
                .set(errors).equalToWhenPresent(record::getErrors)
                .set(warnings).equalToWhenPresent(record::getWarnings)
                .set(rowsAffected).equalToWhenPresent(record::getRowsAffected)
                .set(rowsSent).equalToWhenPresent(record::getRowsSent)
                .set(rowsExamined).equalToWhenPresent(record::getRowsExamined)
                .set(createdTmpDiskTables).equalToWhenPresent(record::getCreatedTmpDiskTables)
                .set(createdTmpTables).equalToWhenPresent(record::getCreatedTmpTables)
                .set(selectFullJoin).equalToWhenPresent(record::getSelectFullJoin)
                .set(selectFullRangeJoin).equalToWhenPresent(record::getSelectFullRangeJoin)
                .set(selectRange).equalToWhenPresent(record::getSelectRange)
                .set(selectRangeCheck).equalToWhenPresent(record::getSelectRangeCheck)
                .set(selectScan).equalToWhenPresent(record::getSelectScan)
                .set(sortMergePasses).equalToWhenPresent(record::getSortMergePasses)
                .set(sortRange).equalToWhenPresent(record::getSortRange)
                .set(sortRows).equalToWhenPresent(record::getSortRows)
                .set(sortScan).equalToWhenPresent(record::getSortScan)
                .set(noIndexUsed).equalToWhenPresent(record::getNoIndexUsed)
                .set(noGoodIndexUsed).equalToWhenPresent(record::getNoGoodIndexUsed)
                .set(nestingEventId).equalToWhenPresent(record::getNestingEventId)
                .set(nestingEventType).equalToWhenPresent(record::getNestingEventType)
                .set(nestingEventLevel).equalToWhenPresent(record::getNestingEventLevel)
                .set(statementId).equalToWhenPresent(record::getStatementId)
                .set(sqlText).equalToWhenPresent(record::getSqlText)
                .set(digestText).equalToWhenPresent(record::getDigestText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    default int updateByPrimaryKey(EventsStatementsCurrent record) {
        return update(c ->
            c.set(endEventId).equalTo(record::getEndEventId)
            .set(eventName).equalTo(record::getEventName)
            .set(source).equalTo(record::getSource)
            .set(timerStart).equalTo(record::getTimerStart)
            .set(timerEnd).equalTo(record::getTimerEnd)
            .set(timerWait).equalTo(record::getTimerWait)
            .set(lockTime).equalTo(record::getLockTime)
            .set(digest).equalTo(record::getDigest)
            .set(currentSchema).equalTo(record::getCurrentSchema)
            .set(objectType).equalTo(record::getObjectType)
            .set(objectSchema).equalTo(record::getObjectSchema)
            .set(objectName).equalTo(record::getObjectName)
            .set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
            .set(mysqlErrno).equalTo(record::getMysqlErrno)
            .set(returnedSqlstate).equalTo(record::getReturnedSqlstate)
            .set(messageText).equalTo(record::getMessageText)
            .set(errors).equalTo(record::getErrors)
            .set(warnings).equalTo(record::getWarnings)
            .set(rowsAffected).equalTo(record::getRowsAffected)
            .set(rowsSent).equalTo(record::getRowsSent)
            .set(rowsExamined).equalTo(record::getRowsExamined)
            .set(createdTmpDiskTables).equalTo(record::getCreatedTmpDiskTables)
            .set(createdTmpTables).equalTo(record::getCreatedTmpTables)
            .set(selectFullJoin).equalTo(record::getSelectFullJoin)
            .set(selectFullRangeJoin).equalTo(record::getSelectFullRangeJoin)
            .set(selectRange).equalTo(record::getSelectRange)
            .set(selectRangeCheck).equalTo(record::getSelectRangeCheck)
            .set(selectScan).equalTo(record::getSelectScan)
            .set(sortMergePasses).equalTo(record::getSortMergePasses)
            .set(sortRange).equalTo(record::getSortRange)
            .set(sortRows).equalTo(record::getSortRows)
            .set(sortScan).equalTo(record::getSortScan)
            .set(noIndexUsed).equalTo(record::getNoIndexUsed)
            .set(noGoodIndexUsed).equalTo(record::getNoGoodIndexUsed)
            .set(nestingEventId).equalTo(record::getNestingEventId)
            .set(nestingEventType).equalTo(record::getNestingEventType)
            .set(nestingEventLevel).equalTo(record::getNestingEventLevel)
            .set(statementId).equalTo(record::getStatementId)
            .set(sqlText).equalTo(record::getSqlText)
            .set(digestText).equalTo(record::getDigestText)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(eventId, isEqualTo(record::getEventId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source Table: events_statements_current")
    default int updateByPrimaryKeySelective(EventsStatementsCurrent record) {
        return update(c ->
            c.set(endEventId).equalToWhenPresent(record::getEndEventId)
            .set(eventName).equalToWhenPresent(record::getEventName)
            .set(source).equalToWhenPresent(record::getSource)
            .set(timerStart).equalToWhenPresent(record::getTimerStart)
            .set(timerEnd).equalToWhenPresent(record::getTimerEnd)
            .set(timerWait).equalToWhenPresent(record::getTimerWait)
            .set(lockTime).equalToWhenPresent(record::getLockTime)
            .set(digest).equalToWhenPresent(record::getDigest)
            .set(currentSchema).equalToWhenPresent(record::getCurrentSchema)
            .set(objectType).equalToWhenPresent(record::getObjectType)
            .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
            .set(objectName).equalToWhenPresent(record::getObjectName)
            .set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
            .set(mysqlErrno).equalToWhenPresent(record::getMysqlErrno)
            .set(returnedSqlstate).equalToWhenPresent(record::getReturnedSqlstate)
            .set(messageText).equalToWhenPresent(record::getMessageText)
            .set(errors).equalToWhenPresent(record::getErrors)
            .set(warnings).equalToWhenPresent(record::getWarnings)
            .set(rowsAffected).equalToWhenPresent(record::getRowsAffected)
            .set(rowsSent).equalToWhenPresent(record::getRowsSent)
            .set(rowsExamined).equalToWhenPresent(record::getRowsExamined)
            .set(createdTmpDiskTables).equalToWhenPresent(record::getCreatedTmpDiskTables)
            .set(createdTmpTables).equalToWhenPresent(record::getCreatedTmpTables)
            .set(selectFullJoin).equalToWhenPresent(record::getSelectFullJoin)
            .set(selectFullRangeJoin).equalToWhenPresent(record::getSelectFullRangeJoin)
            .set(selectRange).equalToWhenPresent(record::getSelectRange)
            .set(selectRangeCheck).equalToWhenPresent(record::getSelectRangeCheck)
            .set(selectScan).equalToWhenPresent(record::getSelectScan)
            .set(sortMergePasses).equalToWhenPresent(record::getSortMergePasses)
            .set(sortRange).equalToWhenPresent(record::getSortRange)
            .set(sortRows).equalToWhenPresent(record::getSortRows)
            .set(sortScan).equalToWhenPresent(record::getSortScan)
            .set(noIndexUsed).equalToWhenPresent(record::getNoIndexUsed)
            .set(noGoodIndexUsed).equalToWhenPresent(record::getNoGoodIndexUsed)
            .set(nestingEventId).equalToWhenPresent(record::getNestingEventId)
            .set(nestingEventType).equalToWhenPresent(record::getNestingEventType)
            .set(nestingEventLevel).equalToWhenPresent(record::getNestingEventLevel)
            .set(statementId).equalToWhenPresent(record::getStatementId)
            .set(sqlText).equalToWhenPresent(record::getSqlText)
            .set(digestText).equalToWhenPresent(record::getDigestText)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(eventId, isEqualTo(record::getEventId))
        );
    }
}