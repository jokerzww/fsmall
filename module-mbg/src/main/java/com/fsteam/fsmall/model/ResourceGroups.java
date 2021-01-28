package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.Generated;

public class ResourceGroups implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_NAME")
    private String resourceGroupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_TYPE")
    private String resourceGroupType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED")
    private Boolean resourceGroupEnabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.THREAD_PRIORITY")
    private Integer threadPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.VCPU_IDS")
    private byte[] vcpuIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: RESOURCE_GROUPS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_NAME")
    public String getResourceGroupName() {
        return resourceGroupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_NAME")
    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_TYPE")
    public String getResourceGroupType() {
        return resourceGroupType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_TYPE")
    public void setResourceGroupType(String resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED")
    public Boolean getResourceGroupEnabled() {
        return resourceGroupEnabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED")
    public void setResourceGroupEnabled(Boolean resourceGroupEnabled) {
        this.resourceGroupEnabled = resourceGroupEnabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.THREAD_PRIORITY")
    public Integer getThreadPriority() {
        return threadPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.THREAD_PRIORITY")
    public void setThreadPriority(Integer threadPriority) {
        this.threadPriority = threadPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.VCPU_IDS")
    public byte[] getVcpuIds() {
        return vcpuIds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source field: RESOURCE_GROUPS.VCPU_IDS")
    public void setVcpuIds(byte[] vcpuIds) {
        this.vcpuIds = vcpuIds;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: RESOURCE_GROUPS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceGroupName=").append(resourceGroupName);
        sb.append(", resourceGroupType=").append(resourceGroupType);
        sb.append(", resourceGroupEnabled=").append(resourceGroupEnabled);
        sb.append(", threadPriority=").append(threadPriority);
        sb.append(", vcpuIds=").append(vcpuIds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: RESOURCE_GROUPS")
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
        ResourceGroups other = (ResourceGroups) that;
        return (this.getResourceGroupName() == null ? other.getResourceGroupName() == null : this.getResourceGroupName().equals(other.getResourceGroupName()))
            && (this.getResourceGroupType() == null ? other.getResourceGroupType() == null : this.getResourceGroupType().equals(other.getResourceGroupType()))
            && (this.getResourceGroupEnabled() == null ? other.getResourceGroupEnabled() == null : this.getResourceGroupEnabled().equals(other.getResourceGroupEnabled()))
            && (this.getThreadPriority() == null ? other.getThreadPriority() == null : this.getThreadPriority().equals(other.getThreadPriority()))
            && (Arrays.equals(this.getVcpuIds(), other.getVcpuIds()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: RESOURCE_GROUPS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        result = prime * result + ((getResourceGroupType() == null) ? 0 : getResourceGroupType().hashCode());
        result = prime * result + ((getResourceGroupEnabled() == null) ? 0 : getResourceGroupEnabled().hashCode());
        result = prime * result + ((getThreadPriority() == null) ? 0 : getThreadPriority().hashCode());
        result = prime * result + (Arrays.hashCode(getVcpuIds()));
        return result;
    }
}