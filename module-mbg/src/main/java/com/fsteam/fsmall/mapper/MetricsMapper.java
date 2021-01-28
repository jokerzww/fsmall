package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.MetricsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.Metrics;
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
public interface MetricsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    BasicColumn[] selectList = BasicColumn.columnList(variableName, type, enabled, variableValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Metrics> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MetricsResult")
    Optional<Metrics> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MetricsResult", value = {
        @Result(column="Variable_name", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="Type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="Enabled", property="enabled", jdbcType=JdbcType.VARCHAR),
        @Result(column="Variable_value", property="variableValue", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Metrics> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, metrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, metrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    default int insert(Metrics record) {
        return MyBatis3Utils.insert(this::insert, record, metrics, c ->
            c.map(variableName).toProperty("variableName")
            .map(type).toProperty("type")
            .map(enabled).toProperty("enabled")
            .map(variableValue).toProperty("variableValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    default int insertSelective(Metrics record) {
        return MyBatis3Utils.insert(this::insert, record, metrics, c ->
            c.map(variableName).toPropertyWhenPresent("variableName", record::getVariableName)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(enabled).toPropertyWhenPresent("enabled", record::getEnabled)
            .map(variableValue).toPropertyWhenPresent("variableValue", record::getVariableValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    default Optional<Metrics> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, metrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    default List<Metrics> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, metrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    default List<Metrics> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, metrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, metrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    static UpdateDSL<UpdateModel> updateAllColumns(Metrics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalTo(record::getVariableName)
                .set(type).equalTo(record::getType)
                .set(enabled).equalTo(record::getEnabled)
                .set(variableValue).equalTo(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: metrics")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Metrics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(variableName).equalToWhenPresent(record::getVariableName)
                .set(type).equalToWhenPresent(record::getType)
                .set(enabled).equalToWhenPresent(record::getEnabled)
                .set(variableValue).equalToWhenPresent(record::getVariableValue);
    }
}