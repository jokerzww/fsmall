package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.HelpRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.HelpRelation;
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
public interface HelpRelationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    BasicColumn[] selectList = BasicColumn.columnList(helpKeywordId, helpTopicId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HelpRelation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HelpRelationResult")
    Optional<HelpRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HelpRelationResult", value = {
        @Result(column="help_keyword_id", property="helpKeywordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="help_topic_id", property="helpTopicId", jdbcType=JdbcType.INTEGER, id=true)
    })
    List<HelpRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, helpRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, helpRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    default int deleteByPrimaryKey(Integer helpKeywordId_, Integer helpTopicId_) {
        return delete(c -> 
            c.where(helpKeywordId, isEqualTo(helpKeywordId_))
            .and(helpTopicId, isEqualTo(helpTopicId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    default int insert(HelpRelation record) {
        return MyBatis3Utils.insert(this::insert, record, helpRelation, c ->
            c.map(helpKeywordId).toProperty("helpKeywordId")
            .map(helpTopicId).toProperty("helpTopicId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    default int insertSelective(HelpRelation record) {
        return MyBatis3Utils.insert(this::insert, record, helpRelation, c ->
            c.map(helpKeywordId).toPropertyWhenPresent("helpKeywordId", record::getHelpKeywordId)
            .map(helpTopicId).toPropertyWhenPresent("helpTopicId", record::getHelpTopicId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    default Optional<HelpRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, helpRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    default List<HelpRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, helpRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    default List<HelpRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, helpRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, helpRelation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    static UpdateDSL<UpdateModel> updateAllColumns(HelpRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(helpKeywordId).equalTo(record::getHelpKeywordId)
                .set(helpTopicId).equalTo(record::getHelpTopicId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HelpRelation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(helpKeywordId).equalToWhenPresent(record::getHelpKeywordId)
                .set(helpTopicId).equalToWhenPresent(record::getHelpTopicId);
    }
}