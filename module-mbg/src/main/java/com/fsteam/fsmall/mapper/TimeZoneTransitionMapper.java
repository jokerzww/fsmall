package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.TimeZoneTransitionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.TimeZoneTransition;
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
public interface TimeZoneTransitionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: time_zone_transition")
    BasicColumn[] selectList = BasicColumn.columnList(timeZoneId, transitionTime, transitionTypeId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TimeZoneTransition> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TimeZoneTransitionResult")
    Optional<TimeZoneTransition> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TimeZoneTransitionResult", value = {
        @Result(column="Time_zone_id", property="timeZoneId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Transition_time", property="transitionTime", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="Transition_type_id", property="transitionTypeId", jdbcType=JdbcType.INTEGER)
    })
    List<TimeZoneTransition> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, timeZoneTransition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, timeZoneTransition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    default int deleteByPrimaryKey(Integer timeZoneId_, Long transitionTime_) {
        return delete(c -> 
            c.where(timeZoneId, isEqualTo(timeZoneId_))
            .and(transitionTime, isEqualTo(transitionTime_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    default int insert(TimeZoneTransition record) {
        return MyBatis3Utils.insert(this::insert, record, timeZoneTransition, c ->
            c.map(timeZoneId).toProperty("timeZoneId")
            .map(transitionTime).toProperty("transitionTime")
            .map(transitionTypeId).toProperty("transitionTypeId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    default int insertSelective(TimeZoneTransition record) {
        return MyBatis3Utils.insert(this::insert, record, timeZoneTransition, c ->
            c.map(timeZoneId).toPropertyWhenPresent("timeZoneId", record::getTimeZoneId)
            .map(transitionTime).toPropertyWhenPresent("transitionTime", record::getTransitionTime)
            .map(transitionTypeId).toPropertyWhenPresent("transitionTypeId", record::getTransitionTypeId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: time_zone_transition")
    default Optional<TimeZoneTransition> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, timeZoneTransition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: time_zone_transition")
    default List<TimeZoneTransition> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, timeZoneTransition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: time_zone_transition")
    default List<TimeZoneTransition> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, timeZoneTransition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: time_zone_transition")
    default Optional<TimeZoneTransition> selectByPrimaryKey(Integer timeZoneId_, Long transitionTime_) {
        return selectOne(c ->
            c.where(timeZoneId, isEqualTo(timeZoneId_))
            .and(transitionTime, isEqualTo(transitionTime_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: time_zone_transition")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, timeZoneTransition, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: time_zone_transition")
    static UpdateDSL<UpdateModel> updateAllColumns(TimeZoneTransition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(timeZoneId).equalTo(record::getTimeZoneId)
                .set(transitionTime).equalTo(record::getTransitionTime)
                .set(transitionTypeId).equalTo(record::getTransitionTypeId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: time_zone_transition")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TimeZoneTransition record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(timeZoneId).equalToWhenPresent(record::getTimeZoneId)
                .set(transitionTime).equalToWhenPresent(record::getTransitionTime)
                .set(transitionTypeId).equalToWhenPresent(record::getTransitionTypeId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: time_zone_transition")
    default int updateByPrimaryKey(TimeZoneTransition record) {
        return update(c ->
            c.set(transitionTypeId).equalTo(record::getTransitionTypeId)
            .where(timeZoneId, isEqualTo(record::getTimeZoneId))
            .and(transitionTime, isEqualTo(record::getTransitionTime))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: time_zone_transition")
    default int updateByPrimaryKeySelective(TimeZoneTransition record) {
        return update(c ->
            c.set(transitionTypeId).equalToWhenPresent(record::getTransitionTypeId)
            .where(timeZoneId, isEqualTo(record::getTimeZoneId))
            .and(transitionTime, isEqualTo(record::getTransitionTime))
        );
    }
}