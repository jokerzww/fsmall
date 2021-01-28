package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.TimeZoneLeapSecondDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.TimeZoneLeapSecond;
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
public interface TimeZoneLeapSecondMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    BasicColumn[] selectList = BasicColumn.columnList(transitionTime, correction);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TimeZoneLeapSecond> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TimeZoneLeapSecondResult")
    Optional<TimeZoneLeapSecond> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TimeZoneLeapSecondResult", value = {
        @Result(column="Transition_time", property="transitionTime", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="Correction", property="correction", jdbcType=JdbcType.INTEGER)
    })
    List<TimeZoneLeapSecond> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, timeZoneLeapSecond, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, timeZoneLeapSecond, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default int deleteByPrimaryKey(Long transitionTime_) {
        return delete(c -> 
            c.where(transitionTime, isEqualTo(transitionTime_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default int insert(TimeZoneLeapSecond record) {
        return MyBatis3Utils.insert(this::insert, record, timeZoneLeapSecond, c ->
            c.map(transitionTime).toProperty("transitionTime")
            .map(correction).toProperty("correction")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default int insertSelective(TimeZoneLeapSecond record) {
        return MyBatis3Utils.insert(this::insert, record, timeZoneLeapSecond, c ->
            c.map(transitionTime).toPropertyWhenPresent("transitionTime", record::getTransitionTime)
            .map(correction).toPropertyWhenPresent("correction", record::getCorrection)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default Optional<TimeZoneLeapSecond> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, timeZoneLeapSecond, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default List<TimeZoneLeapSecond> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, timeZoneLeapSecond, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default List<TimeZoneLeapSecond> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, timeZoneLeapSecond, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default Optional<TimeZoneLeapSecond> selectByPrimaryKey(Long transitionTime_) {
        return selectOne(c ->
            c.where(transitionTime, isEqualTo(transitionTime_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, timeZoneLeapSecond, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    static UpdateDSL<UpdateModel> updateAllColumns(TimeZoneLeapSecond record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(transitionTime).equalTo(record::getTransitionTime)
                .set(correction).equalTo(record::getCorrection);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TimeZoneLeapSecond record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(transitionTime).equalToWhenPresent(record::getTransitionTime)
                .set(correction).equalToWhenPresent(record::getCorrection);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default int updateByPrimaryKey(TimeZoneLeapSecond record) {
        return update(c ->
            c.set(correction).equalTo(record::getCorrection)
            .where(transitionTime, isEqualTo(record::getTransitionTime))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    default int updateByPrimaryKeySelective(TimeZoneLeapSecond record) {
        return update(c ->
            c.set(correction).equalToWhenPresent(record::getCorrection)
            .where(transitionTime, isEqualTo(record::getTransitionTime))
        );
    }
}