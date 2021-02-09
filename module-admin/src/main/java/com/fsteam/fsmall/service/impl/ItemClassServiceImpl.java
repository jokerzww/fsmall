package com.fsteam.fsmall.service.impl;

import com.fsteam.fsmall.mapper.ItemClassMapper;
import com.fsteam.fsmall.model.ItemClass;
import com.fsteam.fsmall.service.ItemClassService;
import com.fsteam.fsmall.utils.MyBatisUtils;
import org.mybatis.dynamic.sql.insert.render.GeneralInsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static com.fsteam.fsmall.mapper.ItemClassDynamicSqlSupport.*;


@Service
public class ItemClassServiceImpl implements ItemClassService {

   @Override
   public List<ItemClass> getAllItemClassByMallId(String mall_id) {
      MyBatisUtils.startSqlSession();
      ItemClassMapper itemClassMapper = MyBatisUtils.getMapper(ItemClassMapper.class);
      List<ItemClass> itemClassList = null;
      try {
         SelectStatementProvider selectStatement = select(id, name, priority)
                 .from(itemClass)
                 .where(mallId, isEqualTo(mall_id))
                 .orderBy(priority)
                 .build()
                 .render(RenderingStrategies.MYBATIS3);
         itemClassList = itemClassMapper.selectMany(selectStatement);
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         MyBatisUtils.close();
      }
      return itemClassList;
   }

   @Override
   public ItemClass getItemClass(Integer icid) {
      MyBatisUtils.startSqlSession();
      ItemClassMapper itemClassMapper = MyBatisUtils.getMapper(ItemClassMapper.class);
      ItemClass itemClass = null;
      try {
         Optional<ItemClass> itemClassOpt = itemClassMapper.selectByPrimaryKey(icid);
         itemClass = itemClassOpt.orElse(null);
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         MyBatisUtils.close();
      }
      return itemClass;
   }

   @Override
   public int addItemClass(ItemClass record) {
      MyBatisUtils.startSqlSession();
      ItemClassMapper itemClassMapper = MyBatisUtils.getMapper(ItemClassMapper.class);
      int row = -1;
      try {
         row = itemClassMapper.insert(record);
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         MyBatisUtils.close();
      }
      return row;
   }

   @Override
   public int deleteItemClass(Integer icid) {
      MyBatisUtils.startSqlSession();
      ItemClassMapper itemClassMapper = MyBatisUtils.getMapper(ItemClassMapper.class);
      int row = -1;
      try {
         row = itemClassMapper.deleteByPrimaryKey(icid);
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         MyBatisUtils.close();
      }
      return row;
   }

   @Override
   public int updateItemClass(ItemClass record) {
      MyBatisUtils.startSqlSession();
      ItemClassMapper itemClassMapper = MyBatisUtils.getMapper(ItemClassMapper.class);
      int row = -1;
      try {
         row = itemClassMapper.updateByPrimaryKeySelective(record);
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         MyBatisUtils.close();
      }
      return row;
   }
}
