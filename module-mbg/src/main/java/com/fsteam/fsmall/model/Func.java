package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Func implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.ret")
    private Byte ret;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.dl")
    private String dl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.ret")
    public Byte getRet() {
        return ret;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.ret")
    public void setRet(Byte ret) {
        this.ret = ret;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.dl")
    public String getDl() {
        return dl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.dl")
    public void setDl(String dl) {
        this.dl = dl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", ret=").append(ret);
        sb.append(", dl=").append(dl);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
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
        Func other = (Func) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRet() == null ? other.getRet() == null : this.getRet().equals(other.getRet()))
            && (this.getDl() == null ? other.getDl() == null : this.getDl().equals(other.getDl()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRet() == null) ? 0 : getRet().hashCode());
        result = prime * result + ((getDl() == null) ? 0 : getDl().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}