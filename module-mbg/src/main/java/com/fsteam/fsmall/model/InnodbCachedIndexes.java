package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbCachedIndexes implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source field: INNODB_CACHED_INDEXES.SPACE_ID")
    private Integer spaceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source field: INNODB_CACHED_INDEXES.INDEX_ID")
    private Long indexId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source field: INNODB_CACHED_INDEXES.N_CACHED_PAGES")
    private Long nCachedPages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: INNODB_CACHED_INDEXES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source field: INNODB_CACHED_INDEXES.SPACE_ID")
    public Integer getSpaceId() {
        return spaceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source field: INNODB_CACHED_INDEXES.SPACE_ID")
    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source field: INNODB_CACHED_INDEXES.INDEX_ID")
    public Long getIndexId() {
        return indexId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source field: INNODB_CACHED_INDEXES.INDEX_ID")
    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source field: INNODB_CACHED_INDEXES.N_CACHED_PAGES")
    public Long getnCachedPages() {
        return nCachedPages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source field: INNODB_CACHED_INDEXES.N_CACHED_PAGES")
    public void setnCachedPages(Long nCachedPages) {
        this.nCachedPages = nCachedPages;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: INNODB_CACHED_INDEXES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spaceId=").append(spaceId);
        sb.append(", indexId=").append(indexId);
        sb.append(", nCachedPages=").append(nCachedPages);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: INNODB_CACHED_INDEXES")
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
        InnodbCachedIndexes other = (InnodbCachedIndexes) that;
        return (this.getSpaceId() == null ? other.getSpaceId() == null : this.getSpaceId().equals(other.getSpaceId()))
            && (this.getIndexId() == null ? other.getIndexId() == null : this.getIndexId().equals(other.getIndexId()))
            && (this.getnCachedPages() == null ? other.getnCachedPages() == null : this.getnCachedPages().equals(other.getnCachedPages()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: INNODB_CACHED_INDEXES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpaceId() == null) ? 0 : getSpaceId().hashCode());
        result = prime * result + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        result = prime * result + ((getnCachedPages() == null) ? 0 : getnCachedPages().hashCode());
        return result;
    }
}