package com.fsteam.fsmall.service;

import com.fsteam.fsmall.model.ItemClass;

import java.util.List;

public interface ItemClassService {
   List<ItemClass> getAllItemClassByMallId(String id);
   ItemClass getItemClass(Integer id);
   int addItemClass(ItemClass itemClass);
   int deleteItemClass(Integer id);
   int updateItemClass(ItemClass itemClass);
}
