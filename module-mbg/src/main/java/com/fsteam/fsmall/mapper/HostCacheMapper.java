package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.HostCacheDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.HostCache;
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
public interface HostCacheMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    BasicColumn[] selectList = BasicColumn.columnList(ip, host, hostValidated, sumConnectErrors, countHostBlockedErrors, countNameinfoTransientErrors, countNameinfoPermanentErrors, countFormatErrors, countAddrinfoTransientErrors, countAddrinfoPermanentErrors, countFcrdnsErrors, countHostAclErrors, countNoAuthPluginErrors, countAuthPluginErrors, countHandshakeErrors, countProxyUserErrors, countProxyUserAclErrors, countAuthenticationErrors, countSslErrors, countMaxUserConnectionsErrors, countMaxUserConnectionsPerHourErrors, countDefaultDatabaseErrors, countInitConnectErrors, countLocalErrors, countUnknownErrors, firstSeen, lastSeen, firstErrorSeen, lastErrorSeen);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HostCache> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HostCacheResult")
    Optional<HostCache> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HostCacheResult", value = {
        @Result(column="IP", property="ip", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="HOST", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOST_VALIDATED", property="hostValidated", jdbcType=JdbcType.CHAR),
        @Result(column="SUM_CONNECT_ERRORS", property="sumConnectErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_HOST_BLOCKED_ERRORS", property="countHostBlockedErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_NAMEINFO_TRANSIENT_ERRORS", property="countNameinfoTransientErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_NAMEINFO_PERMANENT_ERRORS", property="countNameinfoPermanentErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_FORMAT_ERRORS", property="countFormatErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_ADDRINFO_TRANSIENT_ERRORS", property="countAddrinfoTransientErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_ADDRINFO_PERMANENT_ERRORS", property="countAddrinfoPermanentErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_FCRDNS_ERRORS", property="countFcrdnsErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_HOST_ACL_ERRORS", property="countHostAclErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_NO_AUTH_PLUGIN_ERRORS", property="countNoAuthPluginErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_AUTH_PLUGIN_ERRORS", property="countAuthPluginErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_HANDSHAKE_ERRORS", property="countHandshakeErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_PROXY_USER_ERRORS", property="countProxyUserErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_PROXY_USER_ACL_ERRORS", property="countProxyUserAclErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_AUTHENTICATION_ERRORS", property="countAuthenticationErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_SSL_ERRORS", property="countSslErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_MAX_USER_CONNECTIONS_ERRORS", property="countMaxUserConnectionsErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS", property="countMaxUserConnectionsPerHourErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_DEFAULT_DATABASE_ERRORS", property="countDefaultDatabaseErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_INIT_CONNECT_ERRORS", property="countInitConnectErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_LOCAL_ERRORS", property="countLocalErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_UNKNOWN_ERRORS", property="countUnknownErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="FIRST_SEEN", property="firstSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_SEEN", property="lastSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FIRST_ERROR_SEEN", property="firstErrorSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_ERROR_SEEN", property="lastErrorSeen", jdbcType=JdbcType.TIMESTAMP)
    })
    List<HostCache> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hostCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hostCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    default int deleteByPrimaryKey(String ip_) {
        return delete(c -> 
            c.where(ip, isEqualTo(ip_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    default int insert(HostCache record) {
        return MyBatis3Utils.insert(this::insert, record, hostCache, c ->
            c.map(ip).toProperty("ip")
            .map(host).toProperty("host")
            .map(hostValidated).toProperty("hostValidated")
            .map(sumConnectErrors).toProperty("sumConnectErrors")
            .map(countHostBlockedErrors).toProperty("countHostBlockedErrors")
            .map(countNameinfoTransientErrors).toProperty("countNameinfoTransientErrors")
            .map(countNameinfoPermanentErrors).toProperty("countNameinfoPermanentErrors")
            .map(countFormatErrors).toProperty("countFormatErrors")
            .map(countAddrinfoTransientErrors).toProperty("countAddrinfoTransientErrors")
            .map(countAddrinfoPermanentErrors).toProperty("countAddrinfoPermanentErrors")
            .map(countFcrdnsErrors).toProperty("countFcrdnsErrors")
            .map(countHostAclErrors).toProperty("countHostAclErrors")
            .map(countNoAuthPluginErrors).toProperty("countNoAuthPluginErrors")
            .map(countAuthPluginErrors).toProperty("countAuthPluginErrors")
            .map(countHandshakeErrors).toProperty("countHandshakeErrors")
            .map(countProxyUserErrors).toProperty("countProxyUserErrors")
            .map(countProxyUserAclErrors).toProperty("countProxyUserAclErrors")
            .map(countAuthenticationErrors).toProperty("countAuthenticationErrors")
            .map(countSslErrors).toProperty("countSslErrors")
            .map(countMaxUserConnectionsErrors).toProperty("countMaxUserConnectionsErrors")
            .map(countMaxUserConnectionsPerHourErrors).toProperty("countMaxUserConnectionsPerHourErrors")
            .map(countDefaultDatabaseErrors).toProperty("countDefaultDatabaseErrors")
            .map(countInitConnectErrors).toProperty("countInitConnectErrors")
            .map(countLocalErrors).toProperty("countLocalErrors")
            .map(countUnknownErrors).toProperty("countUnknownErrors")
            .map(firstSeen).toProperty("firstSeen")
            .map(lastSeen).toProperty("lastSeen")
            .map(firstErrorSeen).toProperty("firstErrorSeen")
            .map(lastErrorSeen).toProperty("lastErrorSeen")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    default int insertSelective(HostCache record) {
        return MyBatis3Utils.insert(this::insert, record, hostCache, c ->
            c.map(ip).toPropertyWhenPresent("ip", record::getIp)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(hostValidated).toPropertyWhenPresent("hostValidated", record::getHostValidated)
            .map(sumConnectErrors).toPropertyWhenPresent("sumConnectErrors", record::getSumConnectErrors)
            .map(countHostBlockedErrors).toPropertyWhenPresent("countHostBlockedErrors", record::getCountHostBlockedErrors)
            .map(countNameinfoTransientErrors).toPropertyWhenPresent("countNameinfoTransientErrors", record::getCountNameinfoTransientErrors)
            .map(countNameinfoPermanentErrors).toPropertyWhenPresent("countNameinfoPermanentErrors", record::getCountNameinfoPermanentErrors)
            .map(countFormatErrors).toPropertyWhenPresent("countFormatErrors", record::getCountFormatErrors)
            .map(countAddrinfoTransientErrors).toPropertyWhenPresent("countAddrinfoTransientErrors", record::getCountAddrinfoTransientErrors)
            .map(countAddrinfoPermanentErrors).toPropertyWhenPresent("countAddrinfoPermanentErrors", record::getCountAddrinfoPermanentErrors)
            .map(countFcrdnsErrors).toPropertyWhenPresent("countFcrdnsErrors", record::getCountFcrdnsErrors)
            .map(countHostAclErrors).toPropertyWhenPresent("countHostAclErrors", record::getCountHostAclErrors)
            .map(countNoAuthPluginErrors).toPropertyWhenPresent("countNoAuthPluginErrors", record::getCountNoAuthPluginErrors)
            .map(countAuthPluginErrors).toPropertyWhenPresent("countAuthPluginErrors", record::getCountAuthPluginErrors)
            .map(countHandshakeErrors).toPropertyWhenPresent("countHandshakeErrors", record::getCountHandshakeErrors)
            .map(countProxyUserErrors).toPropertyWhenPresent("countProxyUserErrors", record::getCountProxyUserErrors)
            .map(countProxyUserAclErrors).toPropertyWhenPresent("countProxyUserAclErrors", record::getCountProxyUserAclErrors)
            .map(countAuthenticationErrors).toPropertyWhenPresent("countAuthenticationErrors", record::getCountAuthenticationErrors)
            .map(countSslErrors).toPropertyWhenPresent("countSslErrors", record::getCountSslErrors)
            .map(countMaxUserConnectionsErrors).toPropertyWhenPresent("countMaxUserConnectionsErrors", record::getCountMaxUserConnectionsErrors)
            .map(countMaxUserConnectionsPerHourErrors).toPropertyWhenPresent("countMaxUserConnectionsPerHourErrors", record::getCountMaxUserConnectionsPerHourErrors)
            .map(countDefaultDatabaseErrors).toPropertyWhenPresent("countDefaultDatabaseErrors", record::getCountDefaultDatabaseErrors)
            .map(countInitConnectErrors).toPropertyWhenPresent("countInitConnectErrors", record::getCountInitConnectErrors)
            .map(countLocalErrors).toPropertyWhenPresent("countLocalErrors", record::getCountLocalErrors)
            .map(countUnknownErrors).toPropertyWhenPresent("countUnknownErrors", record::getCountUnknownErrors)
            .map(firstSeen).toPropertyWhenPresent("firstSeen", record::getFirstSeen)
            .map(lastSeen).toPropertyWhenPresent("lastSeen", record::getLastSeen)
            .map(firstErrorSeen).toPropertyWhenPresent("firstErrorSeen", record::getFirstErrorSeen)
            .map(lastErrorSeen).toPropertyWhenPresent("lastErrorSeen", record::getLastErrorSeen)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    default Optional<HostCache> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hostCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    default List<HostCache> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hostCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source Table: host_cache")
    default List<HostCache> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hostCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: host_cache")
    default Optional<HostCache> selectByPrimaryKey(String ip_) {
        return selectOne(c ->
            c.where(ip, isEqualTo(ip_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: host_cache")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hostCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: host_cache")
    static UpdateDSL<UpdateModel> updateAllColumns(HostCache record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ip).equalTo(record::getIp)
                .set(host).equalTo(record::getHost)
                .set(hostValidated).equalTo(record::getHostValidated)
                .set(sumConnectErrors).equalTo(record::getSumConnectErrors)
                .set(countHostBlockedErrors).equalTo(record::getCountHostBlockedErrors)
                .set(countNameinfoTransientErrors).equalTo(record::getCountNameinfoTransientErrors)
                .set(countNameinfoPermanentErrors).equalTo(record::getCountNameinfoPermanentErrors)
                .set(countFormatErrors).equalTo(record::getCountFormatErrors)
                .set(countAddrinfoTransientErrors).equalTo(record::getCountAddrinfoTransientErrors)
                .set(countAddrinfoPermanentErrors).equalTo(record::getCountAddrinfoPermanentErrors)
                .set(countFcrdnsErrors).equalTo(record::getCountFcrdnsErrors)
                .set(countHostAclErrors).equalTo(record::getCountHostAclErrors)
                .set(countNoAuthPluginErrors).equalTo(record::getCountNoAuthPluginErrors)
                .set(countAuthPluginErrors).equalTo(record::getCountAuthPluginErrors)
                .set(countHandshakeErrors).equalTo(record::getCountHandshakeErrors)
                .set(countProxyUserErrors).equalTo(record::getCountProxyUserErrors)
                .set(countProxyUserAclErrors).equalTo(record::getCountProxyUserAclErrors)
                .set(countAuthenticationErrors).equalTo(record::getCountAuthenticationErrors)
                .set(countSslErrors).equalTo(record::getCountSslErrors)
                .set(countMaxUserConnectionsErrors).equalTo(record::getCountMaxUserConnectionsErrors)
                .set(countMaxUserConnectionsPerHourErrors).equalTo(record::getCountMaxUserConnectionsPerHourErrors)
                .set(countDefaultDatabaseErrors).equalTo(record::getCountDefaultDatabaseErrors)
                .set(countInitConnectErrors).equalTo(record::getCountInitConnectErrors)
                .set(countLocalErrors).equalTo(record::getCountLocalErrors)
                .set(countUnknownErrors).equalTo(record::getCountUnknownErrors)
                .set(firstSeen).equalTo(record::getFirstSeen)
                .set(lastSeen).equalTo(record::getLastSeen)
                .set(firstErrorSeen).equalTo(record::getFirstErrorSeen)
                .set(lastErrorSeen).equalTo(record::getLastErrorSeen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: host_cache")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HostCache record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(ip).equalToWhenPresent(record::getIp)
                .set(host).equalToWhenPresent(record::getHost)
                .set(hostValidated).equalToWhenPresent(record::getHostValidated)
                .set(sumConnectErrors).equalToWhenPresent(record::getSumConnectErrors)
                .set(countHostBlockedErrors).equalToWhenPresent(record::getCountHostBlockedErrors)
                .set(countNameinfoTransientErrors).equalToWhenPresent(record::getCountNameinfoTransientErrors)
                .set(countNameinfoPermanentErrors).equalToWhenPresent(record::getCountNameinfoPermanentErrors)
                .set(countFormatErrors).equalToWhenPresent(record::getCountFormatErrors)
                .set(countAddrinfoTransientErrors).equalToWhenPresent(record::getCountAddrinfoTransientErrors)
                .set(countAddrinfoPermanentErrors).equalToWhenPresent(record::getCountAddrinfoPermanentErrors)
                .set(countFcrdnsErrors).equalToWhenPresent(record::getCountFcrdnsErrors)
                .set(countHostAclErrors).equalToWhenPresent(record::getCountHostAclErrors)
                .set(countNoAuthPluginErrors).equalToWhenPresent(record::getCountNoAuthPluginErrors)
                .set(countAuthPluginErrors).equalToWhenPresent(record::getCountAuthPluginErrors)
                .set(countHandshakeErrors).equalToWhenPresent(record::getCountHandshakeErrors)
                .set(countProxyUserErrors).equalToWhenPresent(record::getCountProxyUserErrors)
                .set(countProxyUserAclErrors).equalToWhenPresent(record::getCountProxyUserAclErrors)
                .set(countAuthenticationErrors).equalToWhenPresent(record::getCountAuthenticationErrors)
                .set(countSslErrors).equalToWhenPresent(record::getCountSslErrors)
                .set(countMaxUserConnectionsErrors).equalToWhenPresent(record::getCountMaxUserConnectionsErrors)
                .set(countMaxUserConnectionsPerHourErrors).equalToWhenPresent(record::getCountMaxUserConnectionsPerHourErrors)
                .set(countDefaultDatabaseErrors).equalToWhenPresent(record::getCountDefaultDatabaseErrors)
                .set(countInitConnectErrors).equalToWhenPresent(record::getCountInitConnectErrors)
                .set(countLocalErrors).equalToWhenPresent(record::getCountLocalErrors)
                .set(countUnknownErrors).equalToWhenPresent(record::getCountUnknownErrors)
                .set(firstSeen).equalToWhenPresent(record::getFirstSeen)
                .set(lastSeen).equalToWhenPresent(record::getLastSeen)
                .set(firstErrorSeen).equalToWhenPresent(record::getFirstErrorSeen)
                .set(lastErrorSeen).equalToWhenPresent(record::getLastErrorSeen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: host_cache")
    default int updateByPrimaryKey(HostCache record) {
        return update(c ->
            c.set(host).equalTo(record::getHost)
            .set(hostValidated).equalTo(record::getHostValidated)
            .set(sumConnectErrors).equalTo(record::getSumConnectErrors)
            .set(countHostBlockedErrors).equalTo(record::getCountHostBlockedErrors)
            .set(countNameinfoTransientErrors).equalTo(record::getCountNameinfoTransientErrors)
            .set(countNameinfoPermanentErrors).equalTo(record::getCountNameinfoPermanentErrors)
            .set(countFormatErrors).equalTo(record::getCountFormatErrors)
            .set(countAddrinfoTransientErrors).equalTo(record::getCountAddrinfoTransientErrors)
            .set(countAddrinfoPermanentErrors).equalTo(record::getCountAddrinfoPermanentErrors)
            .set(countFcrdnsErrors).equalTo(record::getCountFcrdnsErrors)
            .set(countHostAclErrors).equalTo(record::getCountHostAclErrors)
            .set(countNoAuthPluginErrors).equalTo(record::getCountNoAuthPluginErrors)
            .set(countAuthPluginErrors).equalTo(record::getCountAuthPluginErrors)
            .set(countHandshakeErrors).equalTo(record::getCountHandshakeErrors)
            .set(countProxyUserErrors).equalTo(record::getCountProxyUserErrors)
            .set(countProxyUserAclErrors).equalTo(record::getCountProxyUserAclErrors)
            .set(countAuthenticationErrors).equalTo(record::getCountAuthenticationErrors)
            .set(countSslErrors).equalTo(record::getCountSslErrors)
            .set(countMaxUserConnectionsErrors).equalTo(record::getCountMaxUserConnectionsErrors)
            .set(countMaxUserConnectionsPerHourErrors).equalTo(record::getCountMaxUserConnectionsPerHourErrors)
            .set(countDefaultDatabaseErrors).equalTo(record::getCountDefaultDatabaseErrors)
            .set(countInitConnectErrors).equalTo(record::getCountInitConnectErrors)
            .set(countLocalErrors).equalTo(record::getCountLocalErrors)
            .set(countUnknownErrors).equalTo(record::getCountUnknownErrors)
            .set(firstSeen).equalTo(record::getFirstSeen)
            .set(lastSeen).equalTo(record::getLastSeen)
            .set(firstErrorSeen).equalTo(record::getFirstErrorSeen)
            .set(lastErrorSeen).equalTo(record::getLastErrorSeen)
            .where(ip, isEqualTo(record::getIp))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: host_cache")
    default int updateByPrimaryKeySelective(HostCache record) {
        return update(c ->
            c.set(host).equalToWhenPresent(record::getHost)
            .set(hostValidated).equalToWhenPresent(record::getHostValidated)
            .set(sumConnectErrors).equalToWhenPresent(record::getSumConnectErrors)
            .set(countHostBlockedErrors).equalToWhenPresent(record::getCountHostBlockedErrors)
            .set(countNameinfoTransientErrors).equalToWhenPresent(record::getCountNameinfoTransientErrors)
            .set(countNameinfoPermanentErrors).equalToWhenPresent(record::getCountNameinfoPermanentErrors)
            .set(countFormatErrors).equalToWhenPresent(record::getCountFormatErrors)
            .set(countAddrinfoTransientErrors).equalToWhenPresent(record::getCountAddrinfoTransientErrors)
            .set(countAddrinfoPermanentErrors).equalToWhenPresent(record::getCountAddrinfoPermanentErrors)
            .set(countFcrdnsErrors).equalToWhenPresent(record::getCountFcrdnsErrors)
            .set(countHostAclErrors).equalToWhenPresent(record::getCountHostAclErrors)
            .set(countNoAuthPluginErrors).equalToWhenPresent(record::getCountNoAuthPluginErrors)
            .set(countAuthPluginErrors).equalToWhenPresent(record::getCountAuthPluginErrors)
            .set(countHandshakeErrors).equalToWhenPresent(record::getCountHandshakeErrors)
            .set(countProxyUserErrors).equalToWhenPresent(record::getCountProxyUserErrors)
            .set(countProxyUserAclErrors).equalToWhenPresent(record::getCountProxyUserAclErrors)
            .set(countAuthenticationErrors).equalToWhenPresent(record::getCountAuthenticationErrors)
            .set(countSslErrors).equalToWhenPresent(record::getCountSslErrors)
            .set(countMaxUserConnectionsErrors).equalToWhenPresent(record::getCountMaxUserConnectionsErrors)
            .set(countMaxUserConnectionsPerHourErrors).equalToWhenPresent(record::getCountMaxUserConnectionsPerHourErrors)
            .set(countDefaultDatabaseErrors).equalToWhenPresent(record::getCountDefaultDatabaseErrors)
            .set(countInitConnectErrors).equalToWhenPresent(record::getCountInitConnectErrors)
            .set(countLocalErrors).equalToWhenPresent(record::getCountLocalErrors)
            .set(countUnknownErrors).equalToWhenPresent(record::getCountUnknownErrors)
            .set(firstSeen).equalToWhenPresent(record::getFirstSeen)
            .set(lastSeen).equalToWhenPresent(record::getLastSeen)
            .set(firstErrorSeen).equalToWhenPresent(record::getFirstErrorSeen)
            .set(lastErrorSeen).equalToWhenPresent(record::getLastErrorSeen)
            .where(ip, isEqualTo(record::getIp))
        );
    }
}