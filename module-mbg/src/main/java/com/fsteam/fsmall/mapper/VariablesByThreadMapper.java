package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.VariablesByThreadDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.VariablesByThread;
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
public interface VariablesByThreadMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, variableName, variableValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<VariablesByThread> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VariablesByThreadResult")
    Optional<VariablesByThread> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VariablesByThreadResult", value = {
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<VariablesByThread> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, variablesByThread, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, variablesByThread, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default int deleteByPrimaryKey(Long threadId_, String variableName_) {
        return delete(c -> 
            c.where(threadId, isEqualTo(threadId_))
            .and(variableName, isEqualTo(variableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default int insert(VariablesByThread record) {
        return MyBatis3Utils.insert(this::insert, record, variablesByThread, c ->
            c.map(threadId).toProperty("threadId")
            .map(variableName).toProperty("variableName")
            .map(variableValue).toProperty("variableValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default int insertSelective(VariablesByThread record) {
        return MyBatis3Utils.insert(this::insert, record, variablesByThread, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(variableName).toPropertyWhenPresent("variableName", record::getVariableName)
            .map(variableValue).toPropertyWhenPresent("variableValue", record::getVariableValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default Optional<VariablesByThread> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, variablesByThread, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default List<VariablesByThread> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, variablesByThread, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default List<VariablesByThread> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, variablesByThread, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default Optional<VariablesByThread> selectByPrimaryKey(Long threadId_, String variableName_) {
        return selectOne(c ->
            c.where(threadId, isEqualTo(threadId_))
            .and(variableName, isEqualTo(variableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, variablesByThread, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    static UpdateDSL<UpdateModel> updateAllColumns(VariablesByThread record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(variableName).equalTo(record::getVariableName)
                .set(variableValue).equalTo(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VariablesByThread record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(variableName).equalToWhenPresent(record::getVariableName)
                .set(variableValue).equalToWhenPresent(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0797869+08:00", comments="Source Table: variables_by_thread")
    default int updateByPrimaryKey(VariablesByThread record) {
        return update(c ->
            c.set(variableValue).equalTo(record::getVariableValue)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(variableName, isEqualTo(record::getVariableName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0807877+08:00", comments="Source Table: variables_by_thread")
    default int updateByPrimaryKeySelective(VariablesByThread record) {
        return update(c ->
            c.set(variableValue).equalToWhenPresent(record::getVariableValue)
            .where(threadId, isEqualTo(record::getThreadId))
            .and(variableName, isEqualTo(record::getVariableName))
        );
    }
}