package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.PerformanceTimersDynamicSqlSupport.*;

import com.fsteam.fsmall.model.PerformanceTimers;
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
public interface PerformanceTimersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    BasicColumn[] selectList = BasicColumn.columnList(timerName, timerFrequency, timerResolution, timerOverhead);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PerformanceTimers> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PerformanceTimersResult")
    Optional<PerformanceTimers> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PerformanceTimersResult", value = {
        @Result(column="TIMER_NAME", property="timerName", jdbcType=JdbcType.CHAR),
        @Result(column="TIMER_FREQUENCY", property="timerFrequency", jdbcType=JdbcType.BIGINT),
        @Result(column="TIMER_RESOLUTION", property="timerResolution", jdbcType=JdbcType.BIGINT),
        @Result(column="TIMER_OVERHEAD", property="timerOverhead", jdbcType=JdbcType.BIGINT)
    })
    List<PerformanceTimers> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, performanceTimers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, performanceTimers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    default int insert(PerformanceTimers record) {
        return MyBatis3Utils.insert(this::insert, record, performanceTimers, c ->
            c.map(timerName).toProperty("timerName")
            .map(timerFrequency).toProperty("timerFrequency")
            .map(timerResolution).toProperty("timerResolution")
            .map(timerOverhead).toProperty("timerOverhead")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    default int insertSelective(PerformanceTimers record) {
        return MyBatis3Utils.insert(this::insert, record, performanceTimers, c ->
            c.map(timerName).toPropertyWhenPresent("timerName", record::getTimerName)
            .map(timerFrequency).toPropertyWhenPresent("timerFrequency", record::getTimerFrequency)
            .map(timerResolution).toPropertyWhenPresent("timerResolution", record::getTimerResolution)
            .map(timerOverhead).toPropertyWhenPresent("timerOverhead", record::getTimerOverhead)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    default Optional<PerformanceTimers> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, performanceTimers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    default List<PerformanceTimers> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, performanceTimers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    default List<PerformanceTimers> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, performanceTimers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, performanceTimers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    static UpdateDSL<UpdateModel> updateAllColumns(PerformanceTimers record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(timerName).equalTo(record::getTimerName)
                .set(timerFrequency).equalTo(record::getTimerFrequency)
                .set(timerResolution).equalTo(record::getTimerResolution)
                .set(timerOverhead).equalTo(record::getTimerOverhead);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PerformanceTimers record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(timerName).equalToWhenPresent(record::getTimerName)
                .set(timerFrequency).equalToWhenPresent(record::getTimerFrequency)
                .set(timerResolution).equalToWhenPresent(record::getTimerResolution)
                .set(timerOverhead).equalToWhenPresent(record::getTimerOverhead);
    }
}