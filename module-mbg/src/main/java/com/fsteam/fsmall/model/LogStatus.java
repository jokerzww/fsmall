package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class LogStatus implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1628632+08:00", comments="Source field: log_status.SERVER_UUID")
    private String serverUuid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.LOCAL")
    private String local;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.REPLICATION")
    private String replication;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.STORAGE_ENGINES")
    private String storageEngines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1628632+08:00", comments="Source field: log_status.SERVER_UUID")
    public String getServerUuid() {
        return serverUuid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1628632+08:00", comments="Source field: log_status.SERVER_UUID")
    public void setServerUuid(String serverUuid) {
        this.serverUuid = serverUuid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.LOCAL")
    public String getLocal() {
        return local;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.LOCAL")
    public void setLocal(String local) {
        this.local = local;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.REPLICATION")
    public String getReplication() {
        return replication;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.REPLICATION")
    public void setReplication(String replication) {
        this.replication = replication;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.STORAGE_ENGINES")
    public String getStorageEngines() {
        return storageEngines;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.STORAGE_ENGINES")
    public void setStorageEngines(String storageEngines) {
        this.storageEngines = storageEngines;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serverUuid=").append(serverUuid);
        sb.append(", local=").append(local);
        sb.append(", replication=").append(replication);
        sb.append(", storageEngines=").append(storageEngines);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
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
        LogStatus other = (LogStatus) that;
        return (this.getServerUuid() == null ? other.getServerUuid() == null : this.getServerUuid().equals(other.getServerUuid()))
            && (this.getLocal() == null ? other.getLocal() == null : this.getLocal().equals(other.getLocal()))
            && (this.getReplication() == null ? other.getReplication() == null : this.getReplication().equals(other.getReplication()))
            && (this.getStorageEngines() == null ? other.getStorageEngines() == null : this.getStorageEngines().equals(other.getStorageEngines()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServerUuid() == null) ? 0 : getServerUuid().hashCode());
        result = prime * result + ((getLocal() == null) ? 0 : getLocal().hashCode());
        result = prime * result + ((getReplication() == null) ? 0 : getReplication().hashCode());
        result = prime * result + ((getStorageEngines() == null) ? 0 : getStorageEngines().hashCode());
        return result;
    }
}