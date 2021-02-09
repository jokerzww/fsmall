package com.fsteam.fsmall.service;

import com.fsteam.fsmall.model.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getCart(String cusId, String mallId); // 获取客户对应商家的购物车中的物品列表
    int cleanUpCart(String cusId, String mallId); // 清空购物车
    int addItemIntoCart(Cart cart); // 添加商品进入购物车
    int deleteItemFromCart(Integer id); // 删除购物车中的商品
    int updateItemNumberOfCart(Cart cart); // 修改商品数量

}
