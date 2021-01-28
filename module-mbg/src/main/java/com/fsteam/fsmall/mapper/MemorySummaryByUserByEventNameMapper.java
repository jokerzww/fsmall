package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.MemorySummaryByUserByEventNameDynamicSqlSupport.*;

import com.fsteam.fsmall.model.MemorySummaryByUserByEventName;
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
public interface MemorySummaryByUserByEventNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    BasicColumn[] selectList = BasicColumn.columnList(user, eventName, countAlloc, countFree, sumNumberOfBytesAlloc, sumNumberOfBytesFree, lowCountUsed, currentCountUsed, highCountUsed, lowNumberOfBytesUsed, currentNumberOfBytesUsed, highNumberOfBytesUsed);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MemorySummaryByUserByEventName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MemorySummaryByUserByEventNameResult")
    Optional<MemorySummaryByUserByEventName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MemorySummaryByUserByEventNameResult", value = {
        @Result(column="USER", property="user", jdbcType=JdbcType.CHAR),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
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
    List<MemorySummaryByUserByEventName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, memorySummaryByUserByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, memorySummaryByUserByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    default int insert(MemorySummaryByUserByEventName record) {
        return MyBatis3Utils.insert(this::insert, record, memorySummaryByUserByEventName, c ->
            c.map(user).toProperty("user")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    default int insertSelective(MemorySummaryByUserByEventName record) {
        return MyBatis3Utils.insert(this::insert, record, memorySummaryByUserByEventName, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    default Optional<MemorySummaryByUserByEventName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, memorySummaryByUserByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    default List<MemorySummaryByUserByEventName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, memorySummaryByUserByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    default List<MemorySummaryByUserByEventName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, memorySummaryByUserByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, memorySummaryByUserByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    static UpdateDSL<UpdateModel> updateAllColumns(MemorySummaryByUserByEventName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1038096+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MemorySummaryByUserByEventName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
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
}