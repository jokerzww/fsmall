package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbFtIndexCache implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.WORD")
    private String word;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.FIRST_DOC_ID")
    private Long firstDocId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.LAST_DOC_ID")
    private Long lastDocId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.DOC_COUNT")
    private Long docCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.DOC_ID")
    private Long docId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.POSITION")
    private Long position;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.WORD")
    public String getWord() {
        return word;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.WORD")
    public void setWord(String word) {
        this.word = word;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.FIRST_DOC_ID")
    public Long getFirstDocId() {
        return firstDocId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.FIRST_DOC_ID")
    public void setFirstDocId(Long firstDocId) {
        this.firstDocId = firstDocId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.LAST_DOC_ID")
    public Long getLastDocId() {
        return lastDocId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.LAST_DOC_ID")
    public void setLastDocId(Long lastDocId) {
        this.lastDocId = lastDocId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.DOC_COUNT")
    public Long getDocCount() {
        return docCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.DOC_COUNT")
    public void setDocCount(Long docCount) {
        this.docCount = docCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.DOC_ID")
    public Long getDocId() {
        return docId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.DOC_ID")
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.POSITION")
    public Long getPosition() {
        return position;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source field: INNODB_FT_INDEX_CACHE.POSITION")
    public void setPosition(Long position) {
        this.position = position;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", word=").append(word);
        sb.append(", firstDocId=").append(firstDocId);
        sb.append(", lastDocId=").append(lastDocId);
        sb.append(", docCount=").append(docCount);
        sb.append(", docId=").append(docId);
        sb.append(", position=").append(position);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
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
        InnodbFtIndexCache other = (InnodbFtIndexCache) that;
        return (this.getWord() == null ? other.getWord() == null : this.getWord().equals(other.getWord()))
            && (this.getFirstDocId() == null ? other.getFirstDocId() == null : this.getFirstDocId().equals(other.getFirstDocId()))
            && (this.getLastDocId() == null ? other.getLastDocId() == null : this.getLastDocId().equals(other.getLastDocId()))
            && (this.getDocCount() == null ? other.getDocCount() == null : this.getDocCount().equals(other.getDocCount()))
            && (this.getDocId() == null ? other.getDocId() == null : this.getDocId().equals(other.getDocId()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.122827+08:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWord() == null) ? 0 : getWord().hashCode());
        result = prime * result + ((getFirstDocId() == null) ? 0 : getFirstDocId().hashCode());
        result = prime * result + ((getLastDocId() == null) ? 0 : getLastDocId().hashCode());
        result = prime * result + ((getDocCount() == null) ? 0 : getDocCount().hashCode());
        result = prime * result + ((getDocId() == null) ? 0 : getDocId().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return result;
    }
}