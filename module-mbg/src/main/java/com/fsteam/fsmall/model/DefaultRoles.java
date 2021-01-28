package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class DefaultRoles implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.HOST")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.USER")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.DEFAULT_ROLE_HOST")
    private String defaultRoleHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.DEFAULT_ROLE_USER")
    private String defaultRoleUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source Table: default_roles")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.HOST")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.HOST")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.USER")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.USER")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.DEFAULT_ROLE_HOST")
    public String getDefaultRoleHost() {
        return defaultRoleHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.DEFAULT_ROLE_HOST")
    public void setDefaultRoleHost(String defaultRoleHost) {
        this.defaultRoleHost = defaultRoleHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.DEFAULT_ROLE_USER")
    public String getDefaultRoleUser() {
        return defaultRoleUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source field: default_roles.DEFAULT_ROLE_USER")
    public void setDefaultRoleUser(String defaultRoleUser) {
        this.defaultRoleUser = defaultRoleUser;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source Table: default_roles")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", user=").append(user);
        sb.append(", defaultRoleHost=").append(defaultRoleHost);
        sb.append(", defaultRoleUser=").append(defaultRoleUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source Table: default_roles")
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
        DefaultRoles other = (DefaultRoles) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getDefaultRoleHost() == null ? other.getDefaultRoleHost() == null : this.getDefaultRoleHost().equals(other.getDefaultRoleHost()))
            && (this.getDefaultRoleUser() == null ? other.getDefaultRoleUser() == null : this.getDefaultRoleUser().equals(other.getDefaultRoleUser()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source Table: default_roles")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getDefaultRoleHost() == null) ? 0 : getDefaultRoleHost().hashCode());
        result = prime * result + ((getDefaultRoleUser() == null) ? 0 : getDefaultRoleUser().hashCode());
        return result;
    }
}