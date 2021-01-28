package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class RoleEdges implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.FROM_HOST")
    private String fromHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.FROM_USER")
    private String fromUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.TO_HOST")
    private String toHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.TO_USER")
    private String toUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.WITH_ADMIN_OPTION")
    private String withAdminOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.FROM_HOST")
    public String getFromHost() {
        return fromHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.FROM_HOST")
    public void setFromHost(String fromHost) {
        this.fromHost = fromHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.FROM_USER")
    public String getFromUser() {
        return fromUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.FROM_USER")
    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.TO_HOST")
    public String getToHost() {
        return toHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.TO_HOST")
    public void setToHost(String toHost) {
        this.toHost = toHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.TO_USER")
    public String getToUser() {
        return toUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.TO_USER")
    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.WITH_ADMIN_OPTION")
    public String getWithAdminOption() {
        return withAdminOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source field: role_edges.WITH_ADMIN_OPTION")
    public void setWithAdminOption(String withAdminOption) {
        this.withAdminOption = withAdminOption;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fromHost=").append(fromHost);
        sb.append(", fromUser=").append(fromUser);
        sb.append(", toHost=").append(toHost);
        sb.append(", toUser=").append(toUser);
        sb.append(", withAdminOption=").append(withAdminOption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
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
        RoleEdges other = (RoleEdges) that;
        return (this.getFromHost() == null ? other.getFromHost() == null : this.getFromHost().equals(other.getFromHost()))
            && (this.getFromUser() == null ? other.getFromUser() == null : this.getFromUser().equals(other.getFromUser()))
            && (this.getToHost() == null ? other.getToHost() == null : this.getToHost().equals(other.getToHost()))
            && (this.getToUser() == null ? other.getToUser() == null : this.getToUser().equals(other.getToUser()))
            && (this.getWithAdminOption() == null ? other.getWithAdminOption() == null : this.getWithAdminOption().equals(other.getWithAdminOption()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFromHost() == null) ? 0 : getFromHost().hashCode());
        result = prime * result + ((getFromUser() == null) ? 0 : getFromUser().hashCode());
        result = prime * result + ((getToHost() == null) ? 0 : getToHost().hashCode());
        result = prime * result + ((getToUser() == null) ? 0 : getToUser().hashCode());
        result = prime * result + ((getWithAdminOption() == null) ? 0 : getWithAdminOption().hashCode());
        return result;
    }
}