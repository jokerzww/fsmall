package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Servers implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Server_name")
    private String serverName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Host")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Port")
    private Integer port;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Socket")
    private String socket;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Wrapper")
    private String wrapper;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Owner")
    private String owner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: servers")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Server_name")
    public String getServerName() {
        return serverName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Server_name")
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Host")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Host")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Port")
    public Integer getPort() {
        return port;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Port")
    public void setPort(Integer port) {
        this.port = port;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Socket")
    public String getSocket() {
        return socket;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Socket")
    public void setSocket(String socket) {
        this.socket = socket;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Wrapper")
    public String getWrapper() {
        return wrapper;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Wrapper")
    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Owner")
    public String getOwner() {
        return owner;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: servers")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serverName=").append(serverName);
        sb.append(", host=").append(host);
        sb.append(", db=").append(db);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", port=").append(port);
        sb.append(", socket=").append(socket);
        sb.append(", wrapper=").append(wrapper);
        sb.append(", owner=").append(owner);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: servers")
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
        Servers other = (Servers) that;
        return (this.getServerName() == null ? other.getServerName() == null : this.getServerName().equals(other.getServerName()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getSocket() == null ? other.getSocket() == null : this.getSocket().equals(other.getSocket()))
            && (this.getWrapper() == null ? other.getWrapper() == null : this.getWrapper().equals(other.getWrapper()))
            && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: servers")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServerName() == null) ? 0 : getServerName().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getSocket() == null) ? 0 : getSocket().hashCode());
        result = prime * result + ((getWrapper() == null) ? 0 : getWrapper().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return result;
    }
}