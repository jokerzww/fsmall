package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class TableHandles implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_TYPE")
    private String objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_SCHEMA")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_NAME")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OWNER_THREAD_ID")
    private Long ownerThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OWNER_EVENT_ID")
    private Long ownerEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.INTERNAL_LOCK")
    private String internalLock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.EXTERNAL_LOCK")
    private String externalLock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: table_handles")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_INSTANCE_BEGIN")
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_INSTANCE_BEGIN")
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_TYPE")
    public String getObjectType() {
        return objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_TYPE")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_SCHEMA")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_SCHEMA")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_NAME")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OBJECT_NAME")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OWNER_THREAD_ID")
    public Long getOwnerThreadId() {
        return ownerThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OWNER_THREAD_ID")
    public void setOwnerThreadId(Long ownerThreadId) {
        this.ownerThreadId = ownerThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OWNER_EVENT_ID")
    public Long getOwnerEventId() {
        return ownerEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.OWNER_EVENT_ID")
    public void setOwnerEventId(Long ownerEventId) {
        this.ownerEventId = ownerEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.INTERNAL_LOCK")
    public String getInternalLock() {
        return internalLock;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.INTERNAL_LOCK")
    public void setInternalLock(String internalLock) {
        this.internalLock = internalLock;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.EXTERNAL_LOCK")
    public String getExternalLock() {
        return externalLock;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source field: table_handles.EXTERNAL_LOCK")
    public void setExternalLock(String externalLock) {
        this.externalLock = externalLock;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: table_handles")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", objectType=").append(objectType);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", ownerThreadId=").append(ownerThreadId);
        sb.append(", ownerEventId=").append(ownerEventId);
        sb.append(", internalLock=").append(internalLock);
        sb.append(", externalLock=").append(externalLock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: table_handles")
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
        TableHandles other = (TableHandles) that;
        return (this.getObjectInstanceBegin() == null ? other.getObjectInstanceBegin() == null : this.getObjectInstanceBegin().equals(other.getObjectInstanceBegin()))
            && (this.getObjectType() == null ? other.getObjectType() == null : this.getObjectType().equals(other.getObjectType()))
            && (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getOwnerThreadId() == null ? other.getOwnerThreadId() == null : this.getOwnerThreadId().equals(other.getOwnerThreadId()))
            && (this.getOwnerEventId() == null ? other.getOwnerEventId() == null : this.getOwnerEventId().equals(other.getOwnerEventId()))
            && (this.getInternalLock() == null ? other.getInternalLock() == null : this.getInternalLock().equals(other.getInternalLock()))
            && (this.getExternalLock() == null ? other.getExternalLock() == null : this.getExternalLock().equals(other.getExternalLock()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: table_handles")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectInstanceBegin() == null) ? 0 : getObjectInstanceBegin().hashCode());
        result = prime * result + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getOwnerThreadId() == null) ? 0 : getOwnerThreadId().hashCode());
        result = prime * result + ((getOwnerEventId() == null) ? 0 : getOwnerEventId().hashCode());
        result = prime * result + ((getInternalLock() == null) ? 0 : getInternalLock().hashCode());
        result = prime * result + ((getExternalLock() == null) ? 0 : getExternalLock().hashCode());
        return result;
    }
}