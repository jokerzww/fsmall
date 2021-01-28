package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Component implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_id")
    private Integer componentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_group_id")
    private Integer componentGroupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_urn")
    private String componentUrn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: component")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_id")
    public Integer getComponentId() {
        return componentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_group_id")
    public Integer getComponentGroupId() {
        return componentGroupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_group_id")
    public void setComponentGroupId(Integer componentGroupId) {
        this.componentGroupId = componentGroupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_urn")
    public String getComponentUrn() {
        return componentUrn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source field: component.component_urn")
    public void setComponentUrn(String componentUrn) {
        this.componentUrn = componentUrn;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: component")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", componentId=").append(componentId);
        sb.append(", componentGroupId=").append(componentGroupId);
        sb.append(", componentUrn=").append(componentUrn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: component")
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
        Component other = (Component) that;
        return (this.getComponentId() == null ? other.getComponentId() == null : this.getComponentId().equals(other.getComponentId()))
            && (this.getComponentGroupId() == null ? other.getComponentGroupId() == null : this.getComponentGroupId().equals(other.getComponentGroupId()))
            && (this.getComponentUrn() == null ? other.getComponentUrn() == null : this.getComponentUrn().equals(other.getComponentUrn()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3760577+08:00", comments="Source Table: component")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        result = prime * result + ((getComponentGroupId() == null) ? 0 : getComponentGroupId().hashCode());
        result = prime * result + ((getComponentUrn() == null) ? 0 : getComponentUrn().hashCode());
        return result;
    }
}