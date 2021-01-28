package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HostCacheDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source Table: host_cache")
    public static final HostCache hostCache = new HostCache();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.IP")
    public static final SqlColumn<String> ip = hostCache.ip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.HOST")
    public static final SqlColumn<String> host = hostCache.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.HOST_VALIDATED")
    public static final SqlColumn<String> hostValidated = hostCache.hostValidated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.SUM_CONNECT_ERRORS")
    public static final SqlColumn<Long> sumConnectErrors = hostCache.sumConnectErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_HOST_BLOCKED_ERRORS")
    public static final SqlColumn<Long> countHostBlockedErrors = hostCache.countHostBlockedErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_NAMEINFO_TRANSIENT_ERRORS")
    public static final SqlColumn<Long> countNameinfoTransientErrors = hostCache.countNameinfoTransientErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_NAMEINFO_PERMANENT_ERRORS")
    public static final SqlColumn<Long> countNameinfoPermanentErrors = hostCache.countNameinfoPermanentErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_FORMAT_ERRORS")
    public static final SqlColumn<Long> countFormatErrors = hostCache.countFormatErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_ADDRINFO_TRANSIENT_ERRORS")
    public static final SqlColumn<Long> countAddrinfoTransientErrors = hostCache.countAddrinfoTransientErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_ADDRINFO_PERMANENT_ERRORS")
    public static final SqlColumn<Long> countAddrinfoPermanentErrors = hostCache.countAddrinfoPermanentErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_FCRDNS_ERRORS")
    public static final SqlColumn<Long> countFcrdnsErrors = hostCache.countFcrdnsErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_HOST_ACL_ERRORS")
    public static final SqlColumn<Long> countHostAclErrors = hostCache.countHostAclErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_NO_AUTH_PLUGIN_ERRORS")
    public static final SqlColumn<Long> countNoAuthPluginErrors = hostCache.countNoAuthPluginErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_AUTH_PLUGIN_ERRORS")
    public static final SqlColumn<Long> countAuthPluginErrors = hostCache.countAuthPluginErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_HANDSHAKE_ERRORS")
    public static final SqlColumn<Long> countHandshakeErrors = hostCache.countHandshakeErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_PROXY_USER_ERRORS")
    public static final SqlColumn<Long> countProxyUserErrors = hostCache.countProxyUserErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_PROXY_USER_ACL_ERRORS")
    public static final SqlColumn<Long> countProxyUserAclErrors = hostCache.countProxyUserAclErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_AUTHENTICATION_ERRORS")
    public static final SqlColumn<Long> countAuthenticationErrors = hostCache.countAuthenticationErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_SSL_ERRORS")
    public static final SqlColumn<Long> countSslErrors = hostCache.countSslErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_MAX_USER_CONNECTIONS_ERRORS")
    public static final SqlColumn<Long> countMaxUserConnectionsErrors = hostCache.countMaxUserConnectionsErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS")
    public static final SqlColumn<Long> countMaxUserConnectionsPerHourErrors = hostCache.countMaxUserConnectionsPerHourErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_DEFAULT_DATABASE_ERRORS")
    public static final SqlColumn<Long> countDefaultDatabaseErrors = hostCache.countDefaultDatabaseErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_INIT_CONNECT_ERRORS")
    public static final SqlColumn<Long> countInitConnectErrors = hostCache.countInitConnectErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_LOCAL_ERRORS")
    public static final SqlColumn<Long> countLocalErrors = hostCache.countLocalErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3790615+08:00", comments="Source field: host_cache.COUNT_UNKNOWN_ERRORS")
    public static final SqlColumn<Long> countUnknownErrors = hostCache.countUnknownErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source field: host_cache.FIRST_SEEN")
    public static final SqlColumn<Date> firstSeen = hostCache.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source field: host_cache.LAST_SEEN")
    public static final SqlColumn<Date> lastSeen = hostCache.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source field: host_cache.FIRST_ERROR_SEEN")
    public static final SqlColumn<Date> firstErrorSeen = hostCache.firstErrorSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3800619+08:00", comments="Source field: host_cache.LAST_ERROR_SEEN")
    public static final SqlColumn<Date> lastErrorSeen = hostCache.lastErrorSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source Table: host_cache")
    public static final class HostCache extends SqlTable {
        public final SqlColumn<String> ip = column("IP", JDBCType.VARCHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> hostValidated = column("HOST_VALIDATED", JDBCType.CHAR);

        public final SqlColumn<Long> sumConnectErrors = column("SUM_CONNECT_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countHostBlockedErrors = column("COUNT_HOST_BLOCKED_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countNameinfoTransientErrors = column("COUNT_NAMEINFO_TRANSIENT_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countNameinfoPermanentErrors = column("COUNT_NAMEINFO_PERMANENT_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countFormatErrors = column("COUNT_FORMAT_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countAddrinfoTransientErrors = column("COUNT_ADDRINFO_TRANSIENT_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countAddrinfoPermanentErrors = column("COUNT_ADDRINFO_PERMANENT_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countFcrdnsErrors = column("COUNT_FCRDNS_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countHostAclErrors = column("COUNT_HOST_ACL_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countNoAuthPluginErrors = column("COUNT_NO_AUTH_PLUGIN_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countAuthPluginErrors = column("COUNT_AUTH_PLUGIN_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countHandshakeErrors = column("COUNT_HANDSHAKE_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countProxyUserErrors = column("COUNT_PROXY_USER_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countProxyUserAclErrors = column("COUNT_PROXY_USER_ACL_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countAuthenticationErrors = column("COUNT_AUTHENTICATION_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countSslErrors = column("COUNT_SSL_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countMaxUserConnectionsErrors = column("COUNT_MAX_USER_CONNECTIONS_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countMaxUserConnectionsPerHourErrors = column("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countDefaultDatabaseErrors = column("COUNT_DEFAULT_DATABASE_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countInitConnectErrors = column("COUNT_INIT_CONNECT_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countLocalErrors = column("COUNT_LOCAL_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> countUnknownErrors = column("COUNT_UNKNOWN_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Date> firstSeen = column("FIRST_SEEN", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("LAST_SEEN", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> firstErrorSeen = column("FIRST_ERROR_SEEN", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastErrorSeen = column("LAST_ERROR_SEEN", JDBCType.TIMESTAMP);

        public HostCache() {
            super("host_cache");
        }
    }
}