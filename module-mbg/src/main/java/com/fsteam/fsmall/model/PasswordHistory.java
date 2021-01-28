package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class PasswordHistory implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Host")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.User")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Password_timestamp")
    private Date passwordTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Host")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Host")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.User")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.User")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Password_timestamp")
    public Date getPasswordTimestamp() {
        return passwordTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Password_timestamp")
    public void setPasswordTimestamp(Date passwordTimestamp) {
        this.passwordTimestamp = passwordTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source field: password_history.Password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", user=").append(user);
        sb.append(", passwordTimestamp=").append(passwordTimestamp);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
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
        PasswordHistory other = (PasswordHistory) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getPasswordTimestamp() == null ? other.getPasswordTimestamp() == null : this.getPasswordTimestamp().equals(other.getPasswordTimestamp()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getPasswordTimestamp() == null) ? 0 : getPasswordTimestamp().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }
}