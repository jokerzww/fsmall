package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbTables implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source field: INNODB_TABLES.TABLE_ID")
    private Long tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source field: INNODB_TABLES.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source field: INNODB_TABLES.FLAG")
    private Integer flag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.N_COLS")
    private Integer nCols;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.SPACE")
    private Long space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.ROW_FORMAT")
    private String rowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.ZIP_PAGE_SIZE")
    private Integer zipPageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.SPACE_TYPE")
    private String spaceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.INSTANT_COLS")
    private Integer instantCols;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source Table: INNODB_TABLES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source field: INNODB_TABLES.TABLE_ID")
    public Long getTableId() {
        return tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source field: INNODB_TABLES.TABLE_ID")
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source field: INNODB_TABLES.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source field: INNODB_TABLES.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.FLAG")
    public Integer getFlag() {
        return flag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.FLAG")
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.N_COLS")
    public Integer getnCols() {
        return nCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.N_COLS")
    public void setnCols(Integer nCols) {
        this.nCols = nCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.SPACE")
    public Long getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.SPACE")
    public void setSpace(Long space) {
        this.space = space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.ROW_FORMAT")
    public String getRowFormat() {
        return rowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.ROW_FORMAT")
    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.ZIP_PAGE_SIZE")
    public Integer getZipPageSize() {
        return zipPageSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.ZIP_PAGE_SIZE")
    public void setZipPageSize(Integer zipPageSize) {
        this.zipPageSize = zipPageSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.SPACE_TYPE")
    public String getSpaceType() {
        return spaceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.SPACE_TYPE")
    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.INSTANT_COLS")
    public Integer getInstantCols() {
        return instantCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source field: INNODB_TABLES.INSTANT_COLS")
    public void setInstantCols(Integer instantCols) {
        this.instantCols = instantCols;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source Table: INNODB_TABLES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableId=").append(tableId);
        sb.append(", name=").append(name);
        sb.append(", flag=").append(flag);
        sb.append(", nCols=").append(nCols);
        sb.append(", space=").append(space);
        sb.append(", rowFormat=").append(rowFormat);
        sb.append(", zipPageSize=").append(zipPageSize);
        sb.append(", spaceType=").append(spaceType);
        sb.append(", instantCols=").append(instantCols);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source Table: INNODB_TABLES")
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
        InnodbTables other = (InnodbTables) that;
        return (this.getTableId() == null ? other.getTableId() == null : this.getTableId().equals(other.getTableId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getnCols() == null ? other.getnCols() == null : this.getnCols().equals(other.getnCols()))
            && (this.getSpace() == null ? other.getSpace() == null : this.getSpace().equals(other.getSpace()))
            && (this.getRowFormat() == null ? other.getRowFormat() == null : this.getRowFormat().equals(other.getRowFormat()))
            && (this.getZipPageSize() == null ? other.getZipPageSize() == null : this.getZipPageSize().equals(other.getZipPageSize()))
            && (this.getSpaceType() == null ? other.getSpaceType() == null : this.getSpaceType().equals(other.getSpaceType()))
            && (this.getInstantCols() == null ? other.getInstantCols() == null : this.getInstantCols().equals(other.getInstantCols()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4491243+08:00", comments="Source Table: INNODB_TABLES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableId() == null) ? 0 : getTableId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getnCols() == null) ? 0 : getnCols().hashCode());
        result = prime * result + ((getSpace() == null) ? 0 : getSpace().hashCode());
        result = prime * result + ((getRowFormat() == null) ? 0 : getRowFormat().hashCode());
        result = prime * result + ((getZipPageSize() == null) ? 0 : getZipPageSize().hashCode());
        result = prime * result + ((getSpaceType() == null) ? 0 : getSpaceType().hashCode());
        result = prime * result + ((getInstantCols() == null) ? 0 : getInstantCols().hashCode());
        return result;
    }
}