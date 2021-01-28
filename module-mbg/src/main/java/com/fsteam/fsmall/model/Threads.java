package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Threads implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.TYPE")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_ID")
    private Long processlistId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_USER")
    private String processlistUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_HOST")
    private String processlistHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_DB")
    private String processlistDb;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_COMMAND")
    private String processlistCommand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_TIME")
    private Long processlistTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_STATE")
    private String processlistState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PARENT_THREAD_ID")
    private Long parentThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.ROLE")
    private String role;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.INSTRUMENTED")
    private String instrumented;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.HISTORY")
    private String history;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.CONNECTION_TYPE")
    private String connectionType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.THREAD_OS_ID")
    private Long threadOsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.RESOURCE_GROUP")
    private String resourceGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.PROCESSLIST_INFO")
    private String processlistInfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source Table: threads")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.TYPE")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.TYPE")
    public void setType(String type) {
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_ID")
    public Long getProcesslistId() {
        return processlistId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_ID")
    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_USER")
    public String getProcesslistUser() {
        return processlistUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_USER")
    public void setProcesslistUser(String processlistUser) {
        this.processlistUser = processlistUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_HOST")
    public String getProcesslistHost() {
        return processlistHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_HOST")
    public void setProcesslistHost(String processlistHost) {
        this.processlistHost = processlistHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_DB")
    public String getProcesslistDb() {
        return processlistDb;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_DB")
    public void setProcesslistDb(String processlistDb) {
        this.processlistDb = processlistDb;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_COMMAND")
    public String getProcesslistCommand() {
        return processlistCommand;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_COMMAND")
    public void setProcesslistCommand(String processlistCommand) {
        this.processlistCommand = processlistCommand;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_TIME")
    public Long getProcesslistTime() {
        return processlistTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_TIME")
    public void setProcesslistTime(Long processlistTime) {
        this.processlistTime = processlistTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_STATE")
    public String getProcesslistState() {
        return processlistState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PROCESSLIST_STATE")
    public void setProcesslistState(String processlistState) {
        this.processlistState = processlistState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PARENT_THREAD_ID")
    public Long getParentThreadId() {
        return parentThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.PARENT_THREAD_ID")
    public void setParentThreadId(Long parentThreadId) {
        this.parentThreadId = parentThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.ROLE")
    public String getRole() {
        return role;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.ROLE")
    public void setRole(String role) {
        this.role = role;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.088796+08:00", comments="Source field: threads.INSTRUMENTED")
    public String getInstrumented() {
        return instrumented;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.INSTRUMENTED")
    public void setInstrumented(String instrumented) {
        this.instrumented = instrumented;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.HISTORY")
    public String getHistory() {
        return history;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.HISTORY")
    public void setHistory(String history) {
        this.history = history;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.CONNECTION_TYPE")
    public String getConnectionType() {
        return connectionType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.CONNECTION_TYPE")
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.THREAD_OS_ID")
    public Long getThreadOsId() {
        return threadOsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.THREAD_OS_ID")
    public void setThreadOsId(Long threadOsId) {
        this.threadOsId = threadOsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.RESOURCE_GROUP")
    public String getResourceGroup() {
        return resourceGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.RESOURCE_GROUP")
    public void setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.PROCESSLIST_INFO")
    public String getProcesslistInfo() {
        return processlistInfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source field: threads.PROCESSLIST_INFO")
    public void setProcesslistInfo(String processlistInfo) {
        this.processlistInfo = processlistInfo;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source Table: threads")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", threadId=").append(threadId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", processlistId=").append(processlistId);
        sb.append(", processlistUser=").append(processlistUser);
        sb.append(", processlistHost=").append(processlistHost);
        sb.append(", processlistDb=").append(processlistDb);
        sb.append(", processlistCommand=").append(processlistCommand);
        sb.append(", processlistTime=").append(processlistTime);
        sb.append(", processlistState=").append(processlistState);
        sb.append(", parentThreadId=").append(parentThreadId);
        sb.append(", role=").append(role);
        sb.append(", instrumented=").append(instrumented);
        sb.append(", history=").append(history);
        sb.append(", connectionType=").append(connectionType);
        sb.append(", threadOsId=").append(threadOsId);
        sb.append(", resourceGroup=").append(resourceGroup);
        sb.append(", processlistInfo=").append(processlistInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source Table: threads")
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
        Threads other = (Threads) that;
        return (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getProcesslistId() == null ? other.getProcesslistId() == null : this.getProcesslistId().equals(other.getProcesslistId()))
            && (this.getProcesslistUser() == null ? other.getProcesslistUser() == null : this.getProcesslistUser().equals(other.getProcesslistUser()))
            && (this.getProcesslistHost() == null ? other.getProcesslistHost() == null : this.getProcesslistHost().equals(other.getProcesslistHost()))
            && (this.getProcesslistDb() == null ? other.getProcesslistDb() == null : this.getProcesslistDb().equals(other.getProcesslistDb()))
            && (this.getProcesslistCommand() == null ? other.getProcesslistCommand() == null : this.getProcesslistCommand().equals(other.getProcesslistCommand()))
            && (this.getProcesslistTime() == null ? other.getProcesslistTime() == null : this.getProcesslistTime().equals(other.getProcesslistTime()))
            && (this.getProcesslistState() == null ? other.getProcesslistState() == null : this.getProcesslistState().equals(other.getProcesslistState()))
            && (this.getParentThreadId() == null ? other.getParentThreadId() == null : this.getParentThreadId().equals(other.getParentThreadId()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getInstrumented() == null ? other.getInstrumented() == null : this.getInstrumented().equals(other.getInstrumented()))
            && (this.getHistory() == null ? other.getHistory() == null : this.getHistory().equals(other.getHistory()))
            && (this.getConnectionType() == null ? other.getConnectionType() == null : this.getConnectionType().equals(other.getConnectionType()))
            && (this.getThreadOsId() == null ? other.getThreadOsId() == null : this.getThreadOsId().equals(other.getThreadOsId()))
            && (this.getResourceGroup() == null ? other.getResourceGroup() == null : this.getResourceGroup().equals(other.getResourceGroup()))
            && (this.getProcesslistInfo() == null ? other.getProcesslistInfo() == null : this.getProcesslistInfo().equals(other.getProcesslistInfo()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0897969+08:00", comments="Source Table: threads")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getProcesslistId() == null) ? 0 : getProcesslistId().hashCode());
        result = prime * result + ((getProcesslistUser() == null) ? 0 : getProcesslistUser().hashCode());
        result = prime * result + ((getProcesslistHost() == null) ? 0 : getProcesslistHost().hashCode());
        result = prime * result + ((getProcesslistDb() == null) ? 0 : getProcesslistDb().hashCode());
        result = prime * result + ((getProcesslistCommand() == null) ? 0 : getProcesslistCommand().hashCode());
        result = prime * result + ((getProcesslistTime() == null) ? 0 : getProcesslistTime().hashCode());
        result = prime * result + ((getProcesslistState() == null) ? 0 : getProcesslistState().hashCode());
        result = prime * result + ((getParentThreadId() == null) ? 0 : getParentThreadId().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getInstrumented() == null) ? 0 : getInstrumented().hashCode());
        result = prime * result + ((getHistory() == null) ? 0 : getHistory().hashCode());
        result = prime * result + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        result = prime * result + ((getThreadOsId() == null) ? 0 : getThreadOsId().hashCode());
        result = prime * result + ((getResourceGroup() == null) ? 0 : getResourceGroup().hashCode());
        result = prime * result + ((getProcesslistInfo() == null) ? 0 : getProcesslistInfo().hashCode());
        return result;
    }
}