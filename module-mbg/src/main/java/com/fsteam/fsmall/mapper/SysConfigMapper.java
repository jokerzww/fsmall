package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SysConfigDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SysConfig;
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
public interface SysConfigMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    BasicColumn[] selectList = BasicColumn.columnList(variable, value, setTime, setBy);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysConfig> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysConfigResult")
    Optional<SysConfig> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysConfigResult", value = {
        @Result(column="variable", property="variable", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="set_time", property="setTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="set_by", property="setBy", jdbcType=JdbcType.VARCHAR)
    })
    List<SysConfig> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sysConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sysConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default int deleteByPrimaryKey(String variable_) {
        return delete(c -> 
            c.where(variable, isEqualTo(variable_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default int insert(SysConfig record) {
        return MyBatis3Utils.insert(this::insert, record, sysConfig, c ->
            c.map(variable).toProperty("variable")
            .map(value).toProperty("value")
            .map(setTime).toProperty("setTime")
            .map(setBy).toProperty("setBy")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default int insertSelective(SysConfig record) {
        return MyBatis3Utils.insert(this::insert, record, sysConfig, c ->
            c.map(variable).toPropertyWhenPresent("variable", record::getVariable)
            .map(value).toPropertyWhenPresent("value", record::getValue)
            .map(setTime).toPropertyWhenPresent("setTime", record::getSetTime)
            .map(setBy).toPropertyWhenPresent("setBy", record::getSetBy)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default Optional<SysConfig> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sysConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default List<SysConfig> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sysConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default List<SysConfig> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sysConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default Optional<SysConfig> selectByPrimaryKey(String variable_) {
        return selectOne(c ->
            c.where(variable, isEqualTo(variable_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sysConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    static UpdateDSL<UpdateModel> updateAllColumns(SysConfig record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variable).equalTo(record::getVariable)
                .set(value).equalTo(record::getValue)
                .set(setTime).equalTo(record::getSetTime)
                .set(setBy).equalTo(record::getSetBy);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SysConfig record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variable).equalToWhenPresent(record::getVariable)
                .set(value).equalToWhenPresent(record::getValue)
                .set(setTime).equalToWhenPresent(record::getSetTime)
                .set(setBy).equalToWhenPresent(record::getSetBy);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default int updateByPrimaryKey(SysConfig record) {
        return update(c ->
            c.set(value).equalTo(record::getValue)
            .set(setTime).equalTo(record::getSetTime)
            .set(setBy).equalTo(record::getSetBy)
            .where(variable, isEqualTo(record::getVariable))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    default int updateByPrimaryKeySelective(SysConfig record) {
        return update(c ->
            c.set(value).equalToWhenPresent(record::getValue)
            .set(setTime).equalToWhenPresent(record::getSetTime)
            .set(setBy).equalToWhenPresent(record::getSetBy)
            .where(variable, isEqualTo(record::getVariable))
        );
    }
}