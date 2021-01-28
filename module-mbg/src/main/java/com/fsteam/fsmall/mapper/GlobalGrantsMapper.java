package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.GlobalGrantsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.GlobalGrants;
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
public interface GlobalGrantsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    BasicColumn[] selectList = BasicColumn.columnList(user, host, priv, withGrantOption);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GlobalGrants> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GlobalGrantsResult")
    Optional<GlobalGrants> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GlobalGrantsResult", value = {
        @Result(column="USER", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="HOST", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="PRIV", property="priv", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="WITH_GRANT_OPTION", property="withGrantOption", jdbcType=JdbcType.CHAR)
    })
    List<GlobalGrants> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, globalGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, globalGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default int deleteByPrimaryKey(String user_, String host_, String priv_) {
        return delete(c -> 
            c.where(user, isEqualTo(user_))
            .and(host, isEqualTo(host_))
            .and(priv, isEqualTo(priv_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default int insert(GlobalGrants record) {
        return MyBatis3Utils.insert(this::insert, record, globalGrants, c ->
            c.map(user).toProperty("user")
            .map(host).toProperty("host")
            .map(priv).toProperty("priv")
            .map(withGrantOption).toProperty("withGrantOption")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default int insertSelective(GlobalGrants record) {
        return MyBatis3Utils.insert(this::insert, record, globalGrants, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(priv).toPropertyWhenPresent("priv", record::getPriv)
            .map(withGrantOption).toPropertyWhenPresent("withGrantOption", record::getWithGrantOption)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default Optional<GlobalGrants> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, globalGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default List<GlobalGrants> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, globalGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default List<GlobalGrants> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, globalGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default Optional<GlobalGrants> selectByPrimaryKey(String user_, String host_, String priv_) {
        return selectOne(c ->
            c.where(user, isEqualTo(user_))
            .and(host, isEqualTo(host_))
            .and(priv, isEqualTo(priv_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, globalGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    static UpdateDSL<UpdateModel> updateAllColumns(GlobalGrants record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
                .set(host).equalTo(record::getHost)
                .set(priv).equalTo(record::getPriv)
                .set(withGrantOption).equalTo(record::getWithGrantOption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GlobalGrants record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
                .set(host).equalToWhenPresent(record::getHost)
                .set(priv).equalToWhenPresent(record::getPriv)
                .set(withGrantOption).equalToWhenPresent(record::getWithGrantOption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default int updateByPrimaryKey(GlobalGrants record) {
        return update(c ->
            c.set(withGrantOption).equalTo(record::getWithGrantOption)
            .where(user, isEqualTo(record::getUser))
            .and(host, isEqualTo(record::getHost))
            .and(priv, isEqualTo(record::getPriv))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source Table: global_grants")
    default int updateByPrimaryKeySelective(GlobalGrants record) {
        return update(c ->
            c.set(withGrantOption).equalToWhenPresent(record::getWithGrantOption)
            .where(user, isEqualTo(record::getUser))
            .and(host, isEqualTo(record::getHost))
            .and(priv, isEqualTo(record::getPriv))
        );
    }
}