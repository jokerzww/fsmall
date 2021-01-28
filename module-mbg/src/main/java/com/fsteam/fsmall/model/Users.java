package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Users implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.USER")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.CURRENT_CONNECTIONS")
    private Long currentConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.TOTAL_CONNECTIONS")
    private Long totalConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.USER")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.USER")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.CURRENT_CONNECTIONS")
    public Long getCurrentConnections() {
        return currentConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.CURRENT_CONNECTIONS")
    public void setCurrentConnections(Long currentConnections) {
        this.currentConnections = currentConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.TOTAL_CONNECTIONS")
    public Long getTotalConnections() {
        return totalConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source field: users.TOTAL_CONNECTIONS")
    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", currentConnections=").append(currentConnections);
        sb.append(", totalConnections=").append(totalConnections);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
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
        Users other = (Users) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getCurrentConnections() == null ? other.getCurrentConnections() == null : this.getCurrentConnections().equals(other.getCurrentConnections()))
            && (this.getTotalConnections() == null ? other.getTotalConnections() == null : this.getTotalConnections().equals(other.getTotalConnections()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getCurrentConnections() == null) ? 0 : getCurrentConnections().hashCode());
        result = prime * result + ((getTotalConnections() == null) ? 0 : getTotalConnections().hashCode());
        return result;
    }
}