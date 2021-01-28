package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbFtConfig implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source field: INNODB_FT_CONFIG.KEY")
    private String key;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source field: INNODB_FT_CONFIG.VALUE")
    private String value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: INNODB_FT_CONFIG")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source field: INNODB_FT_CONFIG.KEY")
    public String getKey() {
        return key;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source field: INNODB_FT_CONFIG.KEY")
    public void setKey(String key) {
        this.key = key;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source field: INNODB_FT_CONFIG.VALUE")
    public String getValue() {
        return value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source field: INNODB_FT_CONFIG.VALUE")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: INNODB_FT_CONFIG")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", key=").append(key);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: INNODB_FT_CONFIG")
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
        InnodbFtConfig other = (InnodbFtConfig) that;
        return (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2769664+08:00", comments="Source Table: INNODB_FT_CONFIG")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        return result;
    }
}