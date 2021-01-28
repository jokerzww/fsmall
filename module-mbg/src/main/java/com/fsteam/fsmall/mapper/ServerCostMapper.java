package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ServerCostDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ServerCost;
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
public interface ServerCostMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    BasicColumn[] selectList = BasicColumn.columnList(costName, costValue, lastUpdate, comment, defaultValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: server_cost")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: server_cost")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: server_cost")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ServerCost> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ServerCostResult")
    Optional<ServerCost> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ServerCostResult", value = {
        @Result(column="cost_name", property="costName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="cost_value", property="costValue", jdbcType=JdbcType.REAL),
        @Result(column="last_update", property="lastUpdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="comment", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="default_value", property="defaultValue", jdbcType=JdbcType.REAL)
    })
    List<ServerCost> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, serverCost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, serverCost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default int deleteByPrimaryKey(String costName_) {
        return delete(c -> 
            c.where(costName, isEqualTo(costName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default int insert(ServerCost record) {
        return MyBatis3Utils.insert(this::insert, record, serverCost, c ->
            c.map(costName).toProperty("costName")
            .map(costValue).toProperty("costValue")
            .map(lastUpdate).toProperty("lastUpdate")
            .map(comment).toProperty("comment")
            .map(defaultValue).toProperty("defaultValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default int insertSelective(ServerCost record) {
        return MyBatis3Utils.insert(this::insert, record, serverCost, c ->
            c.map(costName).toPropertyWhenPresent("costName", record::getCostName)
            .map(costValue).toPropertyWhenPresent("costValue", record::getCostValue)
            .map(lastUpdate).toPropertyWhenPresent("lastUpdate", record::getLastUpdate)
            .map(comment).toPropertyWhenPresent("comment", record::getComment)
            .map(defaultValue).toPropertyWhenPresent("defaultValue", record::getDefaultValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default Optional<ServerCost> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, serverCost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default List<ServerCost> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, serverCost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default List<ServerCost> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, serverCost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default Optional<ServerCost> selectByPrimaryKey(String costName_) {
        return selectOne(c ->
            c.where(costName, isEqualTo(costName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, serverCost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    static UpdateDSL<UpdateModel> updateAllColumns(ServerCost record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(costName).equalTo(record::getCostName)
                .set(costValue).equalTo(record::getCostValue)
                .set(lastUpdate).equalTo(record::getLastUpdate)
                .set(comment).equalTo(record::getComment)
                .set(defaultValue).equalTo(record::getDefaultValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ServerCost record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(costName).equalToWhenPresent(record::getCostName)
                .set(costValue).equalToWhenPresent(record::getCostValue)
                .set(lastUpdate).equalToWhenPresent(record::getLastUpdate)
                .set(comment).equalToWhenPresent(record::getComment)
                .set(defaultValue).equalToWhenPresent(record::getDefaultValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default int updateByPrimaryKey(ServerCost record) {
        return update(c ->
            c.set(costValue).equalTo(record::getCostValue)
            .set(lastUpdate).equalTo(record::getLastUpdate)
            .set(comment).equalTo(record::getComment)
            .set(defaultValue).equalTo(record::getDefaultValue)
            .where(costName, isEqualTo(record::getCostName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: server_cost")
    default int updateByPrimaryKeySelective(ServerCost record) {
        return update(c ->
            c.set(costValue).equalToWhenPresent(record::getCostValue)
            .set(lastUpdate).equalToWhenPresent(record::getLastUpdate)
            .set(comment).equalToWhenPresent(record::getComment)
            .set(defaultValue).equalToWhenPresent(record::getDefaultValue)
            .where(costName, isEqualTo(record::getCostName))
        );
    }
}