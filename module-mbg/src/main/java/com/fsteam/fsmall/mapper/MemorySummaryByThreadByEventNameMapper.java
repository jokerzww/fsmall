package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.MemorySummaryByThreadByEventNameDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.MemorySummaryByThreadByEventName;
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
public interface MemorySummaryByThreadByEventNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, eventName, countAlloc, countFree, sumNumberOfBytesAlloc, sumNumberOfBytesFree, lowCountUsed, currentCountUsed, highCountUsed, lowNumberOfBytesUsed, currentNumberOfBytesUsed, highNumberOfBytesUsed);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MemorySummaryByThreadByEventName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MemorySummaryByThreadByEventNameResult")
    Optional<MemorySummaryByThreadByEventName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MemorySummaryByThreadByEventNameResult", value = {
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COUNT_ALLOC", property="countAlloc", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_FREE", property="countFree", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_NUMBER_OF_BYTES_ALLOC", property="sumNumberOfBytesAlloc", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_NUMBER_OF_BYTES_FREE", property="sumNumberOfBytesFree", jdbcType=JdbcType.BIGINT),
        @Result(column="LOW_COUNT_USED", property="lowCountUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="CURRENT_COUNT_USED", property="currentCountUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="HIGH_COUNT_USED", property="highCountUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="LOW_NUMBER_OF_BYTES_USED", property="lowNumberOfBytesUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="CURRENT_NUMBER_OF_BYTES_USED", property="currentNumberOfBytesUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="HIGH_NUMBER_OF_BYTES_USED", property="highNumberOfBytesUsed", jdbcType=JdbcType.BIGINT)
    })
    List<MemorySummaryByThreadByEventName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, memorySummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, memorySummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default int deleteByPrimaryKey(Long threadId_, String eventName_) {
        return delete(c -> 
            c.where(threadId, isEqualTo(threadId_))
            .and(eventName, isEqualTo(eventName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default int insert(MemorySummaryByThreadByEventName record) {
        return MyBatis3Utils.insert(this::insert, record, memorySummaryByThreadByEventName, c ->
            c.map(threadId).toProperty("threadId")
            .map(eventName).toProperty("eventName")
            .map(countAlloc).toProperty("countAlloc")
            .map(countFree).toProperty("countFree")
            .map(sumNumberOfBytesAlloc).toProperty("sumNumberOfBytesAlloc")
            .map(sumNumberOfBytesFree).toProperty("sumNumberOfBytesFree")
            .map(lowCountUsed).toProperty("lowCountUsed")
            .map(currentCountUsed).toProperty("currentCountUsed")
            .map(highCountUsed).toProperty("highCountUsed")
            .map(lowNumberOfBytesUsed).toProperty("lowNumberOfBytesUsed")
            .map(currentNumberOfBytesUsed).toProperty("currentNumberOfBytesUsed")
            .map(highNumberOfBytesUsed).toProperty("highNumberOfBytesUsed")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default int insertSelective(MemorySummaryByThreadByEventName record) {
        return MyBatis3Utils.insert(this::insert, record, memorySummaryByThreadByEventName, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(countAlloc).toPropertyWhenPresent("countAlloc", record::getCountAlloc)
            .map(countFree).toPropertyWhenPresent("countFree", record::getCountFree)
            .map(sumNumberOfBytesAlloc).toPropertyWhenPresent("sumNumberOfBytesAlloc", record::getSumNumberOfBytesAlloc)
            .map(sumNumberOfBytesFree).toPropertyWhenPresent("sumNumberOfBytesFree", record::getSumNumberOfBytesFree)
            .map(lowCountUsed).toPropertyWhenPresent("lowCountUsed", record::getLowCountUsed)
            .map(currentCountUsed).toPropertyWhenPresent("currentCountUsed", record::getCurrentCountUsed)
            .map(highCountUsed).toPropertyWhenPresent("highCountUsed", record::getHighCountUsed)
            .map(lowNumberOfBytesUsed).toPropertyWhenPresent("lowNumberOfBytesUsed", record::getLowNumberOfBytesUsed)
            .map(currentNumberOfBytesUsed).toPropertyWhenPresent("currentNumberOfBytesUsed", record::getCurrentNumberOfBytesUsed)
            .map(highNumberOfBytesUsed).toPropertyWhenPresent("highNumberOfBytesUsed", record::getHighNumberOfBytesUsed)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default Optional<MemorySummaryByThreadByEventName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, memorySummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default List<MemorySummaryByThreadByEventName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, memorySummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default List<MemorySummaryByThreadByEventName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, memorySummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default Optional<MemorySummaryByThreadByEventName> selectByPrimaryKey(Long threadId_, String eventName_) {
        return selectOne(c ->
            c.where(threadId, isEqualTo(threadId_))
            .and(eventName, isEqualTo(eventName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, memorySummaryByThreadByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    static UpdateDSL<UpdateModel> updateAllColumns(MemorySummaryByThreadByEventName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(eventName).equalTo(record::getEventName)
                .set(countAlloc).equalTo(record::getCountAlloc)
                .set(countFree).equalTo(record::getCountFree)
                .set(sumNumberOfBytesAlloc).equalTo(record::getSumNumberOfBytesAlloc)
                .set(sumNumberOfBytesFree).equalTo(record::getSumNumberOfBytesFree)
                .set(lowCountUsed).equalTo(record::getLowCountUsed)
                .set(currentCountUsed).equalTo(record::getCurrentCountUsed)
                .set(highCountUsed).equalTo(record::getHighCountUsed)
                .set(lowNumberOfBytesUsed).equalTo(record::getLowNumberOfBytesUsed)
                .set(currentNumberOfBytesUsed).equalTo(record::getCurrentNumberOfBytesUsed)
                .set(highNumberOfBytesUsed).equalTo(record::getHighNumberOfBytesUsed);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MemorySummaryByThreadByEventName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(countAlloc).equalToWhenPresent(record::getCountAlloc)
                .set(countFree).equalToWhenPresent(record::getCountFree)
                .set(sumNumberOfBytesAlloc).equalToWhenPresent(record::getSumNumberOfBytesAlloc)
                .set(sumNumberOfBytesFree).equalToWhenPresent(record::getSumNumberOfBytesFree)
                .set(lowCountUsed).equalToWhenPresent(record::getLowCountUsed)
                .set(currentCountUsed).equalToWhenPresent(record::getCurrentCountUsed)
                .set(highCountUsed).equalToWhenPresent(record::getHighCountUsed)
                .set(lowNumberOfBytesUsed).equalToWhenPresent(record::getLowNumberOfBytesUsed)
                .set(currentNumberOfBytesUsed).equalToWhenPresent(record::getCurrentNumberOfBytesUsed)
                .set(highNumberOfBytesUsed).equalToWhenPresent(record::getHighNumberOfBytesUsed);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default int updateByPrimaryKey(MemorySummaryByThreadByEventName record) {
        return update(c ->
            c.set(countAlloc).equalTo(record::getCountAlloc)
            .set(countFree).equalTo(record::getCountFree)
            .set(sumNumberOfBytesAlloc).equalTo(record::getSumNumberOfBytesAlloc)
            .set(sumNumberOfBytesFree).equalTo(record::getSumNumberOfBytesFree)
            .set(lowCountUsed).equalTo(record::getLowCountUsed)
            .set(currentCountUsed).equalTo(record::getCurrentCountUsed)
            .set(highCountUsed).equalTo(record::getHighCountUsed)
            .set(lowNumberOfBytesUsed).equalTo(record::getLowNumberOfBytesUsed)
            .set(currentNumberOfBytesUsed).equalTo(record::getCurrentNumberOfBytesUsed)
            .set(highNumberOfBytesUsed).equalTo(record::getHighNumberOfBytesUsed)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(eventName, isEqualTo(record::getEventName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source Table: memory_summary_by_thread_by_event_name")
    default int updateByPrimaryKeySelective(MemorySummaryByThreadByEventName record) {
        return update(c ->
            c.set(countAlloc).equalToWhenPresent(record::getCountAlloc)
            .set(countFree).equalToWhenPresent(record::getCountFree)
            .set(sumNumberOfBytesAlloc).equalToWhenPresent(record::getSumNumberOfBytesAlloc)
            .set(sumNumberOfBytesFree).equalToWhenPresent(record::getSumNumberOfBytesFree)
            .set(lowCountUsed).equalToWhenPresent(record::getLowCountUsed)
            .set(currentCountUsed).equalToWhenPresent(record::getCurrentCountUsed)
            .set(highCountUsed).equalToWhenPresent(record::getHighCountUsed)
            .set(lowNumberOfBytesUsed).equalToWhenPresent(record::getLowNumberOfBytesUsed)
            .set(currentNumberOfBytesUsed).equalToWhenPresent(record::getCurrentNumberOfBytesUsed)
            .set(highNumberOfBytesUsed).equalToWhenPresent(record::getHighNumberOfBytesUsed)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(eventName, isEqualTo(record::getEventName))
        );
    }
}