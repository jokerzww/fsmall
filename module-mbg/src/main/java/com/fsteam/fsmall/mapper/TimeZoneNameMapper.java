package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.TimeZoneNameDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.TimeZoneName;
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
public interface TimeZoneNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    BasicColumn[] selectList = BasicColumn.columnList(name, timeZoneId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TimeZoneName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TimeZoneNameResult")
    Optional<TimeZoneName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TimeZoneNameResult", value = {
        @Result(column="Name", property="name", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Time_zone_id", property="timeZoneId", jdbcType=JdbcType.INTEGER)
    })
    List<TimeZoneName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, timeZoneName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, timeZoneName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default int deleteByPrimaryKey(String name_) {
        return delete(c -> 
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default int insert(TimeZoneName record) {
        return MyBatis3Utils.insert(this::insert, record, timeZoneName, c ->
            c.map(name).toProperty("name")
            .map(timeZoneId).toProperty("timeZoneId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default int insertSelective(TimeZoneName record) {
        return MyBatis3Utils.insert(this::insert, record, timeZoneName, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(timeZoneId).toPropertyWhenPresent("timeZoneId", record::getTimeZoneId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default Optional<TimeZoneName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, timeZoneName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default List<TimeZoneName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, timeZoneName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default List<TimeZoneName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, timeZoneName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default Optional<TimeZoneName> selectByPrimaryKey(String name_) {
        return selectOne(c ->
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, timeZoneName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    static UpdateDSL<UpdateModel> updateAllColumns(TimeZoneName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(timeZoneId).equalTo(record::getTimeZoneId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TimeZoneName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(timeZoneId).equalToWhenPresent(record::getTimeZoneId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default int updateByPrimaryKey(TimeZoneName record) {
        return update(c ->
            c.set(timeZoneId).equalTo(record::getTimeZoneId)
            .where(name, isEqualTo(record::getName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    default int updateByPrimaryKeySelective(TimeZoneName record) {
        return update(c ->
            c.set(timeZoneId).equalToWhenPresent(record::getTimeZoneId)
            .where(name, isEqualTo(record::getName))
        );
    }
}