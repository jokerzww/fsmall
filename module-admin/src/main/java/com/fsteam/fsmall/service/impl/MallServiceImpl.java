package com.fsteam.fsmall.service.impl;

import com.fsteam.fsmall.dto.JoinMapper;
import com.fsteam.fsmall.dto.OrderDetail;
import com.fsteam.fsmall.dto.MallDetail;
import com.fsteam.fsmall.mapper.MallMapper;
import com.fsteam.fsmall.mapper.PictureMapper;
import com.fsteam.fsmall.service.MallService;
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

import static com.fsteam.fsmall.mapper.ItemDynamicSqlSupport.iconId;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static com.fsteam.fsmall.mapper.MallDynamicSqlSupport.*;
import static com.fsteam.fsmall.mapper.PictureDynamicSqlSupport.*;

@Service
public class MallServiceImpl implements MallService {


    @Override
    public List<MallDetail> getAllMall() {
        MyBatisUtils.startSqlSession();
        JoinMapper joinMapper = MyBatisUtils.getMapper(JoinMapper.class);
        List<MallDetail> mallDetailList = null;
        try {
            SelectStatementProvider selectBreifMallList = select(mall.id, mall.name, mall.status, picture.url)
                    .from(mall)
                    .join(picture)
                    .on(mall.iconId, equalTo(picture.id))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            mallDetailList = joinMapper.selectManyMallDetail(selectBreifMallList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return mallDetailList;
    }

    @Override
    public MallDetail getMall(String mall_id) {
        MyBatisUtils.startSqlSession();
        JoinMapper joinMapper = MyBatisUtils.getMapper(JoinMapper.class);
        MallDetail mallDetail = null;
        try {
            SelectStatementProvider selectMallDetail = select(mall.allColumns(), picture.url)
                    .from(mall)
                    .join(picture)
                    .on(mall.iconId, equalTo(picture.id))
                    .where(mall.id, isEqualTo(mall_id))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);
            Optional<MallDetail> mallOpt = joinMapper.selectMallDetail(selectMallDetail);
            mallDetail = mallOpt.orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.close();
        }
        return mallDetail;
    }

    @Override
    public int addMall(MallDetail record) {
        MyBatisUtils.startSqlSession();
        MallMapper mallMapper = MyBatisUtils.getMapper(MallMapper.class);
        PictureMapper pictureMapper = MyBatisUtils.getMapper(PictureMapper.class);
        int rows;

        try {
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

            rows += mallMapper.insertSelective(record);
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
    public int updateMall(MallDetail record) {
        MyBatisUtils.startSqlSession();
        MallMapper mallMapper = MyBatisUtils.getMapper(MallMapper.class);
        PictureMapper pictureMapper = MyBatisUtils.getMapper(PictureMapper.class);
        int rows;
        try {

            rows = mallMapper.updateByPrimaryKeySelective(record);

            if (record.getIconUrl() != null) {
                UpdateStatementProvider updateIcon = update(picture)
                        .set(url).equalTo(record.getIconUrl())
                        .where(picture.id, isEqualTo(record.getIconId()))
                        .build().render(RenderingStrategies.MYBATIS3);
                rows += pictureMapper.update(updateIcon);
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
    public int deleteMall(String mall_id) {
        MyBatisUtils.startSqlSession();
        MallMapper mallMapper = MyBatisUtils.getMapper(MallMapper.class);
        PictureMapper pictureMapper = MyBatisUtils.getMapper(PictureMapper.class);

        int rows;
        try {
            rows = mallMapper.deleteByPrimaryKey(mall_id);

            DeleteStatementProvider deleteIcon = deleteFrom(picture)
                    .where(picture.id, isEqualTo(
                            select(iconId).from(mall).where(mall.id, isEqualTo(mall_id))
                    )).build()
                    .render(RenderingStrategies.MYBATIS3);
            rows += pictureMapper.delete(deleteIcon);
            MyBatisUtils.commit();
        }catch (Exception e) {
            e.printStackTrace();
            MyBatisUtils.rollback();
            rows = -1;
        } finally {
            MyBatisUtils.close();
        }
        return rows;
    }
}
