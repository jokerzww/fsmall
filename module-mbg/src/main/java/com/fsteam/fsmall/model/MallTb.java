package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class MallTb implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.phone")
    private String phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.address")
    private String address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.icon_id")
    private Integer iconId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.status")
    private Integer status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: mall_tb")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.id")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.phone")
    public String getPhone() {
        return phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.address")
    public String getAddress() {
        return address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.address")
    public void setAddress(String address) {
        this.address = address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.icon_id")
    public Integer getIconId() {
        return iconId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.icon_id")
    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source field: mall_tb.status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: mall_tb")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", iconId=").append(iconId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: mall_tb")
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
        MallTb other = (MallTb) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getIconId() == null ? other.getIconId() == null : this.getIconId().equals(other.getIconId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: mall_tb")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getIconId() == null) ? 0 : getIconId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}