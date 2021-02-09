package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class Order implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5038703+08:00", comments="Source field: order.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5038703+08:00", comments="Source field: order.mall_id")
    private String mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5038703+08:00", comments="Source field: order.customer_id")
    private String customerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.mall_name")
    private String mallName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.price")
    private BigDecimal price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.status")
    private String status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.time")
    private LocalDateTime time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.customer_name")
    private String customerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.customer_addr")
    private String customerAddr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.customer_phone")
    private String customerPhone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.note")
    private String note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5058724+08:00", comments="Source Table: order")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5038703+08:00", comments="Source field: order.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5038703+08:00", comments="Source field: order.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5038703+08:00", comments="Source field: order.mall_id")
    public String getMallId() {
        return mallId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5038703+08:00", comments="Source field: order.mall_id")
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5038703+08:00", comments="Source field: order.customer_id")
    public String getCustomerId() {
        return customerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5038703+08:00", comments="Source field: order.customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.mall_name")
    public String getMallName() {
        return mallName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.mall_name")
    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.price")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.status")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.status")
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.time")
    public LocalDateTime getTime() {
        return time;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.time")
    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.customer_name")
    public String getCustomerName() {
        return customerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.customer_name")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.customer_addr")
    public String getCustomerAddr() {
        return customerAddr;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.customer_addr")
    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.customer_phone")
    public String getCustomerPhone() {
        return customerPhone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.customer_phone")
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5048713+08:00", comments="Source field: order.note")
    public String getNote() {
        return note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5058724+08:00", comments="Source field: order.note")
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5058724+08:00", comments="Source Table: order")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mallId=").append(mallId);
        sb.append(", customerId=").append(customerId);
        sb.append(", mallName=").append(mallName);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", time=").append(time);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerAddr=").append(customerAddr);
        sb.append(", customerPhone=").append(customerPhone);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5058724+08:00", comments="Source Table: order")
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
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMallId() == null ? other.getMallId() == null : this.getMallId().equals(other.getMallId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getMallName() == null ? other.getMallName() == null : this.getMallName().equals(other.getMallName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCustomerAddr() == null ? other.getCustomerAddr() == null : this.getCustomerAddr().equals(other.getCustomerAddr()))
            && (this.getCustomerPhone() == null ? other.getCustomerPhone() == null : this.getCustomerPhone().equals(other.getCustomerPhone()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5058724+08:00", comments="Source Table: order")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMallId() == null) ? 0 : getMallId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getMallName() == null) ? 0 : getMallName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCustomerAddr() == null) ? 0 : getCustomerAddr().hashCode());
        result = prime * result + ((getCustomerPhone() == null) ? 0 : getCustomerPhone().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}