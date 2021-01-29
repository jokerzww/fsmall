package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class ItemListTb implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1711822+08:00", comments="Source field: item_list_tb.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1711822+08:00", comments="Source field: item_list_tb.order_id")
    private Integer orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1711822+08:00", comments="Source field: item_list_tb.item_name")
    private String itemName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1731766+08:00", comments="Source field: item_list_tb.item_number")
    private Integer itemNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1731766+08:00", comments="Source field: item_list_tb.price")
    private BigDecimal price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1771662+08:00", comments="Source Table: item_list_tb")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1711822+08:00", comments="Source field: item_list_tb.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1711822+08:00", comments="Source field: item_list_tb.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1711822+08:00", comments="Source field: item_list_tb.order_id")
    public Integer getOrderId() {
        return orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1711822+08:00", comments="Source field: item_list_tb.order_id")
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1721795+08:00", comments="Source field: item_list_tb.item_name")
    public String getItemName() {
        return itemName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1731766+08:00", comments="Source field: item_list_tb.item_name")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1731766+08:00", comments="Source field: item_list_tb.item_number")
    public Integer getItemNumber() {
        return itemNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1731766+08:00", comments="Source field: item_list_tb.item_number")
    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1741783+08:00", comments="Source field: item_list_tb.price")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1771662+08:00", comments="Source field: item_list_tb.price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1771662+08:00", comments="Source Table: item_list_tb")
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
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1771662+08:00", comments="Source Table: item_list_tb")
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
        ItemListTb other = (ItemListTb) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.getItemNumber() == null ? other.getItemNumber() == null : this.getItemNumber().equals(other.getItemNumber()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.1791609+08:00", comments="Source Table: item_list_tb")
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