package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class VariablesInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.VARIABLE_NAME")
    private String variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.VARIABLE_SOURCE")
    private String variableSource;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.VARIABLE_PATH")
    private String variablePath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.MIN_VALUE")
    private String minValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.MAX_VALUE")
    private String maxValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.SET_TIME")
    private Date setTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.SET_USER")
    private String setUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.SET_HOST")
    private String setHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source Table: variables_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.VARIABLE_NAME")
    public String getVariableName() {
        return variableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.VARIABLE_NAME")
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.VARIABLE_SOURCE")
    public String getVariableSource() {
        return variableSource;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.VARIABLE_SOURCE")
    public void setVariableSource(String variableSource) {
        this.variableSource = variableSource;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.VARIABLE_PATH")
    public String getVariablePath() {
        return variablePath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.VARIABLE_PATH")
    public void setVariablePath(String variablePath) {
        this.variablePath = variablePath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.MIN_VALUE")
    public String getMinValue() {
        return minValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.MIN_VALUE")
    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.MAX_VALUE")
    public String getMaxValue() {
        return maxValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.MAX_VALUE")
    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.SET_TIME")
    public Date getSetTime() {
        return setTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.SET_TIME")
    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.SET_USER")
    public String getSetUser() {
        return setUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.SET_USER")
    public void setSetUser(String setUser) {
        this.setUser = setUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.SET_HOST")
    public String getSetHost() {
        return setHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source field: variables_info.SET_HOST")
    public void setSetHost(String setHost) {
        this.setHost = setHost;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source Table: variables_info")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", variableName=").append(variableName);
        sb.append(", variableSource=").append(variableSource);
        sb.append(", variablePath=").append(variablePath);
        sb.append(", minValue=").append(minValue);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", setTime=").append(setTime);
        sb.append(", setUser=").append(setUser);
        sb.append(", setHost=").append(setHost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2679591+08:00", comments="Source Table: variables_info")
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
        VariablesInfo other = (VariablesInfo) that;
        return (this.getVariableName() == null ? other.getVariableName() == null : this.getVariableName().equals(other.getVariableName()))
            && (this.getVariableSource() == null ? other.getVariableSource() == null : this.getVariableSource().equals(other.getVariableSource()))
            && (this.getVariablePath() == null ? other.getVariablePath() == null : this.getVariablePath().equals(other.getVariablePath()))
            && (this.getMinValue() == null ? other.getMinValue() == null : this.getMinValue().equals(other.getMinValue()))
            && (this.getMaxValue() == null ? other.getMaxValue() == null : this.getMaxValue().equals(other.getMaxValue()))
            && (this.getSetTime() == null ? other.getSetTime() == null : this.getSetTime().equals(other.getSetTime()))
            && (this.getSetUser() == null ? other.getSetUser() == null : this.getSetUser().equals(other.getSetUser()))
            && (this.getSetHost() == null ? other.getSetHost() == null : this.getSetHost().equals(other.getSetHost()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2689599+08:00", comments="Source Table: variables_info")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVariableName() == null) ? 0 : getVariableName().hashCode());
        result = prime * result + ((getVariableSource() == null) ? 0 : getVariableSource().hashCode());
        result = prime * result + ((getVariablePath() == null) ? 0 : getVariablePath().hashCode());
        result = prime * result + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        result = prime * result + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        result = prime * result + ((getSetTime() == null) ? 0 : getSetTime().hashCode());
        result = prime * result + ((getSetUser() == null) ? 0 : getSetUser().hashCode());
        result = prime * result + ((getSetHost() == null) ? 0 : getSetHost().hashCode());
        return result;
    }
}