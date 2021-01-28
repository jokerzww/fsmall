package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class CondInstances implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: cond_instances.OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: cond_instances.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: cond_instances.OBJECT_INSTANCE_BEGIN")
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: cond_instances.OBJECT_INSTANCE_BEGIN")
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: cond_instances.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: cond_instances.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
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
        CondInstances other = (CondInstances) that;
        return (this.getObjectInstanceBegin() == null ? other.getObjectInstanceBegin() == null : this.getObjectInstanceBegin().equals(other.getObjectInstanceBegin()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectInstanceBegin() == null) ? 0 : getObjectInstanceBegin().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}