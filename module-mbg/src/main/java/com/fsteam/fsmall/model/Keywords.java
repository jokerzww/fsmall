package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Keywords implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source field: KEYWORDS.WORD")
    private String word;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source field: KEYWORDS.RESERVED")
    private Integer reserved;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source Table: KEYWORDS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source field: KEYWORDS.WORD")
    public String getWord() {
        return word;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source field: KEYWORDS.WORD")
    public void setWord(String word) {
        this.word = word;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source field: KEYWORDS.RESERVED")
    public Integer getReserved() {
        return reserved;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source field: KEYWORDS.RESERVED")
    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source Table: KEYWORDS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", word=").append(word);
        sb.append(", reserved=").append(reserved);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source Table: KEYWORDS")
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
        Keywords other = (Keywords) that;
        return (this.getWord() == null ? other.getWord() == null : this.getWord().equals(other.getWord()))
            && (this.getReserved() == null ? other.getReserved() == null : this.getReserved().equals(other.getReserved()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source Table: KEYWORDS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWord() == null) ? 0 : getWord().hashCode());
        result = prime * result + ((getReserved() == null) ? 0 : getReserved().hashCode());
        return result;
    }
}