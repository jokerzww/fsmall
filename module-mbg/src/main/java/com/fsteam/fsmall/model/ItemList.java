package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class ItemList implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.order_id")
    private Integer orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.item_name")
    private String itemName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.item_number")
    private Integer itemNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.price")
    private BigDecimal price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source Table: item_list")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.order_id")
    public Integer getOrderId() {
        return orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.order_id")
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.item_name")
    public String getItemName() {
        return itemName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.item_name")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.item_number")
    public Integer getItemNumber() {
        return itemNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.item_number")
    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.price")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source field: item_list.price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source Table: item_list")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", itemName=").append(itemName);
        sb.append(", itemNumber=").append(itemNumber);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source Table: item_list")
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
        ItemList other = (ItemList) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.getItemNumber() == null ? other.getItemNumber() == null : this.getItemNumber().equals(other.getItemNumber()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5148805+08:00", comments="Source Table: item_list")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((getItemNumber() == null) ? 0 : getItemNumber().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }
}