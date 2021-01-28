package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Plugin implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: plugin.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: plugin.dl")
    private String dl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: plugin")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: plugin.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: plugin.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: plugin.dl")
    public String getDl() {
        return dl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source field: plugin.dl")
    public void setDl(String dl) {
        this.dl = dl;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: plugin")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", dl=").append(dl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: plugin")
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
        Plugin other = (Plugin) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDl() == null ? other.getDl() == null : this.getDl().equals(other.getDl()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: plugin")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDl() == null) ? 0 : getDl().hashCode());
        return result;
    }
}