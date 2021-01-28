package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.VariablesInfoDynamicSqlSupport.*;

import com.fsteam.fsmall.model.VariablesInfo;
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
public interface VariablesInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    BasicColumn[] selectList = BasicColumn.columnList(variableName, variableSource, variablePath, minValue, maxValue, setTime, setUser, setHost);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<VariablesInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VariablesInfoResult")
    Optional<VariablesInfo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VariablesInfoResult", value = {
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_SOURCE", property="variableSource", jdbcType=JdbcType.CHAR),
        @Result(column="VARIABLE_PATH", property="variablePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="MIN_VALUE", property="minValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAX_VALUE", property="maxValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="SET_TIME", property="setTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SET_USER", property="setUser", jdbcType=JdbcType.CHAR),
        @Result(column="SET_HOST", property="setHost", jdbcType=JdbcType.CHAR)
    })
    List<VariablesInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, variablesInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, variablesInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    default int insert(VariablesInfo record) {
        return MyBatis3Utils.insert(this::insert, record, variablesInfo, c ->
            c.map(variableName).toProperty("variableName")
            .map(variableSource).toProperty("variableSource")
            .map(variablePath).toProperty("variablePath")
            .map(minValue).toProperty("minValue")
            .map(maxValue).toProperty("maxValue")
            .map(setTime).toProperty("setTime")
            .map(setUser).toProperty("setUser")
            .map(setHost).toProperty("setHost")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    default int insertSelective(VariablesInfo record) {
        return MyBatis3Utils.insert(this::insert, record, variablesInfo, c ->
            c.map(variableName).toPropertyWhenPresent("variableName", record::getVariableName)
            .map(variableSource).toPropertyWhenPresent("variableSource", record::getVariableSource)
            .map(variablePath).toPropertyWhenPresent("variablePath", record::getVariablePath)
            .map(minValue).toPropertyWhenPresent("minValue", record::getMinValue)
            .map(maxValue).toPropertyWhenPresent("maxValue", record::getMaxValue)
            .map(setTime).toPropertyWhenPresent("setTime", record::getSetTime)
            .map(setUser).toPropertyWhenPresent("setUser", record::getSetUser)
            .map(setHost).toPropertyWhenPresent("setHost", record::getSetHost)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    default Optional<VariablesInfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, variablesInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    default List<VariablesInfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, variablesInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    default List<VariablesInfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, variablesInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, variablesInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    static UpdateDSL<UpdateModel> updateAllColumns(VariablesInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalTo(record::getVariableName)
                .set(variableSource).equalTo(record::getVariableSource)
                .set(variablePath).equalTo(record::getVariablePath)
                .set(minValue).equalTo(record::getMinValue)
                .set(maxValue).equalTo(record::getMaxValue)
                .set(setTime).equalTo(record::getSetTime)
                .set(setUser).equalTo(record::getSetUser)
                .set(setHost).equalTo(record::getSetHost);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(VariablesInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalToWhenPresent(record::getVariableName)
                .set(variableSource).equalToWhenPresent(record::getVariableSource)
                .set(variablePath).equalToWhenPresent(record::getVariablePath)
                .set(minValue).equalToWhenPresent(record::getMinValue)
                .set(maxValue).equalToWhenPresent(record::getMaxValue)
                .set(setTime).equalToWhenPresent(record::getSetTime)
                .set(setUser).equalToWhenPresent(record::getSetUser)
                .set(setHost).equalToWhenPresent(record::getSetHost);
    }
}