package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ComponentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Component;
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
public interface ComponentMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    BasicColumn[] selectList = BasicColumn.columnList(componentId, componentGroupId, componentUrn);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Component> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ComponentResult")
    Optional<Component> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ComponentResult", value = {
        @Result(column="component_id", property="componentId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="component_group_id", property="componentGroupId", jdbcType=JdbcType.INTEGER),
        @Result(column="component_urn", property="componentUrn", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Component> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, component, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, component, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default int deleteByPrimaryKey(Integer componentId_) {
        return delete(c -> 
            c.where(componentId, isEqualTo(componentId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default int insert(Component record) {
        return MyBatis3Utils.insert(this::insert, record, component, c ->
            c.map(componentId).toProperty("componentId")
            .map(componentGroupId).toProperty("componentGroupId")
            .map(componentUrn).toProperty("componentUrn")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default int insertSelective(Component record) {
        return MyBatis3Utils.insert(this::insert, record, component, c ->
            c.map(componentId).toPropertyWhenPresent("componentId", record::getComponentId)
            .map(componentGroupId).toPropertyWhenPresent("componentGroupId", record::getComponentGroupId)
            .map(componentUrn).toPropertyWhenPresent("componentUrn", record::getComponentUrn)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default Optional<Component> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, component, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default List<Component> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, component, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default List<Component> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, component, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default Optional<Component> selectByPrimaryKey(Integer componentId_) {
        return selectOne(c ->
            c.where(componentId, isEqualTo(componentId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, component, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    static UpdateDSL<UpdateModel> updateAllColumns(Component record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(componentId).equalTo(record::getComponentId)
                .set(componentGroupId).equalTo(record::getComponentGroupId)
                .set(componentUrn).equalTo(record::getComponentUrn);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Component record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(componentId).equalToWhenPresent(record::getComponentId)
                .set(componentGroupId).equalToWhenPresent(record::getComponentGroupId)
                .set(componentUrn).equalToWhenPresent(record::getComponentUrn);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default int updateByPrimaryKey(Component record) {
        return update(c ->
            c.set(componentGroupId).equalTo(record::getComponentGroupId)
            .set(componentUrn).equalTo(record::getComponentUrn)
            .where(componentId, isEqualTo(record::getComponentId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source Table: component")
    default int updateByPrimaryKeySelective(Component record) {
        return update(c ->
            c.set(componentGroupId).equalToWhenPresent(record::getComponentGroupId)
            .set(componentUrn).equalToWhenPresent(record::getComponentUrn)
            .where(componentId, isEqualTo(record::getComponentId))
        );
    }
}