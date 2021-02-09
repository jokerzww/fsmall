package com.fsteam.fsmall.admin.service.impl;

import com.fsteam.fsmall.admin.controller.ImageUploadController;
import com.fsteam.fsmall.admin.service.ImageUploadService;
import com.fsteam.fsmall.mapper.PictureDynamicSqlSupport;
import com.fsteam.fsmall.mapper.PictureMapper;
import com.fsteam.fsmall.model.Picture;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.dynamic.sql.SqlTable;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * @author huangziwen
 * @date 2021/2/9
 * @description desc
 */
@Service
public class ImageUploadServiceImpl implements ImageUploadService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImageUploadServiceImpl.class);
    final
    PictureMapper pictureMapper;

    public ImageUploadServiceImpl(PictureMapper pictureMapper) {
        this.pictureMapper = pictureMapper;
    }

    @Bean
    Picture getPictureModel(){
        return new Picture();
    }

    @Override
    public int createImage(int itemId,String url,int position) {
        if (position<1 || position >9){
            LOGGER.info("创建不正确位置得图片：itemID"+itemId+" 位置："+position);
            return -1;
        }
        Picture picture = new Picture();
        picture.setItemId(itemId);
        picture.setUrl(url);
        picture.setPosition(position);
        return pictureMapper.insert(picture);
    }

    @Override
    public int retrieveImageId(int itemId, int position) {
        SelectStatementProvider selectStatement = select(PictureDynamicSqlSupport.id).from(PictureDynamicSqlSupport.picture)
                .where(PictureDynamicSqlSupport.itemId, isEqualTo(itemId))
                .and(PictureDynamicSqlSupport.position, isEqualTo(position))
                .build()
                .render(RenderingStrategies.MYBATIS3);

        Optional<Picture> picture = pictureMapper.selectOne(selectStatement);
        if (picture.isPresent()){
            return picture.get().getId();
        }else {
            return -1;
        }
    }

    @Override
    public int updateImageUrlByItemIdAndPosition(int itemId, int position, String url) {
        return pictureMapper.update(c ->c.set(PictureDynamicSqlSupport.url).equalTo(url)
                        .where(PictureDynamicSqlSupport.itemId, isEqualTo(itemId))
                        .and(PictureDynamicSqlSupport.position,isEqualTo(position)));
    }

    @Override
    public int deleteImageByItemIdAndPosition(int itemId, int position) {
        return pictureMapper.delete( c -> c.where(PictureDynamicSqlSupport.itemId, isEqualTo(itemId))
                .and(PictureDynamicSqlSupport.position,isEqualTo(position)));
    }

    @Override
    public int getImageNums(int itemId) {
        return (int) pictureMapper.count(c -> c.where(PictureDynamicSqlSupport.itemId, isEqualTo(itemId)));
    }


}
