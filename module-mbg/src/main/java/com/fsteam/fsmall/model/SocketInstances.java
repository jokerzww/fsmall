package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SocketInstances implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.SOCKET_ID")
    private Integer socketId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.IP")
    private String ip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.PORT")
    private Integer port;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.STATE")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: socket_instances")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.OBJECT_INSTANCE_BEGIN")
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.OBJECT_INSTANCE_BEGIN")
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.SOCKET_ID")
    public Integer getSocketId() {
        return socketId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.SOCKET_ID")
    public void setSocketId(Integer socketId) {
        this.socketId = socketId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.IP")
    public String getIp() {
        return ip;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.IP")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.PORT")
    public Integer getPort() {
        return port;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.PORT")
    public void setPort(Integer port) {
        this.port = port;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.STATE")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: socket_instances.STATE")
    public void setState(String state) {
        this.state = state;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: socket_instances")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", eventName=").append(eventName);
        sb.append(", threadId=").append(threadId);
        sb.append(", socketId=").append(socketId);
        sb.append(", ip=").append(ip);
        sb.append(", port=").append(port);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: socket_instances")
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
        SocketInstances other = (SocketInstances) that;
        return (this.getObjectInstanceBegin() == null ? other.getObjectInstanceBegin() == null : this.getObjectInstanceBegin().equals(other.getObjectInstanceBegin()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getSocketId() == null ? other.getSocketId() == null : this.getSocketId().equals(other.getSocketId()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: socket_instances")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectInstanceBegin() == null) ? 0 : getObjectInstanceBegin().hashCode());
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getSocketId() == null) ? 0 : getSocketId().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }
}