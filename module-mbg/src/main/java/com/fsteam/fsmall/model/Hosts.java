package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Hosts implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.HOST")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.CURRENT_CONNECTIONS")
    private Long currentConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.TOTAL_CONNECTIONS")
    private Long totalConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.HOST")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.HOST")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.CURRENT_CONNECTIONS")
    public Long getCurrentConnections() {
        return currentConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.CURRENT_CONNECTIONS")
    public void setCurrentConnections(Long currentConnections) {
        this.currentConnections = currentConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.TOTAL_CONNECTIONS")
    public Long getTotalConnections() {
        return totalConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source field: hosts.TOTAL_CONNECTIONS")
    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", currentConnections=").append(currentConnections);
        sb.append(", totalConnections=").append(totalConnections);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
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
        Hosts other = (Hosts) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getCurrentConnections() == null ? other.getCurrentConnections() == null : this.getCurrentConnections().equals(other.getCurrentConnections()))
            && (this.getTotalConnections() == null ? other.getTotalConnections() == null : this.getTotalConnections().equals(other.getTotalConnections()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getCurrentConnections() == null) ? 0 : getCurrentConnections().hashCode());
        result = prime * result + ((getTotalConnections() == null) ? 0 : getTotalConnections().hashCode());
        return result;
    }
}