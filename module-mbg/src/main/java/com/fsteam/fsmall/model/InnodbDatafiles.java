package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.Generated;

public class InnodbDatafiles implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source field: INNODB_DATAFILES.PATH")
    private String path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source field: INNODB_DATAFILES.SPACE")
    private byte[] space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: INNODB_DATAFILES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source field: INNODB_DATAFILES.PATH")
    public String getPath() {
        return path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source field: INNODB_DATAFILES.PATH")
    public void setPath(String path) {
        this.path = path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source field: INNODB_DATAFILES.SPACE")
    public byte[] getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source field: INNODB_DATAFILES.SPACE")
    public void setSpace(byte[] space) {
        this.space = space;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: INNODB_DATAFILES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", path=").append(path);
        sb.append(", space=").append(space);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: INNODB_DATAFILES")
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
        InnodbDatafiles other = (InnodbDatafiles) that;
        return (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (Arrays.equals(this.getSpace(), other.getSpace()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: INNODB_DATAFILES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + (Arrays.hashCode(getSpace()));
        return result;
    }
}