package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class ProxiesPriv implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Host")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.User")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Proxied_host")
    private String proxiedHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Proxied_user")
    private String proxiedUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.With_grant")
    private Boolean withGrant;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Grantor")
    private String grantor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Timestamp")
    private Date timestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Host")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Host")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.User")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.User")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Proxied_host")
    public String getProxiedHost() {
        return proxiedHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Proxied_host")
    public void setProxiedHost(String proxiedHost) {
        this.proxiedHost = proxiedHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Proxied_user")
    public String getProxiedUser() {
        return proxiedUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Proxied_user")
    public void setProxiedUser(String proxiedUser) {
        this.proxiedUser = proxiedUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.With_grant")
    public Boolean getWithGrant() {
        return withGrant;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.With_grant")
    public void setWithGrant(Boolean withGrant) {
        this.withGrant = withGrant;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Grantor")
    public String getGrantor() {
        return grantor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Grantor")
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source field: proxies_priv.Timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", user=").append(user);
        sb.append(", proxiedHost=").append(proxiedHost);
        sb.append(", proxiedUser=").append(proxiedUser);
        sb.append(", withGrant=").append(withGrant);
        sb.append(", grantor=").append(grantor);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
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
        ProxiesPriv other = (ProxiesPriv) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getProxiedHost() == null ? other.getProxiedHost() == null : this.getProxiedHost().equals(other.getProxiedHost()))
            && (this.getProxiedUser() == null ? other.getProxiedUser() == null : this.getProxiedUser().equals(other.getProxiedUser()))
            && (this.getWithGrant() == null ? other.getWithGrant() == null : this.getWithGrant().equals(other.getWithGrant()))
            && (this.getGrantor() == null ? other.getGrantor() == null : this.getGrantor().equals(other.getGrantor()))
            && (this.getTimestamp() == null ? other.getTimestamp() == null : this.getTimestamp().equals(other.getTimestamp()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getProxiedHost() == null) ? 0 : getProxiedHost().hashCode());
        result = prime * result + ((getProxiedUser() == null) ? 0 : getProxiedUser().hashCode());
        result = prime * result + ((getWithGrant() == null) ? 0 : getWithGrant().hashCode());
        result = prime * result + ((getGrantor() == null) ? 0 : getGrantor().hashCode());
        result = prime * result + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return result;
    }
}