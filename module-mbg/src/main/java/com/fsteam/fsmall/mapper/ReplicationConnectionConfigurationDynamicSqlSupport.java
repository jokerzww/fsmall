package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReplicationConnectionConfigurationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source Table: replication_connection_configuration")
    public static final ReplicationConnectionConfiguration replicationConnectionConfiguration = new ReplicationConnectionConfiguration();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.CHANNEL_NAME")
    public static final SqlColumn<String> channelName = replicationConnectionConfiguration.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.HOST")
    public static final SqlColumn<String> host = replicationConnectionConfiguration.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.PORT")
    public static final SqlColumn<Integer> port = replicationConnectionConfiguration.port;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.USER")
    public static final SqlColumn<String> user = replicationConnectionConfiguration.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.NETWORK_INTERFACE")
    public static final SqlColumn<String> networkInterface = replicationConnectionConfiguration.networkInterface;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.AUTO_POSITION")
    public static final SqlColumn<String> autoPosition = replicationConnectionConfiguration.autoPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.SSL_ALLOWED")
    public static final SqlColumn<String> sslAllowed = replicationConnectionConfiguration.sslAllowed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.SSL_CA_FILE")
    public static final SqlColumn<String> sslCaFile = replicationConnectionConfiguration.sslCaFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.SSL_CA_PATH")
    public static final SqlColumn<String> sslCaPath = replicationConnectionConfiguration.sslCaPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.SSL_CERTIFICATE")
    public static final SqlColumn<String> sslCertificate = replicationConnectionConfiguration.sslCertificate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.SSL_CIPHER")
    public static final SqlColumn<String> sslCipher = replicationConnectionConfiguration.sslCipher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.SSL_KEY")
    public static final SqlColumn<String> sslKey = replicationConnectionConfiguration.sslKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.SSL_VERIFY_SERVER_CERTIFICATE")
    public static final SqlColumn<String> sslVerifyServerCertificate = replicationConnectionConfiguration.sslVerifyServerCertificate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.SSL_CRL_FILE")
    public static final SqlColumn<String> sslCrlFile = replicationConnectionConfiguration.sslCrlFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.SSL_CRL_PATH")
    public static final SqlColumn<String> sslCrlPath = replicationConnectionConfiguration.sslCrlPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source field: replication_connection_configuration.CONNECTION_RETRY_INTERVAL")
    public static final SqlColumn<Integer> connectionRetryInterval = replicationConnectionConfiguration.connectionRetryInterval;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source field: replication_connection_configuration.CONNECTION_RETRY_COUNT")
    public static final SqlColumn<Long> connectionRetryCount = replicationConnectionConfiguration.connectionRetryCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source field: replication_connection_configuration.HEARTBEAT_INTERVAL")
    public static final SqlColumn<Double> heartbeatInterval = replicationConnectionConfiguration.heartbeatInterval;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source field: replication_connection_configuration.TLS_VERSION")
    public static final SqlColumn<String> tlsVersion = replicationConnectionConfiguration.tlsVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source field: replication_connection_configuration.PUBLIC_KEY_PATH")
    public static final SqlColumn<String> publicKeyPath = replicationConnectionConfiguration.publicKeyPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source field: replication_connection_configuration.GET_PUBLIC_KEY")
    public static final SqlColumn<String> getPublicKey = replicationConnectionConfiguration.getPublicKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source field: replication_connection_configuration.NETWORK_NAMESPACE")
    public static final SqlColumn<String> networkNamespace = replicationConnectionConfiguration.networkNamespace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source field: replication_connection_configuration.COMPRESSION_ALGORITHM")
    public static final SqlColumn<String> compressionAlgorithm = replicationConnectionConfiguration.compressionAlgorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source field: replication_connection_configuration.ZSTD_COMPRESSION_LEVEL")
    public static final SqlColumn<Integer> zstdCompressionLevel = replicationConnectionConfiguration.zstdCompressionLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2389331+08:00", comments="Source field: replication_connection_configuration.TLS_CIPHERSUITES")
    public static final SqlColumn<String> tlsCiphersuites = replicationConnectionConfiguration.tlsCiphersuites;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2379319+08:00", comments="Source Table: replication_connection_configuration")
    public static final class ReplicationConnectionConfiguration extends SqlTable {
        public final SqlColumn<String> channelName = column("CHANNEL_NAME", JDBCType.CHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<Integer> port = column("PORT", JDBCType.INTEGER);

        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> networkInterface = column("NETWORK_INTERFACE", JDBCType.CHAR);

        public final SqlColumn<String> autoPosition = column("AUTO_POSITION", JDBCType.CHAR);

        public final SqlColumn<String> sslAllowed = column("SSL_ALLOWED", JDBCType.CHAR);

        public final SqlColumn<String> sslCaFile = column("SSL_CA_FILE", JDBCType.VARCHAR);

        public final SqlColumn<String> sslCaPath = column("SSL_CA_PATH", JDBCType.VARCHAR);

        public final SqlColumn<String> sslCertificate = column("SSL_CERTIFICATE", JDBCType.VARCHAR);

        public final SqlColumn<String> sslCipher = column("SSL_CIPHER", JDBCType.VARCHAR);

        public final SqlColumn<String> sslKey = column("SSL_KEY", JDBCType.VARCHAR);

        public final SqlColumn<String> sslVerifyServerCertificate = column("SSL_VERIFY_SERVER_CERTIFICATE", JDBCType.CHAR);

        public final SqlColumn<String> sslCrlFile = column("SSL_CRL_FILE", JDBCType.VARCHAR);

        public final SqlColumn<String> sslCrlPath = column("SSL_CRL_PATH", JDBCType.VARCHAR);

        public final SqlColumn<Integer> connectionRetryInterval = column("CONNECTION_RETRY_INTERVAL", JDBCType.INTEGER);

        public final SqlColumn<Long> connectionRetryCount = column("CONNECTION_RETRY_COUNT", JDBCType.BIGINT);

        public final SqlColumn<Double> heartbeatInterval = column("HEARTBEAT_INTERVAL", JDBCType.DOUBLE);

        public final SqlColumn<String> tlsVersion = column("TLS_VERSION", JDBCType.VARCHAR);

        public final SqlColumn<String> publicKeyPath = column("PUBLIC_KEY_PATH", JDBCType.VARCHAR);

        public final SqlColumn<String> getPublicKey = column("GET_PUBLIC_KEY", JDBCType.CHAR);

        public final SqlColumn<String> networkNamespace = column("NETWORK_NAMESPACE", JDBCType.VARCHAR);

        public final SqlColumn<String> compressionAlgorithm = column("COMPRESSION_ALGORITHM", JDBCType.CHAR);

        public final SqlColumn<Integer> zstdCompressionLevel = column("ZSTD_COMPRESSION_LEVEL", JDBCType.INTEGER);

        public final SqlColumn<String> tlsCiphersuites = column("TLS_CIPHERSUITES", JDBCType.LONGVARCHAR);

        public ReplicationConnectionConfiguration() {
            super("replication_connection_configuration");
        }
    }
}