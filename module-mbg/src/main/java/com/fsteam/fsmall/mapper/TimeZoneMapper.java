package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.TimeZoneDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.TimeZone;
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
public interface TimeZoneMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    BasicColumn[] selectList = BasicColumn.columnList(timeZoneId, useLeapSeconds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TimeZone> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TimeZoneResult")
    Optional<TimeZone> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TimeZoneResult", value = {
        @Result(column="Time_zone_id", property="timeZoneId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Use_leap_seconds", property="useLeapSeconds", jdbcType=JdbcType.CHAR)
    })
    List<TimeZone> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, timeZone, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, timeZone, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default int deleteByPrimaryKey(Integer timeZoneId_) {
        return delete(c -> 
            c.where(timeZoneId, isEqualTo(timeZoneId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default int insert(TimeZone record) {
        return MyBatis3Utils.insert(this::insert, record, timeZone, c ->
            c.map(timeZoneId).toProperty("timeZoneId")
            .map(useLeapSeconds).toProperty("useLeapSeconds")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default int insertSelective(TimeZone record) {
        return MyBatis3Utils.insert(this::insert, record, timeZone, c ->
            c.map(timeZoneId).toPropertyWhenPresent("timeZoneId", record::getTimeZoneId)
            .map(useLeapSeconds).toPropertyWhenPresent("useLeapSeconds", record::getUseLeapSeconds)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default Optional<TimeZone> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, timeZone, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default List<TimeZone> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, timeZone, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default List<TimeZone> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, timeZone, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default Optional<TimeZone> selectByPrimaryKey(Integer timeZoneId_) {
        return selectOne(c ->
            c.where(timeZoneId, isEqualTo(timeZoneId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, timeZone, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    static UpdateDSL<UpdateModel> updateAllColumns(TimeZone record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(timeZoneId).equalTo(record::getTimeZoneId)
                .set(useLeapSeconds).equalTo(record::getUseLeapSeconds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TimeZone record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(timeZoneId).equalToWhenPresent(record::getTimeZoneId)
                .set(useLeapSeconds).equalToWhenPresent(record::getUseLeapSeconds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default int updateByPrimaryKey(TimeZone record) {
        return update(c ->
            c.set(useLeapSeconds).equalTo(record::getUseLeapSeconds)
            .where(timeZoneId, isEqualTo(record::getTimeZoneId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    default int updateByPrimaryKeySelective(TimeZone record) {
        return update(c ->
            c.set(useLeapSeconds).equalToWhenPresent(record::getUseLeapSeconds)
            .where(timeZoneId, isEqualTo(record::getTimeZoneId))
        );
    }
}