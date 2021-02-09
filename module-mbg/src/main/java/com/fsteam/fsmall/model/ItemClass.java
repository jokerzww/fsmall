package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ItemClass implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.mall_id")
    private String mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.priority")
    private Integer priority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source Table: item_class")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.mall_id")
    public String getMallId() {
        return mallId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.mall_id")
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.priority")
    public Integer getPriority() {
        return priority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source field: item_class.priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source Table: item_class")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mallId=").append(mallId);
        sb.append(", name=").append(name);
        sb.append(", priority=").append(priority);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source Table: item_class")
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
        ItemClass other = (ItemClass) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMallId() == null ? other.getMallId() == null : this.getMallId().equals(other.getMallId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5108775+08:00", comments="Source Table: item_class")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMallId() == null) ? 0 : getMallId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return result;
    }
}