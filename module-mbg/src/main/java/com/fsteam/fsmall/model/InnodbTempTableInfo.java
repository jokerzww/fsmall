package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbTempTableInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.TABLE_ID")
    private Long tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.N_COLS")
    private Integer nCols;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.SPACE")
    private Integer space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.TABLE_ID")
    public Long getTableId() {
        return tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.TABLE_ID")
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.N_COLS")
    public Integer getnCols() {
        return nCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.N_COLS")
    public void setnCols(Integer nCols) {
        this.nCols = nCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.SPACE")
    public Integer getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source field: INNODB_TEMP_TABLE_INFO.SPACE")
    public void setSpace(Integer space) {
        this.space = space;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableId=").append(tableId);
        sb.append(", name=").append(name);
        sb.append(", nCols=").append(nCols);
        sb.append(", space=").append(space);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
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
        InnodbTempTableInfo other = (InnodbTempTableInfo) that;
        return (this.getTableId() == null ? other.getTableId() == null : this.getTableId().equals(other.getTableId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getnCols() == null ? other.getnCols() == null : this.getnCols().equals(other.getnCols()))
            && (this.getSpace() == null ? other.getSpace() == null : this.getSpace().equals(other.getSpace()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3350201+08:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableId() == null) ? 0 : getTableId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getnCols() == null) ? 0 : getnCols().hashCode());
        result = prime * result + ((getSpace() == null) ? 0 : getSpace().hashCode());
        return result;
    }
}