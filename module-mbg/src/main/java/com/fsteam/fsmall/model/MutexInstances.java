package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class MutexInstances implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source field: mutex_instances.OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source field: mutex_instances.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source field: mutex_instances.LOCKED_BY_THREAD_ID")
    private Long lockedByThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: mutex_instances")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source field: mutex_instances.OBJECT_INSTANCE_BEGIN")
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source field: mutex_instances.OBJECT_INSTANCE_BEGIN")
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source field: mutex_instances.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source field: mutex_instances.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source field: mutex_instances.LOCKED_BY_THREAD_ID")
    public Long getLockedByThreadId() {
        return lockedByThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source field: mutex_instances.LOCKED_BY_THREAD_ID")
    public void setLockedByThreadId(Long lockedByThreadId) {
        this.lockedByThreadId = lockedByThreadId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: mutex_instances")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", name=").append(name);
        sb.append(", lockedByThreadId=").append(lockedByThreadId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: mutex_instances")
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
        MutexInstances other = (MutexInstances) that;
        return (this.getObjectInstanceBegin() == null ? other.getObjectInstanceBegin() == null : this.getObjectInstanceBegin().equals(other.getObjectInstanceBegin()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLockedByThreadId() == null ? other.getLockedByThreadId() == null : this.getLockedByThreadId().equals(other.getLockedByThreadId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectInstanceBegin() == null) ? 0 : getObjectInstanceBegin().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLockedByThreadId() == null) ? 0 : getLockedByThreadId().hashCode());
        return result;
    }
}