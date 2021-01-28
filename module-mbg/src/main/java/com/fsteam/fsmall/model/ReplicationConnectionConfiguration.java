package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ReplicationConnectionConfiguration implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.CHANNEL_NAME")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.HOST")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.PORT")
    private Integer port;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.USER")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.NETWORK_INTERFACE")
    private String networkInterface;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.AUTO_POSITION")
    private String autoPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_ALLOWED")
    private String sslAllowed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CA_FILE")
    private String sslCaFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CA_PATH")
    private String sslCaPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CERTIFICATE")
    private String sslCertificate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CIPHER")
    private String sslCipher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_KEY")
    private String sslKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_VERIFY_SERVER_CERTIFICATE")
    private String sslVerifyServerCertificate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CRL_FILE")
    private String sslCrlFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CRL_PATH")
    private String sslCrlPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.CONNECTION_RETRY_INTERVAL")
    private Integer connectionRetryInterval;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.CONNECTION_RETRY_COUNT")
    private Long connectionRetryCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.HEARTBEAT_INTERVAL")
    private Double heartbeatInterval;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.TLS_VERSION")
    private String tlsVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.PUBLIC_KEY_PATH")
    private String publicKeyPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.GET_PUBLIC_KEY")
    private String getPublicKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.NETWORK_NAMESPACE")
    private String networkNamespace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.COMPRESSION_ALGORITHM")
    private String compressionAlgorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.ZSTD_COMPRESSION_LEVEL")
    private Integer zstdCompressionLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.TLS_CIPHERSUITES")
    private String tlsCiphersuites;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source Table: replication_connection_configuration")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.CHANNEL_NAME")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.CHANNEL_NAME")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.HOST")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.HOST")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.PORT")
    public Integer getPort() {
        return port;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.PORT")
    public void setPort(Integer port) {
        this.port = port;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.USER")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.USER")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.NETWORK_INTERFACE")
    public String getNetworkInterface() {
        return networkInterface;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.NETWORK_INTERFACE")
    public void setNetworkInterface(String networkInterface) {
        this.networkInterface = networkInterface;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.AUTO_POSITION")
    public String getAutoPosition() {
        return autoPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.AUTO_POSITION")
    public void setAutoPosition(String autoPosition) {
        this.autoPosition = autoPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_ALLOWED")
    public String getSslAllowed() {
        return sslAllowed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_ALLOWED")
    public void setSslAllowed(String sslAllowed) {
        this.sslAllowed = sslAllowed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CA_FILE")
    public String getSslCaFile() {
        return sslCaFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CA_FILE")
    public void setSslCaFile(String sslCaFile) {
        this.sslCaFile = sslCaFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CA_PATH")
    public String getSslCaPath() {
        return sslCaPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CA_PATH")
    public void setSslCaPath(String sslCaPath) {
        this.sslCaPath = sslCaPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CERTIFICATE")
    public String getSslCertificate() {
        return sslCertificate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CERTIFICATE")
    public void setSslCertificate(String sslCertificate) {
        this.sslCertificate = sslCertificate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CIPHER")
    public String getSslCipher() {
        return sslCipher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CIPHER")
    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_KEY")
    public String getSslKey() {
        return sslKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_KEY")
    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_VERIFY_SERVER_CERTIFICATE")
    public String getSslVerifyServerCertificate() {
        return sslVerifyServerCertificate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_VERIFY_SERVER_CERTIFICATE")
    public void setSslVerifyServerCertificate(String sslVerifyServerCertificate) {
        this.sslVerifyServerCertificate = sslVerifyServerCertificate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CRL_FILE")
    public String getSslCrlFile() {
        return sslCrlFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CRL_FILE")
    public void setSslCrlFile(String sslCrlFile) {
        this.sslCrlFile = sslCrlFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CRL_PATH")
    public String getSslCrlPath() {
        return sslCrlPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.SSL_CRL_PATH")
    public void setSslCrlPath(String sslCrlPath) {
        this.sslCrlPath = sslCrlPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.CONNECTION_RETRY_INTERVAL")
    public Integer getConnectionRetryInterval() {
        return connectionRetryInterval;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.CONNECTION_RETRY_INTERVAL")
    public void setConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.CONNECTION_RETRY_COUNT")
    public Long getConnectionRetryCount() {
        return connectionRetryCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.CONNECTION_RETRY_COUNT")
    public void setConnectionRetryCount(Long connectionRetryCount) {
        this.connectionRetryCount = connectionRetryCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.HEARTBEAT_INTERVAL")
    public Double getHeartbeatInterval() {
        return heartbeatInterval;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.HEARTBEAT_INTERVAL")
    public void setHeartbeatInterval(Double heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.TLS_VERSION")
    public String getTlsVersion() {
        return tlsVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.TLS_VERSION")
    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.PUBLIC_KEY_PATH")
    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.PUBLIC_KEY_PATH")
    public void setPublicKeyPath(String publicKeyPath) {
        this.publicKeyPath = publicKeyPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.GET_PUBLIC_KEY")
    public String getGetPublicKey() {
        return getPublicKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.GET_PUBLIC_KEY")
    public void setGetPublicKey(String getPublicKey) {
        this.getPublicKey = getPublicKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.NETWORK_NAMESPACE")
    public String getNetworkNamespace() {
        return networkNamespace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.NETWORK_NAMESPACE")
    public void setNetworkNamespace(String networkNamespace) {
        this.networkNamespace = networkNamespace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.COMPRESSION_ALGORITHM")
    public String getCompressionAlgorithm() {
        return compressionAlgorithm;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.COMPRESSION_ALGORITHM")
    public void setCompressionAlgorithm(String compressionAlgorithm) {
        this.compressionAlgorithm = compressionAlgorithm;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.ZSTD_COMPRESSION_LEVEL")
    public Integer getZstdCompressionLevel() {
        return zstdCompressionLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.ZSTD_COMPRESSION_LEVEL")
    public void setZstdCompressionLevel(Integer zstdCompressionLevel) {
        this.zstdCompressionLevel = zstdCompressionLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.TLS_CIPHERSUITES")
    public String getTlsCiphersuites() {
        return tlsCiphersuites;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source field: replication_connection_configuration.TLS_CIPHERSUITES")
    public void setTlsCiphersuites(String tlsCiphersuites) {
        this.tlsCiphersuites = tlsCiphersuites;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source Table: replication_connection_configuration")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", host=").append(host);
        sb.append(", port=").append(port);
        sb.append(", user=").append(user);
        sb.append(", networkInterface=").append(networkInterface);
        sb.append(", autoPosition=").append(autoPosition);
        sb.append(", sslAllowed=").append(sslAllowed);
        sb.append(", sslCaFile=").append(sslCaFile);
        sb.append(", sslCaPath=").append(sslCaPath);
        sb.append(", sslCertificate=").append(sslCertificate);
        sb.append(", sslCipher=").append(sslCipher);
        sb.append(", sslKey=").append(sslKey);
        sb.append(", sslVerifyServerCertificate=").append(sslVerifyServerCertificate);
        sb.append(", sslCrlFile=").append(sslCrlFile);
        sb.append(", sslCrlPath=").append(sslCrlPath);
        sb.append(", connectionRetryInterval=").append(connectionRetryInterval);
        sb.append(", connectionRetryCount=").append(connectionRetryCount);
        sb.append(", heartbeatInterval=").append(heartbeatInterval);
        sb.append(", tlsVersion=").append(tlsVersion);
        sb.append(", publicKeyPath=").append(publicKeyPath);
        sb.append(", getPublicKey=").append(getPublicKey);
        sb.append(", networkNamespace=").append(networkNamespace);
        sb.append(", compressionAlgorithm=").append(compressionAlgorithm);
        sb.append(", zstdCompressionLevel=").append(zstdCompressionLevel);
        sb.append(", tlsCiphersuites=").append(tlsCiphersuites);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source Table: replication_connection_configuration")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ReplicationConnectionConfiguration other = (ReplicationConnectionConfiguration) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getNetworkInterface() == null ? other.getNetworkInterface() == null : this.getNetworkInterface().equals(other.getNetworkInterface()))
            && (this.getAutoPosition() == null ? other.getAutoPosition() == null : this.getAutoPosition().equals(other.getAutoPosition()))
            && (this.getSslAllowed() == null ? other.getSslAllowed() == null : this.getSslAllowed().equals(other.getSslAllowed()))
            && (this.getSslCaFile() == null ? other.getSslCaFile() == null : this.getSslCaFile().equals(other.getSslCaFile()))
            && (this.getSslCaPath() == null ? other.getSslCaPath() == null : this.getSslCaPath().equals(other.getSslCaPath()))
            && (this.getSslCertificate() == null ? other.getSslCertificate() == null : this.getSslCertificate().equals(other.getSslCertificate()))
            && (this.getSslCipher() == null ? other.getSslCipher() == null : this.getSslCipher().equals(other.getSslCipher()))
            && (this.getSslKey() == null ? other.getSslKey() == null : this.getSslKey().equals(other.getSslKey()))
            && (this.getSslVerifyServerCertificate() == null ? other.getSslVerifyServerCertificate() == null : this.getSslVerifyServerCertificate().equals(other.getSslVerifyServerCertificate()))
            && (this.getSslCrlFile() == null ? other.getSslCrlFile() == null : this.getSslCrlFile().equals(other.getSslCrlFile()))
            && (this.getSslCrlPath() == null ? other.getSslCrlPath() == null : this.getSslCrlPath().equals(other.getSslCrlPath()))
            && (this.getConnectionRetryInterval() == null ? other.getConnectionRetryInterval() == null : this.getConnectionRetryInterval().equals(other.getConnectionRetryInterval()))
            && (this.getConnectionRetryCount() == null ? other.getConnectionRetryCount() == null : this.getConnectionRetryCount().equals(other.getConnectionRetryCount()))
            && (this.getHeartbeatInterval() == null ? other.getHeartbeatInterval() == null : this.getHeartbeatInterval().equals(other.getHeartbeatInterval()))
            && (this.getTlsVersion() == null ? other.getTlsVersion() == null : this.getTlsVersion().equals(other.getTlsVersion()))
            && (this.getPublicKeyPath() == null ? other.getPublicKeyPath() == null : this.getPublicKeyPath().equals(other.getPublicKeyPath()))
            && (this.getGetPublicKey() == null ? other.getGetPublicKey() == null : this.getGetPublicKey().equals(other.getGetPublicKey()))
            && (this.getNetworkNamespace() == null ? other.getNetworkNamespace() == null : this.getNetworkNamespace().equals(other.getNetworkNamespace()))
            && (this.getCompressionAlgorithm() == null ? other.getCompressionAlgorithm() == null : this.getCompressionAlgorithm().equals(other.getCompressionAlgorithm()))
            && (this.getZstdCompressionLevel() == null ? other.getZstdCompressionLevel() == null : this.getZstdCompressionLevel().equals(other.getZstdCompressionLevel()))
            && (this.getTlsCiphersuites() == null ? other.getTlsCiphersuites() == null : this.getTlsCiphersuites().equals(other.getTlsCiphersuites()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2369308+08:00", comments="Source Table: replication_connection_configuration")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getNetworkInterface() == null) ? 0 : getNetworkInterface().hashCode());
        result = prime * result + ((getAutoPosition() == null) ? 0 : getAutoPosition().hashCode());
        result = prime * result + ((getSslAllowed() == null) ? 0 : getSslAllowed().hashCode());
        result = prime * result + ((getSslCaFile() == null) ? 0 : getSslCaFile().hashCode());
        result = prime * result + ((getSslCaPath() == null) ? 0 : getSslCaPath().hashCode());
        result = prime * result + ((getSslCertificate() == null) ? 0 : getSslCertificate().hashCode());
        result = prime * result + ((getSslCipher() == null) ? 0 : getSslCipher().hashCode());
        result = prime * result + ((getSslKey() == null) ? 0 : getSslKey().hashCode());
        result = prime * result + ((getSslVerifyServerCertificate() == null) ? 0 : getSslVerifyServerCertificate().hashCode());
        result = prime * result + ((getSslCrlFile() == null) ? 0 : getSslCrlFile().hashCode());
        result = prime * result + ((getSslCrlPath() == null) ? 0 : getSslCrlPath().hashCode());
        result = prime * result + ((getConnectionRetryInterval() == null) ? 0 : getConnectionRetryInterval().hashCode());
        result = prime * result + ((getConnectionRetryCount() == null) ? 0 : getConnectionRetryCount().hashCode());
        result = prime * result + ((getHeartbeatInterval() == null) ? 0 : getHeartbeatInterval().hashCode());
        result = prime * result + ((getTlsVersion() == null) ? 0 : getTlsVersion().hashCode());
        result = prime * result + ((getPublicKeyPath() == null) ? 0 : getPublicKeyPath().hashCode());
        result = prime * result + ((getGetPublicKey() == null) ? 0 : getGetPublicKey().hashCode());
        result = prime * result + ((getNetworkNamespace() == null) ? 0 : getNetworkNamespace().hashCode());
        result = prime * result + ((getCompressionAlgorithm() == null) ? 0 : getCompressionAlgorithm().hashCode());
        result = prime * result + ((getZstdCompressionLevel() == null) ? 0 : getZstdCompressionLevel().hashCode());
        result = prime * result + ((getTlsCiphersuites() == null) ? 0 : getTlsCiphersuites().hashCode());
        return result;
    }
}