package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ReplicationGroupMembers implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.CHANNEL_NAME")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_ID")
    private String memberId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_HOST")
    private String memberHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_PORT")
    private Integer memberPort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_STATE")
    private String memberState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_ROLE")
    private String memberRole;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_VERSION")
    private String memberVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.CHANNEL_NAME")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.CHANNEL_NAME")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_ID")
    public String getMemberId() {
        return memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_ID")
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_HOST")
    public String getMemberHost() {
        return memberHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_HOST")
    public void setMemberHost(String memberHost) {
        this.memberHost = memberHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_PORT")
    public Integer getMemberPort() {
        return memberPort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_PORT")
    public void setMemberPort(Integer memberPort) {
        this.memberPort = memberPort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_STATE")
    public String getMemberState() {
        return memberState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_STATE")
    public void setMemberState(String memberState) {
        this.memberState = memberState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_ROLE")
    public String getMemberRole() {
        return memberRole;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_ROLE")
    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_VERSION")
    public String getMemberVersion() {
        return memberVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_VERSION")
    public void setMemberVersion(String memberVersion) {
        this.memberVersion = memberVersion;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", memberId=").append(memberId);
        sb.append(", memberHost=").append(memberHost);
        sb.append(", memberPort=").append(memberPort);
        sb.append(", memberState=").append(memberState);
        sb.append(", memberRole=").append(memberRole);
        sb.append(", memberVersion=").append(memberVersion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
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
        ReplicationGroupMembers other = (ReplicationGroupMembers) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getMemberHost() == null ? other.getMemberHost() == null : this.getMemberHost().equals(other.getMemberHost()))
            && (this.getMemberPort() == null ? other.getMemberPort() == null : this.getMemberPort().equals(other.getMemberPort()))
            && (this.getMemberState() == null ? other.getMemberState() == null : this.getMemberState().equals(other.getMemberState()))
            && (this.getMemberRole() == null ? other.getMemberRole() == null : this.getMemberRole().equals(other.getMemberRole()))
            && (this.getMemberVersion() == null ? other.getMemberVersion() == null : this.getMemberVersion().equals(other.getMemberVersion()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getMemberHost() == null) ? 0 : getMemberHost().hashCode());
        result = prime * result + ((getMemberPort() == null) ? 0 : getMemberPort().hashCode());
        result = prime * result + ((getMemberState() == null) ? 0 : getMemberState().hashCode());
        result = prime * result + ((getMemberRole() == null) ? 0 : getMemberRole().hashCode());
        result = prime * result + ((getMemberVersion() == null) ? 0 : getMemberVersion().hashCode());
        return result;
    }
}