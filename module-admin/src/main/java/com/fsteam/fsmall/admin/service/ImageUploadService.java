package com.fsteam.fsmall.admin.service;

import com.fsteam.fsmall.admin.dto.ItemImage;

/**
 * @author huangziwen
 * @date 2021/2/9
 * @description 用于图片的操作相关service
 */
public interface ImageUploadService {
    int createImage(int itemId,String url,int position);
    int retrieveImageId(int itemId, int position);
    int updateImageUrlByItemIdAndPosition(int itemId, int position, String url);
    int deleteImageByItemIdAndPosition(int itemId,int position);
    int getImageNums(int itemId);
}
