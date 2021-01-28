package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SetupConsumers implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source field: setup_consumers.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source field: setup_consumers.ENABLED")
    private String enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source Table: setup_consumers")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source field: setup_consumers.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source field: setup_consumers.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source field: setup_consumers.ENABLED")
    public String getEnabled() {
        return enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source field: setup_consumers.ENABLED")
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source Table: setup_consumers")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", enabled=").append(enabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source Table: setup_consumers")
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
        SetupConsumers other = (SetupConsumers) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source Table: setup_consumers")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return result;
    }
}