package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.TimeZoneTransitionTypeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.TimeZoneTransitionType;
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
public interface TimeZoneTransitionTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    BasicColumn[] selectList = BasicColumn.columnList(timeZoneId, transitionTypeId, offset, isDst, abbreviation);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TimeZoneTransitionType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TimeZoneTransitionTypeResult")
    Optional<TimeZoneTransitionType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TimeZoneTransitionTypeResult", value = {
        @Result(column="Time_zone_id", property="timeZoneId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Transition_type_id", property="transitionTypeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Offset", property="offset", jdbcType=JdbcType.INTEGER),
        @Result(column="Is_DST", property="isDst", jdbcType=JdbcType.TINYINT),
        @Result(column="Abbreviation", property="abbreviation", jdbcType=JdbcType.CHAR)
    })
    List<TimeZoneTransitionType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, timeZoneTransitionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, timeZoneTransitionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default int deleteByPrimaryKey(Integer timeZoneId_, Integer transitionTypeId_) {
        return delete(c -> 
            c.where(timeZoneId, isEqualTo(timeZoneId_))
            .and(transitionTypeId, isEqualTo(transitionTypeId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default int insert(TimeZoneTransitionType record) {
        return MyBatis3Utils.insert(this::insert, record, timeZoneTransitionType, c ->
            c.map(timeZoneId).toProperty("timeZoneId")
            .map(transitionTypeId).toProperty("transitionTypeId")
            .map(offset).toProperty("offset")
            .map(isDst).toProperty("isDst")
            .map(abbreviation).toProperty("abbreviation")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default int insertSelective(TimeZoneTransitionType record) {
        return MyBatis3Utils.insert(this::insert, record, timeZoneTransitionType, c ->
            c.map(timeZoneId).toPropertyWhenPresent("timeZoneId", record::getTimeZoneId)
            .map(transitionTypeId).toPropertyWhenPresent("transitionTypeId", record::getTransitionTypeId)
            .map(offset).toPropertyWhenPresent("offset", record::getOffset)
            .map(isDst).toPropertyWhenPresent("isDst", record::getIsDst)
            .map(abbreviation).toPropertyWhenPresent("abbreviation", record::getAbbreviation)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default Optional<TimeZoneTransitionType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, timeZoneTransitionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default List<TimeZoneTransitionType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, timeZoneTransitionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default List<TimeZoneTransitionType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, timeZoneTransitionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default Optional<TimeZoneTransitionType> selectByPrimaryKey(Integer timeZoneId_, Integer transitionTypeId_) {
        return selectOne(c ->
            c.where(timeZoneId, isEqualTo(timeZoneId_))
            .and(transitionTypeId, isEqualTo(transitionTypeId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, timeZoneTransitionType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    static UpdateDSL<UpdateModel> updateAllColumns(TimeZoneTransitionType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(timeZoneId).equalTo(record::getTimeZoneId)
                .set(transitionTypeId).equalTo(record::getTransitionTypeId)
                .set(offset).equalTo(record::getOffset)
                .set(isDst).equalTo(record::getIsDst)
                .set(abbreviation).equalTo(record::getAbbreviation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TimeZoneTransitionType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(timeZoneId).equalToWhenPresent(record::getTimeZoneId)
                .set(transitionTypeId).equalToWhenPresent(record::getTransitionTypeId)
                .set(offset).equalToWhenPresent(record::getOffset)
                .set(isDst).equalToWhenPresent(record::getIsDst)
                .set(abbreviation).equalToWhenPresent(record::getAbbreviation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default int updateByPrimaryKey(TimeZoneTransitionType record) {
        return update(c ->
            c.set(offset).equalTo(record::getOffset)
            .set(isDst).equalTo(record::getIsDst)
            .set(abbreviation).equalTo(record::getAbbreviation)
            .where(timeZoneId, isEqualTo(record::getTimeZoneId))
            .and(transitionTypeId, isEqualTo(record::getTransitionTypeId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    default int updateByPrimaryKeySelective(TimeZoneTransitionType record) {
        return update(c ->
            c.set(offset).equalToWhenPresent(record::getOffset)
            .set(isDst).equalToWhenPresent(record::getIsDst)
            .set(abbreviation).equalToWhenPresent(record::getAbbreviation)
            .where(timeZoneId, isEqualTo(record::getTimeZoneId))
            .and(transitionTypeId, isEqualTo(record::getTransitionTypeId))
        );
    }
}