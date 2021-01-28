package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.HelpTopicDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.HelpTopic;
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
public interface HelpTopicMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    BasicColumn[] selectList = BasicColumn.columnList(helpTopicId, name, helpCategoryId, description, example, url);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HelpTopic> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HelpTopicResult")
    Optional<HelpTopic> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HelpTopicResult", value = {
        @Result(column="help_topic_id", property="helpTopicId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.CHAR),
        @Result(column="help_category_id", property="helpCategoryId", jdbcType=JdbcType.SMALLINT),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="example", property="example", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<HelpTopic> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, helpTopic, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, helpTopic, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    default int deleteByPrimaryKey(Integer helpTopicId_) {
        return delete(c -> 
            c.where(helpTopicId, isEqualTo(helpTopicId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    default int insert(HelpTopic record) {
        return MyBatis3Utils.insert(this::insert, record, helpTopic, c ->
            c.map(helpTopicId).toProperty("helpTopicId")
            .map(name).toProperty("name")
            .map(helpCategoryId).toProperty("helpCategoryId")
            .map(description).toProperty("description")
            .map(example).toProperty("example")
            .map(url).toProperty("url")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    default int insertSelective(HelpTopic record) {
        return MyBatis3Utils.insert(this::insert, record, helpTopic, c ->
            c.map(helpTopicId).toPropertyWhenPresent("helpTopicId", record::getHelpTopicId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(helpCategoryId).toPropertyWhenPresent("helpCategoryId", record::getHelpCategoryId)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(example).toPropertyWhenPresent("example", record::getExample)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    default Optional<HelpTopic> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, helpTopic, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1528539+08:00", comments="Source Table: help_topic")
    default List<HelpTopic> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, helpTopic, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1528539+08:00", comments="Source Table: help_topic")
    default List<HelpTopic> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, helpTopic, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1528539+08:00", comments="Source Table: help_topic")
    default Optional<HelpTopic> selectByPrimaryKey(Integer helpTopicId_) {
        return selectOne(c ->
            c.where(helpTopicId, isEqualTo(helpTopicId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1528539+08:00", comments="Source Table: help_topic")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, helpTopic, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1528539+08:00", comments="Source Table: help_topic")
    static UpdateDSL<UpdateModel> updateAllColumns(HelpTopic record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(helpTopicId).equalTo(record::getHelpTopicId)
                .set(name).equalTo(record::getName)
                .set(helpCategoryId).equalTo(record::getHelpCategoryId)
                .set(description).equalTo(record::getDescription)
                .set(example).equalTo(record::getExample)
                .set(url).equalTo(record::getUrl);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1528539+08:00", comments="Source Table: help_topic")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HelpTopic record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(helpTopicId).equalToWhenPresent(record::getHelpTopicId)
                .set(name).equalToWhenPresent(record::getName)
                .set(helpCategoryId).equalToWhenPresent(record::getHelpCategoryId)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(example).equalToWhenPresent(record::getExample)
                .set(url).equalToWhenPresent(record::getUrl);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1528539+08:00", comments="Source Table: help_topic")
    default int updateByPrimaryKey(HelpTopic record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(helpCategoryId).equalTo(record::getHelpCategoryId)
            .set(description).equalTo(record::getDescription)
            .set(example).equalTo(record::getExample)
            .set(url).equalTo(record::getUrl)
            .where(helpTopicId, isEqualTo(record::getHelpTopicId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1528539+08:00", comments="Source Table: help_topic")
    default int updateByPrimaryKeySelective(HelpTopic record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(helpCategoryId).equalToWhenPresent(record::getHelpCategoryId)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(example).equalToWhenPresent(record::getExample)
            .set(url).equalToWhenPresent(record::getUrl)
            .where(helpTopicId, isEqualTo(record::getHelpTopicId))
        );
    }
}