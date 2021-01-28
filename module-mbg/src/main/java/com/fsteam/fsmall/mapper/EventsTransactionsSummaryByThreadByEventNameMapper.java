package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsTransactionsSummaryByThreadByEventNameDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.EventsTransactionsSummaryByThreadByEventName;
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
public interface EventsTransactionsSummaryByThreadByEventNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, eventName, countStar, sumTimerWait, minTimerWait, avgTimerWait, maxTimerWait, countReadWrite, sumTimerReadWrite, minTimerReadWrite, avgTimerReadWrite, maxTimerReadWrite, countReadOnly, sumTimerReadOnly, minTimerReadOnly, avgTimerReadOnly, maxTimerReadOnly);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsTransactionsSummaryByThreadByEventName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsTransactionsSummaryByThreadByEventNameResult")
    Optional<EventsTransactionsSummaryByThreadByEventName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsTransactionsSummaryByThreadByEventNameResult", value = {
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COUNT_STAR", property="countStar", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WAIT", property="sumTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WAIT", property="minTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WAIT", property="avgTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WAIT", property="maxTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_READ_WRITE", property="countReadWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_READ_WRITE", property="sumTimerReadWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_READ_WRITE", property="minTimerReadWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_READ_WRITE", property="avgTimerReadWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_READ_WRITE", property="maxTimerReadWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_READ_ONLY", property="countReadOnly", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_READ_ONLY", property="sumTimerReadOnly", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_READ_ONLY", property="minTimerReadOnly", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_READ_ONLY", property="avgTimerReadOnly", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_READ_ONLY", property="maxTimerReadOnly", jdbcType=JdbcType.BIGINT)
    })
    List<EventsTransactionsSummaryByThreadByEventName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsTransactionsSummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsTransactionsSummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default int deleteByPrimaryKey(Long threadId_, String eventName_) {
        return delete(c -> 
            c.where(threadId, isEqualTo(threadId_))
            .and(eventName, isEqualTo(eventName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default int insert(EventsTransactionsSummaryByThreadByEventName record) {
        return MyBatis3Utils.insert(this::insert, record, eventsTransactionsSummaryByThreadByEventName, c ->
            c.map(threadId).toProperty("threadId")
            .map(eventName).toProperty("eventName")
            .map(countStar).toProperty("countStar")
            .map(sumTimerWait).toProperty("sumTimerWait")
            .map(minTimerWait).toProperty("minTimerWait")
            .map(avgTimerWait).toProperty("avgTimerWait")
            .map(maxTimerWait).toProperty("maxTimerWait")
            .map(countReadWrite).toProperty("countReadWrite")
            .map(sumTimerReadWrite).toProperty("sumTimerReadWrite")
            .map(minTimerReadWrite).toProperty("minTimerReadWrite")
            .map(avgTimerReadWrite).toProperty("avgTimerReadWrite")
            .map(maxTimerReadWrite).toProperty("maxTimerReadWrite")
            .map(countReadOnly).toProperty("countReadOnly")
            .map(sumTimerReadOnly).toProperty("sumTimerReadOnly")
            .map(minTimerReadOnly).toProperty("minTimerReadOnly")
            .map(avgTimerReadOnly).toProperty("avgTimerReadOnly")
            .map(maxTimerReadOnly).toProperty("maxTimerReadOnly")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default int insertSelective(EventsTransactionsSummaryByThreadByEventName record) {
        return MyBatis3Utils.insert(this::insert, record, eventsTransactionsSummaryByThreadByEventName, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(countStar).toPropertyWhenPresent("countStar", record::getCountStar)
            .map(sumTimerWait).toPropertyWhenPresent("sumTimerWait", record::getSumTimerWait)
            .map(minTimerWait).toPropertyWhenPresent("minTimerWait", record::getMinTimerWait)
            .map(avgTimerWait).toPropertyWhenPresent("avgTimerWait", record::getAvgTimerWait)
            .map(maxTimerWait).toPropertyWhenPresent("maxTimerWait", record::getMaxTimerWait)
            .map(countReadWrite).toPropertyWhenPresent("countReadWrite", record::getCountReadWrite)
            .map(sumTimerReadWrite).toPropertyWhenPresent("sumTimerReadWrite", record::getSumTimerReadWrite)
            .map(minTimerReadWrite).toPropertyWhenPresent("minTimerReadWrite", record::getMinTimerReadWrite)
            .map(avgTimerReadWrite).toPropertyWhenPresent("avgTimerReadWrite", record::getAvgTimerReadWrite)
            .map(maxTimerReadWrite).toPropertyWhenPresent("maxTimerReadWrite", record::getMaxTimerReadWrite)
            .map(countReadOnly).toPropertyWhenPresent("countReadOnly", record::getCountReadOnly)
            .map(sumTimerReadOnly).toPropertyWhenPresent("sumTimerReadOnly", record::getSumTimerReadOnly)
            .map(minTimerReadOnly).toPropertyWhenPresent("minTimerReadOnly", record::getMinTimerReadOnly)
            .map(avgTimerReadOnly).toPropertyWhenPresent("avgTimerReadOnly", record::getAvgTimerReadOnly)
            .map(maxTimerReadOnly).toPropertyWhenPresent("maxTimerReadOnly", record::getMaxTimerReadOnly)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default Optional<EventsTransactionsSummaryByThreadByEventName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsTransactionsSummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default List<EventsTransactionsSummaryByThreadByEventName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsTransactionsSummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default List<EventsTransactionsSummaryByThreadByEventName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsTransactionsSummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default Optional<EventsTransactionsSummaryByThreadByEventName> selectByPrimaryKey(Long threadId_, String eventName_) {
        return selectOne(c ->
            c.where(threadId, isEqualTo(threadId_))
            .and(eventName, isEqualTo(eventName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsTransactionsSummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsTransactionsSummaryByThreadByEventName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(eventName).equalTo(record::getEventName)
                .set(countStar).equalTo(record::getCountStar)
                .set(sumTimerWait).equalTo(record::getSumTimerWait)
                .set(minTimerWait).equalTo(record::getMinTimerWait)
                .set(avgTimerWait).equalTo(record::getAvgTimerWait)
                .set(maxTimerWait).equalTo(record::getMaxTimerWait)
                .set(countReadWrite).equalTo(record::getCountReadWrite)
                .set(sumTimerReadWrite).equalTo(record::getSumTimerReadWrite)
                .set(minTimerReadWrite).equalTo(record::getMinTimerReadWrite)
                .set(avgTimerReadWrite).equalTo(record::getAvgTimerReadWrite)
                .set(maxTimerReadWrite).equalTo(record::getMaxTimerReadWrite)
                .set(countReadOnly).equalTo(record::getCountReadOnly)
                .set(sumTimerReadOnly).equalTo(record::getSumTimerReadOnly)
                .set(minTimerReadOnly).equalTo(record::getMinTimerReadOnly)
                .set(avgTimerReadOnly).equalTo(record::getAvgTimerReadOnly)
                .set(maxTimerReadOnly).equalTo(record::getMaxTimerReadOnly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsTransactionsSummaryByThreadByEventName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(countStar).equalToWhenPresent(record::getCountStar)
                .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
                .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
                .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
                .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait)
                .set(countReadWrite).equalToWhenPresent(record::getCountReadWrite)
                .set(sumTimerReadWrite).equalToWhenPresent(record::getSumTimerReadWrite)
                .set(minTimerReadWrite).equalToWhenPresent(record::getMinTimerReadWrite)
                .set(avgTimerReadWrite).equalToWhenPresent(record::getAvgTimerReadWrite)
                .set(maxTimerReadWrite).equalToWhenPresent(record::getMaxTimerReadWrite)
                .set(countReadOnly).equalToWhenPresent(record::getCountReadOnly)
                .set(sumTimerReadOnly).equalToWhenPresent(record::getSumTimerReadOnly)
                .set(minTimerReadOnly).equalToWhenPresent(record::getMinTimerReadOnly)
                .set(avgTimerReadOnly).equalToWhenPresent(record::getAvgTimerReadOnly)
                .set(maxTimerReadOnly).equalToWhenPresent(record::getMaxTimerReadOnly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default int updateByPrimaryKey(EventsTransactionsSummaryByThreadByEventName record) {
        return update(c ->
            c.set(countStar).equalTo(record::getCountStar)
            .set(sumTimerWait).equalTo(record::getSumTimerWait)
            .set(minTimerWait).equalTo(record::getMinTimerWait)
            .set(avgTimerWait).equalTo(record::getAvgTimerWait)
            .set(maxTimerWait).equalTo(record::getMaxTimerWait)
            .set(countReadWrite).equalTo(record::getCountReadWrite)
            .set(sumTimerReadWrite).equalTo(record::getSumTimerReadWrite)
            .set(minTimerReadWrite).equalTo(record::getMinTimerReadWrite)
            .set(avgTimerReadWrite).equalTo(record::getAvgTimerReadWrite)
            .set(maxTimerReadWrite).equalTo(record::getMaxTimerReadWrite)
            .set(countReadOnly).equalTo(record::getCountReadOnly)
            .set(sumTimerReadOnly).equalTo(record::getSumTimerReadOnly)
            .set(minTimerReadOnly).equalTo(record::getMinTimerReadOnly)
            .set(avgTimerReadOnly).equalTo(record::getAvgTimerReadOnly)
            .set(maxTimerReadOnly).equalTo(record::getMaxTimerReadOnly)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(eventName, isEqualTo(record::getEventName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2809703+08:00", comments="Source Table: events_transactions_summary_by_thread_by_event_name")
    default int updateByPrimaryKeySelective(EventsTransactionsSummaryByThreadByEventName record) {
        return update(c ->
            c.set(countStar).equalToWhenPresent(record::getCountStar)
            .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
            .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
            .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
            .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait)
            .set(countReadWrite).equalToWhenPresent(record::getCountReadWrite)
            .set(sumTimerReadWrite).equalToWhenPresent(record::getSumTimerReadWrite)
            .set(minTimerReadWrite).equalToWhenPresent(record::getMinTimerReadWrite)
            .set(avgTimerReadWrite).equalToWhenPresent(record::getAvgTimerReadWrite)
            .set(maxTimerReadWrite).equalToWhenPresent(record::getMaxTimerReadWrite)
            .set(countReadOnly).equalToWhenPresent(record::getCountReadOnly)
            .set(sumTimerReadOnly).equalToWhenPresent(record::getSumTimerReadOnly)
            .set(minTimerReadOnly).equalToWhenPresent(record::getMinTimerReadOnly)
            .set(avgTimerReadOnly).equalToWhenPresent(record::getAvgTimerReadOnly)
            .set(maxTimerReadOnly).equalToWhenPresent(record::getMaxTimerReadOnly)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(eventName, isEqualTo(record::getEventName))
        );
    }
}