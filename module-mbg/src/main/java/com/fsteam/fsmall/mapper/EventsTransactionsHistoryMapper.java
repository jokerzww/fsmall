package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsTransactionsHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.EventsTransactionsHistory;
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
public interface EventsTransactionsHistoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, eventId, endEventId, eventName, state, trxId, gtid, xidFormatId, xidGtrid, xidBqual, xaState, source, timerStart, timerEnd, timerWait, accessMode, isolationLevel, autocommit, numberOfSavepoints, numberOfRollbackToSavepoint, numberOfReleaseSavepoint, objectInstanceBegin, nestingEventId, nestingEventType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source Table: events_transactions_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source Table: events_transactions_history")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source Table: events_transactions_history")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsTransactionsHistory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source Table: events_transactions_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsTransactionsHistoryResult")
    Optional<EventsTransactionsHistory> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3099971+08:00", comments="Source Table: events_transactions_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsTransactionsHistoryResult", value = {
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="EVENT_ID", property="eventId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="END_EVENT_ID", property="endEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATE", property="state", jdbcType=JdbcType.CHAR),
        @Result(column="TRX_ID", property="trxId", jdbcType=JdbcType.BIGINT),
        @Result(column="GTID", property="gtid", jdbcType=JdbcType.VARCHAR),
        @Result(column="XID_FORMAT_ID", property="xidFormatId", jdbcType=JdbcType.INTEGER),
        @Result(column="XID_GTRID", property="xidGtrid", jdbcType=JdbcType.VARCHAR),
        @Result(column="XID_BQUAL", property="xidBqual", jdbcType=JdbcType.VARCHAR),
        @Result(column="XA_STATE", property="xaState", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIMER_START", property="timerStart", jdbcType=JdbcType.BIGINT),
        @Result(column="TIMER_END", property="timerEnd", jdbcType=JdbcType.BIGINT),
        @Result(column="TIMER_WAIT", property="timerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="ACCESS_MODE", property="accessMode", jdbcType=JdbcType.CHAR),
        @Result(column="ISOLATION_LEVEL", property="isolationLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="AUTOCOMMIT", property="autocommit", jdbcType=JdbcType.CHAR),
        @Result(column="NUMBER_OF_SAVEPOINTS", property="numberOfSavepoints", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMBER_OF_ROLLBACK_TO_SAVEPOINT", property="numberOfRollbackToSavepoint", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMBER_OF_RELEASE_SAVEPOINT", property="numberOfReleaseSavepoint", jdbcType=JdbcType.BIGINT),
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT),
        @Result(column="NESTING_EVENT_ID", property="nestingEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="NESTING_EVENT_TYPE", property="nestingEventType", jdbcType=JdbcType.CHAR)
    })
    List<EventsTransactionsHistory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsTransactionsHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsTransactionsHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default int deleteByPrimaryKey(Long threadId_, Long eventId_) {
        return delete(c -> 
            c.where(threadId, isEqualTo(threadId_))
            .and(eventId, isEqualTo(eventId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default int insert(EventsTransactionsHistory record) {
        return MyBatis3Utils.insert(this::insert, record, eventsTransactionsHistory, c ->
            c.map(threadId).toProperty("threadId")
            .map(eventId).toProperty("eventId")
            .map(endEventId).toProperty("endEventId")
            .map(eventName).toProperty("eventName")
            .map(state).toProperty("state")
            .map(trxId).toProperty("trxId")
            .map(gtid).toProperty("gtid")
            .map(xidFormatId).toProperty("xidFormatId")
            .map(xidGtrid).toProperty("xidGtrid")
            .map(xidBqual).toProperty("xidBqual")
            .map(xaState).toProperty("xaState")
            .map(source).toProperty("source")
            .map(timerStart).toProperty("timerStart")
            .map(timerEnd).toProperty("timerEnd")
            .map(timerWait).toProperty("timerWait")
            .map(accessMode).toProperty("accessMode")
            .map(isolationLevel).toProperty("isolationLevel")
            .map(autocommit).toProperty("autocommit")
            .map(numberOfSavepoints).toProperty("numberOfSavepoints")
            .map(numberOfRollbackToSavepoint).toProperty("numberOfRollbackToSavepoint")
            .map(numberOfReleaseSavepoint).toProperty("numberOfReleaseSavepoint")
            .map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(nestingEventId).toProperty("nestingEventId")
            .map(nestingEventType).toProperty("nestingEventType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default int insertSelective(EventsTransactionsHistory record) {
        return MyBatis3Utils.insert(this::insert, record, eventsTransactionsHistory, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(eventId).toPropertyWhenPresent("eventId", record::getEventId)
            .map(endEventId).toPropertyWhenPresent("endEventId", record::getEndEventId)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(trxId).toPropertyWhenPresent("trxId", record::getTrxId)
            .map(gtid).toPropertyWhenPresent("gtid", record::getGtid)
            .map(xidFormatId).toPropertyWhenPresent("xidFormatId", record::getXidFormatId)
            .map(xidGtrid).toPropertyWhenPresent("xidGtrid", record::getXidGtrid)
            .map(xidBqual).toPropertyWhenPresent("xidBqual", record::getXidBqual)
            .map(xaState).toPropertyWhenPresent("xaState", record::getXaState)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(timerStart).toPropertyWhenPresent("timerStart", record::getTimerStart)
            .map(timerEnd).toPropertyWhenPresent("timerEnd", record::getTimerEnd)
            .map(timerWait).toPropertyWhenPresent("timerWait", record::getTimerWait)
            .map(accessMode).toPropertyWhenPresent("accessMode", record::getAccessMode)
            .map(isolationLevel).toPropertyWhenPresent("isolationLevel", record::getIsolationLevel)
            .map(autocommit).toPropertyWhenPresent("autocommit", record::getAutocommit)
            .map(numberOfSavepoints).toPropertyWhenPresent("numberOfSavepoints", record::getNumberOfSavepoints)
            .map(numberOfRollbackToSavepoint).toPropertyWhenPresent("numberOfRollbackToSavepoint", record::getNumberOfRollbackToSavepoint)
            .map(numberOfReleaseSavepoint).toPropertyWhenPresent("numberOfReleaseSavepoint", record::getNumberOfReleaseSavepoint)
            .map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(nestingEventId).toPropertyWhenPresent("nestingEventId", record::getNestingEventId)
            .map(nestingEventType).toPropertyWhenPresent("nestingEventType", record::getNestingEventType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default Optional<EventsTransactionsHistory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsTransactionsHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default List<EventsTransactionsHistory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsTransactionsHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default List<EventsTransactionsHistory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsTransactionsHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default Optional<EventsTransactionsHistory> selectByPrimaryKey(Long threadId_, Long eventId_) {
        return selectOne(c ->
            c.where(threadId, isEqualTo(threadId_))
            .and(eventId, isEqualTo(eventId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsTransactionsHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsTransactionsHistory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(eventId).equalTo(record::getEventId)
                .set(endEventId).equalTo(record::getEndEventId)
                .set(eventName).equalTo(record::getEventName)
                .set(state).equalTo(record::getState)
                .set(trxId).equalTo(record::getTrxId)
                .set(gtid).equalTo(record::getGtid)
                .set(xidFormatId).equalTo(record::getXidFormatId)
                .set(xidGtrid).equalTo(record::getXidGtrid)
                .set(xidBqual).equalTo(record::getXidBqual)
                .set(xaState).equalTo(record::getXaState)
                .set(source).equalTo(record::getSource)
                .set(timerStart).equalTo(record::getTimerStart)
                .set(timerEnd).equalTo(record::getTimerEnd)
                .set(timerWait).equalTo(record::getTimerWait)
                .set(accessMode).equalTo(record::getAccessMode)
                .set(isolationLevel).equalTo(record::getIsolationLevel)
                .set(autocommit).equalTo(record::getAutocommit)
                .set(numberOfSavepoints).equalTo(record::getNumberOfSavepoints)
                .set(numberOfRollbackToSavepoint).equalTo(record::getNumberOfRollbackToSavepoint)
                .set(numberOfReleaseSavepoint).equalTo(record::getNumberOfReleaseSavepoint)
                .set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(nestingEventId).equalTo(record::getNestingEventId)
                .set(nestingEventType).equalTo(record::getNestingEventType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsTransactionsHistory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(eventId).equalToWhenPresent(record::getEventId)
                .set(endEventId).equalToWhenPresent(record::getEndEventId)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(state).equalToWhenPresent(record::getState)
                .set(trxId).equalToWhenPresent(record::getTrxId)
                .set(gtid).equalToWhenPresent(record::getGtid)
                .set(xidFormatId).equalToWhenPresent(record::getXidFormatId)
                .set(xidGtrid).equalToWhenPresent(record::getXidGtrid)
                .set(xidBqual).equalToWhenPresent(record::getXidBqual)
                .set(xaState).equalToWhenPresent(record::getXaState)
                .set(source).equalToWhenPresent(record::getSource)
                .set(timerStart).equalToWhenPresent(record::getTimerStart)
                .set(timerEnd).equalToWhenPresent(record::getTimerEnd)
                .set(timerWait).equalToWhenPresent(record::getTimerWait)
                .set(accessMode).equalToWhenPresent(record::getAccessMode)
                .set(isolationLevel).equalToWhenPresent(record::getIsolationLevel)
                .set(autocommit).equalToWhenPresent(record::getAutocommit)
                .set(numberOfSavepoints).equalToWhenPresent(record::getNumberOfSavepoints)
                .set(numberOfRollbackToSavepoint).equalToWhenPresent(record::getNumberOfRollbackToSavepoint)
                .set(numberOfReleaseSavepoint).equalToWhenPresent(record::getNumberOfReleaseSavepoint)
                .set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(nestingEventId).equalToWhenPresent(record::getNestingEventId)
                .set(nestingEventType).equalToWhenPresent(record::getNestingEventType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default int updateByPrimaryKey(EventsTransactionsHistory record) {
        return update(c ->
            c.set(endEventId).equalTo(record::getEndEventId)
            .set(eventName).equalTo(record::getEventName)
            .set(state).equalTo(record::getState)
            .set(trxId).equalTo(record::getTrxId)
            .set(gtid).equalTo(record::getGtid)
            .set(xidFormatId).equalTo(record::getXidFormatId)
            .set(xidGtrid).equalTo(record::getXidGtrid)
            .set(xidBqual).equalTo(record::getXidBqual)
            .set(xaState).equalTo(record::getXaState)
            .set(source).equalTo(record::getSource)
            .set(timerStart).equalTo(record::getTimerStart)
            .set(timerEnd).equalTo(record::getTimerEnd)
            .set(timerWait).equalTo(record::getTimerWait)
            .set(accessMode).equalTo(record::getAccessMode)
            .set(isolationLevel).equalTo(record::getIsolationLevel)
            .set(autocommit).equalTo(record::getAutocommit)
            .set(numberOfSavepoints).equalTo(record::getNumberOfSavepoints)
            .set(numberOfRollbackToSavepoint).equalTo(record::getNumberOfRollbackToSavepoint)
            .set(numberOfReleaseSavepoint).equalTo(record::getNumberOfReleaseSavepoint)
            .set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
            .set(nestingEventId).equalTo(record::getNestingEventId)
            .set(nestingEventType).equalTo(record::getNestingEventType)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(eventId, isEqualTo(record::getEventId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3109979+08:00", comments="Source Table: events_transactions_history")
    default int updateByPrimaryKeySelective(EventsTransactionsHistory record) {
        return update(c ->
            c.set(endEventId).equalToWhenPresent(record::getEndEventId)
            .set(eventName).equalToWhenPresent(record::getEventName)
            .set(state).equalToWhenPresent(record::getState)
            .set(trxId).equalToWhenPresent(record::getTrxId)
            .set(gtid).equalToWhenPresent(record::getGtid)
            .set(xidFormatId).equalToWhenPresent(record::getXidFormatId)
            .set(xidGtrid).equalToWhenPresent(record::getXidGtrid)
            .set(xidBqual).equalToWhenPresent(record::getXidBqual)
            .set(xaState).equalToWhenPresent(record::getXaState)
            .set(source).equalToWhenPresent(record::getSource)
            .set(timerStart).equalToWhenPresent(record::getTimerStart)
            .set(timerEnd).equalToWhenPresent(record::getTimerEnd)
            .set(timerWait).equalToWhenPresent(record::getTimerWait)
            .set(accessMode).equalToWhenPresent(record::getAccessMode)
            .set(isolationLevel).equalToWhenPresent(record::getIsolationLevel)
            .set(autocommit).equalToWhenPresent(record::getAutocommit)
            .set(numberOfSavepoints).equalToWhenPresent(record::getNumberOfSavepoints)
            .set(numberOfRollbackToSavepoint).equalToWhenPresent(record::getNumberOfRollbackToSavepoint)
            .set(numberOfReleaseSavepoint).equalToWhenPresent(record::getNumberOfReleaseSavepoint)
            .set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
            .set(nestingEventId).equalToWhenPresent(record::getNestingEventId)
            .set(nestingEventType).equalToWhenPresent(record::getNestingEventType)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(eventId, isEqualTo(record::getEventId))
        );
    }
}