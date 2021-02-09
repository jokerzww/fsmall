package com.fsteam.fsmall.service.impl;

import com.fsteam.fsmall.dto.ItemDetail;
import com.fsteam.fsmall.dto.JoinMapper;
import com.fsteam.fsmall.dto.OrderDetail;
import com.fsteam.fsmall.mapper.ItemLabelMapper;
import com.fsteam.fsmall.mapper.ItemMapper;
import com.fsteam.fsmall.mapper.PictureMapper;
import com.fsteam.fsmall.model.ItemLabel;
import com.fsteam.fsmall.model.Picture;
import com.fsteam.fsmall.service.ItemService;
import com.fsteam.fsmall.utils.MyBatisUtils;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.GeneralInsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static com.fsteam.fsmall.mapper.ItemDynamicSqlSupport.*;
import static com.fsteam.fsmall.mapper.PictureDynamicSqlSupport.*;
import static com.fsteam.fsmall.mapper.ItemLabelDynamicSqlSupport.*;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public List<ItemDetail> getAllItemByMallId(String mall_id) {
        MyBatisUtils.startSqlSession();
        JoinMapper joinMapper = MyBatisUtils.getMapper(JoinMapper.class);
        List<ItemDetail> itemDetailList = null;
        try {
            SelectStatementProvider selectStatement = select(
                    item.id, item.status, item.name, item.priority, item.saleVolume, item.unit, item.price, picture.url)
                    .from(item)
                    .join(picture)
                    .on(item.iconId, equalTo(picture.id))
                    .where(item.mallId, isEqualTo(mall_id))
                    .orderBy(item.priority)
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            itemDetailList = joinMapper.selectManyItemDetail(selectStatement);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return itemDetailList;
    }

    @Override
    public List<ItemDetail> getAllItemByItemClassId(Integer item_class_id) {
        MyBatisUtils.startSqlSession();
        JoinMapper joinMapper = MyBatisUtils.getMapper(JoinMapper.class);
        List<ItemDetail> itemDetailList = null;

        SelectStatementProvider selectStatement = select(
                item.id, item.status, item.name, item.priority, item.saleVolume, item.unit, item.price, picture.url)
                .from(item)
                .join(picture)
                .on(item.iconId, equalTo(picture.id))
                .where(item.itemClassId, isEqualTo(item_class_id))
                .orderBy(item.priority)
                .build()
                .render(RenderingStrategies.MYBATIS3);
        try {
            itemDetailList = joinMapper.selectManyItemDetail(selectStatement);
        } catch (Exception e) {
            System.out.println(selectStatement.getSelectStatement());
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return itemDetailList;
    }

    @Override
    public ItemDetail getItem(Integer item_id) {
        MyBatisUtils.startSqlSession();
        JoinMapper joinMapper = MyBatisUtils.getMapper(JoinMapper.class);
        PictureMapper pictureMapper = MyBatisUtils.getMapper(PictureMapper.class);
        ItemLabelMapper itemLabelMapper = MyBatisUtils.getMapper(ItemLabelMapper.class);

        ItemDetail itemDetail = null;
        try {
            SelectStatementProvider selectItemDetail = select(item.allColumns(), picture.url)
                    .from(item)
                    .leftJoin(picture)
                    .on(item.iconId, equalTo(picture.id))
                    .where(item.id, isEqualTo(item_id))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            Optional<ItemDetail> itemDetailOpt = joinMapper.selectItemDetail(selectItemDetail);
            itemDetail = itemDetailOpt.orElse(null);

            if (itemDetail != null) {
                SelectStatementProvider selectPic = select(picture.id, picture.url)
                        .from(picture)
                        .where(picture.itemId, isEqualTo(item_id))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
                List<Picture> pics = pictureMapper.selectMany(selectPic);

                SelectStatementProvider selectLabel = select(itemLabel.id, itemLabel.name, itemLabel.price)
                        .from(itemLabel)
                        .where(itemLabel.itemId, isEqualTo(item_id))
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
                List<ItemLabel> itemLabels = itemLabelMapper.selectMany(selectLabel);

                itemDetail.setPictureList(pics);
                itemDetail.setLabelList(itemLabels);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return itemDetail;
    }

    @Override
    public int addItem(ItemDetail record) {
        MyBatisUtils.startSqlSession();
        ItemMapper itemMapper = MyBatisUtils.getMapper(ItemMapper.class);
        PictureMapper pictureMapper = MyBatisUtils.getMapper(PictureMapper.class);
        ItemLabelMapper itemLabelMapper = MyBatisUtils.getMapper(ItemLabelMapper.class);
        int rows;

        try {
            // 一定会为icon留出一个记录，即使url是空的，方便之后修改icon
            GeneralInsertStatementProvider insertIcon = insertInto(picture)
                    .set(url).toValue(record::getIconUrl)
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            rows = pictureMapper.generalInsert(insertIcon);

            Connection conn = MyBatisUtils.getSqlSession().getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select last_insert_id()"); // 获取自增主键
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                record.setIconId(rs.getInt(1));
            }
            rs.close();
            pstmt.close();

            rows += itemMapper.insertSelective(record);

            for (Picture pic : record.getPictureList()) {
                rows += pictureMapper.insertSelective(pic);
            }

            for (ItemLabel label : record.getLabelList()) {
                rows += itemLabelMapper.insertSelective(label);
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
    public int updateItem(ItemDetail record) {
        MyBatisUtils.startSqlSession();
        ItemMapper itemMapper = MyBatisUtils.getMapper(ItemMapper.class);
        PictureMapper pictureMapper = MyBatisUtils.getMapper(PictureMapper.class);
        ItemLabelMapper itemLabelMapper = MyBatisUtils.getMapper(ItemLabelMapper.class);
        int rows;

        try {
            rows = itemMapper.updateByPrimaryKeySelective(record);

            if (record.getIconUrl() != null) {
                UpdateStatementProvider updateIcon = update(picture)
                        .set(url).equalTo(record.getIconUrl())
                        .where(picture.id, isEqualTo(record.getIconId()))
                        .build().render(RenderingStrategies.MYBATIS3);
                rows += pictureMapper.update(updateIcon);
            }

            for (Picture pic : record.getPictureList()) {
                if (pic.getId() != null) {
                    // 图片的id非空，表示要删除该图片
                    rows += pictureMapper.deleteByPrimaryKey(pic.getId());
                } else {
                    // 否则表示添加该图片
                    rows += pictureMapper.insertSelective(pic);
                }
            }

            for (ItemLabel label : record.getLabelList()) {
                if (label.getId() != null) {
                    // 有id表示要删除该label
                    rows += itemLabelMapper.deleteByPrimaryKey(label.getId());
                } else {
                    // 没有id表示label是新添加的
                    itemLabelMapper.insertSelective(label);
                }
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
    public int deleteItem(Integer item_id) {
        MyBatisUtils.startSqlSession();
        ItemMapper itemMapper = MyBatisUtils.getMapper(ItemMapper.class);
        PictureMapper pictureMapper = MyBatisUtils.getMapper(PictureMapper.class);
        ItemLabelMapper itemLabelMapper = MyBatisUtils.getMapper(ItemLabelMapper.class);
        int rows;

        try {
            // 删除item
            rows = itemMapper.deleteByPrimaryKey(item_id);

            // 删除icon
            DeleteStatementProvider deleteIcon = deleteFrom(picture)
                    .where(picture.id, isEqualTo(
                            select(iconId).from(item).where(item.id, isEqualTo(item_id))
                    )).build()
                    .render(RenderingStrategies.MYBATIS3);
            rows += pictureMapper.delete(deleteIcon);

            // 删除图片
            DeleteStatementProvider deletePics = deleteFrom(picture)
                    .where(picture.itemId, isEqualTo(item_id))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            rows += pictureMapper.delete(deletePics);

            // 删除label
            DeleteStatementProvider deleteLabel = deleteFrom(itemLabel)
                    .where(itemLabel.itemId, isEqualTo(item_id))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            rows += itemLabelMapper.delete(deleteLabel);
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
}
