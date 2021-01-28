package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Metrics implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Variable_name")
    private String variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Enabled")
    private String enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Variable_value")
    private String variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Variable_name")
    public String getVariableName() {
        return variableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Variable_name")
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Type")
    public void setType(String type) {
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Enabled")
    public String getEnabled() {
        return enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Enabled")
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Variable_value")
    public String getVariableValue() {
        return variableValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Variable_value")
    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", variableName=").append(variableName);
        sb.append(", type=").append(type);
        sb.append(", enabled=").append(enabled);
        sb.append(", variableValue=").append(variableValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
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
        Metrics other = (Metrics) that;
        return (this.getVariableName() == null ? other.getVariableName() == null : this.getVariableName().equals(other.getVariableName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getVariableValue() == null ? other.getVariableValue() == null : this.getVariableValue().equals(other.getVariableValue()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVariableName() == null) ? 0 : getVariableName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getVariableValue() == null) ? 0 : getVariableValue().hashCode());
        return result;
    }
}