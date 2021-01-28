package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbColumns implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.TABLE_ID")
    private Long tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.POS")
    private Long pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.MTYPE")
    private Integer mtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.PRTYPE")
    private Integer prtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.LEN")
    private Integer len;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.HAS_DEFAULT")
    private Integer hasDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.DEFAULT_VALUE")
    private String defaultValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source Table: INNODB_COLUMNS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.TABLE_ID")
    public Long getTableId() {
        return tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.TABLE_ID")
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.POS")
    public Long getPos() {
        return pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.POS")
    public void setPos(Long pos) {
        this.pos = pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.MTYPE")
    public Integer getMtype() {
        return mtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.MTYPE")
    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.PRTYPE")
    public Integer getPrtype() {
        return prtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.PRTYPE")
    public void setPrtype(Integer prtype) {
        this.prtype = prtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.LEN")
    public Integer getLen() {
        return len;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.LEN")
    public void setLen(Integer len) {
        this.len = len;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.HAS_DEFAULT")
    public Integer getHasDefault() {
        return hasDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.HAS_DEFAULT")
    public void setHasDefault(Integer hasDefault) {
        this.hasDefault = hasDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.DEFAULT_VALUE")
    public String getDefaultValue() {
        return defaultValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source field: INNODB_COLUMNS.DEFAULT_VALUE")
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source Table: INNODB_COLUMNS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableId=").append(tableId);
        sb.append(", name=").append(name);
        sb.append(", pos=").append(pos);
        sb.append(", mtype=").append(mtype);
        sb.append(", prtype=").append(prtype);
        sb.append(", len=").append(len);
        sb.append(", hasDefault=").append(hasDefault);
        sb.append(", defaultValue=").append(defaultValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source Table: INNODB_COLUMNS")
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
        InnodbColumns other = (InnodbColumns) that;
        return (this.getTableId() == null ? other.getTableId() == null : this.getTableId().equals(other.getTableId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (this.getMtype() == null ? other.getMtype() == null : this.getMtype().equals(other.getMtype()))
            && (this.getPrtype() == null ? other.getPrtype() == null : this.getPrtype().equals(other.getPrtype()))
            && (this.getLen() == null ? other.getLen() == null : this.getLen().equals(other.getLen()))
            && (this.getHasDefault() == null ? other.getHasDefault() == null : this.getHasDefault().equals(other.getHasDefault()))
            && (this.getDefaultValue() == null ? other.getDefaultValue() == null : this.getDefaultValue().equals(other.getDefaultValue()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2649556+08:00", comments="Source Table: INNODB_COLUMNS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableId() == null) ? 0 : getTableId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + ((getMtype() == null) ? 0 : getMtype().hashCode());
        result = prime * result + ((getPrtype() == null) ? 0 : getPrtype().hashCode());
        result = prime * result + ((getLen() == null) ? 0 : getLen().hashCode());
        result = prime * result + ((getHasDefault() == null) ? 0 : getHasDefault().hashCode());
        result = prime * result + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return result;
    }
}