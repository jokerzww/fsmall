package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ReplicationConnectionConfigurationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ReplicationConnectionConfiguration;
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
public interface ReplicationConnectionConfigurationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, host, port, user, networkInterface, autoPosition, sslAllowed, sslCaFile, sslCaPath, sslCertificate, sslCipher, sslKey, sslVerifyServerCertificate, sslCrlFile, sslCrlPath, connectionRetryInterval, connectionRetryCount, heartbeatInterval, tlsVersion, publicKeyPath, getPublicKey, networkNamespace, compressionAlgorithm, zstdCompressionLevel, tlsCiphersuites);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReplicationConnectionConfiguration> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReplicationConnectionConfigurationResult")
    Optional<ReplicationConnectionConfiguration> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReplicationConnectionConfigurationResult", value = {
        @Result(column="CHANNEL_NAME", property="channelName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="HOST", property="host", jdbcType=JdbcType.CHAR),
        @Result(column="PORT", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="USER", property="user", jdbcType=JdbcType.CHAR),
        @Result(column="NETWORK_INTERFACE", property="networkInterface", jdbcType=JdbcType.CHAR),
        @Result(column="AUTO_POSITION", property="autoPosition", jdbcType=JdbcType.CHAR),
        @Result(column="SSL_ALLOWED", property="sslAllowed", jdbcType=JdbcType.CHAR),
        @Result(column="SSL_CA_FILE", property="sslCaFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="SSL_CA_PATH", property="sslCaPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="SSL_CERTIFICATE", property="sslCertificate", jdbcType=JdbcType.VARCHAR),
        @Result(column="SSL_CIPHER", property="sslCipher", jdbcType=JdbcType.VARCHAR),
        @Result(column="SSL_KEY", property="sslKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="SSL_VERIFY_SERVER_CERTIFICATE", property="sslVerifyServerCertificate", jdbcType=JdbcType.CHAR),
        @Result(column="SSL_CRL_FILE", property="sslCrlFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="SSL_CRL_PATH", property="sslCrlPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONNECTION_RETRY_INTERVAL", property="connectionRetryInterval", jdbcType=JdbcType.INTEGER),
        @Result(column="CONNECTION_RETRY_COUNT", property="connectionRetryCount", jdbcType=JdbcType.BIGINT),
        @Result(column="HEARTBEAT_INTERVAL", property="heartbeatInterval", jdbcType=JdbcType.DOUBLE),
        @Result(column="TLS_VERSION", property="tlsVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PUBLIC_KEY_PATH", property="publicKeyPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="GET_PUBLIC_KEY", property="getPublicKey", jdbcType=JdbcType.CHAR),
        @Result(column="NETWORK_NAMESPACE", property="networkNamespace", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMPRESSION_ALGORITHM", property="compressionAlgorithm", jdbcType=JdbcType.CHAR),
        @Result(column="ZSTD_COMPRESSION_LEVEL", property="zstdCompressionLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="TLS_CIPHERSUITES", property="tlsCiphersuites", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ReplicationConnectionConfiguration> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, replicationConnectionConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, replicationConnectionConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    default int deleteByPrimaryKey(String channelName_) {
        return delete(c -> 
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    default int insert(ReplicationConnectionConfiguration record) {
        return MyBatis3Utils.insert(this::insert, record, replicationConnectionConfiguration, c ->
            c.map(channelName).toProperty("channelName")
            .map(host).toProperty("host")
            .map(port).toProperty("port")
            .map(user).toProperty("user")
            .map(networkInterface).toProperty("networkInterface")
            .map(autoPosition).toProperty("autoPosition")
            .map(sslAllowed).toProperty("sslAllowed")
            .map(sslCaFile).toProperty("sslCaFile")
            .map(sslCaPath).toProperty("sslCaPath")
            .map(sslCertificate).toProperty("sslCertificate")
            .map(sslCipher).toProperty("sslCipher")
            .map(sslKey).toProperty("sslKey")
            .map(sslVerifyServerCertificate).toProperty("sslVerifyServerCertificate")
            .map(sslCrlFile).toProperty("sslCrlFile")
            .map(sslCrlPath).toProperty("sslCrlPath")
            .map(connectionRetryInterval).toProperty("connectionRetryInterval")
            .map(connectionRetryCount).toProperty("connectionRetryCount")
            .map(heartbeatInterval).toProperty("heartbeatInterval")
            .map(tlsVersion).toProperty("tlsVersion")
            .map(publicKeyPath).toProperty("publicKeyPath")
            .map(getPublicKey).toProperty("getPublicKey")
            .map(networkNamespace).toProperty("networkNamespace")
            .map(compressionAlgorithm).toProperty("compressionAlgorithm")
            .map(zstdCompressionLevel).toProperty("zstdCompressionLevel")
            .map(tlsCiphersuites).toProperty("tlsCiphersuites")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    default int insertSelective(ReplicationConnectionConfiguration record) {
        return MyBatis3Utils.insert(this::insert, record, replicationConnectionConfiguration, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(port).toPropertyWhenPresent("port", record::getPort)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(networkInterface).toPropertyWhenPresent("networkInterface", record::getNetworkInterface)
            .map(autoPosition).toPropertyWhenPresent("autoPosition", record::getAutoPosition)
            .map(sslAllowed).toPropertyWhenPresent("sslAllowed", record::getSslAllowed)
            .map(sslCaFile).toPropertyWhenPresent("sslCaFile", record::getSslCaFile)
            .map(sslCaPath).toPropertyWhenPresent("sslCaPath", record::getSslCaPath)
            .map(sslCertificate).toPropertyWhenPresent("sslCertificate", record::getSslCertificate)
            .map(sslCipher).toPropertyWhenPresent("sslCipher", record::getSslCipher)
            .map(sslKey).toPropertyWhenPresent("sslKey", record::getSslKey)
            .map(sslVerifyServerCertificate).toPropertyWhenPresent("sslVerifyServerCertificate", record::getSslVerifyServerCertificate)
            .map(sslCrlFile).toPropertyWhenPresent("sslCrlFile", record::getSslCrlFile)
            .map(sslCrlPath).toPropertyWhenPresent("sslCrlPath", record::getSslCrlPath)
            .map(connectionRetryInterval).toPropertyWhenPresent("connectionRetryInterval", record::getConnectionRetryInterval)
            .map(connectionRetryCount).toPropertyWhenPresent("connectionRetryCount", record::getConnectionRetryCount)
            .map(heartbeatInterval).toPropertyWhenPresent("heartbeatInterval", record::getHeartbeatInterval)
            .map(tlsVersion).toPropertyWhenPresent("tlsVersion", record::getTlsVersion)
            .map(publicKeyPath).toPropertyWhenPresent("publicKeyPath", record::getPublicKeyPath)
            .map(getPublicKey).toPropertyWhenPresent("getPublicKey", record::getGetPublicKey)
            .map(networkNamespace).toPropertyWhenPresent("networkNamespace", record::getNetworkNamespace)
            .map(compressionAlgorithm).toPropertyWhenPresent("compressionAlgorithm", record::getCompressionAlgorithm)
            .map(zstdCompressionLevel).toPropertyWhenPresent("zstdCompressionLevel", record::getZstdCompressionLevel)
            .map(tlsCiphersuites).toPropertyWhenPresent("tlsCiphersuites", record::getTlsCiphersuites)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    default Optional<ReplicationConnectionConfiguration> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, replicationConnectionConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    default List<ReplicationConnectionConfiguration> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, replicationConnectionConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    default List<ReplicationConnectionConfiguration> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, replicationConnectionConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    default Optional<ReplicationConnectionConfiguration> selectByPrimaryKey(String channelName_) {
        return selectOne(c ->
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, replicationConnectionConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source Table: replication_connection_configuration")
    static UpdateDSL<UpdateModel> updateAllColumns(ReplicationConnectionConfiguration record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(host).equalTo(record::getHost)
                .set(port).equalTo(record::getPort)
                .set(user).equalTo(record::getUser)
                .set(networkInterface).equalTo(record::getNetworkInterface)
                .set(autoPosition).equalTo(record::getAutoPosition)
                .set(sslAllowed).equalTo(record::getSslAllowed)
                .set(sslCaFile).equalTo(record::getSslCaFile)
                .set(sslCaPath).equalTo(record::getSslCaPath)
                .set(sslCertificate).equalTo(record::getSslCertificate)
                .set(sslCipher).equalTo(record::getSslCipher)
                .set(sslKey).equalTo(record::getSslKey)
                .set(sslVerifyServerCertificate).equalTo(record::getSslVerifyServerCertificate)
                .set(sslCrlFile).equalTo(record::getSslCrlFile)
                .set(sslCrlPath).equalTo(record::getSslCrlPath)
                .set(connectionRetryInterval).equalTo(record::getConnectionRetryInterval)
                .set(connectionRetryCount).equalTo(record::getConnectionRetryCount)
                .set(heartbeatInterval).equalTo(record::getHeartbeatInterval)
                .set(tlsVersion).equalTo(record::getTlsVersion)
                .set(publicKeyPath).equalTo(record::getPublicKeyPath)
                .set(getPublicKey).equalTo(record::getGetPublicKey)
                .set(networkNamespace).equalTo(record::getNetworkNamespace)
                .set(compressionAlgorithm).equalTo(record::getCompressionAlgorithm)
                .set(zstdCompressionLevel).equalTo(record::getZstdCompressionLevel)
                .set(tlsCiphersuites).equalTo(record::getTlsCiphersuites);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source Table: replication_connection_configuration")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReplicationConnectionConfiguration record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(host).equalToWhenPresent(record::getHost)
                .set(port).equalToWhenPresent(record::getPort)
                .set(user).equalToWhenPresent(record::getUser)
                .set(networkInterface).equalToWhenPresent(record::getNetworkInterface)
                .set(autoPosition).equalToWhenPresent(record::getAutoPosition)
                .set(sslAllowed).equalToWhenPresent(record::getSslAllowed)
                .set(sslCaFile).equalToWhenPresent(record::getSslCaFile)
                .set(sslCaPath).equalToWhenPresent(record::getSslCaPath)
                .set(sslCertificate).equalToWhenPresent(record::getSslCertificate)
                .set(sslCipher).equalToWhenPresent(record::getSslCipher)
                .set(sslKey).equalToWhenPresent(record::getSslKey)
                .set(sslVerifyServerCertificate).equalToWhenPresent(record::getSslVerifyServerCertificate)
                .set(sslCrlFile).equalToWhenPresent(record::getSslCrlFile)
                .set(sslCrlPath).equalToWhenPresent(record::getSslCrlPath)
                .set(connectionRetryInterval).equalToWhenPresent(record::getConnectionRetryInterval)
                .set(connectionRetryCount).equalToWhenPresent(record::getConnectionRetryCount)
                .set(heartbeatInterval).equalToWhenPresent(record::getHeartbeatInterval)
                .set(tlsVersion).equalToWhenPresent(record::getTlsVersion)
                .set(publicKeyPath).equalToWhenPresent(record::getPublicKeyPath)
                .set(getPublicKey).equalToWhenPresent(record::getGetPublicKey)
                .set(networkNamespace).equalToWhenPresent(record::getNetworkNamespace)
                .set(compressionAlgorithm).equalToWhenPresent(record::getCompressionAlgorithm)
                .set(zstdCompressionLevel).equalToWhenPresent(record::getZstdCompressionLevel)
                .set(tlsCiphersuites).equalToWhenPresent(record::getTlsCiphersuites);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source Table: replication_connection_configuration")
    default int updateByPrimaryKey(ReplicationConnectionConfiguration record) {
        return update(c ->
            c.set(host).equalTo(record::getHost)
            .set(port).equalTo(record::getPort)
            .set(user).equalTo(record::getUser)
            .set(networkInterface).equalTo(record::getNetworkInterface)
            .set(autoPosition).equalTo(record::getAutoPosition)
            .set(sslAllowed).equalTo(record::getSslAllowed)
            .set(sslCaFile).equalTo(record::getSslCaFile)
            .set(sslCaPath).equalTo(record::getSslCaPath)
            .set(sslCertificate).equalTo(record::getSslCertificate)
            .set(sslCipher).equalTo(record::getSslCipher)
            .set(sslKey).equalTo(record::getSslKey)
            .set(sslVerifyServerCertificate).equalTo(record::getSslVerifyServerCertificate)
            .set(sslCrlFile).equalTo(record::getSslCrlFile)
            .set(sslCrlPath).equalTo(record::getSslCrlPath)
            .set(connectionRetryInterval).equalTo(record::getConnectionRetryInterval)
            .set(connectionRetryCount).equalTo(record::getConnectionRetryCount)
            .set(heartbeatInterval).equalTo(record::getHeartbeatInterval)
            .set(tlsVersion).equalTo(record::getTlsVersion)
            .set(publicKeyPath).equalTo(record::getPublicKeyPath)
            .set(getPublicKey).equalTo(record::getGetPublicKey)
            .set(networkNamespace).equalTo(record::getNetworkNamespace)
            .set(compressionAlgorithm).equalTo(record::getCompressionAlgorithm)
            .set(zstdCompressionLevel).equalTo(record::getZstdCompressionLevel)
            .set(tlsCiphersuites).equalTo(record::getTlsCiphersuites)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source Table: replication_connection_configuration")
    default int updateByPrimaryKeySelective(ReplicationConnectionConfiguration record) {
        return update(c ->
            c.set(host).equalToWhenPresent(record::getHost)
            .set(port).equalToWhenPresent(record::getPort)
            .set(user).equalToWhenPresent(record::getUser)
            .set(networkInterface).equalToWhenPresent(record::getNetworkInterface)
            .set(autoPosition).equalToWhenPresent(record::getAutoPosition)
            .set(sslAllowed).equalToWhenPresent(record::getSslAllowed)
            .set(sslCaFile).equalToWhenPresent(record::getSslCaFile)
            .set(sslCaPath).equalToWhenPresent(record::getSslCaPath)
            .set(sslCertificate).equalToWhenPresent(record::getSslCertificate)
            .set(sslCipher).equalToWhenPresent(record::getSslCipher)
            .set(sslKey).equalToWhenPresent(record::getSslKey)
            .set(sslVerifyServerCertificate).equalToWhenPresent(record::getSslVerifyServerCertificate)
            .set(sslCrlFile).equalToWhenPresent(record::getSslCrlFile)
            .set(sslCrlPath).equalToWhenPresent(record::getSslCrlPath)
            .set(connectionRetryInterval).equalToWhenPresent(record::getConnectionRetryInterval)
            .set(connectionRetryCount).equalToWhenPresent(record::getConnectionRetryCount)
            .set(heartbeatInterval).equalToWhenPresent(record::getHeartbeatInterval)
            .set(tlsVersion).equalToWhenPresent(record::getTlsVersion)
            .set(publicKeyPath).equalToWhenPresent(record::getPublicKeyPath)
            .set(getPublicKey).equalToWhenPresent(record::getGetPublicKey)
            .set(networkNamespace).equalToWhenPresent(record::getNetworkNamespace)
            .set(compressionAlgorithm).equalToWhenPresent(record::getCompressionAlgorithm)
            .set(zstdCompressionLevel).equalToWhenPresent(record::getZstdCompressionLevel)
            .set(tlsCiphersuites).equalToWhenPresent(record::getTlsCiphersuites)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }
}