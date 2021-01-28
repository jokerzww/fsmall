package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class ServerCost implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.cost_name")
    private String costName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.cost_value")
    private Float costValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.last_update")
    private Date lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.comment")
    private String comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.default_value")
    private Float defaultValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: server_cost")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.cost_name")
    public String getCostName() {
        return costName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.cost_name")
    public void setCostName(String costName) {
        this.costName = costName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.cost_value")
    public Float getCostValue() {
        return costValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.cost_value")
    public void setCostValue(Float costValue) {
        this.costValue = costValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.last_update")
    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.last_update")
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.comment")
    public String getComment() {
        return comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.default_value")
    public Float getDefaultValue() {
        return defaultValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.default_value")
    public void setDefaultValue(Float defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: server_cost")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", costName=").append(costName);
        sb.append(", costValue=").append(costValue);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", comment=").append(comment);
        sb.append(", defaultValue=").append(defaultValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: server_cost")
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
        ServerCost other = (ServerCost) that;
        return (this.getCostName() == null ? other.getCostName() == null : this.getCostName().equals(other.getCostName()))
            && (this.getCostValue() == null ? other.getCostValue() == null : this.getCostValue().equals(other.getCostValue()))
            && (this.getLastUpdate() == null ? other.getLastUpdate() == null : this.getLastUpdate().equals(other.getLastUpdate()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getDefaultValue() == null ? other.getDefaultValue() == null : this.getDefaultValue().equals(other.getDefaultValue()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: server_cost")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCostName() == null) ? 0 : getCostName().hashCode());
        result = prime * result + ((getCostValue() == null) ? 0 : getCostValue().hashCode());
        result = prime * result + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return result;
    }
}