package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.AccountsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.Accounts;
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
public interface AccountsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    BasicColumn[] selectList = BasicColumn.columnList(user, host, currentConnections, totalConnections);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Accounts> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AccountsResult")
    Optional<Accounts> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountsResult", value = {
        @Result(column="USER", property="user", jdbcType=JdbcType.CHAR),
        @Result(column="HOST", property="host", jdbcType=JdbcType.CHAR),
        @Result(column="CURRENT_CONNECTIONS", property="currentConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="TOTAL_CONNECTIONS", property="totalConnections", jdbcType=JdbcType.BIGINT)
    })
    List<Accounts> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accounts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accounts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    default int insert(Accounts record) {
        return MyBatis3Utils.insert(this::insert, record, accounts, c ->
            c.map(user).toProperty("user")
            .map(host).toProperty("host")
            .map(currentConnections).toProperty("currentConnections")
            .map(totalConnections).toProperty("totalConnections")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    default int insertSelective(Accounts record) {
        return MyBatis3Utils.insert(this::insert, record, accounts, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(currentConnections).toPropertyWhenPresent("currentConnections", record::getCurrentConnections)
            .map(totalConnections).toPropertyWhenPresent("totalConnections", record::getTotalConnections)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    default Optional<Accounts> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accounts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    default List<Accounts> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accounts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    default List<Accounts> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accounts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accounts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    static UpdateDSL<UpdateModel> updateAllColumns(Accounts record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
                .set(host).equalTo(record::getHost)
                .set(currentConnections).equalTo(record::getCurrentConnections)
                .set(totalConnections).equalTo(record::getTotalConnections);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1938923+08:00", comments="Source Table: accounts")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Accounts record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
                .set(host).equalToWhenPresent(record::getHost)
                .set(currentConnections).equalToWhenPresent(record::getCurrentConnections)
                .set(totalConnections).equalToWhenPresent(record::getTotalConnections);
    }
}