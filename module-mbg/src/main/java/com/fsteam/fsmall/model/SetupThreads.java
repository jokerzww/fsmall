package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SetupThreads implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.ENABLED")
    private String enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.HISTORY")
    private String history;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.PROPERTIES")
    private String properties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.VOLATILITY")
    private Integer volatility;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.DOCUMENTATION")
    private String documentation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: setup_threads")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.ENABLED")
    public String getEnabled() {
        return enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.ENABLED")
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.HISTORY")
    public String getHistory() {
        return history;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.HISTORY")
    public void setHistory(String history) {
        this.history = history;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.PROPERTIES")
    public String getProperties() {
        return properties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.PROPERTIES")
    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.VOLATILITY")
    public Integer getVolatility() {
        return volatility;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.VOLATILITY")
    public void setVolatility(Integer volatility) {
        this.volatility = volatility;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.DOCUMENTATION")
    public String getDocumentation() {
        return documentation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: setup_threads.DOCUMENTATION")
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: setup_threads")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", enabled=").append(enabled);
        sb.append(", history=").append(history);
        sb.append(", properties=").append(properties);
        sb.append(", volatility=").append(volatility);
        sb.append(", documentation=").append(documentation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: setup_threads")
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
        SetupThreads other = (SetupThreads) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getHistory() == null ? other.getHistory() == null : this.getHistory().equals(other.getHistory()))
            && (this.getProperties() == null ? other.getProperties() == null : this.getProperties().equals(other.getProperties()))
            && (this.getVolatility() == null ? other.getVolatility() == null : this.getVolatility().equals(other.getVolatility()))
            && (this.getDocumentation() == null ? other.getDocumentation() == null : this.getDocumentation().equals(other.getDocumentation()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: setup_threads")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getHistory() == null) ? 0 : getHistory().hashCode());
        result = prime * result + ((getProperties() == null) ? 0 : getProperties().hashCode());
        result = prime * result + ((getVolatility() == null) ? 0 : getVolatility().hashCode());
        result = prime * result + ((getDocumentation() == null) ? 0 : getDocumentation().hashCode());
        return result;
    }
}