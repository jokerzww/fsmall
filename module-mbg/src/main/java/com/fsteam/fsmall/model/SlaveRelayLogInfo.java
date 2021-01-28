package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SlaveRelayLogInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Channel_name")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Number_of_lines")
    private Integer numberOfLines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Relay_log_pos")
    private Long relayLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Master_log_pos")
    private Long masterLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Sql_delay")
    private Integer sqlDelay;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Number_of_workers")
    private Integer numberOfWorkers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Privilege_checks_username")
    private String privilegeChecksUsername;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Privilege_checks_hostname")
    private String privilegeChecksHostname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Require_row_format")
    private Boolean requireRowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Require_table_primary_key_check")
    private String requireTablePrimaryKeyCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Relay_log_name")
    private String relayLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Master_log_name")
    private String masterLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source Table: slave_relay_log_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Channel_name")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Channel_name")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Number_of_lines")
    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Number_of_lines")
    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Relay_log_pos")
    public Long getRelayLogPos() {
        return relayLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Relay_log_pos")
    public void setRelayLogPos(Long relayLogPos) {
        this.relayLogPos = relayLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Master_log_pos")
    public Long getMasterLogPos() {
        return masterLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Master_log_pos")
    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Sql_delay")
    public Integer getSqlDelay() {
        return sqlDelay;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4010799+08:00", comments="Source field: slave_relay_log_info.Sql_delay")
    public void setSqlDelay(Integer sqlDelay) {
        this.sqlDelay = sqlDelay;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Number_of_workers")
    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Number_of_workers")
    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Privilege_checks_username")
    public String getPrivilegeChecksUsername() {
        return privilegeChecksUsername;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Privilege_checks_username")
    public void setPrivilegeChecksUsername(String privilegeChecksUsername) {
        this.privilegeChecksUsername = privilegeChecksUsername;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Privilege_checks_hostname")
    public String getPrivilegeChecksHostname() {
        return privilegeChecksHostname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Privilege_checks_hostname")
    public void setPrivilegeChecksHostname(String privilegeChecksHostname) {
        this.privilegeChecksHostname = privilegeChecksHostname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Require_row_format")
    public Boolean getRequireRowFormat() {
        return requireRowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Require_row_format")
    public void setRequireRowFormat(Boolean requireRowFormat) {
        this.requireRowFormat = requireRowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Require_table_primary_key_check")
    public String getRequireTablePrimaryKeyCheck() {
        return requireTablePrimaryKeyCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Require_table_primary_key_check")
    public void setRequireTablePrimaryKeyCheck(String requireTablePrimaryKeyCheck) {
        this.requireTablePrimaryKeyCheck = requireTablePrimaryKeyCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Relay_log_name")
    public String getRelayLogName() {
        return relayLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Relay_log_name")
    public void setRelayLogName(String relayLogName) {
        this.relayLogName = relayLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Master_log_name")
    public String getMasterLogName() {
        return masterLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Master_log_name")
    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source Table: slave_relay_log_info")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", numberOfLines=").append(numberOfLines);
        sb.append(", relayLogPos=").append(relayLogPos);
        sb.append(", masterLogPos=").append(masterLogPos);
        sb.append(", sqlDelay=").append(sqlDelay);
        sb.append(", numberOfWorkers=").append(numberOfWorkers);
        sb.append(", id=").append(id);
        sb.append(", privilegeChecksUsername=").append(privilegeChecksUsername);
        sb.append(", privilegeChecksHostname=").append(privilegeChecksHostname);
        sb.append(", requireRowFormat=").append(requireRowFormat);
        sb.append(", requireTablePrimaryKeyCheck=").append(requireTablePrimaryKeyCheck);
        sb.append(", relayLogName=").append(relayLogName);
        sb.append(", masterLogName=").append(masterLogName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source Table: slave_relay_log_info")
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
        SlaveRelayLogInfo other = (SlaveRelayLogInfo) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getNumberOfLines() == null ? other.getNumberOfLines() == null : this.getNumberOfLines().equals(other.getNumberOfLines()))
            && (this.getRelayLogPos() == null ? other.getRelayLogPos() == null : this.getRelayLogPos().equals(other.getRelayLogPos()))
            && (this.getMasterLogPos() == null ? other.getMasterLogPos() == null : this.getMasterLogPos().equals(other.getMasterLogPos()))
            && (this.getSqlDelay() == null ? other.getSqlDelay() == null : this.getSqlDelay().equals(other.getSqlDelay()))
            && (this.getNumberOfWorkers() == null ? other.getNumberOfWorkers() == null : this.getNumberOfWorkers().equals(other.getNumberOfWorkers()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPrivilegeChecksUsername() == null ? other.getPrivilegeChecksUsername() == null : this.getPrivilegeChecksUsername().equals(other.getPrivilegeChecksUsername()))
            && (this.getPrivilegeChecksHostname() == null ? other.getPrivilegeChecksHostname() == null : this.getPrivilegeChecksHostname().equals(other.getPrivilegeChecksHostname()))
            && (this.getRequireRowFormat() == null ? other.getRequireRowFormat() == null : this.getRequireRowFormat().equals(other.getRequireRowFormat()))
            && (this.getRequireTablePrimaryKeyCheck() == null ? other.getRequireTablePrimaryKeyCheck() == null : this.getRequireTablePrimaryKeyCheck().equals(other.getRequireTablePrimaryKeyCheck()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source Table: slave_relay_log_info")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getNumberOfLines() == null) ? 0 : getNumberOfLines().hashCode());
        result = prime * result + ((getRelayLogPos() == null) ? 0 : getRelayLogPos().hashCode());
        result = prime * result + ((getMasterLogPos() == null) ? 0 : getMasterLogPos().hashCode());
        result = prime * result + ((getSqlDelay() == null) ? 0 : getSqlDelay().hashCode());
        result = prime * result + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPrivilegeChecksUsername() == null) ? 0 : getPrivilegeChecksUsername().hashCode());
        result = prime * result + ((getPrivilegeChecksHostname() == null) ? 0 : getPrivilegeChecksHostname().hashCode());
        result = prime * result + ((getRequireRowFormat() == null) ? 0 : getRequireRowFormat().hashCode());
        result = prime * result + ((getRequireTablePrimaryKeyCheck() == null) ? 0 : getRequireTablePrimaryKeyCheck().hashCode());
        return result;
    }
}