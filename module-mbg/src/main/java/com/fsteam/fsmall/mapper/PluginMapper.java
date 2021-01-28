package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.PluginDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Plugin;
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
public interface PluginMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    BasicColumn[] selectList = BasicColumn.columnList(name, dl);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Plugin> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PluginResult")
    Optional<Plugin> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PluginResult", value = {
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="dl", property="dl", jdbcType=JdbcType.VARCHAR)
    })
    List<Plugin> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, plugin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, plugin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default int deleteByPrimaryKey(String name_) {
        return delete(c -> 
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default int insert(Plugin record) {
        return MyBatis3Utils.insert(this::insert, record, plugin, c ->
            c.map(name).toProperty("name")
            .map(dl).toProperty("dl")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default int insertSelective(Plugin record) {
        return MyBatis3Utils.insert(this::insert, record, plugin, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(dl).toPropertyWhenPresent("dl", record::getDl)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default Optional<Plugin> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, plugin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default List<Plugin> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, plugin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default List<Plugin> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, plugin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default Optional<Plugin> selectByPrimaryKey(String name_) {
        return selectOne(c ->
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, plugin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    static UpdateDSL<UpdateModel> updateAllColumns(Plugin record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(dl).equalTo(record::getDl);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Plugin record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(dl).equalToWhenPresent(record::getDl);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default int updateByPrimaryKey(Plugin record) {
        return update(c ->
            c.set(dl).equalTo(record::getDl)
            .where(name, isEqualTo(record::getName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    default int updateByPrimaryKeySelective(Plugin record) {
        return update(c ->
            c.set(dl).equalToWhenPresent(record::getDl)
            .where(name, isEqualTo(record::getName))
        );
    }
}