package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ReplicationApplierConfiguration implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.CHANNEL_NAME")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.DESIRED_DELAY")
    private Integer desiredDelay;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.REQUIRE_ROW_FORMAT")
    private String requireRowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.REQUIRE_TABLE_PRIMARY_KEY_CHECK")
    private String requireTablePrimaryKeyCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.PRIVILEGE_CHECKS_USER")
    private String privilegeChecksUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source Table: replication_applier_configuration")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.CHANNEL_NAME")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.CHANNEL_NAME")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.DESIRED_DELAY")
    public Integer getDesiredDelay() {
        return desiredDelay;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.DESIRED_DELAY")
    public void setDesiredDelay(Integer desiredDelay) {
        this.desiredDelay = desiredDelay;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.REQUIRE_ROW_FORMAT")
    public String getRequireRowFormat() {
        return requireRowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.REQUIRE_ROW_FORMAT")
    public void setRequireRowFormat(String requireRowFormat) {
        this.requireRowFormat = requireRowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.REQUIRE_TABLE_PRIMARY_KEY_CHECK")
    public String getRequireTablePrimaryKeyCheck() {
        return requireTablePrimaryKeyCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.REQUIRE_TABLE_PRIMARY_KEY_CHECK")
    public void setRequireTablePrimaryKeyCheck(String requireTablePrimaryKeyCheck) {
        this.requireTablePrimaryKeyCheck = requireTablePrimaryKeyCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.PRIVILEGE_CHECKS_USER")
    public String getPrivilegeChecksUser() {
        return privilegeChecksUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.PRIVILEGE_CHECKS_USER")
    public void setPrivilegeChecksUser(String privilegeChecksUser) {
        this.privilegeChecksUser = privilegeChecksUser;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source Table: replication_applier_configuration")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", desiredDelay=").append(desiredDelay);
        sb.append(", requireRowFormat=").append(requireRowFormat);
        sb.append(", requireTablePrimaryKeyCheck=").append(requireTablePrimaryKeyCheck);
        sb.append(", privilegeChecksUser=").append(privilegeChecksUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source Table: replication_applier_configuration")
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
        ReplicationApplierConfiguration other = (ReplicationApplierConfiguration) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getDesiredDelay() == null ? other.getDesiredDelay() == null : this.getDesiredDelay().equals(other.getDesiredDelay()))
            && (this.getRequireRowFormat() == null ? other.getRequireRowFormat() == null : this.getRequireRowFormat().equals(other.getRequireRowFormat()))
            && (this.getRequireTablePrimaryKeyCheck() == null ? other.getRequireTablePrimaryKeyCheck() == null : this.getRequireTablePrimaryKeyCheck().equals(other.getRequireTablePrimaryKeyCheck()))
            && (this.getPrivilegeChecksUser() == null ? other.getPrivilegeChecksUser() == null : this.getPrivilegeChecksUser().equals(other.getPrivilegeChecksUser()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source Table: replication_applier_configuration")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getDesiredDelay() == null) ? 0 : getDesiredDelay().hashCode());
        result = prime * result + ((getRequireRowFormat() == null) ? 0 : getRequireRowFormat().hashCode());
        result = prime * result + ((getRequireTablePrimaryKeyCheck() == null) ? 0 : getRequireTablePrimaryKeyCheck().hashCode());
        result = prime * result + ((getPrivilegeChecksUser() == null) ? 0 : getPrivilegeChecksUser().hashCode());
        return result;
    }
}