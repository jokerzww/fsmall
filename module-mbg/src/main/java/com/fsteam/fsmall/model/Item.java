package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class Item implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.mall_id")
    private String mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.item_class_id")
    private Integer itemClassId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.icon_id")
    private Integer iconId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.status")
    private Integer status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.priority")
    private Integer priority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.sale_volume")
    private Integer saleVolume;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source field: item.price")
    private BigDecimal price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source field: item.unit")
    private String unit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source Table: item")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.mall_id")
    public String getMallId() {
        return mallId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.mall_id")
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.item_class_id")
    public Integer getItemClassId() {
        return itemClassId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.item_class_id")
    public void setItemClassId(Integer itemClassId) {
        this.itemClassId = itemClassId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.icon_id")
    public Integer getIconId() {
        return iconId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.icon_id")
    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.priority")
    public Integer getPriority() {
        return priority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5218869+08:00", comments="Source field: item.sale_volume")
    public Integer getSaleVolume() {
        return saleVolume;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source field: item.sale_volume")
    public void setSaleVolume(Integer saleVolume) {
        this.saleVolume = saleVolume;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source field: item.price")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source field: item.price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source field: item.unit")
    public String getUnit() {
        return unit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source field: item.unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source Table: item")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mallId=").append(mallId);
        sb.append(", itemClassId=").append(itemClassId);
        sb.append(", iconId=").append(iconId);
        sb.append(", status=").append(status);
        sb.append(", priority=").append(priority);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", saleVolume=").append(saleVolume);
        sb.append(", price=").append(price);
        sb.append(", unit=").append(unit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source Table: item")
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
        Item other = (Item) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMallId() == null ? other.getMallId() == null : this.getMallId().equals(other.getMallId()))
            && (this.getItemClassId() == null ? other.getItemClassId() == null : this.getItemClassId().equals(other.getItemClassId()))
            && (this.getIconId() == null ? other.getIconId() == null : this.getIconId().equals(other.getIconId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getSaleVolume() == null ? other.getSaleVolume() == null : this.getSaleVolume().equals(other.getSaleVolume()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source Table: item")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMallId() == null) ? 0 : getMallId().hashCode());
        result = prime * result + ((getItemClassId() == null) ? 0 : getItemClassId().hashCode());
        result = prime * result + ((getIconId() == null) ? 0 : getIconId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getSaleVolume() == null) ? 0 : getSaleVolume().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return result;
    }
}