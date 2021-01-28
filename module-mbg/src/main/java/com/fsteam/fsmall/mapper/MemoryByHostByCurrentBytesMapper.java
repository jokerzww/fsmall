package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.MemoryByHostByCurrentBytesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.MemoryByHostByCurrentBytes;
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
public interface MemoryByHostByCurrentBytesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    BasicColumn[] selectList = BasicColumn.columnList(host, currentCountUsed, currentAllocated, currentAvgAlloc, currentMaxAlloc, totalAllocated);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MemoryByHostByCurrentBytes> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MemoryByHostByCurrentBytesResult")
    Optional<MemoryByHostByCurrentBytes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MemoryByHostByCurrentBytesResult", value = {
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_count_used", property="currentCountUsed", jdbcType=JdbcType.DECIMAL),
        @Result(column="current_allocated", property="currentAllocated", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_avg_alloc", property="currentAvgAlloc", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_max_alloc", property="currentMaxAlloc", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_allocated", property="totalAllocated", jdbcType=JdbcType.VARCHAR)
    })
    List<MemoryByHostByCurrentBytes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, memoryByHostByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, memoryByHostByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    default int insert(MemoryByHostByCurrentBytes record) {
        return MyBatis3Utils.insert(this::insert, record, memoryByHostByCurrentBytes, c ->
            c.map(host).toProperty("host")
            .map(currentCountUsed).toProperty("currentCountUsed")
            .map(currentAllocated).toProperty("currentAllocated")
            .map(currentAvgAlloc).toProperty("currentAvgAlloc")
            .map(currentMaxAlloc).toProperty("currentMaxAlloc")
            .map(totalAllocated).toProperty("totalAllocated")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    default int insertSelective(MemoryByHostByCurrentBytes record) {
        return MyBatis3Utils.insert(this::insert, record, memoryByHostByCurrentBytes, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(currentCountUsed).toPropertyWhenPresent("currentCountUsed", record::getCurrentCountUsed)
            .map(currentAllocated).toPropertyWhenPresent("currentAllocated", record::getCurrentAllocated)
            .map(currentAvgAlloc).toPropertyWhenPresent("currentAvgAlloc", record::getCurrentAvgAlloc)
            .map(currentMaxAlloc).toPropertyWhenPresent("currentMaxAlloc", record::getCurrentMaxAlloc)
            .map(totalAllocated).toPropertyWhenPresent("totalAllocated", record::getTotalAllocated)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1858866+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    default Optional<MemoryByHostByCurrentBytes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, memoryByHostByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    default List<MemoryByHostByCurrentBytes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, memoryByHostByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    default List<MemoryByHostByCurrentBytes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, memoryByHostByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, memoryByHostByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    static UpdateDSL<UpdateModel> updateAllColumns(MemoryByHostByCurrentBytes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(currentCountUsed).equalTo(record::getCurrentCountUsed)
                .set(currentAllocated).equalTo(record::getCurrentAllocated)
                .set(currentAvgAlloc).equalTo(record::getCurrentAvgAlloc)
                .set(currentMaxAlloc).equalTo(record::getCurrentMaxAlloc)
                .set(totalAllocated).equalTo(record::getTotalAllocated);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source Table: memory_by_host_by_current_bytes")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MemoryByHostByCurrentBytes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(currentCountUsed).equalToWhenPresent(record::getCurrentCountUsed)
                .set(currentAllocated).equalToWhenPresent(record::getCurrentAllocated)
                .set(currentAvgAlloc).equalToWhenPresent(record::getCurrentAvgAlloc)
                .set(currentMaxAlloc).equalToWhenPresent(record::getCurrentMaxAlloc)
                .set(totalAllocated).equalToWhenPresent(record::getTotalAllocated);
    }
}