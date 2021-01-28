package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbForeignCols implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.ID")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.FOR_COL_NAME")
    private String forColName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.REF_COL_NAME")
    private String refColName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.POS")
    private Integer pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.ID")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.ID")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.FOR_COL_NAME")
    public String getForColName() {
        return forColName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.FOR_COL_NAME")
    public void setForColName(String forColName) {
        this.forColName = forColName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.REF_COL_NAME")
    public String getRefColName() {
        return refColName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.REF_COL_NAME")
    public void setRefColName(String refColName) {
        this.refColName = refColName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.POS")
    public Integer getPos() {
        return pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: INNODB_FOREIGN_COLS.POS")
    public void setPos(Integer pos) {
        this.pos = pos;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", forColName=").append(forColName);
        sb.append(", refColName=").append(refColName);
        sb.append(", pos=").append(pos);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
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
        InnodbForeignCols other = (InnodbForeignCols) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getForColName() == null ? other.getForColName() == null : this.getForColName().equals(other.getForColName()))
            && (this.getRefColName() == null ? other.getRefColName() == null : this.getRefColName().equals(other.getRefColName()))
            && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: INNODB_FOREIGN_COLS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getForColName() == null) ? 0 : getForColName().hashCode());
        result = prime * result + ((getRefColName() == null) ? 0 : getRefColName().hashCode());
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        return result;
    }
}