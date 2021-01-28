package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.WaitClassesGlobalByLatencyDynamicSqlSupport.*;

import com.fsteam.fsmall.model.WaitClassesGlobalByLatency;
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
public interface WaitClassesGlobalByLatencyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    BasicColumn[] selectList = BasicColumn.columnList(eventClass, total, totalLatency, minLatency, avgLatency, maxLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WaitClassesGlobalByLatency> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WaitClassesGlobalByLatencyResult")
    Optional<WaitClassesGlobalByLatency> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WaitClassesGlobalByLatencyResult", value = {
        @Result(column="event_class", property="eventClass", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="min_latency", property="minLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="avg_latency", property="avgLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_latency", property="maxLatency", jdbcType=JdbcType.VARCHAR)
    })
    List<WaitClassesGlobalByLatency> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, waitClassesGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, waitClassesGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    default int insert(WaitClassesGlobalByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, waitClassesGlobalByLatency, c ->
            c.map(eventClass).toProperty("eventClass")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(minLatency).toProperty("minLatency")
            .map(avgLatency).toProperty("avgLatency")
            .map(maxLatency).toProperty("maxLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    default int insertSelective(WaitClassesGlobalByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, waitClassesGlobalByLatency, c ->
            c.map(eventClass).toPropertyWhenPresent("eventClass", record::getEventClass)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(minLatency).toPropertyWhenPresent("minLatency", record::getMinLatency)
            .map(avgLatency).toPropertyWhenPresent("avgLatency", record::getAvgLatency)
            .map(maxLatency).toPropertyWhenPresent("maxLatency", record::getMaxLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    default Optional<WaitClassesGlobalByLatency> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, waitClassesGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    default List<WaitClassesGlobalByLatency> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, waitClassesGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0837909+08:00", comments="Source Table: wait_classes_global_by_latency")
    default List<WaitClassesGlobalByLatency> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, waitClassesGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0847924+08:00", comments="Source Table: wait_classes_global_by_latency")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, waitClassesGlobalByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0847924+08:00", comments="Source Table: wait_classes_global_by_latency")
    static UpdateDSL<UpdateModel> updateAllColumns(WaitClassesGlobalByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventClass).equalTo(record::getEventClass)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(minLatency).equalTo(record::getMinLatency)
                .set(avgLatency).equalTo(record::getAvgLatency)
                .set(maxLatency).equalTo(record::getMaxLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0847924+08:00", comments="Source Table: wait_classes_global_by_latency")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(WaitClassesGlobalByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventClass).equalToWhenPresent(record::getEventClass)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(minLatency).equalToWhenPresent(record::getMinLatency)
                .set(avgLatency).equalToWhenPresent(record::getAvgLatency)
                .set(maxLatency).equalToWhenPresent(record::getMaxLatency);
    }
}