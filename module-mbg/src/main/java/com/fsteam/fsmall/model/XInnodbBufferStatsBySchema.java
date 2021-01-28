package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XInnodbBufferStatsBySchema implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.allocated")
    private BigDecimal allocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.data")
    private BigDecimal data;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages")
    private Long pages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages_hashed")
    private Long pagesHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages_old")
    private Long pagesOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.rows_cached")
    private BigDecimal rowsCached;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.object_schema")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source Table: x$innodb_buffer_stats_by_schema")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.allocated")
    public BigDecimal getAllocated() {
        return allocated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.allocated")
    public void setAllocated(BigDecimal allocated) {
        this.allocated = allocated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.data")
    public BigDecimal getData() {
        return data;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.data")
    public void setData(BigDecimal data) {
        this.data = data;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages")
    public Long getPages() {
        return pages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages")
    public void setPages(Long pages) {
        this.pages = pages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages_hashed")
    public Long getPagesHashed() {
        return pagesHashed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages_hashed")
    public void setPagesHashed(Long pagesHashed) {
        this.pagesHashed = pagesHashed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages_old")
    public Long getPagesOld() {
        return pagesOld;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages_old")
    public void setPagesOld(Long pagesOld) {
        this.pagesOld = pagesOld;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.rows_cached")
    public BigDecimal getRowsCached() {
        return rowsCached;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.rows_cached")
    public void setRowsCached(BigDecimal rowsCached) {
        this.rowsCached = rowsCached;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.object_schema")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.object_schema")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source Table: x$innodb_buffer_stats_by_schema")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", allocated=").append(allocated);
        sb.append(", data=").append(data);
        sb.append(", pages=").append(pages);
        sb.append(", pagesHashed=").append(pagesHashed);
        sb.append(", pagesOld=").append(pagesOld);
        sb.append(", rowsCached=").append(rowsCached);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source Table: x$innodb_buffer_stats_by_schema")
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
        XInnodbBufferStatsBySchema other = (XInnodbBufferStatsBySchema) that;
        return (this.getAllocated() == null ? other.getAllocated() == null : this.getAllocated().equals(other.getAllocated()))
            && (this.getData() == null ? other.getData() == null : this.getData().equals(other.getData()))
            && (this.getPages() == null ? other.getPages() == null : this.getPages().equals(other.getPages()))
            && (this.getPagesHashed() == null ? other.getPagesHashed() == null : this.getPagesHashed().equals(other.getPagesHashed()))
            && (this.getPagesOld() == null ? other.getPagesOld() == null : this.getPagesOld().equals(other.getPagesOld()))
            && (this.getRowsCached() == null ? other.getRowsCached() == null : this.getRowsCached().equals(other.getRowsCached()))
            && (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4711455+08:00", comments="Source Table: x$innodb_buffer_stats_by_schema")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAllocated() == null) ? 0 : getAllocated().hashCode());
        result = prime * result + ((getData() == null) ? 0 : getData().hashCode());
        result = prime * result + ((getPages() == null) ? 0 : getPages().hashCode());
        result = prime * result + ((getPagesHashed() == null) ? 0 : getPagesHashed().hashCode());
        result = prime * result + ((getPagesOld() == null) ? 0 : getPagesOld().hashCode());
        result = prime * result + ((getRowsCached() == null) ? 0 : getRowsCached().hashCode());
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        return result;
    }
}