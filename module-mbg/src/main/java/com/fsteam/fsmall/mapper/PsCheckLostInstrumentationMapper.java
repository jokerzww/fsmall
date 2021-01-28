package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.PsCheckLostInstrumentationDynamicSqlSupport.*;

import com.fsteam.fsmall.model.PsCheckLostInstrumentation;
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
public interface PsCheckLostInstrumentationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    BasicColumn[] selectList = BasicColumn.columnList(variableName, variableValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PsCheckLostInstrumentation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PsCheckLostInstrumentationResult")
    Optional<PsCheckLostInstrumentation> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PsCheckLostInstrumentationResult", value = {
        @Result(column="variable_name", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="variable_value", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<PsCheckLostInstrumentation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, psCheckLostInstrumentation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, psCheckLostInstrumentation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    default int insert(PsCheckLostInstrumentation record) {
        return MyBatis3Utils.insert(this::insert, record, psCheckLostInstrumentation, c ->
            c.map(variableName).toProperty("variableName")
            .map(variableValue).toProperty("variableValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    default int insertSelective(PsCheckLostInstrumentation record) {
        return MyBatis3Utils.insert(this::insert, record, psCheckLostInstrumentation, c ->
            c.map(variableName).toPropertyWhenPresent("variableName", record::getVariableName)
            .map(variableValue).toPropertyWhenPresent("variableValue", record::getVariableValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    default Optional<PsCheckLostInstrumentation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, psCheckLostInstrumentation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    default List<PsCheckLostInstrumentation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, psCheckLostInstrumentation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    default List<PsCheckLostInstrumentation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, psCheckLostInstrumentation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, psCheckLostInstrumentation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    static UpdateDSL<UpdateModel> updateAllColumns(PsCheckLostInstrumentation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalTo(record::getVariableName)
                .set(variableValue).equalTo(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PsCheckLostInstrumentation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalToWhenPresent(record::getVariableName)
                .set(variableValue).equalToWhenPresent(record::getVariableValue);
    }
}