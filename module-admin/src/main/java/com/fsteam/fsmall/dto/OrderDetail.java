package com.fsteam.fsmall.dto;

import com.fsteam.fsmall.model.ItemList;
import com.fsteam.fsmall.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import java.util.List;
import java.util.Optional;


public class OrderDetail extends Order {
    // 表外信息
    private List<ItemList> itemList;

    public List<ItemList> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemList> itemList) {
        this.itemList = itemList;
    }

    public OrderDetail(Order order, List<ItemList> itemList) {
        setId(order.getId());
        setMallId(order.getMallId());
        setCustomerId(order.getCustomerId());
        setMallName(order.getMallName());
        setPrice(order.getPrice());
        setStatus(order.getStatus());
        setTime(order.getTime());
        setCustomerName(order.getCustomerName());
        setCustomerAddr(order.getCustomerAddr());
        setCustomerPhone(order.getCustomerPhone());
        setNote(order.getNote());
        setItemList(itemList);
    }


}
