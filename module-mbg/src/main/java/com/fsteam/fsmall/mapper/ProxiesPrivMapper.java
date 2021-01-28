package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ProxiesPrivDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ProxiesPriv;
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
public interface ProxiesPrivMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    BasicColumn[] selectList = BasicColumn.columnList(host, user, proxiedHost, proxiedUser, withGrant, grantor, timestamp);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ProxiesPriv> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProxiesPrivResult")
    Optional<ProxiesPriv> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProxiesPrivResult", value = {
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="User", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Proxied_host", property="proxiedHost", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Proxied_user", property="proxiedUser", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="With_grant", property="withGrant", jdbcType=JdbcType.BIT),
        @Result(column="Grantor", property="grantor", jdbcType=JdbcType.VARCHAR),
        @Result(column="Timestamp", property="timestamp", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ProxiesPriv> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, proxiesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, proxiesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default int deleteByPrimaryKey(String host_, String user_, String proxiedHost_, String proxiedUser_) {
        return delete(c -> 
            c.where(host, isEqualTo(host_))
            .and(user, isEqualTo(user_))
            .and(proxiedHost, isEqualTo(proxiedHost_))
            .and(proxiedUser, isEqualTo(proxiedUser_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default int insert(ProxiesPriv record) {
        return MyBatis3Utils.insert(this::insert, record, proxiesPriv, c ->
            c.map(host).toProperty("host")
            .map(user).toProperty("user")
            .map(proxiedHost).toProperty("proxiedHost")
            .map(proxiedUser).toProperty("proxiedUser")
            .map(withGrant).toProperty("withGrant")
            .map(grantor).toProperty("grantor")
            .map(timestamp).toProperty("timestamp")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default int insertSelective(ProxiesPriv record) {
        return MyBatis3Utils.insert(this::insert, record, proxiesPriv, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(proxiedHost).toPropertyWhenPresent("proxiedHost", record::getProxiedHost)
            .map(proxiedUser).toPropertyWhenPresent("proxiedUser", record::getProxiedUser)
            .map(withGrant).toPropertyWhenPresent("withGrant", record::getWithGrant)
            .map(grantor).toPropertyWhenPresent("grantor", record::getGrantor)
            .map(timestamp).toPropertyWhenPresent("timestamp", record::getTimestamp)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default Optional<ProxiesPriv> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, proxiesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default List<ProxiesPriv> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, proxiesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default List<ProxiesPriv> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, proxiesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default Optional<ProxiesPriv> selectByPrimaryKey(String host_, String user_, String proxiedHost_, String proxiedUser_) {
        return selectOne(c ->
            c.where(host, isEqualTo(host_))
            .and(user, isEqualTo(user_))
            .and(proxiedHost, isEqualTo(proxiedHost_))
            .and(proxiedUser, isEqualTo(proxiedUser_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, proxiesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    static UpdateDSL<UpdateModel> updateAllColumns(ProxiesPriv record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(user).equalTo(record::getUser)
                .set(proxiedHost).equalTo(record::getProxiedHost)
                .set(proxiedUser).equalTo(record::getProxiedUser)
                .set(withGrant).equalTo(record::getWithGrant)
                .set(grantor).equalTo(record::getGrantor)
                .set(timestamp).equalTo(record::getTimestamp);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ProxiesPriv record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(user).equalToWhenPresent(record::getUser)
                .set(proxiedHost).equalToWhenPresent(record::getProxiedHost)
                .set(proxiedUser).equalToWhenPresent(record::getProxiedUser)
                .set(withGrant).equalToWhenPresent(record::getWithGrant)
                .set(grantor).equalToWhenPresent(record::getGrantor)
                .set(timestamp).equalToWhenPresent(record::getTimestamp);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default int updateByPrimaryKey(ProxiesPriv record) {
        return update(c ->
            c.set(withGrant).equalTo(record::getWithGrant)
            .set(grantor).equalTo(record::getGrantor)
            .set(timestamp).equalTo(record::getTimestamp)
            .where(host, isEqualTo(record::getHost))
            .and(user, isEqualTo(record::getUser))
            .and(proxiedHost, isEqualTo(record::getProxiedHost))
            .and(proxiedUser, isEqualTo(record::getProxiedUser))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    default int updateByPrimaryKeySelective(ProxiesPriv record) {
        return update(c ->
            c.set(withGrant).equalToWhenPresent(record::getWithGrant)
            .set(grantor).equalToWhenPresent(record::getGrantor)
            .set(timestamp).equalToWhenPresent(record::getTimestamp)
            .where(host, isEqualTo(record::getHost))
            .and(user, isEqualTo(record::getUser))
            .and(proxiedHost, isEqualTo(record::getProxiedHost))
            .and(proxiedUser, isEqualTo(record::getProxiedUser))
        );
    }
}