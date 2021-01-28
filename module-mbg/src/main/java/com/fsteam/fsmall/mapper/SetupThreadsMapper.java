package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SetupThreadsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SetupThreads;
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
public interface SetupThreadsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    BasicColumn[] selectList = BasicColumn.columnList(name, enabled, history, properties, volatility, documentation);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SetupThreads> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SetupThreadsResult")
    Optional<SetupThreads> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SetupThreadsResult", value = {
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ENABLED", property="enabled", jdbcType=JdbcType.CHAR),
        @Result(column="HISTORY", property="history", jdbcType=JdbcType.CHAR),
        @Result(column="PROPERTIES", property="properties", jdbcType=JdbcType.CHAR),
        @Result(column="VOLATILITY", property="volatility", jdbcType=JdbcType.INTEGER),
        @Result(column="DOCUMENTATION", property="documentation", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SetupThreads> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, setupThreads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, setupThreads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    default int deleteByPrimaryKey(String name_) {
        return delete(c -> 
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    default int insert(SetupThreads record) {
        return MyBatis3Utils.insert(this::insert, record, setupThreads, c ->
            c.map(name).toProperty("name")
            .map(enabled).toProperty("enabled")
            .map(history).toProperty("history")
            .map(properties).toProperty("properties")
            .map(volatility).toProperty("volatility")
            .map(documentation).toProperty("documentation")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    default int insertSelective(SetupThreads record) {
        return MyBatis3Utils.insert(this::insert, record, setupThreads, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(enabled).toPropertyWhenPresent("enabled", record::getEnabled)
            .map(history).toPropertyWhenPresent("history", record::getHistory)
            .map(properties).toPropertyWhenPresent("properties", record::getProperties)
            .map(volatility).toPropertyWhenPresent("volatility", record::getVolatility)
            .map(documentation).toPropertyWhenPresent("documentation", record::getDocumentation)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    default Optional<SetupThreads> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, setupThreads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    default List<SetupThreads> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, setupThreads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    default List<SetupThreads> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, setupThreads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    default Optional<SetupThreads> selectByPrimaryKey(String name_) {
        return selectOne(c ->
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, setupThreads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    static UpdateDSL<UpdateModel> updateAllColumns(SetupThreads record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(enabled).equalTo(record::getEnabled)
                .set(history).equalTo(record::getHistory)
                .set(properties).equalTo(record::getProperties)
                .set(volatility).equalTo(record::getVolatility)
                .set(documentation).equalTo(record::getDocumentation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SetupThreads record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(enabled).equalToWhenPresent(record::getEnabled)
                .set(history).equalToWhenPresent(record::getHistory)
                .set(properties).equalToWhenPresent(record::getProperties)
                .set(volatility).equalToWhenPresent(record::getVolatility)
                .set(documentation).equalToWhenPresent(record::getDocumentation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source Table: setup_threads")
    default int updateByPrimaryKey(SetupThreads record) {
        return update(c ->
            c.set(enabled).equalTo(record::getEnabled)
            .set(history).equalTo(record::getHistory)
            .set(properties).equalTo(record::getProperties)
            .set(volatility).equalTo(record::getVolatility)
            .set(documentation).equalTo(record::getDocumentation)
            .where(name, isEqualTo(record::getName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source Table: setup_threads")
    default int updateByPrimaryKeySelective(SetupThreads record) {
        return update(c ->
            c.set(enabled).equalToWhenPresent(record::getEnabled)
            .set(history).equalToWhenPresent(record::getHistory)
            .set(properties).equalToWhenPresent(record::getProperties)
            .set(volatility).equalToWhenPresent(record::getVolatility)
            .set(documentation).equalToWhenPresent(record::getDocumentation)
            .where(name, isEqualTo(record::getName))
        );
    }
}