package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsErrorsSummaryByThreadByErrorDynamicSqlSupport.*;

import com.fsteam.fsmall.model.EventsErrorsSummaryByThreadByError;
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
public interface EventsErrorsSummaryByThreadByErrorMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, errorNumber, errorName, sqlState, sumErrorRaised, sumErrorHandled, firstSeen, lastSeen);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsErrorsSummaryByThreadByError> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsErrorsSummaryByThreadByErrorResult")
    Optional<EventsErrorsSummaryByThreadByError> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsErrorsSummaryByThreadByErrorResult", value = {
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="ERROR_NUMBER", property="errorNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="ERROR_NAME", property="errorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SQL_STATE", property="sqlState", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUM_ERROR_RAISED", property="sumErrorRaised", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_ERROR_HANDLED", property="sumErrorHandled", jdbcType=JdbcType.BIGINT),
        @Result(column="FIRST_SEEN", property="firstSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_SEEN", property="lastSeen", jdbcType=JdbcType.TIMESTAMP)
    })
    List<EventsErrorsSummaryByThreadByError> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsErrorsSummaryByThreadByError, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsErrorsSummaryByThreadByError, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    default int insert(EventsErrorsSummaryByThreadByError record) {
        return MyBatis3Utils.insert(this::insert, record, eventsErrorsSummaryByThreadByError, c ->
            c.map(threadId).toProperty("threadId")
            .map(errorNumber).toProperty("errorNumber")
            .map(errorName).toProperty("errorName")
            .map(sqlState).toProperty("sqlState")
            .map(sumErrorRaised).toProperty("sumErrorRaised")
            .map(sumErrorHandled).toProperty("sumErrorHandled")
            .map(firstSeen).toProperty("firstSeen")
            .map(lastSeen).toProperty("lastSeen")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    default int insertSelective(EventsErrorsSummaryByThreadByError record) {
        return MyBatis3Utils.insert(this::insert, record, eventsErrorsSummaryByThreadByError, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(errorNumber).toPropertyWhenPresent("errorNumber", record::getErrorNumber)
            .map(errorName).toPropertyWhenPresent("errorName", record::getErrorName)
            .map(sqlState).toPropertyWhenPresent("sqlState", record::getSqlState)
            .map(sumErrorRaised).toPropertyWhenPresent("sumErrorRaised", record::getSumErrorRaised)
            .map(sumErrorHandled).toPropertyWhenPresent("sumErrorHandled", record::getSumErrorHandled)
            .map(firstSeen).toPropertyWhenPresent("firstSeen", record::getFirstSeen)
            .map(lastSeen).toPropertyWhenPresent("lastSeen", record::getLastSeen)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    default Optional<EventsErrorsSummaryByThreadByError> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsErrorsSummaryByThreadByError, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    default List<EventsErrorsSummaryByThreadByError> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsErrorsSummaryByThreadByError, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    default List<EventsErrorsSummaryByThreadByError> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsErrorsSummaryByThreadByError, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsErrorsSummaryByThreadByError, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsErrorsSummaryByThreadByError record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(errorNumber).equalTo(record::getErrorNumber)
                .set(errorName).equalTo(record::getErrorName)
                .set(sqlState).equalTo(record::getSqlState)
                .set(sumErrorRaised).equalTo(record::getSumErrorRaised)
                .set(sumErrorHandled).equalTo(record::getSumErrorHandled)
                .set(firstSeen).equalTo(record::getFirstSeen)
                .set(lastSeen).equalTo(record::getLastSeen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source Table: events_errors_summary_by_thread_by_error")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsErrorsSummaryByThreadByError record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(errorNumber).equalToWhenPresent(record::getErrorNumber)
                .set(errorName).equalToWhenPresent(record::getErrorName)
                .set(sqlState).equalToWhenPresent(record::getSqlState)
                .set(sumErrorRaised).equalToWhenPresent(record::getSumErrorRaised)
                .set(sumErrorHandled).equalToWhenPresent(record::getSumErrorHandled)
                .set(firstSeen).equalToWhenPresent(record::getFirstSeen)
                .set(lastSeen).equalToWhenPresent(record::getLastSeen);
    }
}