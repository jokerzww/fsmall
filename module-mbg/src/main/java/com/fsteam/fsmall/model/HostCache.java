package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class HostCache implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.IP")
    private String ip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.HOST")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.HOST_VALIDATED")
    private String hostValidated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.SUM_CONNECT_ERRORS")
    private Long sumConnectErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_HOST_BLOCKED_ERRORS")
    private Long countHostBlockedErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_NAMEINFO_TRANSIENT_ERRORS")
    private Long countNameinfoTransientErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_NAMEINFO_PERMANENT_ERRORS")
    private Long countNameinfoPermanentErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_FORMAT_ERRORS")
    private Long countFormatErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_ADDRINFO_TRANSIENT_ERRORS")
    private Long countAddrinfoTransientErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_ADDRINFO_PERMANENT_ERRORS")
    private Long countAddrinfoPermanentErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_FCRDNS_ERRORS")
    private Long countFcrdnsErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_HOST_ACL_ERRORS")
    private Long countHostAclErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_NO_AUTH_PLUGIN_ERRORS")
    private Long countNoAuthPluginErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_AUTH_PLUGIN_ERRORS")
    private Long countAuthPluginErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_HANDSHAKE_ERRORS")
    private Long countHandshakeErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_PROXY_USER_ERRORS")
    private Long countProxyUserErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_PROXY_USER_ACL_ERRORS")
    private Long countProxyUserAclErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_AUTHENTICATION_ERRORS")
    private Long countAuthenticationErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_SSL_ERRORS")
    private Long countSslErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_MAX_USER_CONNECTIONS_ERRORS")
    private Long countMaxUserConnectionsErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS")
    private Long countMaxUserConnectionsPerHourErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_DEFAULT_DATABASE_ERRORS")
    private Long countDefaultDatabaseErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_INIT_CONNECT_ERRORS")
    private Long countInitConnectErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_LOCAL_ERRORS")
    private Long countLocalErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_UNKNOWN_ERRORS")
    private Long countUnknownErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.FIRST_SEEN")
    private Date firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.LAST_SEEN")
    private Date lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.FIRST_ERROR_SEEN")
    private Date firstErrorSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.LAST_ERROR_SEEN")
    private Date lastErrorSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source Table: host_cache")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.IP")
    public String getIp() {
        return ip;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.IP")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.HOST")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.HOST")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.HOST_VALIDATED")
    public String getHostValidated() {
        return hostValidated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.HOST_VALIDATED")
    public void setHostValidated(String hostValidated) {
        this.hostValidated = hostValidated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3770599+08:00", comments="Source field: host_cache.SUM_CONNECT_ERRORS")
    public Long getSumConnectErrors() {
        return sumConnectErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.SUM_CONNECT_ERRORS")
    public void setSumConnectErrors(Long sumConnectErrors) {
        this.sumConnectErrors = sumConnectErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_HOST_BLOCKED_ERRORS")
    public Long getCountHostBlockedErrors() {
        return countHostBlockedErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_HOST_BLOCKED_ERRORS")
    public void setCountHostBlockedErrors(Long countHostBlockedErrors) {
        this.countHostBlockedErrors = countHostBlockedErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_NAMEINFO_TRANSIENT_ERRORS")
    public Long getCountNameinfoTransientErrors() {
        return countNameinfoTransientErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_NAMEINFO_TRANSIENT_ERRORS")
    public void setCountNameinfoTransientErrors(Long countNameinfoTransientErrors) {
        this.countNameinfoTransientErrors = countNameinfoTransientErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_NAMEINFO_PERMANENT_ERRORS")
    public Long getCountNameinfoPermanentErrors() {
        return countNameinfoPermanentErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_NAMEINFO_PERMANENT_ERRORS")
    public void setCountNameinfoPermanentErrors(Long countNameinfoPermanentErrors) {
        this.countNameinfoPermanentErrors = countNameinfoPermanentErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_FORMAT_ERRORS")
    public Long getCountFormatErrors() {
        return countFormatErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_FORMAT_ERRORS")
    public void setCountFormatErrors(Long countFormatErrors) {
        this.countFormatErrors = countFormatErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_ADDRINFO_TRANSIENT_ERRORS")
    public Long getCountAddrinfoTransientErrors() {
        return countAddrinfoTransientErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_ADDRINFO_TRANSIENT_ERRORS")
    public void setCountAddrinfoTransientErrors(Long countAddrinfoTransientErrors) {
        this.countAddrinfoTransientErrors = countAddrinfoTransientErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_ADDRINFO_PERMANENT_ERRORS")
    public Long getCountAddrinfoPermanentErrors() {
        return countAddrinfoPermanentErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_ADDRINFO_PERMANENT_ERRORS")
    public void setCountAddrinfoPermanentErrors(Long countAddrinfoPermanentErrors) {
        this.countAddrinfoPermanentErrors = countAddrinfoPermanentErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_FCRDNS_ERRORS")
    public Long getCountFcrdnsErrors() {
        return countFcrdnsErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_FCRDNS_ERRORS")
    public void setCountFcrdnsErrors(Long countFcrdnsErrors) {
        this.countFcrdnsErrors = countFcrdnsErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_HOST_ACL_ERRORS")
    public Long getCountHostAclErrors() {
        return countHostAclErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_HOST_ACL_ERRORS")
    public void setCountHostAclErrors(Long countHostAclErrors) {
        this.countHostAclErrors = countHostAclErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_NO_AUTH_PLUGIN_ERRORS")
    public Long getCountNoAuthPluginErrors() {
        return countNoAuthPluginErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_NO_AUTH_PLUGIN_ERRORS")
    public void setCountNoAuthPluginErrors(Long countNoAuthPluginErrors) {
        this.countNoAuthPluginErrors = countNoAuthPluginErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_AUTH_PLUGIN_ERRORS")
    public Long getCountAuthPluginErrors() {
        return countAuthPluginErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_AUTH_PLUGIN_ERRORS")
    public void setCountAuthPluginErrors(Long countAuthPluginErrors) {
        this.countAuthPluginErrors = countAuthPluginErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_HANDSHAKE_ERRORS")
    public Long getCountHandshakeErrors() {
        return countHandshakeErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_HANDSHAKE_ERRORS")
    public void setCountHandshakeErrors(Long countHandshakeErrors) {
        this.countHandshakeErrors = countHandshakeErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_PROXY_USER_ERRORS")
    public Long getCountProxyUserErrors() {
        return countProxyUserErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_PROXY_USER_ERRORS")
    public void setCountProxyUserErrors(Long countProxyUserErrors) {
        this.countProxyUserErrors = countProxyUserErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_PROXY_USER_ACL_ERRORS")
    public Long getCountProxyUserAclErrors() {
        return countProxyUserAclErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_PROXY_USER_ACL_ERRORS")
    public void setCountProxyUserAclErrors(Long countProxyUserAclErrors) {
        this.countProxyUserAclErrors = countProxyUserAclErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_AUTHENTICATION_ERRORS")
    public Long getCountAuthenticationErrors() {
        return countAuthenticationErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_AUTHENTICATION_ERRORS")
    public void setCountAuthenticationErrors(Long countAuthenticationErrors) {
        this.countAuthenticationErrors = countAuthenticationErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_SSL_ERRORS")
    public Long getCountSslErrors() {
        return countSslErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_SSL_ERRORS")
    public void setCountSslErrors(Long countSslErrors) {
        this.countSslErrors = countSslErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_MAX_USER_CONNECTIONS_ERRORS")
    public Long getCountMaxUserConnectionsErrors() {
        return countMaxUserConnectionsErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_MAX_USER_CONNECTIONS_ERRORS")
    public void setCountMaxUserConnectionsErrors(Long countMaxUserConnectionsErrors) {
        this.countMaxUserConnectionsErrors = countMaxUserConnectionsErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS")
    public Long getCountMaxUserConnectionsPerHourErrors() {
        return countMaxUserConnectionsPerHourErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS")
    public void setCountMaxUserConnectionsPerHourErrors(Long countMaxUserConnectionsPerHourErrors) {
        this.countMaxUserConnectionsPerHourErrors = countMaxUserConnectionsPerHourErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_DEFAULT_DATABASE_ERRORS")
    public Long getCountDefaultDatabaseErrors() {
        return countDefaultDatabaseErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_DEFAULT_DATABASE_ERRORS")
    public void setCountDefaultDatabaseErrors(Long countDefaultDatabaseErrors) {
        this.countDefaultDatabaseErrors = countDefaultDatabaseErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_INIT_CONNECT_ERRORS")
    public Long getCountInitConnectErrors() {
        return countInitConnectErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_INIT_CONNECT_ERRORS")
    public void setCountInitConnectErrors(Long countInitConnectErrors) {
        this.countInitConnectErrors = countInitConnectErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_LOCAL_ERRORS")
    public Long getCountLocalErrors() {
        return countLocalErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_LOCAL_ERRORS")
    public void setCountLocalErrors(Long countLocalErrors) {
        this.countLocalErrors = countLocalErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_UNKNOWN_ERRORS")
    public Long getCountUnknownErrors() {
        return countUnknownErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.COUNT_UNKNOWN_ERRORS")
    public void setCountUnknownErrors(Long countUnknownErrors) {
        this.countUnknownErrors = countUnknownErrors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.FIRST_SEEN")
    public Date getFirstSeen() {
        return firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.FIRST_SEEN")
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.LAST_SEEN")
    public Date getLastSeen() {
        return lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.LAST_SEEN")
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.FIRST_ERROR_SEEN")
    public Date getFirstErrorSeen() {
        return firstErrorSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.FIRST_ERROR_SEEN")
    public void setFirstErrorSeen(Date firstErrorSeen) {
        this.firstErrorSeen = firstErrorSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.LAST_ERROR_SEEN")
    public Date getLastErrorSeen() {
        return lastErrorSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source field: host_cache.LAST_ERROR_SEEN")
    public void setLastErrorSeen(Date lastErrorSeen) {
        this.lastErrorSeen = lastErrorSeen;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source Table: host_cache")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ip=").append(ip);
        sb.append(", host=").append(host);
        sb.append(", hostValidated=").append(hostValidated);
        sb.append(", sumConnectErrors=").append(sumConnectErrors);
        sb.append(", countHostBlockedErrors=").append(countHostBlockedErrors);
        sb.append(", countNameinfoTransientErrors=").append(countNameinfoTransientErrors);
        sb.append(", countNameinfoPermanentErrors=").append(countNameinfoPermanentErrors);
        sb.append(", countFormatErrors=").append(countFormatErrors);
        sb.append(", countAddrinfoTransientErrors=").append(countAddrinfoTransientErrors);
        sb.append(", countAddrinfoPermanentErrors=").append(countAddrinfoPermanentErrors);
        sb.append(", countFcrdnsErrors=").append(countFcrdnsErrors);
        sb.append(", countHostAclErrors=").append(countHostAclErrors);
        sb.append(", countNoAuthPluginErrors=").append(countNoAuthPluginErrors);
        sb.append(", countAuthPluginErrors=").append(countAuthPluginErrors);
        sb.append(", countHandshakeErrors=").append(countHandshakeErrors);
        sb.append(", countProxyUserErrors=").append(countProxyUserErrors);
        sb.append(", countProxyUserAclErrors=").append(countProxyUserAclErrors);
        sb.append(", countAuthenticationErrors=").append(countAuthenticationErrors);
        sb.append(", countSslErrors=").append(countSslErrors);
        sb.append(", countMaxUserConnectionsErrors=").append(countMaxUserConnectionsErrors);
        sb.append(", countMaxUserConnectionsPerHourErrors=").append(countMaxUserConnectionsPerHourErrors);
        sb.append(", countDefaultDatabaseErrors=").append(countDefaultDatabaseErrors);
        sb.append(", countInitConnectErrors=").append(countInitConnectErrors);
        sb.append(", countLocalErrors=").append(countLocalErrors);
        sb.append(", countUnknownErrors=").append(countUnknownErrors);
        sb.append(", firstSeen=").append(firstSeen);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", firstErrorSeen=").append(firstErrorSeen);
        sb.append(", lastErrorSeen=").append(lastErrorSeen);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source Table: host_cache")
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
        HostCache other = (HostCache) that;
        return (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getHostValidated() == null ? other.getHostValidated() == null : this.getHostValidated().equals(other.getHostValidated()))
            && (this.getSumConnectErrors() == null ? other.getSumConnectErrors() == null : this.getSumConnectErrors().equals(other.getSumConnectErrors()))
            && (this.getCountHostBlockedErrors() == null ? other.getCountHostBlockedErrors() == null : this.getCountHostBlockedErrors().equals(other.getCountHostBlockedErrors()))
            && (this.getCountNameinfoTransientErrors() == null ? other.getCountNameinfoTransientErrors() == null : this.getCountNameinfoTransientErrors().equals(other.getCountNameinfoTransientErrors()))
            && (this.getCountNameinfoPermanentErrors() == null ? other.getCountNameinfoPermanentErrors() == null : this.getCountNameinfoPermanentErrors().equals(other.getCountNameinfoPermanentErrors()))
            && (this.getCountFormatErrors() == null ? other.getCountFormatErrors() == null : this.getCountFormatErrors().equals(other.getCountFormatErrors()))
            && (this.getCountAddrinfoTransientErrors() == null ? other.getCountAddrinfoTransientErrors() == null : this.getCountAddrinfoTransientErrors().equals(other.getCountAddrinfoTransientErrors()))
            && (this.getCountAddrinfoPermanentErrors() == null ? other.getCountAddrinfoPermanentErrors() == null : this.getCountAddrinfoPermanentErrors().equals(other.getCountAddrinfoPermanentErrors()))
            && (this.getCountFcrdnsErrors() == null ? other.getCountFcrdnsErrors() == null : this.getCountFcrdnsErrors().equals(other.getCountFcrdnsErrors()))
            && (this.getCountHostAclErrors() == null ? other.getCountHostAclErrors() == null : this.getCountHostAclErrors().equals(other.getCountHostAclErrors()))
            && (this.getCountNoAuthPluginErrors() == null ? other.getCountNoAuthPluginErrors() == null : this.getCountNoAuthPluginErrors().equals(other.getCountNoAuthPluginErrors()))
            && (this.getCountAuthPluginErrors() == null ? other.getCountAuthPluginErrors() == null : this.getCountAuthPluginErrors().equals(other.getCountAuthPluginErrors()))
            && (this.getCountHandshakeErrors() == null ? other.getCountHandshakeErrors() == null : this.getCountHandshakeErrors().equals(other.getCountHandshakeErrors()))
            && (this.getCountProxyUserErrors() == null ? other.getCountProxyUserErrors() == null : this.getCountProxyUserErrors().equals(other.getCountProxyUserErrors()))
            && (this.getCountProxyUserAclErrors() == null ? other.getCountProxyUserAclErrors() == null : this.getCountProxyUserAclErrors().equals(other.getCountProxyUserAclErrors()))
            && (this.getCountAuthenticationErrors() == null ? other.getCountAuthenticationErrors() == null : this.getCountAuthenticationErrors().equals(other.getCountAuthenticationErrors()))
            && (this.getCountSslErrors() == null ? other.getCountSslErrors() == null : this.getCountSslErrors().equals(other.getCountSslErrors()))
            && (this.getCountMaxUserConnectionsErrors() == null ? other.getCountMaxUserConnectionsErrors() == null : this.getCountMaxUserConnectionsErrors().equals(other.getCountMaxUserConnectionsErrors()))
            && (this.getCountMaxUserConnectionsPerHourErrors() == null ? other.getCountMaxUserConnectionsPerHourErrors() == null : this.getCountMaxUserConnectionsPerHourErrors().equals(other.getCountMaxUserConnectionsPerHourErrors()))
            && (this.getCountDefaultDatabaseErrors() == null ? other.getCountDefaultDatabaseErrors() == null : this.getCountDefaultDatabaseErrors().equals(other.getCountDefaultDatabaseErrors()))
            && (this.getCountInitConnectErrors() == null ? other.getCountInitConnectErrors() == null : this.getCountInitConnectErrors().equals(other.getCountInitConnectErrors()))
            && (this.getCountLocalErrors() == null ? other.getCountLocalErrors() == null : this.getCountLocalErrors().equals(other.getCountLocalErrors()))
            && (this.getCountUnknownErrors() == null ? other.getCountUnknownErrors() == null : this.getCountUnknownErrors().equals(other.getCountUnknownErrors()))
            && (this.getFirstSeen() == null ? other.getFirstSeen() == null : this.getFirstSeen().equals(other.getFirstSeen()))
            && (this.getLastSeen() == null ? other.getLastSeen() == null : this.getLastSeen().equals(other.getLastSeen()))
            && (this.getFirstErrorSeen() == null ? other.getFirstErrorSeen() == null : this.getFirstErrorSeen().equals(other.getFirstErrorSeen()))
            && (this.getLastErrorSeen() == null ? other.getLastErrorSeen() == null : this.getLastErrorSeen().equals(other.getLastErrorSeen()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3780604+08:00", comments="Source Table: host_cache")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getHostValidated() == null) ? 0 : getHostValidated().hashCode());
        result = prime * result + ((getSumConnectErrors() == null) ? 0 : getSumConnectErrors().hashCode());
        result = prime * result + ((getCountHostBlockedErrors() == null) ? 0 : getCountHostBlockedErrors().hashCode());
        result = prime * result + ((getCountNameinfoTransientErrors() == null) ? 0 : getCountNameinfoTransientErrors().hashCode());
        result = prime * result + ((getCountNameinfoPermanentErrors() == null) ? 0 : getCountNameinfoPermanentErrors().hashCode());
        result = prime * result + ((getCountFormatErrors() == null) ? 0 : getCountFormatErrors().hashCode());
        result = prime * result + ((getCountAddrinfoTransientErrors() == null) ? 0 : getCountAddrinfoTransientErrors().hashCode());
        result = prime * result + ((getCountAddrinfoPermanentErrors() == null) ? 0 : getCountAddrinfoPermanentErrors().hashCode());
        result = prime * result + ((getCountFcrdnsErrors() == null) ? 0 : getCountFcrdnsErrors().hashCode());
        result = prime * result + ((getCountHostAclErrors() == null) ? 0 : getCountHostAclErrors().hashCode());
        result = prime * result + ((getCountNoAuthPluginErrors() == null) ? 0 : getCountNoAuthPluginErrors().hashCode());
        result = prime * result + ((getCountAuthPluginErrors() == null) ? 0 : getCountAuthPluginErrors().hashCode());
        result = prime * result + ((getCountHandshakeErrors() == null) ? 0 : getCountHandshakeErrors().hashCode());
        result = prime * result + ((getCountProxyUserErrors() == null) ? 0 : getCountProxyUserErrors().hashCode());
        result = prime * result + ((getCountProxyUserAclErrors() == null) ? 0 : getCountProxyUserAclErrors().hashCode());
        result = prime * result + ((getCountAuthenticationErrors() == null) ? 0 : getCountAuthenticationErrors().hashCode());
        result = prime * result + ((getCountSslErrors() == null) ? 0 : getCountSslErrors().hashCode());
        result = prime * result + ((getCountMaxUserConnectionsErrors() == null) ? 0 : getCountMaxUserConnectionsErrors().hashCode());
        result = prime * result + ((getCountMaxUserConnectionsPerHourErrors() == null) ? 0 : getCountMaxUserConnectionsPerHourErrors().hashCode());
        result = prime * result + ((getCountDefaultDatabaseErrors() == null) ? 0 : getCountDefaultDatabaseErrors().hashCode());
        result = prime * result + ((getCountInitConnectErrors() == null) ? 0 : getCountInitConnectErrors().hashCode());
        result = prime * result + ((getCountLocalErrors() == null) ? 0 : getCountLocalErrors().hashCode());
        result = prime * result + ((getCountUnknownErrors() == null) ? 0 : getCountUnknownErrors().hashCode());
        result = prime * result + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        result = prime * result + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        result = prime * result + ((getFirstErrorSeen() == null) ? 0 : getFirstErrorSeen().hashCode());
        result = prime * result + ((getLastErrorSeen() == null) ? 0 : getLastErrorSeen().hashCode());
        return result;
    }
}