package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SetupInstruments implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.ENABLED")
    private String enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.TIMED")
    private String timed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.PROPERTIES")
    private String properties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.VOLATILITY")
    private Integer volatility;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.DOCUMENTATION")
    private String documentation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.ENABLED")
    public String getEnabled() {
        return enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.ENABLED")
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.TIMED")
    public String getTimed() {
        return timed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.TIMED")
    public void setTimed(String timed) {
        this.timed = timed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.PROPERTIES")
    public String getProperties() {
        return properties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.PROPERTIES")
    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.VOLATILITY")
    public Integer getVolatility() {
        return volatility;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.VOLATILITY")
    public void setVolatility(Integer volatility) {
        this.volatility = volatility;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2219182+08:00", comments="Source field: setup_instruments.DOCUMENTATION")
    public String getDocumentation() {
        return documentation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: setup_instruments.DOCUMENTATION")
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", enabled=").append(enabled);
        sb.append(", timed=").append(timed);
        sb.append(", properties=").append(properties);
        sb.append(", volatility=").append(volatility);
        sb.append(", documentation=").append(documentation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
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
        SetupInstruments other = (SetupInstruments) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getTimed() == null ? other.getTimed() == null : this.getTimed().equals(other.getTimed()))
            && (this.getProperties() == null ? other.getProperties() == null : this.getProperties().equals(other.getProperties()))
            && (this.getVolatility() == null ? other.getVolatility() == null : this.getVolatility().equals(other.getVolatility()))
            && (this.getDocumentation() == null ? other.getDocumentation() == null : this.getDocumentation().equals(other.getDocumentation()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getTimed() == null) ? 0 : getTimed().hashCode());
        result = prime * result + ((getProperties() == null) ? 0 : getProperties().hashCode());
        result = prime * result + ((getVolatility() == null) ? 0 : getVolatility().hashCode());
        result = prime * result + ((getDocumentation() == null) ? 0 : getDocumentation().hashCode());
        return result;
    }
}