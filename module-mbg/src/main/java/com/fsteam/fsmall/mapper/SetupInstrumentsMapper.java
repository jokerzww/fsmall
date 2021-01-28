package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SetupInstrumentsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SetupInstruments;
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
public interface SetupInstrumentsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    BasicColumn[] selectList = BasicColumn.columnList(name, enabled, timed, properties, volatility, documentation);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SetupInstruments> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SetupInstrumentsResult")
    Optional<SetupInstruments> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SetupInstrumentsResult", value = {
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ENABLED", property="enabled", jdbcType=JdbcType.CHAR),
        @Result(column="TIMED", property="timed", jdbcType=JdbcType.CHAR),
        @Result(column="PROPERTIES", property="properties", jdbcType=JdbcType.CHAR),
        @Result(column="VOLATILITY", property="volatility", jdbcType=JdbcType.INTEGER),
        @Result(column="DOCUMENTATION", property="documentation", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SetupInstruments> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, setupInstruments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, setupInstruments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default int deleteByPrimaryKey(String name_) {
        return delete(c -> 
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default int insert(SetupInstruments record) {
        return MyBatis3Utils.insert(this::insert, record, setupInstruments, c ->
            c.map(name).toProperty("name")
            .map(enabled).toProperty("enabled")
            .map(timed).toProperty("timed")
            .map(properties).toProperty("properties")
            .map(volatility).toProperty("volatility")
            .map(documentation).toProperty("documentation")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default int insertSelective(SetupInstruments record) {
        return MyBatis3Utils.insert(this::insert, record, setupInstruments, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(enabled).toPropertyWhenPresent("enabled", record::getEnabled)
            .map(timed).toPropertyWhenPresent("timed", record::getTimed)
            .map(properties).toPropertyWhenPresent("properties", record::getProperties)
            .map(volatility).toPropertyWhenPresent("volatility", record::getVolatility)
            .map(documentation).toPropertyWhenPresent("documentation", record::getDocumentation)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default Optional<SetupInstruments> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, setupInstruments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default List<SetupInstruments> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, setupInstruments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default List<SetupInstruments> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, setupInstruments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default Optional<SetupInstruments> selectByPrimaryKey(String name_) {
        return selectOne(c ->
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, setupInstruments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    static UpdateDSL<UpdateModel> updateAllColumns(SetupInstruments record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(enabled).equalTo(record::getEnabled)
                .set(timed).equalTo(record::getTimed)
                .set(properties).equalTo(record::getProperties)
                .set(volatility).equalTo(record::getVolatility)
                .set(documentation).equalTo(record::getDocumentation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SetupInstruments record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(enabled).equalToWhenPresent(record::getEnabled)
                .set(timed).equalToWhenPresent(record::getTimed)
                .set(properties).equalToWhenPresent(record::getProperties)
                .set(volatility).equalToWhenPresent(record::getVolatility)
                .set(documentation).equalToWhenPresent(record::getDocumentation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default int updateByPrimaryKey(SetupInstruments record) {
        return update(c ->
            c.set(enabled).equalTo(record::getEnabled)
            .set(timed).equalTo(record::getTimed)
            .set(properties).equalTo(record::getProperties)
            .set(volatility).equalTo(record::getVolatility)
            .set(documentation).equalTo(record::getDocumentation)
            .where(name, isEqualTo(record::getName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    default int updateByPrimaryKeySelective(SetupInstruments record) {
        return update(c ->
            c.set(enabled).equalToWhenPresent(record::getEnabled)
            .set(timed).equalToWhenPresent(record::getTimed)
            .set(properties).equalToWhenPresent(record::getProperties)
            .set(volatility).equalToWhenPresent(record::getVolatility)
            .set(documentation).equalToWhenPresent(record::getDocumentation)
            .where(name, isEqualTo(record::getName))
        );
    }
}