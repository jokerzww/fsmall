package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.Generated;

public class InnodbFields implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: INNODB_FIELDS.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: INNODB_FIELDS.POS")
    private Long pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: INNODB_FIELDS.INDEX_ID")
    private byte[] indexId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source Table: INNODB_FIELDS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: INNODB_FIELDS.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: INNODB_FIELDS.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: INNODB_FIELDS.POS")
    public Long getPos() {
        return pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: INNODB_FIELDS.POS")
    public void setPos(Long pos) {
        this.pos = pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: INNODB_FIELDS.INDEX_ID")
    public byte[] getIndexId() {
        return indexId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source field: INNODB_FIELDS.INDEX_ID")
    public void setIndexId(byte[] indexId) {
        this.indexId = indexId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source Table: INNODB_FIELDS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", pos=").append(pos);
        sb.append(", indexId=").append(indexId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source Table: INNODB_FIELDS")
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
        InnodbFields other = (InnodbFields) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (Arrays.equals(this.getIndexId(), other.getIndexId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1798798+08:00", comments="Source Table: INNODB_FIELDS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + (Arrays.hashCode(getIndexId()));
        return result;
    }
}