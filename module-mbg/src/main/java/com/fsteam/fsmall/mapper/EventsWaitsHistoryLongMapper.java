package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsWaitsHistoryLongDynamicSqlSupport.*;

import com.fsteam.fsmall.model.EventsWaitsHistoryLong;
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
public interface EventsWaitsHistoryLongMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, eventId, endEventId, eventName, source, timerStart, timerEnd, timerWait, spins, objectSchema, objectName, indexName, objectType, objectInstanceBegin, nestingEventId, nestingEventType, operation, numberOfBytes, flags);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsWaitsHistoryLong> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsWaitsHistoryLongResult")
    Optional<EventsWaitsHistoryLong> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsWaitsHistoryLongResult", value = {
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="EVENT_ID", property="eventId", jdbcType=JdbcType.BIGINT),
        @Result(column="END_EVENT_ID", property="endEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIMER_START", property="timerStart", jdbcType=JdbcType.BIGINT),
        @Result(column="TIMER_END", property="timerEnd", jdbcType=JdbcType.BIGINT),
        @Result(column="TIMER_WAIT", property="timerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="SPINS", property="spins", jdbcType=JdbcType.INTEGER),
        @Result(column="OBJECT_SCHEMA", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEX_NAME", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_TYPE", property="objectType", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT),
        @Result(column="NESTING_EVENT_ID", property="nestingEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="NESTING_EVENT_TYPE", property="nestingEventType", jdbcType=JdbcType.CHAR),
        @Result(column="OPERATION", property="operation", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMBER_OF_BYTES", property="numberOfBytes", jdbcType=JdbcType.BIGINT),
        @Result(column="FLAGS", property="flags", jdbcType=JdbcType.INTEGER)
    })
    List<EventsWaitsHistoryLong> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsWaitsHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsWaitsHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    default int insert(EventsWaitsHistoryLong record) {
        return MyBatis3Utils.insert(this::insert, record, eventsWaitsHistoryLong, c ->
            c.map(threadId).toProperty("threadId")
            .map(eventId).toProperty("eventId")
            .map(endEventId).toProperty("endEventId")
            .map(eventName).toProperty("eventName")
            .map(source).toProperty("source")
            .map(timerStart).toProperty("timerStart")
            .map(timerEnd).toProperty("timerEnd")
            .map(timerWait).toProperty("timerWait")
            .map(spins).toProperty("spins")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(indexName).toProperty("indexName")
            .map(objectType).toProperty("objectType")
            .map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(nestingEventId).toProperty("nestingEventId")
            .map(nestingEventType).toProperty("nestingEventType")
            .map(operation).toProperty("operation")
            .map(numberOfBytes).toProperty("numberOfBytes")
            .map(flags).toProperty("flags")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    default int insertSelective(EventsWaitsHistoryLong record) {
        return MyBatis3Utils.insert(this::insert, record, eventsWaitsHistoryLong, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(eventId).toPropertyWhenPresent("eventId", record::getEventId)
            .map(endEventId).toPropertyWhenPresent("endEventId", record::getEndEventId)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(timerStart).toPropertyWhenPresent("timerStart", record::getTimerStart)
            .map(timerEnd).toPropertyWhenPresent("timerEnd", record::getTimerEnd)
            .map(timerWait).toPropertyWhenPresent("timerWait", record::getTimerWait)
            .map(spins).toPropertyWhenPresent("spins", record::getSpins)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(indexName).toPropertyWhenPresent("indexName", record::getIndexName)
            .map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
            .map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(nestingEventId).toPropertyWhenPresent("nestingEventId", record::getNestingEventId)
            .map(nestingEventType).toPropertyWhenPresent("nestingEventType", record::getNestingEventType)
            .map(operation).toPropertyWhenPresent("operation", record::getOperation)
            .map(numberOfBytes).toPropertyWhenPresent("numberOfBytes", record::getNumberOfBytes)
            .map(flags).toPropertyWhenPresent("flags", record::getFlags)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    default Optional<EventsWaitsHistoryLong> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsWaitsHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    default List<EventsWaitsHistoryLong> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsWaitsHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    default List<EventsWaitsHistoryLong> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsWaitsHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsWaitsHistoryLong, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsWaitsHistoryLong record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(eventId).equalTo(record::getEventId)
                .set(endEventId).equalTo(record::getEndEventId)
                .set(eventName).equalTo(record::getEventName)
                .set(source).equalTo(record::getSource)
                .set(timerStart).equalTo(record::getTimerStart)
                .set(timerEnd).equalTo(record::getTimerEnd)
                .set(timerWait).equalTo(record::getTimerWait)
                .set(spins).equalTo(record::getSpins)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(indexName).equalTo(record::getIndexName)
                .set(objectType).equalTo(record::getObjectType)
                .set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(nestingEventId).equalTo(record::getNestingEventId)
                .set(nestingEventType).equalTo(record::getNestingEventType)
                .set(operation).equalTo(record::getOperation)
                .set(numberOfBytes).equalTo(record::getNumberOfBytes)
                .set(flags).equalTo(record::getFlags);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2109075+08:00", comments="Source Table: events_waits_history_long")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsWaitsHistoryLong record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(eventId).equalToWhenPresent(record::getEventId)
                .set(endEventId).equalToWhenPresent(record::getEndEventId)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(source).equalToWhenPresent(record::getSource)
                .set(timerStart).equalToWhenPresent(record::getTimerStart)
                .set(timerEnd).equalToWhenPresent(record::getTimerEnd)
                .set(timerWait).equalToWhenPresent(record::getTimerWait)
                .set(spins).equalToWhenPresent(record::getSpins)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(indexName).equalToWhenPresent(record::getIndexName)
                .set(objectType).equalToWhenPresent(record::getObjectType)
                .set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(nestingEventId).equalToWhenPresent(record::getNestingEventId)
                .set(nestingEventType).equalToWhenPresent(record::getNestingEventType)
                .set(operation).equalToWhenPresent(record::getOperation)
                .set(numberOfBytes).equalToWhenPresent(record::getNumberOfBytes)
                .set(flags).equalToWhenPresent(record::getFlags);
    }
}