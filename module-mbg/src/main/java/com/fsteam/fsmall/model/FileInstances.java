package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class FileInstances implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: file_instances.FILE_NAME")
    private String fileName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: file_instances.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: file_instances.OPEN_COUNT")
    private Integer openCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source Table: file_instances")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: file_instances.FILE_NAME")
    public String getFileName() {
        return fileName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: file_instances.FILE_NAME")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: file_instances.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: file_instances.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: file_instances.OPEN_COUNT")
    public Integer getOpenCount() {
        return openCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: file_instances.OPEN_COUNT")
    public void setOpenCount(Integer openCount) {
        this.openCount = openCount;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source Table: file_instances")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileName=").append(fileName);
        sb.append(", eventName=").append(eventName);
        sb.append(", openCount=").append(openCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source Table: file_instances")
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
        FileInstances other = (FileInstances) that;
        return (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getOpenCount() == null ? other.getOpenCount() == null : this.getOpenCount().equals(other.getOpenCount()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source Table: file_instances")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getOpenCount() == null) ? 0 : getOpenCount().hashCode());
        return result;
    }
}