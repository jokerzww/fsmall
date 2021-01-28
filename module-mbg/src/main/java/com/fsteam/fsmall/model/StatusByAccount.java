package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class StatusByAccount implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.USER")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.HOST")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.VARIABLE_NAME")
    private String variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.VARIABLE_VALUE")
    private String variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source Table: status_by_account")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.USER")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.USER")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.HOST")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.HOST")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.VARIABLE_NAME")
    public String getVariableName() {
        return variableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.VARIABLE_NAME")
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.VARIABLE_VALUE")
    public String getVariableValue() {
        return variableValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: status_by_account.VARIABLE_VALUE")
    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source Table: status_by_account")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", host=").append(host);
        sb.append(", variableName=").append(variableName);
        sb.append(", variableValue=").append(variableValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source Table: status_by_account")
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
        StatusByAccount other = (StatusByAccount) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getVariableName() == null ? other.getVariableName() == null : this.getVariableName().equals(other.getVariableName()))
            && (this.getVariableValue() == null ? other.getVariableValue() == null : this.getVariableValue().equals(other.getVariableValue()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source Table: status_by_account")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getVariableName() == null) ? 0 : getVariableName().hashCode());
        result = prime * result + ((getVariableValue() == null) ? 0 : getVariableValue().hashCode());
        return result;
    }
}