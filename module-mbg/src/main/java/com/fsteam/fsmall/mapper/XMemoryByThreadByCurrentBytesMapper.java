package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XMemoryByThreadByCurrentBytesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XMemoryByThreadByCurrentBytes;
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
public interface XMemoryByThreadByCurrentBytesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, user, currentCountUsed, currentAllocated, currentAvgAlloc, currentMaxAlloc, totalAllocated);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XMemoryByThreadByCurrentBytes> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XMemoryByThreadByCurrentBytesResult")
    Optional<XMemoryByThreadByCurrentBytes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XMemoryByThreadByCurrentBytesResult", value = {
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="user", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_count_used", property="currentCountUsed", jdbcType=JdbcType.DECIMAL),
        @Result(column="current_allocated", property="currentAllocated", jdbcType=JdbcType.DECIMAL),
        @Result(column="current_avg_alloc", property="currentAvgAlloc", jdbcType=JdbcType.DECIMAL),
        @Result(column="current_max_alloc", property="currentMaxAlloc", jdbcType=JdbcType.BIGINT),
        @Result(column="total_allocated", property="totalAllocated", jdbcType=JdbcType.DECIMAL)
    })
    List<XMemoryByThreadByCurrentBytes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XMemoryByThreadByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XMemoryByThreadByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    default int insert(XMemoryByThreadByCurrentBytes record) {
        return MyBatis3Utils.insert(this::insert, record, XMemoryByThreadByCurrentBytes, c ->
            c.map(threadId).toProperty("threadId")
            .map(user).toProperty("user")
            .map(currentCountUsed).toProperty("currentCountUsed")
            .map(currentAllocated).toProperty("currentAllocated")
            .map(currentAvgAlloc).toProperty("currentAvgAlloc")
            .map(currentMaxAlloc).toProperty("currentMaxAlloc")
            .map(totalAllocated).toProperty("totalAllocated")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    default int insertSelective(XMemoryByThreadByCurrentBytes record) {
        return MyBatis3Utils.insert(this::insert, record, XMemoryByThreadByCurrentBytes, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(currentCountUsed).toPropertyWhenPresent("currentCountUsed", record::getCurrentCountUsed)
            .map(currentAllocated).toPropertyWhenPresent("currentAllocated", record::getCurrentAllocated)
            .map(currentAvgAlloc).toPropertyWhenPresent("currentAvgAlloc", record::getCurrentAvgAlloc)
            .map(currentMaxAlloc).toPropertyWhenPresent("currentMaxAlloc", record::getCurrentMaxAlloc)
            .map(totalAllocated).toPropertyWhenPresent("totalAllocated", record::getTotalAllocated)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    default Optional<XMemoryByThreadByCurrentBytes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XMemoryByThreadByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    default List<XMemoryByThreadByCurrentBytes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XMemoryByThreadByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    default List<XMemoryByThreadByCurrentBytes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XMemoryByThreadByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XMemoryByThreadByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    static UpdateDSL<UpdateModel> updateAllColumns(XMemoryByThreadByCurrentBytes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(user).equalTo(record::getUser)
                .set(currentCountUsed).equalTo(record::getCurrentCountUsed)
                .set(currentAllocated).equalTo(record::getCurrentAllocated)
                .set(currentAvgAlloc).equalTo(record::getCurrentAvgAlloc)
                .set(currentMaxAlloc).equalTo(record::getCurrentMaxAlloc)
                .set(totalAllocated).equalTo(record::getTotalAllocated);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5061769+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XMemoryByThreadByCurrentBytes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(user).equalToWhenPresent(record::getUser)
                .set(currentCountUsed).equalToWhenPresent(record::getCurrentCountUsed)
                .set(currentAllocated).equalToWhenPresent(record::getCurrentAllocated)
                .set(currentAvgAlloc).equalToWhenPresent(record::getCurrentAvgAlloc)
                .set(currentMaxAlloc).equalToWhenPresent(record::getCurrentMaxAlloc)
                .set(totalAllocated).equalToWhenPresent(record::getTotalAllocated);
    }
}