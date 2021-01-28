package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class RwlockInstances implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.WRITE_LOCKED_BY_THREAD_ID")
    private Long writeLockedByThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.READ_LOCKED_BY_COUNT")
    private Integer readLockedByCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.OBJECT_INSTANCE_BEGIN")
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.OBJECT_INSTANCE_BEGIN")
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.WRITE_LOCKED_BY_THREAD_ID")
    public Long getWriteLockedByThreadId() {
        return writeLockedByThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.WRITE_LOCKED_BY_THREAD_ID")
    public void setWriteLockedByThreadId(Long writeLockedByThreadId) {
        this.writeLockedByThreadId = writeLockedByThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.READ_LOCKED_BY_COUNT")
    public Integer getReadLockedByCount() {
        return readLockedByCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.READ_LOCKED_BY_COUNT")
    public void setReadLockedByCount(Integer readLockedByCount) {
        this.readLockedByCount = readLockedByCount;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", name=").append(name);
        sb.append(", writeLockedByThreadId=").append(writeLockedByThreadId);
        sb.append(", readLockedByCount=").append(readLockedByCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
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
        RwlockInstances other = (RwlockInstances) that;
        return (this.getObjectInstanceBegin() == null ? other.getObjectInstanceBegin() == null : this.getObjectInstanceBegin().equals(other.getObjectInstanceBegin()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getWriteLockedByThreadId() == null ? other.getWriteLockedByThreadId() == null : this.getWriteLockedByThreadId().equals(other.getWriteLockedByThreadId()))
            && (this.getReadLockedByCount() == null ? other.getReadLockedByCount() == null : this.getReadLockedByCount().equals(other.getReadLockedByCount()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectInstanceBegin() == null) ? 0 : getObjectInstanceBegin().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getWriteLockedByThreadId() == null) ? 0 : getWriteLockedByThreadId().hashCode());
        result = prime * result + ((getReadLockedByCount() == null) ? 0 : getReadLockedByCount().hashCode());
        return result;
    }
}