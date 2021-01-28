package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class ProcsPriv implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Host")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.User")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Routine_name")
    private String routineName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Routine_type")
    private String routineType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Grantor")
    private String grantor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Proc_priv")
    private String procPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Timestamp")
    private Date timestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: procs_priv")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Host")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Host")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.User")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.User")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Routine_name")
    public String getRoutineName() {
        return routineName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Routine_name")
    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Routine_type")
    public String getRoutineType() {
        return routineType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Routine_type")
    public void setRoutineType(String routineType) {
        this.routineType = routineType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Grantor")
    public String getGrantor() {
        return grantor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Grantor")
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Proc_priv")
    public String getProcPriv() {
        return procPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Proc_priv")
    public void setProcPriv(String procPriv) {
        this.procPriv = procPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: procs_priv")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", db=").append(db);
        sb.append(", user=").append(user);
        sb.append(", routineName=").append(routineName);
        sb.append(", routineType=").append(routineType);
        sb.append(", grantor=").append(grantor);
        sb.append(", procPriv=").append(procPriv);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: procs_priv")
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
        ProcsPriv other = (ProcsPriv) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getRoutineName() == null ? other.getRoutineName() == null : this.getRoutineName().equals(other.getRoutineName()))
            && (this.getRoutineType() == null ? other.getRoutineType() == null : this.getRoutineType().equals(other.getRoutineType()))
            && (this.getGrantor() == null ? other.getGrantor() == null : this.getGrantor().equals(other.getGrantor()))
            && (this.getProcPriv() == null ? other.getProcPriv() == null : this.getProcPriv().equals(other.getProcPriv()))
            && (this.getTimestamp() == null ? other.getTimestamp() == null : this.getTimestamp().equals(other.getTimestamp()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: procs_priv")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getRoutineName() == null) ? 0 : getRoutineName().hashCode());
        result = prime * result + ((getRoutineType() == null) ? 0 : getRoutineType().hashCode());
        result = prime * result + ((getGrantor() == null) ? 0 : getGrantor().hashCode());
        result = prime * result + ((getProcPriv() == null) ? 0 : getProcPriv().hashCode());
        result = prime * result + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return result;
    }
}