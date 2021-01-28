package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbTablespacesBrief implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.PATH")
    private String path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE_TYPE")
    private String spaceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE")
    private byte[] space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.FLAG")
    private byte[] flag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.PATH")
    public String getPath() {
        return path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.PATH")
    public void setPath(String path) {
        this.path = path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE_TYPE")
    public String getSpaceType() {
        return spaceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE_TYPE")
    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE")
    public byte[] getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE")
    public void setSpace(byte[] space) {
        this.space = space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.FLAG")
    public byte[] getFlag() {
        return flag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source field: INNODB_TABLESPACES_BRIEF.FLAG")
    public void setFlag(byte[] flag) {
        this.flag = flag;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", path=").append(path);
        sb.append(", spaceType=").append(spaceType);
        sb.append(", space=").append(space);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
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
        InnodbTablespacesBrief other = (InnodbTablespacesBrief) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getSpaceType() == null ? other.getSpaceType() == null : this.getSpaceType().equals(other.getSpaceType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0968026+08:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getSpaceType() == null) ? 0 : getSpaceType().hashCode());
        return result;
    }
}