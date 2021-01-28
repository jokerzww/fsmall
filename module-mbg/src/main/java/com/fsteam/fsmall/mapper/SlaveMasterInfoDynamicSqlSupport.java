package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SlaveMasterInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source Table: slave_master_info")
    public static final SlaveMasterInfo slaveMasterInfo = new SlaveMasterInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source field: slave_master_info.Channel_name")
    public static final SqlColumn<String> channelName = slaveMasterInfo.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.034746+08:00", comments="Source field: slave_master_info.Number_of_lines")
    public static final SqlColumn<Integer> numberOfLines = slaveMasterInfo.numberOfLines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.034746+08:00", comments="Source field: slave_master_info.Master_log_pos")
    public static final SqlColumn<Long> masterLogPos = slaveMasterInfo.masterLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.034746+08:00", comments="Source field: slave_master_info.Host")
    public static final SqlColumn<String> host = slaveMasterInfo.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.034746+08:00", comments="Source field: slave_master_info.Port")
    public static final SqlColumn<Integer> port = slaveMasterInfo.port;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.034746+08:00", comments="Source field: slave_master_info.Connect_retry")
    public static final SqlColumn<Integer> connectRetry = slaveMasterInfo.connectRetry;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.034746+08:00", comments="Source field: slave_master_info.Enabled_ssl")
    public static final SqlColumn<Boolean> enabledSsl = slaveMasterInfo.enabledSsl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.034746+08:00", comments="Source field: slave_master_info.Ssl_verify_server_cert")
    public static final SqlColumn<Boolean> sslVerifyServerCert = slaveMasterInfo.sslVerifyServerCert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0357469+08:00", comments="Source field: slave_master_info.Heartbeat")
    public static final SqlColumn<Float> heartbeat = slaveMasterInfo.heartbeat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0357469+08:00", comments="Source field: slave_master_info.Retry_count")
    public static final SqlColumn<Long> retryCount = slaveMasterInfo.retryCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0357469+08:00", comments="Source field: slave_master_info.Enabled_auto_position")
    public static final SqlColumn<Boolean> enabledAutoPosition = slaveMasterInfo.enabledAutoPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0357469+08:00", comments="Source field: slave_master_info.Get_public_key")
    public static final SqlColumn<Boolean> getPublicKey = slaveMasterInfo.getPublicKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0357469+08:00", comments="Source field: slave_master_info.Master_compression_algorithm")
    public static final SqlColumn<String> masterCompressionAlgorithm = slaveMasterInfo.masterCompressionAlgorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0357469+08:00", comments="Source field: slave_master_info.Master_zstd_compression_level")
    public static final SqlColumn<Integer> masterZstdCompressionLevel = slaveMasterInfo.masterZstdCompressionLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0357469+08:00", comments="Source field: slave_master_info.Master_log_name")
    public static final SqlColumn<String> masterLogName = slaveMasterInfo.masterLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0357469+08:00", comments="Source field: slave_master_info.User_name")
    public static final SqlColumn<String> userName = slaveMasterInfo.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0367485+08:00", comments="Source field: slave_master_info.User_password")
    public static final SqlColumn<String> userPassword = slaveMasterInfo.userPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0367485+08:00", comments="Source field: slave_master_info.Ssl_ca")
    public static final SqlColumn<String> sslCa = slaveMasterInfo.sslCa;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0367485+08:00", comments="Source field: slave_master_info.Ssl_capath")
    public static final SqlColumn<String> sslCapath = slaveMasterInfo.sslCapath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0367485+08:00", comments="Source field: slave_master_info.Ssl_cert")
    public static final SqlColumn<String> sslCert = slaveMasterInfo.sslCert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0367485+08:00", comments="Source field: slave_master_info.Ssl_cipher")
    public static final SqlColumn<String> sslCipher = slaveMasterInfo.sslCipher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0367485+08:00", comments="Source field: slave_master_info.Ssl_key")
    public static final SqlColumn<String> sslKey = slaveMasterInfo.sslKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0367485+08:00", comments="Source field: slave_master_info.Bind")
    public static final SqlColumn<String> bind = slaveMasterInfo.bind;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0367485+08:00", comments="Source field: slave_master_info.Ignored_server_ids")
    public static final SqlColumn<String> ignoredServerIds = slaveMasterInfo.ignoredServerIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0367485+08:00", comments="Source field: slave_master_info.Uuid")
    public static final SqlColumn<String> uuid = slaveMasterInfo.uuid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0377492+08:00", comments="Source field: slave_master_info.Ssl_crl")
    public static final SqlColumn<String> sslCrl = slaveMasterInfo.sslCrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0377492+08:00", comments="Source field: slave_master_info.Ssl_crlpath")
    public static final SqlColumn<String> sslCrlpath = slaveMasterInfo.sslCrlpath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0377492+08:00", comments="Source field: slave_master_info.Tls_version")
    public static final SqlColumn<String> tlsVersion = slaveMasterInfo.tlsVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0377492+08:00", comments="Source field: slave_master_info.Public_key_path")
    public static final SqlColumn<String> publicKeyPath = slaveMasterInfo.publicKeyPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0377492+08:00", comments="Source field: slave_master_info.Network_namespace")
    public static final SqlColumn<String> networkNamespace = slaveMasterInfo.networkNamespace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0377492+08:00", comments="Source field: slave_master_info.Tls_ciphersuites")
    public static final SqlColumn<String> tlsCiphersuites = slaveMasterInfo.tlsCiphersuites;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0337456+08:00", comments="Source Table: slave_master_info")
    public static final class SlaveMasterInfo extends SqlTable {
        public final SqlColumn<String> channelName = column("Channel_name", JDBCType.CHAR);

        public final SqlColumn<Integer> numberOfLines = column("Number_of_lines", JDBCType.INTEGER);

        public final SqlColumn<Long> masterLogPos = column("Master_log_pos", JDBCType.BIGINT);

        public final SqlColumn<String> host = column("Host", JDBCType.CHAR);

        public final SqlColumn<Integer> port = column("Port", JDBCType.INTEGER);

        public final SqlColumn<Integer> connectRetry = column("Connect_retry", JDBCType.INTEGER);

        public final SqlColumn<Boolean> enabledSsl = column("Enabled_ssl", JDBCType.BIT);

        public final SqlColumn<Boolean> sslVerifyServerCert = column("Ssl_verify_server_cert", JDBCType.BIT);

        public final SqlColumn<Float> heartbeat = column("Heartbeat", JDBCType.REAL);

        public final SqlColumn<Long> retryCount = column("Retry_count", JDBCType.BIGINT);

        public final SqlColumn<Boolean> enabledAutoPosition = column("Enabled_auto_position", JDBCType.BIT);

        public final SqlColumn<Boolean> getPublicKey = column("Get_public_key", JDBCType.BIT);

        public final SqlColumn<String> masterCompressionAlgorithm = column("Master_compression_algorithm", JDBCType.CHAR);

        public final SqlColumn<Integer> masterZstdCompressionLevel = column("Master_zstd_compression_level", JDBCType.INTEGER);

        public final SqlColumn<String> masterLogName = column("Master_log_name", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> userName = column("User_name", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> userPassword = column("User_password", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> sslCa = column("Ssl_ca", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> sslCapath = column("Ssl_capath", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> sslCert = column("Ssl_cert", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> sslCipher = column("Ssl_cipher", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> sslKey = column("Ssl_key", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> bind = column("Bind", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> ignoredServerIds = column("Ignored_server_ids", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> uuid = column("Uuid", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> sslCrl = column("Ssl_crl", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> sslCrlpath = column("Ssl_crlpath", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> tlsVersion = column("Tls_version", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> publicKeyPath = column("Public_key_path", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> networkNamespace = column("Network_namespace", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> tlsCiphersuites = column("Tls_ciphersuites", JDBCType.LONGVARCHAR);

        public SlaveMasterInfo() {
            super("slave_master_info");
        }
    }
}