package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsWaitsSummaryGlobalByEventNameDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.EventsWaitsSummaryGlobalByEventName;
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
public interface EventsWaitsSummaryGlobalByEventNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    BasicColumn[] selectList = BasicColumn.columnList(eventName, countStar, sumTimerWait, minTimerWait, avgTimerWait, maxTimerWait);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4981686+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4981686+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4981686+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsWaitsSummaryGlobalByEventName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4981686+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsWaitsSummaryGlobalByEventNameResult")
    Optional<EventsWaitsSummaryGlobalByEventName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4981686+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsWaitsSummaryGlobalByEventNameResult", value = {
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COUNT_STAR", property="countStar", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WAIT", property="sumTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WAIT", property="minTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WAIT", property="avgTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WAIT", property="maxTimerWait", jdbcType=JdbcType.BIGINT)
    })
    List<EventsWaitsSummaryGlobalByEventName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4981686+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4981686+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsWaitsSummaryGlobalByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4981686+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsWaitsSummaryGlobalByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default int deleteByPrimaryKey(String eventName_) {
        return delete(c -> 
            c.where(eventName, isEqualTo(eventName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default int insert(EventsWaitsSummaryGlobalByEventName record) {
        return MyBatis3Utils.insert(this::insert, record, eventsWaitsSummaryGlobalByEventName, c ->
            c.map(eventName).toProperty("eventName")
            .map(countStar).toProperty("countStar")
            .map(sumTimerWait).toProperty("sumTimerWait")
            .map(minTimerWait).toProperty("minTimerWait")
            .map(avgTimerWait).toProperty("avgTimerWait")
            .map(maxTimerWait).toProperty("maxTimerWait")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default int insertSelective(EventsWaitsSummaryGlobalByEventName record) {
        return MyBatis3Utils.insert(this::insert, record, eventsWaitsSummaryGlobalByEventName, c ->
            c.map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(countStar).toPropertyWhenPresent("countStar", record::getCountStar)
            .map(sumTimerWait).toPropertyWhenPresent("sumTimerWait", record::getSumTimerWait)
            .map(minTimerWait).toPropertyWhenPresent("minTimerWait", record::getMinTimerWait)
            .map(avgTimerWait).toPropertyWhenPresent("avgTimerWait", record::getAvgTimerWait)
            .map(maxTimerWait).toPropertyWhenPresent("maxTimerWait", record::getMaxTimerWait)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default Optional<EventsWaitsSummaryGlobalByEventName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsWaitsSummaryGlobalByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default List<EventsWaitsSummaryGlobalByEventName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsWaitsSummaryGlobalByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default List<EventsWaitsSummaryGlobalByEventName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsWaitsSummaryGlobalByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default Optional<EventsWaitsSummaryGlobalByEventName> selectByPrimaryKey(String eventName_) {
        return selectOne(c ->
            c.where(eventName, isEqualTo(eventName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsWaitsSummaryGlobalByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsWaitsSummaryGlobalByEventName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventName).equalTo(record::getEventName)
                .set(countStar).equalTo(record::getCountStar)
                .set(sumTimerWait).equalTo(record::getSumTimerWait)
                .set(minTimerWait).equalTo(record::getMinTimerWait)
                .set(avgTimerWait).equalTo(record::getAvgTimerWait)
                .set(maxTimerWait).equalTo(record::getMaxTimerWait);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsWaitsSummaryGlobalByEventName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventName).equalToWhenPresent(record::getEventName)
                .set(countStar).equalToWhenPresent(record::getCountStar)
                .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
                .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
                .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
                .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default int updateByPrimaryKey(EventsWaitsSummaryGlobalByEventName record) {
        return update(c ->
            c.set(countStar).equalTo(record::getCountStar)
            .set(sumTimerWait).equalTo(record::getSumTimerWait)
            .set(minTimerWait).equalTo(record::getMinTimerWait)
            .set(avgTimerWait).equalTo(record::getAvgTimerWait)
            .set(maxTimerWait).equalTo(record::getMaxTimerWait)
            .where(eventName, isEqualTo(record::getEventName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: events_waits_summary_global_by_event_name")
    default int updateByPrimaryKeySelective(EventsWaitsSummaryGlobalByEventName record) {
        return update(c ->
            c.set(countStar).equalToWhenPresent(record::getCountStar)
            .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
            .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
            .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
            .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait)
            .where(eventName, isEqualTo(record::getEventName))
        );
    }
}