package com.fsteam.fsmall.admin.dto;

import lombok.Data;

/**
 * @author huangziwen
 * @date 2021/2/9
 * @description 图片描述
 */
@Data
public class ItemImage {
    int imageId;
    String imageUrl;

    public ItemImage(int imageId, String imageUrl) {
        this.imageId = imageId;
        this.imageUrl = imageUrl;
    }
}
