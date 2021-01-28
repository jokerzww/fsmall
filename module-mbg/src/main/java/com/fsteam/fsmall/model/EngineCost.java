package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class EngineCost implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.cost_name")
    private String costName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.engine_name")
    private String engineName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.device_type")
    private Integer deviceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.cost_value")
    private Float costValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.last_update")
    private Date lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.comment")
    private String comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.default_value")
    private Float defaultValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source Table: engine_cost")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.cost_name")
    public String getCostName() {
        return costName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.cost_name")
    public void setCostName(String costName) {
        this.costName = costName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.engine_name")
    public String getEngineName() {
        return engineName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.engine_name")
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.device_type")
    public Integer getDeviceType() {
        return deviceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.device_type")
    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.cost_value")
    public Float getCostValue() {
        return costValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.cost_value")
    public void setCostValue(Float costValue) {
        this.costValue = costValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.last_update")
    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.last_update")
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.comment")
    public String getComment() {
        return comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.default_value")
    public Float getDefaultValue() {
        return defaultValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4751487+08:00", comments="Source field: engine_cost.default_value")
    public void setDefaultValue(Float defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source Table: engine_cost")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", costName=").append(costName);
        sb.append(", engineName=").append(engineName);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", costValue=").append(costValue);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", comment=").append(comment);
        sb.append(", defaultValue=").append(defaultValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source Table: engine_cost")
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
        EngineCost other = (EngineCost) that;
        return (this.getCostName() == null ? other.getCostName() == null : this.getCostName().equals(other.getCostName()))
            && (this.getEngineName() == null ? other.getEngineName() == null : this.getEngineName().equals(other.getEngineName()))
            && (this.getDeviceType() == null ? other.getDeviceType() == null : this.getDeviceType().equals(other.getDeviceType()))
            && (this.getCostValue() == null ? other.getCostValue() == null : this.getCostValue().equals(other.getCostValue()))
            && (this.getLastUpdate() == null ? other.getLastUpdate() == null : this.getLastUpdate().equals(other.getLastUpdate()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getDefaultValue() == null ? other.getDefaultValue() == null : this.getDefaultValue().equals(other.getDefaultValue()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source Table: engine_cost")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCostName() == null) ? 0 : getCostName().hashCode());
        result = prime * result + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        result = prime * result + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        result = prime * result + ((getCostValue() == null) ? 0 : getCostValue().hashCode());
        result = prime * result + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return result;
    }
}