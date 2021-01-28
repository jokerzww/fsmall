package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SessionVariablesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SessionVariables;
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
public interface SessionVariablesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    BasicColumn[] selectList = BasicColumn.columnList(variableName, variableValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SessionVariables> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SessionVariablesResult")
    Optional<SessionVariables> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SessionVariablesResult", value = {
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<SessionVariables> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sessionVariables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sessionVariables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    default int deleteByPrimaryKey(String variableName_) {
        return delete(c -> 
            c.where(variableName, isEqualTo(variableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    default int insert(SessionVariables record) {
        return MyBatis3Utils.insert(this::insert, record, sessionVariables, c ->
            c.map(variableName).toProperty("variableName")
            .map(variableValue).toProperty("variableValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    default int insertSelective(SessionVariables record) {
        return MyBatis3Utils.insert(this::insert, record, sessionVariables, c ->
            c.map(variableName).toPropertyWhenPresent("variableName", record::getVariableName)
            .map(variableValue).toPropertyWhenPresent("variableValue", record::getVariableValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    default Optional<SessionVariables> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sessionVariables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    default List<SessionVariables> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sessionVariables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    default List<SessionVariables> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sessionVariables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    default Optional<SessionVariables> selectByPrimaryKey(String variableName_) {
        return selectOne(c ->
            c.where(variableName, isEqualTo(variableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sessionVariables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1758766+08:00", comments="Source Table: session_variables")
    static UpdateDSL<UpdateModel> updateAllColumns(SessionVariables record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalTo(record::getVariableName)
                .set(variableValue).equalTo(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: session_variables")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SessionVariables record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalToWhenPresent(record::getVariableName)
                .set(variableValue).equalToWhenPresent(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: session_variables")
    default int updateByPrimaryKey(SessionVariables record) {
        return update(c ->
            c.set(variableValue).equalTo(record::getVariableValue)
            .where(variableName, isEqualTo(record::getVariableName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: session_variables")
    default int updateByPrimaryKeySelective(SessionVariables record) {
        return update(c ->
            c.set(variableValue).equalToWhenPresent(record::getVariableValue)
            .where(variableName, isEqualTo(record::getVariableName))
        );
    }
}