package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class StatusByThread implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: status_by_thread.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: status_by_thread.VARIABLE_NAME")
    private String variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: status_by_thread.VARIABLE_VALUE")
    private String variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: status_by_thread")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: status_by_thread.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: status_by_thread.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: status_by_thread.VARIABLE_NAME")
    public String getVariableName() {
        return variableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: status_by_thread.VARIABLE_NAME")
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: status_by_thread.VARIABLE_VALUE")
    public String getVariableValue() {
        return variableValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: status_by_thread.VARIABLE_VALUE")
    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: status_by_thread")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", threadId=").append(threadId);
        sb.append(", variableName=").append(variableName);
        sb.append(", variableValue=").append(variableValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: status_by_thread")
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
        StatusByThread other = (StatusByThread) that;
        return (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getVariableName() == null ? other.getVariableName() == null : this.getVariableName().equals(other.getVariableName()))
            && (this.getVariableValue() == null ? other.getVariableValue() == null : this.getVariableValue().equals(other.getVariableValue()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: status_by_thread")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getVariableName() == null) ? 0 : getVariableName().hashCode());
        result = prime * result + ((getVariableValue() == null) ? 0 : getVariableValue().hashCode());
        return result;
    }
}