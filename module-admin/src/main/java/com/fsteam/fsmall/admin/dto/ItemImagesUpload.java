package com.fsteam.fsmall.admin.dto;

import lombok.Data;

import java.util.List;

/**
 * @author huangziwen
 * @date 2021/2/9
 * @description 上传mall item 图片的dto
 */
@Data
public class ItemImagesUpload {
    int itemId;
    List<String> imageUrlList;
}
