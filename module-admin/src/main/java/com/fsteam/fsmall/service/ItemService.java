package com.fsteam.fsmall.service;

import com.fsteam.fsmall.dto.ItemDetail;

import java.util.List;

public interface ItemService {
    List<ItemDetail> getAllItemByMallId(String mallId);
    List<ItemDetail> getAllItemByItemClassId(Integer itemClassId);
    ItemDetail getItem(Integer id);
    int addItem(ItemDetail item);
    int updateItem(ItemDetail item);
    int deleteItem(Integer id);
}
