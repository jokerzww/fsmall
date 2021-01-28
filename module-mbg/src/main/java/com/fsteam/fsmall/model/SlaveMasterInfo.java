package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SlaveMasterInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Channel_name")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Number_of_lines")
    private Integer numberOfLines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Master_log_pos")
    private Long masterLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Host")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Port")
    private Integer port;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Connect_retry")
    private Integer connectRetry;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Enabled_ssl")
    private Boolean enabledSsl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Ssl_verify_server_cert")
    private Boolean sslVerifyServerCert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Heartbeat")
    private Float heartbeat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Retry_count")
    private Long retryCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Enabled_auto_position")
    private Boolean enabledAutoPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Get_public_key")
    private Boolean getPublicKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Master_compression_algorithm")
    private String masterCompressionAlgorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Master_zstd_compression_level")
    private Integer masterZstdCompressionLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Master_log_name")
    private String masterLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.User_name")
    private String userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.User_password")
    private String userPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Ssl_ca")
    private String sslCa;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_capath")
    private String sslCapath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_cert")
    private String sslCert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_cipher")
    private String sslCipher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_key")
    private String sslKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Bind")
    private String bind;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ignored_server_ids")
    private String ignoredServerIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Uuid")
    private String uuid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_crl")
    private String sslCrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_crlpath")
    private String sslCrlpath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Tls_version")
    private String tlsVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Public_key_path")
    private String publicKeyPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Network_namespace")
    private String networkNamespace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Tls_ciphersuites")
    private String tlsCiphersuites;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source Table: slave_master_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Channel_name")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Channel_name")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Number_of_lines")
    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Number_of_lines")
    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Master_log_pos")
    public Long getMasterLogPos() {
        return masterLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Master_log_pos")
    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Host")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Host")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Port")
    public Integer getPort() {
        return port;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Port")
    public void setPort(Integer port) {
        this.port = port;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Connect_retry")
    public Integer getConnectRetry() {
        return connectRetry;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Connect_retry")
    public void setConnectRetry(Integer connectRetry) {
        this.connectRetry = connectRetry;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Enabled_ssl")
    public Boolean getEnabledSsl() {
        return enabledSsl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Enabled_ssl")
    public void setEnabledSsl(Boolean enabledSsl) {
        this.enabledSsl = enabledSsl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0307426+08:00", comments="Source field: slave_master_info.Ssl_verify_server_cert")
    public Boolean getSslVerifyServerCert() {
        return sslVerifyServerCert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Ssl_verify_server_cert")
    public void setSslVerifyServerCert(Boolean sslVerifyServerCert) {
        this.sslVerifyServerCert = sslVerifyServerCert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Heartbeat")
    public Float getHeartbeat() {
        return heartbeat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Heartbeat")
    public void setHeartbeat(Float heartbeat) {
        this.heartbeat = heartbeat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Retry_count")
    public Long getRetryCount() {
        return retryCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Retry_count")
    public void setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Enabled_auto_position")
    public Boolean getEnabledAutoPosition() {
        return enabledAutoPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Enabled_auto_position")
    public void setEnabledAutoPosition(Boolean enabledAutoPosition) {
        this.enabledAutoPosition = enabledAutoPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Get_public_key")
    public Boolean getGetPublicKey() {
        return getPublicKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Get_public_key")
    public void setGetPublicKey(Boolean getPublicKey) {
        this.getPublicKey = getPublicKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Master_compression_algorithm")
    public String getMasterCompressionAlgorithm() {
        return masterCompressionAlgorithm;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Master_compression_algorithm")
    public void setMasterCompressionAlgorithm(String masterCompressionAlgorithm) {
        this.masterCompressionAlgorithm = masterCompressionAlgorithm;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Master_zstd_compression_level")
    public Integer getMasterZstdCompressionLevel() {
        return masterZstdCompressionLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Master_zstd_compression_level")
    public void setMasterZstdCompressionLevel(Integer masterZstdCompressionLevel) {
        this.masterZstdCompressionLevel = masterZstdCompressionLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Master_log_name")
    public String getMasterLogName() {
        return masterLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.Master_log_name")
    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.User_name")
    public String getUserName() {
        return userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.User_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.User_password")
    public String getUserPassword() {
        return userPassword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0317434+08:00", comments="Source field: slave_master_info.User_password")
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_ca")
    public String getSslCa() {
        return sslCa;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_ca")
    public void setSslCa(String sslCa) {
        this.sslCa = sslCa;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_capath")
    public String getSslCapath() {
        return sslCapath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_capath")
    public void setSslCapath(String sslCapath) {
        this.sslCapath = sslCapath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_cert")
    public String getSslCert() {
        return sslCert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_cert")
    public void setSslCert(String sslCert) {
        this.sslCert = sslCert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_cipher")
    public String getSslCipher() {
        return sslCipher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_cipher")
    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_key")
    public String getSslKey() {
        return sslKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_key")
    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Bind")
    public String getBind() {
        return bind;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Bind")
    public void setBind(String bind) {
        this.bind = bind;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ignored_server_ids")
    public String getIgnoredServerIds() {
        return ignoredServerIds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ignored_server_ids")
    public void setIgnoredServerIds(String ignoredServerIds) {
        this.ignoredServerIds = ignoredServerIds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Uuid")
    public String getUuid() {
        return uuid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_crl")
    public String getSslCrl() {
        return sslCrl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_crl")
    public void setSslCrl(String sslCrl) {
        this.sslCrl = sslCrl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_crlpath")
    public String getSslCrlpath() {
        return sslCrlpath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Ssl_crlpath")
    public void setSslCrlpath(String sslCrlpath) {
        this.sslCrlpath = sslCrlpath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0327448+08:00", comments="Source field: slave_master_info.Tls_version")
    public String getTlsVersion() {
        return tlsVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Tls_version")
    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Public_key_path")
    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Public_key_path")
    public void setPublicKeyPath(String publicKeyPath) {
        this.publicKeyPath = publicKeyPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Network_namespace")
    public String getNetworkNamespace() {
        return networkNamespace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Network_namespace")
    public void setNetworkNamespace(String networkNamespace) {
        this.networkNamespace = networkNamespace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Tls_ciphersuites")
    public String getTlsCiphersuites() {
        return tlsCiphersuites;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Tls_ciphersuites")
    public void setTlsCiphersuites(String tlsCiphersuites) {
        this.tlsCiphersuites = tlsCiphersuites;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source Table: slave_master_info")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", numberOfLines=").append(numberOfLines);
        sb.append(", masterLogPos=").append(masterLogPos);
        sb.append(", host=").append(host);
        sb.append(", port=").append(port);
        sb.append(", connectRetry=").append(connectRetry);
        sb.append(", enabledSsl=").append(enabledSsl);
        sb.append(", sslVerifyServerCert=").append(sslVerifyServerCert);
        sb.append(", heartbeat=").append(heartbeat);
        sb.append(", retryCount=").append(retryCount);
        sb.append(", enabledAutoPosition=").append(enabledAutoPosition);
        sb.append(", getPublicKey=").append(getPublicKey);
        sb.append(", masterCompressionAlgorithm=").append(masterCompressionAlgorithm);
        sb.append(", masterZstdCompressionLevel=").append(masterZstdCompressionLevel);
        sb.append(", masterLogName=").append(masterLogName);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", sslCa=").append(sslCa);
        sb.append(", sslCapath=").append(sslCapath);
        sb.append(", sslCert=").append(sslCert);
        sb.append(", sslCipher=").append(sslCipher);
        sb.append(", sslKey=").append(sslKey);
        sb.append(", bind=").append(bind);
        sb.append(", ignoredServerIds=").append(ignoredServerIds);
        sb.append(", uuid=").append(uuid);
        sb.append(", sslCrl=").append(sslCrl);
        sb.append(", sslCrlpath=").append(sslCrlpath);
        sb.append(", tlsVersion=").append(tlsVersion);
        sb.append(", publicKeyPath=").append(publicKeyPath);
        sb.append(", networkNamespace=").append(networkNamespace);
        sb.append(", tlsCiphersuites=").append(tlsCiphersuites);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source Table: slave_master_info")
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
        SlaveMasterInfo other = (SlaveMasterInfo) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getNumberOfLines() == null ? other.getNumberOfLines() == null : this.getNumberOfLines().equals(other.getNumberOfLines()))
            && (this.getMasterLogPos() == null ? other.getMasterLogPos() == null : this.getMasterLogPos().equals(other.getMasterLogPos()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getConnectRetry() == null ? other.getConnectRetry() == null : this.getConnectRetry().equals(other.getConnectRetry()))
            && (this.getEnabledSsl() == null ? other.getEnabledSsl() == null : this.getEnabledSsl().equals(other.getEnabledSsl()))
            && (this.getSslVerifyServerCert() == null ? other.getSslVerifyServerCert() == null : this.getSslVerifyServerCert().equals(other.getSslVerifyServerCert()))
            && (this.getHeartbeat() == null ? other.getHeartbeat() == null : this.getHeartbeat().equals(other.getHeartbeat()))
            && (this.getRetryCount() == null ? other.getRetryCount() == null : this.getRetryCount().equals(other.getRetryCount()))
            && (this.getEnabledAutoPosition() == null ? other.getEnabledAutoPosition() == null : this.getEnabledAutoPosition().equals(other.getEnabledAutoPosition()))
            && (this.getGetPublicKey() == null ? other.getGetPublicKey() == null : this.getGetPublicKey().equals(other.getGetPublicKey()))
            && (this.getMasterCompressionAlgorithm() == null ? other.getMasterCompressionAlgorithm() == null : this.getMasterCompressionAlgorithm().equals(other.getMasterCompressionAlgorithm()))
            && (this.getMasterZstdCompressionLevel() == null ? other.getMasterZstdCompressionLevel() == null : this.getMasterZstdCompressionLevel().equals(other.getMasterZstdCompressionLevel()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source Table: slave_master_info")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getNumberOfLines() == null) ? 0 : getNumberOfLines().hashCode());
        result = prime * result + ((getMasterLogPos() == null) ? 0 : getMasterLogPos().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getConnectRetry() == null) ? 0 : getConnectRetry().hashCode());
        result = prime * result + ((getEnabledSsl() == null) ? 0 : getEnabledSsl().hashCode());
        result = prime * result + ((getSslVerifyServerCert() == null) ? 0 : getSslVerifyServerCert().hashCode());
        result = prime * result + ((getHeartbeat() == null) ? 0 : getHeartbeat().hashCode());
        result = prime * result + ((getRetryCount() == null) ? 0 : getRetryCount().hashCode());
        result = prime * result + ((getEnabledAutoPosition() == null) ? 0 : getEnabledAutoPosition().hashCode());
        result = prime * result + ((getGetPublicKey() == null) ? 0 : getGetPublicKey().hashCode());
        result = prime * result + ((getMasterCompressionAlgorithm() == null) ? 0 : getMasterCompressionAlgorithm().hashCode());
        result = prime * result + ((getMasterZstdCompressionLevel() == null) ? 0 : getMasterZstdCompressionLevel().hashCode());
        return result;
    }
}