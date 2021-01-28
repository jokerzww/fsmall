package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbFtDefaultStopword implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source field: INNODB_FT_DEFAULT_STOPWORD.value")
    private String value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source field: INNODB_FT_DEFAULT_STOPWORD.value")
    public String getValue() {
        return value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source field: INNODB_FT_DEFAULT_STOPWORD.value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
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
        InnodbFtDefaultStopword other = (InnodbFtDefaultStopword) that;
        return (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1738739+08:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        return result;
    }
}