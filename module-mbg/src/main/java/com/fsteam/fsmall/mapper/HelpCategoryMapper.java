package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.HelpCategoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.HelpCategory;
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
public interface HelpCategoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    BasicColumn[] selectList = BasicColumn.columnList(helpCategoryId, name, parentCategoryId, url);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HelpCategory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HelpCategoryResult")
    Optional<HelpCategory> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HelpCategoryResult", value = {
        @Result(column="help_category_id", property="helpCategoryId", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.CHAR),
        @Result(column="parent_category_id", property="parentCategoryId", jdbcType=JdbcType.SMALLINT),
        @Result(column="url", property="url", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<HelpCategory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, helpCategory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, helpCategory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default int deleteByPrimaryKey(Short helpCategoryId_) {
        return delete(c -> 
            c.where(helpCategoryId, isEqualTo(helpCategoryId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default int insert(HelpCategory record) {
        return MyBatis3Utils.insert(this::insert, record, helpCategory, c ->
            c.map(helpCategoryId).toProperty("helpCategoryId")
            .map(name).toProperty("name")
            .map(parentCategoryId).toProperty("parentCategoryId")
            .map(url).toProperty("url")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default int insertSelective(HelpCategory record) {
        return MyBatis3Utils.insert(this::insert, record, helpCategory, c ->
            c.map(helpCategoryId).toPropertyWhenPresent("helpCategoryId", record::getHelpCategoryId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(parentCategoryId).toPropertyWhenPresent("parentCategoryId", record::getParentCategoryId)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default Optional<HelpCategory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, helpCategory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default List<HelpCategory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, helpCategory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default List<HelpCategory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, helpCategory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default Optional<HelpCategory> selectByPrimaryKey(Short helpCategoryId_) {
        return selectOne(c ->
            c.where(helpCategoryId, isEqualTo(helpCategoryId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, helpCategory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    static UpdateDSL<UpdateModel> updateAllColumns(HelpCategory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(helpCategoryId).equalTo(record::getHelpCategoryId)
                .set(name).equalTo(record::getName)
                .set(parentCategoryId).equalTo(record::getParentCategoryId)
                .set(url).equalTo(record::getUrl);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HelpCategory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(helpCategoryId).equalToWhenPresent(record::getHelpCategoryId)
                .set(name).equalToWhenPresent(record::getName)
                .set(parentCategoryId).equalToWhenPresent(record::getParentCategoryId)
                .set(url).equalToWhenPresent(record::getUrl);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default int updateByPrimaryKey(HelpCategory record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(parentCategoryId).equalTo(record::getParentCategoryId)
            .set(url).equalTo(record::getUrl)
            .where(helpCategoryId, isEqualTo(record::getHelpCategoryId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    default int updateByPrimaryKeySelective(HelpCategory record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(parentCategoryId).equalToWhenPresent(record::getParentCategoryId)
            .set(url).equalToWhenPresent(record::getUrl)
            .where(helpCategoryId, isEqualTo(record::getHelpCategoryId))
        );
    }
}