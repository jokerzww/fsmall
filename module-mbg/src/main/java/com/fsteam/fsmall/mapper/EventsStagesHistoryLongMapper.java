package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsStagesHistoryLongDynamicSqlSupport.*;

import com.fsteam.fsmall.model.EventsStagesHistoryLong;
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
public interface EventsStagesHistoryLongMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, eventId, endEventId, eventName, source, timerStart, timerEnd, timerWait, workCompleted, workEstimated, nestingEventId, nestingEventType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source Table: events_stages_history_long")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source Table: events_stages_history_long")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source Table: events_stages_history_long")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsStagesHistoryLong> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source Table: events_stages_history_long")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsStagesHistoryLongResult")
    Optional<EventsStagesHistoryLong> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1048098+08:00", comments="Source Table: events_stages_history_long")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsStagesHistoryLongResult", value = {
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="EVENT_ID", property="eventId", jdbcType=JdbcType.BIGINT),
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
    List<EventsStagesHistoryLong> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsStagesHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsStagesHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    default int insert(EventsStagesHistoryLong record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStagesHistoryLong, c ->
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    default int insertSelective(EventsStagesHistoryLong record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStagesHistoryLong, c ->
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    default Optional<EventsStagesHistoryLong> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsStagesHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    default List<EventsStagesHistoryLong> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsStagesHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    default List<EventsStagesHistoryLong> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsStagesHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsStagesHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsStagesHistoryLong record, UpdateDSL<UpdateModel> dsl) {
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: events_stages_history_long")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsStagesHistoryLong record, UpdateDSL<UpdateModel> dsl) {
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
}