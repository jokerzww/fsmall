package com.fsteam.fsmall.admin.controller;

import com.fsteam.fsmall.admin.dto.ItemImage;
import com.fsteam.fsmall.admin.dto.ItemImagesUpload;
import com.fsteam.fsmall.admin.service.ImageUploadService;
import com.fsteam.fsmall.common.result.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangziwen
 * @date 2021/2/9
 * @description 图片上传的controller
 */
@RestController
@RequestMapping("/admin/upload-mall-image")
public class ImageUploadController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImageUploadController.class);
    final
    ImageUploadService imageUploadService;

    static int IMAGE_MAX_NUM = 9;
    public ImageUploadController(ImageUploadService imageUploadService) {
        this.imageUploadService = imageUploadService;
    }


    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @Transactional
    public CommonResult imageUpload(@RequestBody ItemImagesUpload itemImagesUpload){
        List<ItemImage> list =new ArrayList<>();
        int imagesNums = imageUploadService.getImageNums(itemImagesUpload.getItemId());

        List<String> urlList = itemImagesUpload.getImageUrlList();
        for (int i = 1; i <= Math.min(urlList.size(), IMAGE_MAX_NUM); i++) {
            if (i <= imagesNums){
                //已经存在的需要更新
                imageUploadService.updateImageUrlByItemIdAndPosition(itemImagesUpload.getItemId(), i,urlList.get(i-1));
            }else{
                //不存在直接添加
                imageUploadService.createImage(itemImagesUpload.getItemId(), urlList.get(i-1),i);
            }
            int imageId = imageUploadService.retrieveImageId(itemImagesUpload.getItemId(), i);
            list.add(new ItemImage(imageId,itemImagesUpload.getImageUrlList().get(i-1)));
        }
        if(imagesNums > urlList.size()){
            LOGGER.info("图片数量减少，准备删除多余的图片,itemId:"+itemImagesUpload.getItemId());
            for (int i = urlList.size()+1; i <= imagesNums; i++) {
                imageUploadService.deleteImageByItemIdAndPosition(itemImagesUpload.getItemId(),i);
            }
            LOGGER.info("图片数量减少，删除多余的图片完毕,itemId:"+itemImagesUpload.getItemId());
        }
        return CommonResult.success(list,"成功上传图片"+itemImagesUpload.getImageUrlList().size()+"张");
    }

}
