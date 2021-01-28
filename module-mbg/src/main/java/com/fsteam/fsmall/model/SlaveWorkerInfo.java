package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SlaveWorkerInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Channel_name")
    private String channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Relay_log_pos")
    private Long relayLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Master_log_pos")
    private Long masterLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_relay_log_pos")
    private Long checkpointRelayLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_master_log_pos")
    private Long checkpointMasterLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_seqno")
    private Integer checkpointSeqno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_group_size")
    private Integer checkpointGroupSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Relay_log_name")
    private String relayLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Master_log_name")
    private String masterLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_relay_log_name")
    private String checkpointRelayLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_master_log_name")
    private String checkpointMasterLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_group_bitmap")
    private byte[] checkpointGroupBitmap;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source Table: slave_worker_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Channel_name")
    public String getChannelName() {
        return channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Channel_name")
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Relay_log_pos")
    public Long getRelayLogPos() {
        return relayLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Relay_log_pos")
    public void setRelayLogPos(Long relayLogPos) {
        this.relayLogPos = relayLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Master_log_pos")
    public Long getMasterLogPos() {
        return masterLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Master_log_pos")
    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_relay_log_pos")
    public Long getCheckpointRelayLogPos() {
        return checkpointRelayLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_relay_log_pos")
    public void setCheckpointRelayLogPos(Long checkpointRelayLogPos) {
        this.checkpointRelayLogPos = checkpointRelayLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_master_log_pos")
    public Long getCheckpointMasterLogPos() {
        return checkpointMasterLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_master_log_pos")
    public void setCheckpointMasterLogPos(Long checkpointMasterLogPos) {
        this.checkpointMasterLogPos = checkpointMasterLogPos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_seqno")
    public Integer getCheckpointSeqno() {
        return checkpointSeqno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_seqno")
    public void setCheckpointSeqno(Integer checkpointSeqno) {
        this.checkpointSeqno = checkpointSeqno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_group_size")
    public Integer getCheckpointGroupSize() {
        return checkpointGroupSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_group_size")
    public void setCheckpointGroupSize(Integer checkpointGroupSize) {
        this.checkpointGroupSize = checkpointGroupSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Relay_log_name")
    public String getRelayLogName() {
        return relayLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Relay_log_name")
    public void setRelayLogName(String relayLogName) {
        this.relayLogName = relayLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Master_log_name")
    public String getMasterLogName() {
        return masterLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Master_log_name")
    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_relay_log_name")
    public String getCheckpointRelayLogName() {
        return checkpointRelayLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_relay_log_name")
    public void setCheckpointRelayLogName(String checkpointRelayLogName) {
        this.checkpointRelayLogName = checkpointRelayLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_master_log_name")
    public String getCheckpointMasterLogName() {
        return checkpointMasterLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_master_log_name")
    public void setCheckpointMasterLogName(String checkpointMasterLogName) {
        this.checkpointMasterLogName = checkpointMasterLogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_group_bitmap")
    public byte[] getCheckpointGroupBitmap() {
        return checkpointGroupBitmap;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_group_bitmap")
    public void setCheckpointGroupBitmap(byte[] checkpointGroupBitmap) {
        this.checkpointGroupBitmap = checkpointGroupBitmap;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source Table: slave_worker_info")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", id=").append(id);
        sb.append(", relayLogPos=").append(relayLogPos);
        sb.append(", masterLogPos=").append(masterLogPos);
        sb.append(", checkpointRelayLogPos=").append(checkpointRelayLogPos);
        sb.append(", checkpointMasterLogPos=").append(checkpointMasterLogPos);
        sb.append(", checkpointSeqno=").append(checkpointSeqno);
        sb.append(", checkpointGroupSize=").append(checkpointGroupSize);
        sb.append(", relayLogName=").append(relayLogName);
        sb.append(", masterLogName=").append(masterLogName);
        sb.append(", checkpointRelayLogName=").append(checkpointRelayLogName);
        sb.append(", checkpointMasterLogName=").append(checkpointMasterLogName);
        sb.append(", checkpointGroupBitmap=").append(checkpointGroupBitmap);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source Table: slave_worker_info")
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
        SlaveWorkerInfo other = (SlaveWorkerInfo) that;
        return (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRelayLogPos() == null ? other.getRelayLogPos() == null : this.getRelayLogPos().equals(other.getRelayLogPos()))
            && (this.getMasterLogPos() == null ? other.getMasterLogPos() == null : this.getMasterLogPos().equals(other.getMasterLogPos()))
            && (this.getCheckpointRelayLogPos() == null ? other.getCheckpointRelayLogPos() == null : this.getCheckpointRelayLogPos().equals(other.getCheckpointRelayLogPos()))
            && (this.getCheckpointMasterLogPos() == null ? other.getCheckpointMasterLogPos() == null : this.getCheckpointMasterLogPos().equals(other.getCheckpointMasterLogPos()))
            && (this.getCheckpointSeqno() == null ? other.getCheckpointSeqno() == null : this.getCheckpointSeqno().equals(other.getCheckpointSeqno()))
            && (this.getCheckpointGroupSize() == null ? other.getCheckpointGroupSize() == null : this.getCheckpointGroupSize().equals(other.getCheckpointGroupSize()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source Table: slave_worker_info")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRelayLogPos() == null) ? 0 : getRelayLogPos().hashCode());
        result = prime * result + ((getMasterLogPos() == null) ? 0 : getMasterLogPos().hashCode());
        result = prime * result + ((getCheckpointRelayLogPos() == null) ? 0 : getCheckpointRelayLogPos().hashCode());
        result = prime * result + ((getCheckpointMasterLogPos() == null) ? 0 : getCheckpointMasterLogPos().hashCode());
        result = prime * result + ((getCheckpointSeqno() == null) ? 0 : getCheckpointSeqno().hashCode());
        result = prime * result + ((getCheckpointGroupSize() == null) ? 0 : getCheckpointGroupSize().hashCode());
        return result;
    }
}