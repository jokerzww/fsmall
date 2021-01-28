package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class MetadataLocks implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_TYPE")
    private String objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_SCHEMA")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_NAME")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.COLUMN_NAME")
    private String columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_TYPE")
    private String lockType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_DURATION")
    private String lockDuration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_STATUS")
    private String lockStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.SOURCE")
    private String source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OWNER_THREAD_ID")
    private Long ownerThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OWNER_EVENT_ID")
    private Long ownerEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source Table: metadata_locks")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_INSTANCE_BEGIN")
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_INSTANCE_BEGIN")
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_TYPE")
    public String getObjectType() {
        return objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_TYPE")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_SCHEMA")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_SCHEMA")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_NAME")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_NAME")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.COLUMN_NAME")
    public String getColumnName() {
        return columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.COLUMN_NAME")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_TYPE")
    public String getLockType() {
        return lockType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_TYPE")
    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_DURATION")
    public String getLockDuration() {
        return lockDuration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_DURATION")
    public void setLockDuration(String lockDuration) {
        this.lockDuration = lockDuration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_STATUS")
    public String getLockStatus() {
        return lockStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_STATUS")
    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.SOURCE")
    public String getSource() {
        return source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.SOURCE")
    public void setSource(String source) {
        this.source = source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OWNER_THREAD_ID")
    public Long getOwnerThreadId() {
        return ownerThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OWNER_THREAD_ID")
    public void setOwnerThreadId(Long ownerThreadId) {
        this.ownerThreadId = ownerThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OWNER_EVENT_ID")
    public Long getOwnerEventId() {
        return ownerEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OWNER_EVENT_ID")
    public void setOwnerEventId(Long ownerEventId) {
        this.ownerEventId = ownerEventId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source Table: metadata_locks")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", objectType=").append(objectType);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", columnName=").append(columnName);
        sb.append(", lockType=").append(lockType);
        sb.append(", lockDuration=").append(lockDuration);
        sb.append(", lockStatus=").append(lockStatus);
        sb.append(", source=").append(source);
        sb.append(", ownerThreadId=").append(ownerThreadId);
        sb.append(", ownerEventId=").append(ownerEventId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source Table: metadata_locks")
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
        MetadataLocks other = (MetadataLocks) that;
        return (this.getObjectInstanceBegin() == null ? other.getObjectInstanceBegin() == null : this.getObjectInstanceBegin().equals(other.getObjectInstanceBegin()))
            && (this.getObjectType() == null ? other.getObjectType() == null : this.getObjectType().equals(other.getObjectType()))
            && (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getColumnName() == null ? other.getColumnName() == null : this.getColumnName().equals(other.getColumnName()))
            && (this.getLockType() == null ? other.getLockType() == null : this.getLockType().equals(other.getLockType()))
            && (this.getLockDuration() == null ? other.getLockDuration() == null : this.getLockDuration().equals(other.getLockDuration()))
            && (this.getLockStatus() == null ? other.getLockStatus() == null : this.getLockStatus().equals(other.getLockStatus()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getOwnerThreadId() == null ? other.getOwnerThreadId() == null : this.getOwnerThreadId().equals(other.getOwnerThreadId()))
            && (this.getOwnerEventId() == null ? other.getOwnerEventId() == null : this.getOwnerEventId().equals(other.getOwnerEventId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source Table: metadata_locks")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectInstanceBegin() == null) ? 0 : getObjectInstanceBegin().hashCode());
        result = prime * result + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        result = prime * result + ((getLockType() == null) ? 0 : getLockType().hashCode());
        result = prime * result + ((getLockDuration() == null) ? 0 : getLockDuration().hashCode());
        result = prime * result + ((getLockStatus() == null) ? 0 : getLockStatus().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getOwnerThreadId() == null) ? 0 : getOwnerThreadId().hashCode());
        result = prime * result + ((getOwnerEventId() == null) ? 0 : getOwnerEventId().hashCode());
        return result;
    }
}