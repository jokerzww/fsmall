package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SlaveMasterInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SlaveMasterInfo;
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
public interface SlaveMasterInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, numberOfLines, masterLogPos, host, port, connectRetry, enabledSsl, sslVerifyServerCert, heartbeat, retryCount, enabledAutoPosition, getPublicKey, masterCompressionAlgorithm, masterZstdCompressionLevel, masterLogName, userName, userPassword, sslCa, sslCapath, sslCert, sslCipher, sslKey, bind, ignoredServerIds, uuid, sslCrl, sslCrlpath, tlsVersion, publicKeyPath, networkNamespace, tlsCiphersuites);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0377492+08:00", comments="Source Table: slave_master_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0377492+08:00", comments="Source Table: slave_master_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0377492+08:00", comments="Source Table: slave_master_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SlaveMasterInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SlaveMasterInfoResult")
    Optional<SlaveMasterInfo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SlaveMasterInfoResult", value = {
        @Result(column="Channel_name", property="channelName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Number_of_lines", property="numberOfLines", jdbcType=JdbcType.INTEGER),
        @Result(column="Master_log_pos", property="masterLogPos", jdbcType=JdbcType.BIGINT),
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR),
        @Result(column="Port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="Connect_retry", property="connectRetry", jdbcType=JdbcType.INTEGER),
        @Result(column="Enabled_ssl", property="enabledSsl", jdbcType=JdbcType.BIT),
        @Result(column="Ssl_verify_server_cert", property="sslVerifyServerCert", jdbcType=JdbcType.BIT),
        @Result(column="Heartbeat", property="heartbeat", jdbcType=JdbcType.REAL),
        @Result(column="Retry_count", property="retryCount", jdbcType=JdbcType.BIGINT),
        @Result(column="Enabled_auto_position", property="enabledAutoPosition", jdbcType=JdbcType.BIT),
        @Result(column="Get_public_key", property="getPublicKey", jdbcType=JdbcType.BIT),
        @Result(column="Master_compression_algorithm", property="masterCompressionAlgorithm", jdbcType=JdbcType.CHAR),
        @Result(column="Master_zstd_compression_level", property="masterZstdCompressionLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="Master_log_name", property="masterLogName", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="User_name", property="userName", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="User_password", property="userPassword", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Ssl_ca", property="sslCa", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Ssl_capath", property="sslCapath", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Ssl_cert", property="sslCert", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Ssl_cipher", property="sslCipher", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Ssl_key", property="sslKey", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Bind", property="bind", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Ignored_server_ids", property="ignoredServerIds", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Uuid", property="uuid", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Ssl_crl", property="sslCrl", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Ssl_crlpath", property="sslCrlpath", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Tls_version", property="tlsVersion", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Public_key_path", property="publicKeyPath", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Network_namespace", property="networkNamespace", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Tls_ciphersuites", property="tlsCiphersuites", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SlaveMasterInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, slaveMasterInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, slaveMasterInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    default int deleteByPrimaryKey(String channelName_) {
        return delete(c -> 
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    default int insert(SlaveMasterInfo record) {
        return MyBatis3Utils.insert(this::insert, record, slaveMasterInfo, c ->
            c.map(channelName).toProperty("channelName")
            .map(numberOfLines).toProperty("numberOfLines")
            .map(masterLogPos).toProperty("masterLogPos")
            .map(host).toProperty("host")
            .map(port).toProperty("port")
            .map(connectRetry).toProperty("connectRetry")
            .map(enabledSsl).toProperty("enabledSsl")
            .map(sslVerifyServerCert).toProperty("sslVerifyServerCert")
            .map(heartbeat).toProperty("heartbeat")
            .map(retryCount).toProperty("retryCount")
            .map(enabledAutoPosition).toProperty("enabledAutoPosition")
            .map(getPublicKey).toProperty("getPublicKey")
            .map(masterCompressionAlgorithm).toProperty("masterCompressionAlgorithm")
            .map(masterZstdCompressionLevel).toProperty("masterZstdCompressionLevel")
            .map(masterLogName).toProperty("masterLogName")
            .map(userName).toProperty("userName")
            .map(userPassword).toProperty("userPassword")
            .map(sslCa).toProperty("sslCa")
            .map(sslCapath).toProperty("sslCapath")
            .map(sslCert).toProperty("sslCert")
            .map(sslCipher).toProperty("sslCipher")
            .map(sslKey).toProperty("sslKey")
            .map(bind).toProperty("bind")
            .map(ignoredServerIds).toProperty("ignoredServerIds")
            .map(uuid).toProperty("uuid")
            .map(sslCrl).toProperty("sslCrl")
            .map(sslCrlpath).toProperty("sslCrlpath")
            .map(tlsVersion).toProperty("tlsVersion")
            .map(publicKeyPath).toProperty("publicKeyPath")
            .map(networkNamespace).toProperty("networkNamespace")
            .map(tlsCiphersuites).toProperty("tlsCiphersuites")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    default int insertSelective(SlaveMasterInfo record) {
        return MyBatis3Utils.insert(this::insert, record, slaveMasterInfo, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(numberOfLines).toPropertyWhenPresent("numberOfLines", record::getNumberOfLines)
            .map(masterLogPos).toPropertyWhenPresent("masterLogPos", record::getMasterLogPos)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(port).toPropertyWhenPresent("port", record::getPort)
            .map(connectRetry).toPropertyWhenPresent("connectRetry", record::getConnectRetry)
            .map(enabledSsl).toPropertyWhenPresent("enabledSsl", record::getEnabledSsl)
            .map(sslVerifyServerCert).toPropertyWhenPresent("sslVerifyServerCert", record::getSslVerifyServerCert)
            .map(heartbeat).toPropertyWhenPresent("heartbeat", record::getHeartbeat)
            .map(retryCount).toPropertyWhenPresent("retryCount", record::getRetryCount)
            .map(enabledAutoPosition).toPropertyWhenPresent("enabledAutoPosition", record::getEnabledAutoPosition)
            .map(getPublicKey).toPropertyWhenPresent("getPublicKey", record::getGetPublicKey)
            .map(masterCompressionAlgorithm).toPropertyWhenPresent("masterCompressionAlgorithm", record::getMasterCompressionAlgorithm)
            .map(masterZstdCompressionLevel).toPropertyWhenPresent("masterZstdCompressionLevel", record::getMasterZstdCompressionLevel)
            .map(masterLogName).toPropertyWhenPresent("masterLogName", record::getMasterLogName)
            .map(userName).toPropertyWhenPresent("userName", record::getUserName)
            .map(userPassword).toPropertyWhenPresent("userPassword", record::getUserPassword)
            .map(sslCa).toPropertyWhenPresent("sslCa", record::getSslCa)
            .map(sslCapath).toPropertyWhenPresent("sslCapath", record::getSslCapath)
            .map(sslCert).toPropertyWhenPresent("sslCert", record::getSslCert)
            .map(sslCipher).toPropertyWhenPresent("sslCipher", record::getSslCipher)
            .map(sslKey).toPropertyWhenPresent("sslKey", record::getSslKey)
            .map(bind).toPropertyWhenPresent("bind", record::getBind)
            .map(ignoredServerIds).toPropertyWhenPresent("ignoredServerIds", record::getIgnoredServerIds)
            .map(uuid).toPropertyWhenPresent("uuid", record::getUuid)
            .map(sslCrl).toPropertyWhenPresent("sslCrl", record::getSslCrl)
            .map(sslCrlpath).toPropertyWhenPresent("sslCrlpath", record::getSslCrlpath)
            .map(tlsVersion).toPropertyWhenPresent("tlsVersion", record::getTlsVersion)
            .map(publicKeyPath).toPropertyWhenPresent("publicKeyPath", record::getPublicKeyPath)
            .map(networkNamespace).toPropertyWhenPresent("networkNamespace", record::getNetworkNamespace)
            .map(tlsCiphersuites).toPropertyWhenPresent("tlsCiphersuites", record::getTlsCiphersuites)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    default Optional<SlaveMasterInfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, slaveMasterInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    default List<SlaveMasterInfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, slaveMasterInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.03875+08:00", comments="Source Table: slave_master_info")
    default List<SlaveMasterInfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, slaveMasterInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0397509+08:00", comments="Source Table: slave_master_info")
    default Optional<SlaveMasterInfo> selectByPrimaryKey(String channelName_) {
        return selectOne(c ->
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0397509+08:00", comments="Source Table: slave_master_info")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, slaveMasterInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0397509+08:00", comments="Source Table: slave_master_info")
    static UpdateDSL<UpdateModel> updateAllColumns(SlaveMasterInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(numberOfLines).equalTo(record::getNumberOfLines)
                .set(masterLogPos).equalTo(record::getMasterLogPos)
                .set(host).equalTo(record::getHost)
                .set(port).equalTo(record::getPort)
                .set(connectRetry).equalTo(record::getConnectRetry)
                .set(enabledSsl).equalTo(record::getEnabledSsl)
                .set(sslVerifyServerCert).equalTo(record::getSslVerifyServerCert)
                .set(heartbeat).equalTo(record::getHeartbeat)
                .set(retryCount).equalTo(record::getRetryCount)
                .set(enabledAutoPosition).equalTo(record::getEnabledAutoPosition)
                .set(getPublicKey).equalTo(record::getGetPublicKey)
                .set(masterCompressionAlgorithm).equalTo(record::getMasterCompressionAlgorithm)
                .set(masterZstdCompressionLevel).equalTo(record::getMasterZstdCompressionLevel)
                .set(masterLogName).equalTo(record::getMasterLogName)
                .set(userName).equalTo(record::getUserName)
                .set(userPassword).equalTo(record::getUserPassword)
                .set(sslCa).equalTo(record::getSslCa)
                .set(sslCapath).equalTo(record::getSslCapath)
                .set(sslCert).equalTo(record::getSslCert)
                .set(sslCipher).equalTo(record::getSslCipher)
                .set(sslKey).equalTo(record::getSslKey)
                .set(bind).equalTo(record::getBind)
                .set(ignoredServerIds).equalTo(record::getIgnoredServerIds)
                .set(uuid).equalTo(record::getUuid)
                .set(sslCrl).equalTo(record::getSslCrl)
                .set(sslCrlpath).equalTo(record::getSslCrlpath)
                .set(tlsVersion).equalTo(record::getTlsVersion)
                .set(publicKeyPath).equalTo(record::getPublicKeyPath)
                .set(networkNamespace).equalTo(record::getNetworkNamespace)
                .set(tlsCiphersuites).equalTo(record::getTlsCiphersuites);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0397509+08:00", comments="Source Table: slave_master_info")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SlaveMasterInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(numberOfLines).equalToWhenPresent(record::getNumberOfLines)
                .set(masterLogPos).equalToWhenPresent(record::getMasterLogPos)
                .set(host).equalToWhenPresent(record::getHost)
                .set(port).equalToWhenPresent(record::getPort)
                .set(connectRetry).equalToWhenPresent(record::getConnectRetry)
                .set(enabledSsl).equalToWhenPresent(record::getEnabledSsl)
                .set(sslVerifyServerCert).equalToWhenPresent(record::getSslVerifyServerCert)
                .set(heartbeat).equalToWhenPresent(record::getHeartbeat)
                .set(retryCount).equalToWhenPresent(record::getRetryCount)
                .set(enabledAutoPosition).equalToWhenPresent(record::getEnabledAutoPosition)
                .set(getPublicKey).equalToWhenPresent(record::getGetPublicKey)
                .set(masterCompressionAlgorithm).equalToWhenPresent(record::getMasterCompressionAlgorithm)
                .set(masterZstdCompressionLevel).equalToWhenPresent(record::getMasterZstdCompressionLevel)
                .set(masterLogName).equalToWhenPresent(record::getMasterLogName)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(userPassword).equalToWhenPresent(record::getUserPassword)
                .set(sslCa).equalToWhenPresent(record::getSslCa)
                .set(sslCapath).equalToWhenPresent(record::getSslCapath)
                .set(sslCert).equalToWhenPresent(record::getSslCert)
                .set(sslCipher).equalToWhenPresent(record::getSslCipher)
                .set(sslKey).equalToWhenPresent(record::getSslKey)
                .set(bind).equalToWhenPresent(record::getBind)
                .set(ignoredServerIds).equalToWhenPresent(record::getIgnoredServerIds)
                .set(uuid).equalToWhenPresent(record::getUuid)
                .set(sslCrl).equalToWhenPresent(record::getSslCrl)
                .set(sslCrlpath).equalToWhenPresent(record::getSslCrlpath)
                .set(tlsVersion).equalToWhenPresent(record::getTlsVersion)
                .set(publicKeyPath).equalToWhenPresent(record::getPublicKeyPath)
                .set(networkNamespace).equalToWhenPresent(record::getNetworkNamespace)
                .set(tlsCiphersuites).equalToWhenPresent(record::getTlsCiphersuites);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0397509+08:00", comments="Source Table: slave_master_info")
    default int updateByPrimaryKey(SlaveMasterInfo record) {
        return update(c ->
            c.set(numberOfLines).equalTo(record::getNumberOfLines)
            .set(masterLogPos).equalTo(record::getMasterLogPos)
            .set(host).equalTo(record::getHost)
            .set(port).equalTo(record::getPort)
            .set(connectRetry).equalTo(record::getConnectRetry)
            .set(enabledSsl).equalTo(record::getEnabledSsl)
            .set(sslVerifyServerCert).equalTo(record::getSslVerifyServerCert)
            .set(heartbeat).equalTo(record::getHeartbeat)
            .set(retryCount).equalTo(record::getRetryCount)
            .set(enabledAutoPosition).equalTo(record::getEnabledAutoPosition)
            .set(getPublicKey).equalTo(record::getGetPublicKey)
            .set(masterCompressionAlgorithm).equalTo(record::getMasterCompressionAlgorithm)
            .set(masterZstdCompressionLevel).equalTo(record::getMasterZstdCompressionLevel)
            .set(masterLogName).equalTo(record::getMasterLogName)
            .set(userName).equalTo(record::getUserName)
            .set(userPassword).equalTo(record::getUserPassword)
            .set(sslCa).equalTo(record::getSslCa)
            .set(sslCapath).equalTo(record::getSslCapath)
            .set(sslCert).equalTo(record::getSslCert)
            .set(sslCipher).equalTo(record::getSslCipher)
            .set(sslKey).equalTo(record::getSslKey)
            .set(bind).equalTo(record::getBind)
            .set(ignoredServerIds).equalTo(record::getIgnoredServerIds)
            .set(uuid).equalTo(record::getUuid)
            .set(sslCrl).equalTo(record::getSslCrl)
            .set(sslCrlpath).equalTo(record::getSslCrlpath)
            .set(tlsVersion).equalTo(record::getTlsVersion)
            .set(publicKeyPath).equalTo(record::getPublicKeyPath)
            .set(networkNamespace).equalTo(record::getNetworkNamespace)
            .set(tlsCiphersuites).equalTo(record::getTlsCiphersuites)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0397509+08:00", comments="Source Table: slave_master_info")
    default int updateByPrimaryKeySelective(SlaveMasterInfo record) {
        return update(c ->
            c.set(numberOfLines).equalToWhenPresent(record::getNumberOfLines)
            .set(masterLogPos).equalToWhenPresent(record::getMasterLogPos)
            .set(host).equalToWhenPresent(record::getHost)
            .set(port).equalToWhenPresent(record::getPort)
            .set(connectRetry).equalToWhenPresent(record::getConnectRetry)
            .set(enabledSsl).equalToWhenPresent(record::getEnabledSsl)
            .set(sslVerifyServerCert).equalToWhenPresent(record::getSslVerifyServerCert)
            .set(heartbeat).equalToWhenPresent(record::getHeartbeat)
            .set(retryCount).equalToWhenPresent(record::getRetryCount)
            .set(enabledAutoPosition).equalToWhenPresent(record::getEnabledAutoPosition)
            .set(getPublicKey).equalToWhenPresent(record::getGetPublicKey)
            .set(masterCompressionAlgorithm).equalToWhenPresent(record::getMasterCompressionAlgorithm)
            .set(masterZstdCompressionLevel).equalToWhenPresent(record::getMasterZstdCompressionLevel)
            .set(masterLogName).equalToWhenPresent(record::getMasterLogName)
            .set(userName).equalToWhenPresent(record::getUserName)
            .set(userPassword).equalToWhenPresent(record::getUserPassword)
            .set(sslCa).equalToWhenPresent(record::getSslCa)
            .set(sslCapath).equalToWhenPresent(record::getSslCapath)
            .set(sslCert).equalToWhenPresent(record::getSslCert)
            .set(sslCipher).equalToWhenPresent(record::getSslCipher)
            .set(sslKey).equalToWhenPresent(record::getSslKey)
            .set(bind).equalToWhenPresent(record::getBind)
            .set(ignoredServerIds).equalToWhenPresent(record::getIgnoredServerIds)
            .set(uuid).equalToWhenPresent(record::getUuid)
            .set(sslCrl).equalToWhenPresent(record::getSslCrl)
            .set(sslCrlpath).equalToWhenPresent(record::getSslCrlpath)
            .set(tlsVersion).equalToWhenPresent(record::getTlsVersion)
            .set(publicKeyPath).equalToWhenPresent(record::getPublicKeyPath)
            .set(networkNamespace).equalToWhenPresent(record::getNetworkNamespace)
            .set(tlsCiphersuites).equalToWhenPresent(record::getTlsCiphersuites)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }
}