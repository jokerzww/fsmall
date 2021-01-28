package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbIndexes implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.INDEX_ID")
    private Long indexId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.TABLE_ID")
    private Long tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.TYPE")
    private Integer type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.N_FIELDS")
    private Integer nFields;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.PAGE_NO")
    private Integer pageNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.SPACE")
    private Integer space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.MERGE_THRESHOLD")
    private Integer mergeThreshold;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source Table: INNODB_INDEXES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.INDEX_ID")
    public Long getIndexId() {
        return indexId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.INDEX_ID")
    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.TABLE_ID")
    public Long getTableId() {
        return tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.TABLE_ID")
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.TYPE")
    public Integer getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.TYPE")
    public void setType(Integer type) {
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.N_FIELDS")
    public Integer getnFields() {
        return nFields;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.N_FIELDS")
    public void setnFields(Integer nFields) {
        this.nFields = nFields;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.PAGE_NO")
    public Integer getPageNo() {
        return pageNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.PAGE_NO")
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.SPACE")
    public Integer getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.SPACE")
    public void setSpace(Integer space) {
        this.space = space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.MERGE_THRESHOLD")
    public Integer getMergeThreshold() {
        return mergeThreshold;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source field: INNODB_INDEXES.MERGE_THRESHOLD")
    public void setMergeThreshold(Integer mergeThreshold) {
        this.mergeThreshold = mergeThreshold;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source Table: INNODB_INDEXES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", indexId=").append(indexId);
        sb.append(", name=").append(name);
        sb.append(", tableId=").append(tableId);
        sb.append(", type=").append(type);
        sb.append(", nFields=").append(nFields);
        sb.append(", pageNo=").append(pageNo);
        sb.append(", space=").append(space);
        sb.append(", mergeThreshold=").append(mergeThreshold);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source Table: INNODB_INDEXES")
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
        InnodbIndexes other = (InnodbIndexes) that;
        return (this.getIndexId() == null ? other.getIndexId() == null : this.getIndexId().equals(other.getIndexId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTableId() == null ? other.getTableId() == null : this.getTableId().equals(other.getTableId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getnFields() == null ? other.getnFields() == null : this.getnFields().equals(other.getnFields()))
            && (this.getPageNo() == null ? other.getPageNo() == null : this.getPageNo().equals(other.getPageNo()))
            && (this.getSpace() == null ? other.getSpace() == null : this.getSpace().equals(other.getSpace()))
            && (this.getMergeThreshold() == null ? other.getMergeThreshold() == null : this.getMergeThreshold().equals(other.getMergeThreshold()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4381157+08:00", comments="Source Table: INNODB_INDEXES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTableId() == null) ? 0 : getTableId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getnFields() == null) ? 0 : getnFields().hashCode());
        result = prime * result + ((getPageNo() == null) ? 0 : getPageNo().hashCode());
        result = prime * result + ((getSpace() == null) ? 0 : getSpace().hashCode());
        result = prime * result + ((getMergeThreshold() == null) ? 0 : getMergeThreshold().hashCode());
        return result;
    }
}