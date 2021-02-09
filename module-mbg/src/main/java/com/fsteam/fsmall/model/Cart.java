package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Cart implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.mall_id")
    private String mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.customer_id")
    private String customerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.item_id")
    private Integer itemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.number")
    private Integer number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source Table: cart")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.mall_id")
    public String getMallId() {
        return mallId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.mall_id")
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.customer_id")
    public String getCustomerId() {
        return customerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.item_id")
    public Integer getItemId() {
        return itemId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5178839+08:00", comments="Source field: cart.item_id")
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source field: cart.number")
    public Integer getNumber() {
        return number;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source field: cart.number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source Table: cart")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mallId=").append(mallId);
        sb.append(", customerId=").append(customerId);
        sb.append(", itemId=").append(itemId);
        sb.append(", number=").append(number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source Table: cart")
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
        Cart other = (Cart) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMallId() == null ? other.getMallId() == null : this.getMallId().equals(other.getMallId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source Table: cart")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMallId() == null) ? 0 : getMallId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        return result;
    }
}