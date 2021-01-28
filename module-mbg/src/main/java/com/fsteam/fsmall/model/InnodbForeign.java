package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbForeign implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.ID")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.FOR_NAME")
    private String forName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.REF_NAME")
    private String refName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.N_COLS")
    private Long nCols;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.TYPE")
    private Long type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source Table: INNODB_FOREIGN")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.ID")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.ID")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.FOR_NAME")
    public String getForName() {
        return forName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.FOR_NAME")
    public void setForName(String forName) {
        this.forName = forName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.REF_NAME")
    public String getRefName() {
        return refName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.REF_NAME")
    public void setRefName(String refName) {
        this.refName = refName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.N_COLS")
    public Long getnCols() {
        return nCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.N_COLS")
    public void setnCols(Long nCols) {
        this.nCols = nCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.TYPE")
    public Long getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.TYPE")
    public void setType(Long type) {
        this.type = type;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source Table: INNODB_FOREIGN")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", forName=").append(forName);
        sb.append(", refName=").append(refName);
        sb.append(", nCols=").append(nCols);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source Table: INNODB_FOREIGN")
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
        InnodbForeign other = (InnodbForeign) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getForName() == null ? other.getForName() == null : this.getForName().equals(other.getForName()))
            && (this.getRefName() == null ? other.getRefName() == null : this.getRefName().equals(other.getRefName()))
            && (this.getnCols() == null ? other.getnCols() == null : this.getnCols().equals(other.getnCols()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source Table: INNODB_FOREIGN")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getForName() == null) ? 0 : getForName().hashCode());
        result = prime * result + ((getRefName() == null) ? 0 : getRefName().hashCode());
        result = prime * result + ((getnCols() == null) ? 0 : getnCols().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}