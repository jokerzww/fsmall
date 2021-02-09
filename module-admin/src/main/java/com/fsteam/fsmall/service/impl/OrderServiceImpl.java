package com.fsteam.fsmall.service.impl;

import com.fsteam.fsmall.dto.OrderDetail;
import com.fsteam.fsmall.mapper.ItemListMapper;
import com.fsteam.fsmall.mapper.OrderMapper;
import com.fsteam.fsmall.model.ItemList;
import com.fsteam.fsmall.model.Order;
import com.fsteam.fsmall.service.OrderService;
import com.fsteam.fsmall.utils.MyBatisUtils;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static com.fsteam.fsmall.mapper.OrderDynamicSqlSupport.*;
import static com.fsteam.fsmall.mapper.ItemListDynamicSqlSupport.*;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDetail getOrderDetail(Integer order_id) {
        MyBatisUtils.startSqlSession();
        OrderMapper orderMapper = MyBatisUtils.getMapper(OrderMapper.class);
        ItemListMapper itemListMapper = MyBatisUtils.getMapper(ItemListMapper.class);

        OrderDetail orderDetail = null;
        try {
            Optional<Order> orderOpt = orderMapper.selectByPrimaryKey(order_id);
            if (orderOpt.isPresent()) {
                SelectStatementProvider selectItemList = select(itemList.allColumns())
                        .from(itemList)
                        .where(itemList.orderId, isEqualTo(order_id))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
                List<ItemList> itemLists = itemListMapper.selectMany(selectItemList);
                orderDetail = new OrderDetail(orderOpt.get(), itemLists);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return orderDetail;
    }

    @Override
    public List<Order> getOrderByMallId(String mall_id) {
        MyBatisUtils.startSqlSession();
        OrderMapper orderMapper = MyBatisUtils.getMapper(OrderMapper.class);
        List<Order> orders = null;
        try {
            SelectStatementProvider selectOrder = select(order.allColumns())
                    .from(order)
                    .where(order.mallId, isEqualTo(mall_id))
                    .orderBy(order.time.descending())
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            orders = orderMapper.selectMany(selectOrder);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return orders;
    }

    @Override
    public List<Order> getOrderByCustomerId(String customer_id) {
        MyBatisUtils.startSqlSession();
        OrderMapper orderMapper = MyBatisUtils.getMapper(OrderMapper.class);
        List<Order> orders = null;
        try {
            SelectStatementProvider selectOrder = select(order.allColumns())
                    .from(order)
                    .where(order.customerId, isEqualTo(customer_id))
                    .orderBy(order.time.descending())
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            orders = orderMapper.selectMany(selectOrder);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return orders;
    }

    @Override
    public int addOrder(OrderDetail recordDetail) {
        // 订单只能由客户来创建
        MyBatisUtils.startSqlSession();
        OrderMapper orderMapper = MyBatisUtils.getMapper(OrderMapper.class);
        ItemListMapper itemListMapper = MyBatisUtils.getMapper(ItemListMapper.class);
        int rows;

        try {
            rows = orderMapper.insert(recordDetail);
            for (ItemList item : recordDetail.getItemList()) {
                itemListMapper.insert(item);
            }
            MyBatisUtils.commit();
        } catch (Exception e) {
            e.printStackTrace();
            MyBatisUtils.rollback();
            rows = -1;
        } finally {
            MyBatisUtils.close();
        }
        return rows;
    }

    @Override
    public int deleteOrder(Integer order_id) {
        MyBatisUtils.startSqlSession();
        OrderMapper orderMapper = MyBatisUtils.getMapper(OrderMapper.class);
        ItemListMapper itemListMapper = MyBatisUtils.getMapper(ItemListMapper.class);
        int rows;
        try {
            rows = orderMapper.deleteByPrimaryKey(order_id);
            DeleteStatementProvider deleteItem = deleteFrom(itemList)
                    .where(itemList.orderId, isEqualTo(
                            select(itemList.orderId).from(order).where(order.id, isEqualTo(order_id))
                    )).build().render(RenderingStrategies.MYBATIS3);
            rows += itemListMapper.delete(deleteItem);
            MyBatisUtils.commit();
        } catch (Exception e) {
            e.printStackTrace();
            MyBatisUtils.rollback();
            rows = -1;
        } finally {
            MyBatisUtils.close();
        }
        return rows;
    }

    @Override
    public int updateStatus(OrderDetail record) {
        MyBatisUtils.startSqlSession();
        OrderMapper orderMapper = MyBatisUtils.getMapper(OrderMapper.class);
        int rows = -1;

        try {
            UpdateStatementProvider updateStatus = update(order)
                    .set(status).equalTo(record::getStatus)
                    .where(order.id, isEqualTo(record::getId))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            rows = orderMapper.update(updateStatus);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return rows;
    }
}
