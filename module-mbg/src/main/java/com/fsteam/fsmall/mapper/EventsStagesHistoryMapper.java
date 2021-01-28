package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsStagesHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.EventsStagesHistory;
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
public interface EventsStagesHistoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, eventId, endEventId, eventName, source, timerStart, timerEnd, timerWait, workCompleted, workEstimated, nestingEventId, nestingEventType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source Table: events_stages_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3009886+08:00", comments="Source Table: events_stages_history")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsStagesHistory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsStagesHistoryResult")
    Optional<EventsStagesHistory> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsStagesHistoryResult", value = {
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="EVENT_ID", property="eventId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="END_EVENT_ID", property="endEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIMER_START", property="timerStart", jdbcType=JdbcType.BIGINT),
        @Result(column="TIMER_END", property="timerEnd", jdbcType=JdbcType.BIGINT),
        @Result(column="TIMER_WAIT", property="timerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="WORK_COMPLETED", property="workCompleted", jdbcType=JdbcType.BIGINT),
        @Result(column="WORK_ESTIMATED", property="workEstimated", jdbcType=JdbcType.BIGINT),
        @Result(column="NESTING_EVENT_ID", property="nestingEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="NESTING_EVENT_TYPE", property="nestingEventType", jdbcType=JdbcType.CHAR)
    })
    List<EventsStagesHistory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsStagesHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsStagesHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default int deleteByPrimaryKey(Long threadId_, Long eventId_) {
        return delete(c -> 
            c.where(threadId, isEqualTo(threadId_))
            .and(eventId, isEqualTo(eventId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default int insert(EventsStagesHistory record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStagesHistory, c ->
            c.map(threadId).toProperty("threadId")
            .map(eventId).toProperty("eventId")
            .map(endEventId).toProperty("endEventId")
            .map(eventName).toProperty("eventName")
            .map(source).toProperty("source")
            .map(timerStart).toProperty("timerStart")
            .map(timerEnd).toProperty("timerEnd")
            .map(timerWait).toProperty("timerWait")
            .map(workCompleted).toProperty("workCompleted")
            .map(workEstimated).toProperty("workEstimated")
            .map(nestingEventId).toProperty("nestingEventId")
            .map(nestingEventType).toProperty("nestingEventType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default int insertSelective(EventsStagesHistory record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStagesHistory, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(eventId).toPropertyWhenPresent("eventId", record::getEventId)
            .map(endEventId).toPropertyWhenPresent("endEventId", record::getEndEventId)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(timerStart).toPropertyWhenPresent("timerStart", record::getTimerStart)
            .map(timerEnd).toPropertyWhenPresent("timerEnd", record::getTimerEnd)
            .map(timerWait).toPropertyWhenPresent("timerWait", record::getTimerWait)
            .map(workCompleted).toPropertyWhenPresent("workCompleted", record::getWorkCompleted)
            .map(workEstimated).toPropertyWhenPresent("workEstimated", record::getWorkEstimated)
            .map(nestingEventId).toPropertyWhenPresent("nestingEventId", record::getNestingEventId)
            .map(nestingEventType).toPropertyWhenPresent("nestingEventType", record::getNestingEventType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default Optional<EventsStagesHistory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsStagesHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default List<EventsStagesHistory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsStagesHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default List<EventsStagesHistory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsStagesHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default Optional<EventsStagesHistory> selectByPrimaryKey(Long threadId_, Long eventId_) {
        return selectOne(c ->
            c.where(threadId, isEqualTo(threadId_))
            .and(eventId, isEqualTo(eventId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsStagesHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsStagesHistory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(eventId).equalTo(record::getEventId)
                .set(endEventId).equalTo(record::getEndEventId)
                .set(eventName).equalTo(record::getEventName)
                .set(source).equalTo(record::getSource)
                .set(timerStart).equalTo(record::getTimerStart)
                .set(timerEnd).equalTo(record::getTimerEnd)
                .set(timerWait).equalTo(record::getTimerWait)
                .set(workCompleted).equalTo(record::getWorkCompleted)
                .set(workEstimated).equalTo(record::getWorkEstimated)
                .set(nestingEventId).equalTo(record::getNestingEventId)
                .set(nestingEventType).equalTo(record::getNestingEventType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsStagesHistory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(eventId).equalToWhenPresent(record::getEventId)
                .set(endEventId).equalToWhenPresent(record::getEndEventId)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(source).equalToWhenPresent(record::getSource)
                .set(timerStart).equalToWhenPresent(record::getTimerStart)
                .set(timerEnd).equalToWhenPresent(record::getTimerEnd)
                .set(timerWait).equalToWhenPresent(record::getTimerWait)
                .set(workCompleted).equalToWhenPresent(record::getWorkCompleted)
                .set(workEstimated).equalToWhenPresent(record::getWorkEstimated)
                .set(nestingEventId).equalToWhenPresent(record::getNestingEventId)
                .set(nestingEventType).equalToWhenPresent(record::getNestingEventType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default int updateByPrimaryKey(EventsStagesHistory record) {
        return update(c ->
            c.set(endEventId).equalTo(record::getEndEventId)
            .set(eventName).equalTo(record::getEventName)
            .set(source).equalTo(record::getSource)
            .set(timerStart).equalTo(record::getTimerStart)
            .set(timerEnd).equalTo(record::getTimerEnd)
            .set(timerWait).equalTo(record::getTimerWait)
            .set(workCompleted).equalTo(record::getWorkCompleted)
            .set(workEstimated).equalTo(record::getWorkEstimated)
            .set(nestingEventId).equalTo(record::getNestingEventId)
            .set(nestingEventType).equalTo(record::getNestingEventType)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(eventId, isEqualTo(record::getEventId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3019896+08:00", comments="Source Table: events_stages_history")
    default int updateByPrimaryKeySelective(EventsStagesHistory record) {
        return update(c ->
            c.set(endEventId).equalToWhenPresent(record::getEndEventId)
            .set(eventName).equalToWhenPresent(record::getEventName)
            .set(source).equalToWhenPresent(record::getSource)
            .set(timerStart).equalToWhenPresent(record::getTimerStart)
            .set(timerEnd).equalToWhenPresent(record::getTimerEnd)
            .set(timerWait).equalToWhenPresent(record::getTimerWait)
            .set(workCompleted).equalToWhenPresent(record::getWorkCompleted)
            .set(workEstimated).equalToWhenPresent(record::getWorkEstimated)
            .set(nestingEventId).equalToWhenPresent(record::getNestingEventId)
            .set(nestingEventType).equalToWhenPresent(record::getNestingEventType)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(eventId, isEqualTo(record::getEventId))
        );
    }
}