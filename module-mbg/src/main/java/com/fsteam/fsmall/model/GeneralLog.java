package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class GeneralLog implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source field: general_log.event_time")
    private Date eventTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source field: general_log.thread_id")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source field: general_log.server_id")
    private Integer serverId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.command_type")
    private String commandType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.user_host")
    private String userHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.argument")
    private byte[] argument;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source field: general_log.event_time")
    public Date getEventTime() {
        return eventTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source field: general_log.event_time")
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source field: general_log.thread_id")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source field: general_log.thread_id")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source field: general_log.server_id")
    public Integer getServerId() {
        return serverId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.server_id")
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.command_type")
    public String getCommandType() {
        return commandType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.command_type")
    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.user_host")
    public String getUserHost() {
        return userHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.user_host")
    public void setUserHost(String userHost) {
        this.userHost = userHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.argument")
    public byte[] getArgument() {
        return argument;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.argument")
    public void setArgument(byte[] argument) {
        this.argument = argument;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eventTime=").append(eventTime);
        sb.append(", threadId=").append(threadId);
        sb.append(", serverId=").append(serverId);
        sb.append(", commandType=").append(commandType);
        sb.append(", userHost=").append(userHost);
        sb.append(", argument=").append(argument);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
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
        GeneralLog other = (GeneralLog) that;
        return (this.getEventTime() == null ? other.getEventTime() == null : this.getEventTime().equals(other.getEventTime()))
            && (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getServerId() == null ? other.getServerId() == null : this.getServerId().equals(other.getServerId()))
            && (this.getCommandType() == null ? other.getCommandType() == null : this.getCommandType().equals(other.getCommandType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getServerId() == null) ? 0 : getServerId().hashCode());
        result = prime * result + ((getCommandType() == null) ? 0 : getCommandType().hashCode());
        return result;
    }
}