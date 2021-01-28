package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XMemoryGlobalByCurrentBytesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XMemoryGlobalByCurrentBytes;
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
public interface XMemoryGlobalByCurrentBytesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    BasicColumn[] selectList = BasicColumn.columnList(eventName, currentCount, currentAlloc, currentAvgAlloc, highCount, highAlloc, highAvgAlloc);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XMemoryGlobalByCurrentBytes> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XMemoryGlobalByCurrentBytesResult")
    Optional<XMemoryGlobalByCurrentBytes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XMemoryGlobalByCurrentBytesResult", value = {
        @Result(column="event_name", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_count", property="currentCount", jdbcType=JdbcType.BIGINT),
        @Result(column="current_alloc", property="currentAlloc", jdbcType=JdbcType.BIGINT),
        @Result(column="current_avg_alloc", property="currentAvgAlloc", jdbcType=JdbcType.DECIMAL),
        @Result(column="high_count", property="highCount", jdbcType=JdbcType.BIGINT),
        @Result(column="high_alloc", property="highAlloc", jdbcType=JdbcType.BIGINT),
        @Result(column="high_avg_alloc", property="highAvgAlloc", jdbcType=JdbcType.DECIMAL)
    })
    List<XMemoryGlobalByCurrentBytes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XMemoryGlobalByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XMemoryGlobalByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    default int insert(XMemoryGlobalByCurrentBytes record) {
        return MyBatis3Utils.insert(this::insert, record, XMemoryGlobalByCurrentBytes, c ->
            c.map(eventName).toProperty("eventName")
            .map(currentCount).toProperty("currentCount")
            .map(currentAlloc).toProperty("currentAlloc")
            .map(currentAvgAlloc).toProperty("currentAvgAlloc")
            .map(highCount).toProperty("highCount")
            .map(highAlloc).toProperty("highAlloc")
            .map(highAvgAlloc).toProperty("highAvgAlloc")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    default int insertSelective(XMemoryGlobalByCurrentBytes record) {
        return MyBatis3Utils.insert(this::insert, record, XMemoryGlobalByCurrentBytes, c ->
            c.map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(currentCount).toPropertyWhenPresent("currentCount", record::getCurrentCount)
            .map(currentAlloc).toPropertyWhenPresent("currentAlloc", record::getCurrentAlloc)
            .map(currentAvgAlloc).toPropertyWhenPresent("currentAvgAlloc", record::getCurrentAvgAlloc)
            .map(highCount).toPropertyWhenPresent("highCount", record::getHighCount)
            .map(highAlloc).toPropertyWhenPresent("highAlloc", record::getHighAlloc)
            .map(highAvgAlloc).toPropertyWhenPresent("highAvgAlloc", record::getHighAvgAlloc)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    default Optional<XMemoryGlobalByCurrentBytes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XMemoryGlobalByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    default List<XMemoryGlobalByCurrentBytes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XMemoryGlobalByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    default List<XMemoryGlobalByCurrentBytes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XMemoryGlobalByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XMemoryGlobalByCurrentBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    static UpdateDSL<UpdateModel> updateAllColumns(XMemoryGlobalByCurrentBytes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventName).equalTo(record::getEventName)
                .set(currentCount).equalTo(record::getCurrentCount)
                .set(currentAlloc).equalTo(record::getCurrentAlloc)
                .set(currentAvgAlloc).equalTo(record::getCurrentAvgAlloc)
                .set(highCount).equalTo(record::getHighCount)
                .set(highAlloc).equalTo(record::getHighAlloc)
                .set(highAvgAlloc).equalTo(record::getHighAvgAlloc);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XMemoryGlobalByCurrentBytes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventName).equalToWhenPresent(record::getEventName)
                .set(currentCount).equalToWhenPresent(record::getCurrentCount)
                .set(currentAlloc).equalToWhenPresent(record::getCurrentAlloc)
                .set(currentAvgAlloc).equalToWhenPresent(record::getCurrentAvgAlloc)
                .set(highCount).equalToWhenPresent(record::getHighCount)
                .set(highAlloc).equalToWhenPresent(record::getHighAlloc)
                .set(highAvgAlloc).equalToWhenPresent(record::getHighAvgAlloc);
    }
}