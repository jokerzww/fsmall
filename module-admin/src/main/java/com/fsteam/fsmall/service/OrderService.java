package com.fsteam.fsmall.service;

import com.fsteam.fsmall.dto.OrderDetail;
import com.fsteam.fsmall.model.Order;

import java.util.List;

public interface OrderService {
    // 订单相关不设置修改权限
    List<Order> getOrderByMallId(String mallId);
    List<Order> getOrderByCustomerId(String customerId);
    OrderDetail getOrderDetail(Integer id);
    int addOrder(OrderDetail order);
    int deleteOrder(Integer id);
    int updateStatus(OrderDetail order);
}
