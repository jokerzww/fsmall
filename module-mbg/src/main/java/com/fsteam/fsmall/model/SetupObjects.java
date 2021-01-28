package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SetupObjects implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_TYPE")
    private String objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_SCHEMA")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_NAME")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.ENABLED")
    private String enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.TIMED")
    private String timed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_TYPE")
    public String getObjectType() {
        return objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_TYPE")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_SCHEMA")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_SCHEMA")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_NAME")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_NAME")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.ENABLED")
    public String getEnabled() {
        return enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.ENABLED")
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.TIMED")
    public String getTimed() {
        return timed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.TIMED")
    public void setTimed(String timed) {
        this.timed = timed;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectType=").append(objectType);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", enabled=").append(enabled);
        sb.append(", timed=").append(timed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
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
        SetupObjects other = (SetupObjects) that;
        return (this.getObjectType() == null ? other.getObjectType() == null : this.getObjectType().equals(other.getObjectType()))
            && (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getTimed() == null ? other.getTimed() == null : this.getTimed().equals(other.getTimed()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getTimed() == null) ? 0 : getTimed().hashCode());
        return result;
    }
}