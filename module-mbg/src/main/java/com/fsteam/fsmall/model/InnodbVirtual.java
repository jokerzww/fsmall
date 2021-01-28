package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbVirtual implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: INNODB_VIRTUAL.TABLE_ID")
    private Long tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: INNODB_VIRTUAL.POS")
    private Integer pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: INNODB_VIRTUAL.BASE_POS")
    private Integer basePos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source Table: INNODB_VIRTUAL")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: INNODB_VIRTUAL.TABLE_ID")
    public Long getTableId() {
        return tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: INNODB_VIRTUAL.TABLE_ID")
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: INNODB_VIRTUAL.POS")
    public Integer getPos() {
        return pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: INNODB_VIRTUAL.POS")
    public void setPos(Integer pos) {
        this.pos = pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: INNODB_VIRTUAL.BASE_POS")
    public Integer getBasePos() {
        return basePos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source field: INNODB_VIRTUAL.BASE_POS")
    public void setBasePos(Integer basePos) {
        this.basePos = basePos;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source Table: INNODB_VIRTUAL")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableId=").append(tableId);
        sb.append(", pos=").append(pos);
        sb.append(", basePos=").append(basePos);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source Table: INNODB_VIRTUAL")
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
        InnodbVirtual other = (InnodbVirtual) that;
        return (this.getTableId() == null ? other.getTableId() == null : this.getTableId().equals(other.getTableId()))
            && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (this.getBasePos() == null ? other.getBasePos() == null : this.getBasePos().equals(other.getBasePos()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4401165+08:00", comments="Source Table: INNODB_VIRTUAL")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableId() == null) ? 0 : getTableId().hashCode());
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + ((getBasePos() == null) ? 0 : getBasePos().hashCode());
        return result;
    }
}