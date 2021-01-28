package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.StatusByHostDynamicSqlSupport.*;

import com.fsteam.fsmall.model.StatusByHost;
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
public interface StatusByHostMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    BasicColumn[] selectList = BasicColumn.columnList(host, variableName, variableValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<StatusByHost> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StatusByHostResult")
    Optional<StatusByHost> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StatusByHostResult", value = {
        @Result(column="HOST", property="host", jdbcType=JdbcType.CHAR),
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<StatusByHost> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, statusByHost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, statusByHost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    default int insert(StatusByHost record) {
        return MyBatis3Utils.insert(this::insert, record, statusByHost, c ->
            c.map(host).toProperty("host")
            .map(variableName).toProperty("variableName")
            .map(variableValue).toProperty("variableValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    default int insertSelective(StatusByHost record) {
        return MyBatis3Utils.insert(this::insert, record, statusByHost, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(variableName).toPropertyWhenPresent("variableName", record::getVariableName)
            .map(variableValue).toPropertyWhenPresent("variableValue", record::getVariableValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    default Optional<StatusByHost> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, statusByHost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    default List<StatusByHost> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, statusByHost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    default List<StatusByHost> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, statusByHost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, statusByHost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    static UpdateDSL<UpdateModel> updateAllColumns(StatusByHost record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(variableName).equalTo(record::getVariableName)
                .set(variableValue).equalTo(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3610434+08:00", comments="Source Table: status_by_host")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(StatusByHost record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(variableName).equalToWhenPresent(record::getVariableName)
                .set(variableValue).equalToWhenPresent(record::getVariableValue);
    }
}