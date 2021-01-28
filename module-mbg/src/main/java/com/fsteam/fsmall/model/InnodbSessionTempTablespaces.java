package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbSessionTempTablespaces implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.SPACE")
    private Integer space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.PATH")
    private String path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.SIZE")
    private Long size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.STATE")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.PURPOSE")
    private String purpose;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.SPACE")
    public Integer getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.SPACE")
    public void setSpace(Integer space) {
        this.space = space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.PATH")
    public String getPath() {
        return path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.PATH")
    public void setPath(String path) {
        this.path = path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.SIZE")
    public Long getSize() {
        return size;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.SIZE")
    public void setSize(Long size) {
        this.size = size;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.STATE")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.STATE")
    public void setState(String state) {
        this.state = state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.PURPOSE")
    public String getPurpose() {
        return purpose;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.PURPOSE")
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", space=").append(space);
        sb.append(", path=").append(path);
        sb.append(", size=").append(size);
        sb.append(", state=").append(state);
        sb.append(", purpose=").append(purpose);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
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
        InnodbSessionTempTablespaces other = (InnodbSessionTempTablespaces) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSpace() == null ? other.getSpace() == null : this.getSpace().equals(other.getSpace()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getPurpose() == null ? other.getPurpose() == null : this.getPurpose().equals(other.getPurpose()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3620449+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSpace() == null) ? 0 : getSpace().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getPurpose() == null) ? 0 : getPurpose().hashCode());
        return result;
    }
}