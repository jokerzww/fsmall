package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SetupActors implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.HOST")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.USER")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.ROLE")
    private String role;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.ENABLED")
    private String enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.HISTORY")
    private String history;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: setup_actors")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.HOST")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.HOST")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.USER")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.USER")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.ROLE")
    public String getRole() {
        return role;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.ROLE")
    public void setRole(String role) {
        this.role = role;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.ENABLED")
    public String getEnabled() {
        return enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.ENABLED")
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.HISTORY")
    public String getHistory() {
        return history;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.HISTORY")
    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: setup_actors")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", user=").append(user);
        sb.append(", role=").append(role);
        sb.append(", enabled=").append(enabled);
        sb.append(", history=").append(history);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: setup_actors")
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
        SetupActors other = (SetupActors) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getHistory() == null ? other.getHistory() == null : this.getHistory().equals(other.getHistory()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: setup_actors")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getHistory() == null) ? 0 : getHistory().hashCode());
        return result;
    }
}