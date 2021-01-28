package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SessionConnectAttrs implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.PROCESSLIST_ID")
    private Long processlistId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ATTR_NAME")
    private String attrName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ATTR_VALUE")
    private String attrValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ORDINAL_POSITION")
    private Integer ordinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source Table: session_connect_attrs")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.PROCESSLIST_ID")
    public Long getProcesslistId() {
        return processlistId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.PROCESSLIST_ID")
    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ATTR_NAME")
    public String getAttrName() {
        return attrName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ATTR_NAME")
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ATTR_VALUE")
    public String getAttrValue() {
        return attrValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ATTR_VALUE")
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ORDINAL_POSITION")
    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ORDINAL_POSITION")
    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source Table: session_connect_attrs")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", processlistId=").append(processlistId);
        sb.append(", attrName=").append(attrName);
        sb.append(", attrValue=").append(attrValue);
        sb.append(", ordinalPosition=").append(ordinalPosition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source Table: session_connect_attrs")
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
        SessionConnectAttrs other = (SessionConnectAttrs) that;
        return (this.getProcesslistId() == null ? other.getProcesslistId() == null : this.getProcesslistId().equals(other.getProcesslistId()))
            && (this.getAttrName() == null ? other.getAttrName() == null : this.getAttrName().equals(other.getAttrName()))
            && (this.getAttrValue() == null ? other.getAttrValue() == null : this.getAttrValue().equals(other.getAttrValue()))
            && (this.getOrdinalPosition() == null ? other.getOrdinalPosition() == null : this.getOrdinalPosition().equals(other.getOrdinalPosition()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source Table: session_connect_attrs")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProcesslistId() == null) ? 0 : getProcesslistId().hashCode());
        result = prime * result + ((getAttrName() == null) ? 0 : getAttrName().hashCode());
        result = prime * result + ((getAttrValue() == null) ? 0 : getAttrValue().hashCode());
        result = prime * result + ((getOrdinalPosition() == null) ? 0 : getOrdinalPosition().hashCode());
        return result;
    }
}