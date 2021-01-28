package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XWaitsGlobalByLatencyDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XWaitsGlobalByLatency;
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
public interface XWaitsGlobalByLatencyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    BasicColumn[] selectList = BasicColumn.columnList(events, total, totalLatency, avgLatency, maxLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source Table: x$waits_global_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source Table: x$waits_global_by_latency")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source Table: x$waits_global_by_latency")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XWaitsGlobalByLatency> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XWaitsGlobalByLatencyResult")
    Optional<XWaitsGlobalByLatency> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XWaitsGlobalByLatencyResult", value = {
        @Result(column="events", property="events", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_latency", property="avgLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="max_latency", property="maxLatency", jdbcType=JdbcType.BIGINT)
    })
    List<XWaitsGlobalByLatency> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XWaitsGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XWaitsGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    default int insert(XWaitsGlobalByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, XWaitsGlobalByLatency, c ->
            c.map(events).toProperty("events")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(avgLatency).toProperty("avgLatency")
            .map(maxLatency).toProperty("maxLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    default int insertSelective(XWaitsGlobalByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, XWaitsGlobalByLatency, c ->
            c.map(events).toPropertyWhenPresent("events", record::getEvents)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(avgLatency).toPropertyWhenPresent("avgLatency", record::getAvgLatency)
            .map(maxLatency).toPropertyWhenPresent("maxLatency", record::getMaxLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    default Optional<XWaitsGlobalByLatency> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XWaitsGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    default List<XWaitsGlobalByLatency> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XWaitsGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    default List<XWaitsGlobalByLatency> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XWaitsGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XWaitsGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    static UpdateDSL<UpdateModel> updateAllColumns(XWaitsGlobalByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(events).equalTo(record::getEvents)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(avgLatency).equalTo(record::getAvgLatency)
                .set(maxLatency).equalTo(record::getMaxLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: x$waits_global_by_latency")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XWaitsGlobalByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(events).equalToWhenPresent(record::getEvents)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(avgLatency).equalToWhenPresent(record::getAvgLatency)
                .set(maxLatency).equalToWhenPresent(record::getMaxLatency);
    }
}