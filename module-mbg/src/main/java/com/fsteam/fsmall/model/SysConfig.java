package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class SysConfig implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.variable")
    private String variable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.value")
    private String value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.set_time")
    private Date setTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.set_by")
    private String setBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.variable")
    public String getVariable() {
        return variable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.variable")
    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.value")
    public String getValue() {
        return value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.value")
    public void setValue(String value) {
        this.value = value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.set_time")
    public Date getSetTime() {
        return setTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.set_time")
    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.set_by")
    public String getSetBy() {
        return setBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.set_by")
    public void setSetBy(String setBy) {
        this.setBy = setBy;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", variable=").append(variable);
        sb.append(", value=").append(value);
        sb.append(", setTime=").append(setTime);
        sb.append(", setBy=").append(setBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
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
        SysConfig other = (SysConfig) that;
        return (this.getVariable() == null ? other.getVariable() == null : this.getVariable().equals(other.getVariable()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getSetTime() == null ? other.getSetTime() == null : this.getSetTime().equals(other.getSetTime()))
            && (this.getSetBy() == null ? other.getSetBy() == null : this.getSetBy().equals(other.getSetBy()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVariable() == null) ? 0 : getVariable().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getSetTime() == null) ? 0 : getSetTime().hashCode());
        result = prime * result + ((getSetBy() == null) ? 0 : getSetBy().hashCode());
        return result;
    }
}