package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbFtDeleted implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3470305+08:00", comments="Source field: INNODB_FT_DELETED.DOC_ID")
    private Long docId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3470305+08:00", comments="Source Table: INNODB_FT_DELETED")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3470305+08:00", comments="Source field: INNODB_FT_DELETED.DOC_ID")
    public Long getDocId() {
        return docId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3470305+08:00", comments="Source field: INNODB_FT_DELETED.DOC_ID")
    public void setDocId(Long docId) {
        this.docId = docId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3470305+08:00", comments="Source Table: INNODB_FT_DELETED")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", docId=").append(docId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3470305+08:00", comments="Source Table: INNODB_FT_DELETED")
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
        InnodbFtDeleted other = (InnodbFtDeleted) that;
        return (this.getDocId() == null ? other.getDocId() == null : this.getDocId().equals(other.getDocId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3470305+08:00", comments="Source Table: INNODB_FT_DELETED")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDocId() == null) ? 0 : getDocId().hashCode());
        return result;
    }
}