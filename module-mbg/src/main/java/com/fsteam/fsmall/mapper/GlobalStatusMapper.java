package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.GlobalStatusDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.GlobalStatus;
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
public interface GlobalStatusMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    BasicColumn[] selectList = BasicColumn.columnList(variableName, variableValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2269212+08:00", comments="Source Table: global_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2269212+08:00", comments="Source Table: global_status")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2269212+08:00", comments="Source Table: global_status")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GlobalStatus> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2269212+08:00", comments="Source Table: global_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GlobalStatusResult")
    Optional<GlobalStatus> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2269212+08:00", comments="Source Table: global_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GlobalStatusResult", value = {
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<GlobalStatus> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, globalStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, globalStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default int deleteByPrimaryKey(String variableName_) {
        return delete(c -> 
            c.where(variableName, isEqualTo(variableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default int insert(GlobalStatus record) {
        return MyBatis3Utils.insert(this::insert, record, globalStatus, c ->
            c.map(variableName).toProperty("variableName")
            .map(variableValue).toProperty("variableValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default int insertSelective(GlobalStatus record) {
        return MyBatis3Utils.insert(this::insert, record, globalStatus, c ->
            c.map(variableName).toPropertyWhenPresent("variableName", record::getVariableName)
            .map(variableValue).toPropertyWhenPresent("variableValue", record::getVariableValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default Optional<GlobalStatus> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, globalStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default List<GlobalStatus> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, globalStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default List<GlobalStatus> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, globalStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default Optional<GlobalStatus> selectByPrimaryKey(String variableName_) {
        return selectOne(c ->
            c.where(variableName, isEqualTo(variableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, globalStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    static UpdateDSL<UpdateModel> updateAllColumns(GlobalStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalTo(record::getVariableName)
                .set(variableValue).equalTo(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GlobalStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalToWhenPresent(record::getVariableName)
                .set(variableValue).equalToWhenPresent(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default int updateByPrimaryKey(GlobalStatus record) {
        return update(c ->
            c.set(variableValue).equalTo(record::getVariableValue)
            .where(variableName, isEqualTo(record::getVariableName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: global_status")
    default int updateByPrimaryKeySelective(GlobalStatus record) {
        return update(c ->
            c.set(variableValue).equalToWhenPresent(record::getVariableValue)
            .where(variableName, isEqualTo(record::getVariableName))
        );
    }
}