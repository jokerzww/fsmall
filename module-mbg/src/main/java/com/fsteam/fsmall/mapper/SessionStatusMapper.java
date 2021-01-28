package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SessionStatusDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SessionStatus;
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
public interface SessionStatusMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: session_status")
    BasicColumn[] selectList = BasicColumn.columnList(variableName, variableValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SessionStatus> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SessionStatusResult")
    Optional<SessionStatus> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SessionStatusResult", value = {
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<SessionStatus> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sessionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sessionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    default int deleteByPrimaryKey(String variableName_) {
        return delete(c -> 
            c.where(variableName, isEqualTo(variableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    default int insert(SessionStatus record) {
        return MyBatis3Utils.insert(this::insert, record, sessionStatus, c ->
            c.map(variableName).toProperty("variableName")
            .map(variableValue).toProperty("variableValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: session_status")
    default int insertSelective(SessionStatus record) {
        return MyBatis3Utils.insert(this::insert, record, sessionStatus, c ->
            c.map(variableName).toPropertyWhenPresent("variableName", record::getVariableName)
            .map(variableValue).toPropertyWhenPresent("variableValue", record::getVariableValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: session_status")
    default Optional<SessionStatus> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sessionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: session_status")
    default List<SessionStatus> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sessionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: session_status")
    default List<SessionStatus> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sessionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: session_status")
    default Optional<SessionStatus> selectByPrimaryKey(String variableName_) {
        return selectOne(c ->
            c.where(variableName, isEqualTo(variableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: session_status")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sessionStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: session_status")
    static UpdateDSL<UpdateModel> updateAllColumns(SessionStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalTo(record::getVariableName)
                .set(variableValue).equalTo(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: session_status")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SessionStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalToWhenPresent(record::getVariableName)
                .set(variableValue).equalToWhenPresent(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: session_status")
    default int updateByPrimaryKey(SessionStatus record) {
        return update(c ->
            c.set(variableValue).equalTo(record::getVariableValue)
            .where(variableName, isEqualTo(record::getVariableName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: session_status")
    default int updateByPrimaryKeySelective(SessionStatus record) {
        return update(c ->
            c.set(variableValue).equalToWhenPresent(record::getVariableValue)
            .where(variableName, isEqualTo(record::getVariableName))
        );
    }
}