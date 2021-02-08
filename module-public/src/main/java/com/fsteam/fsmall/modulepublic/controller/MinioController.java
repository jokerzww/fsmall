package com.fsteam.fsmall.modulepublic.controller;


import com.fsteam.fsmall.common.result.CommonResult;
import com.fsteam.fsmall.modulepublic.dto.MinioFileUpload;
import io.minio.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huangziwen
 * @date 2021/2/8
 * @description minio上传文件api
 */

@RestController
@RequestMapping("/Public")
public class MinioController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MinioController.class);
    @Value("${minio.endpoint}")
    private String ENDPOINT;
    @Value("${minio.bucketName}")
    private String BUCKET_NAME;
    @Value("${minio.accessKey}")
    private String ACCESS_KEY;
    @Value("${minio.secretKey}")
    private String SECRET_KEY;

    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult uploadImage(@RequestParam("file") MultipartFile file){
        try {
            //创建一个MinIO的Java客户端
            MinioClient minioClient = MinioClient
                    .builder()
                    .credentials(ACCESS_KEY,SECRET_KEY)
                    .endpoint(ENDPOINT)
                    .build();
            if (minioClient.bucketExists(BucketExistsArgs
                    .builder()
                    .bucket(BUCKET_NAME)
                    .build())) {
                LOGGER.info("存储桶已经存在！");
            } else {
                //创建存储桶并设置只读权限
                minioClient.makeBucket(
                        MakeBucketArgs.builder()
                        .bucket(BUCKET_NAME)
                        .build());
            }
            String filename = file.getOriginalFilename();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            // 设置存储对象名称
            String objectName = sdf.format(new Date()) + "/" + filename;
            // 使用putObject上传一个文件到存储桶中
            minioClient.putObject(PutObjectArgs.builder()
                    .contentType(file.getContentType())
                    .object(objectName)
                    .bucket(BUCKET_NAME)
                    .stream(file.getInputStream(),file.getSize(),PutObjectArgs.MIN_MULTIPART_SIZE)
                    .build());
            LOGGER.info("文件上传成功!");
            MinioFileUpload minioFileUpload = new MinioFileUpload();
            minioFileUpload.setName(filename);
            minioFileUpload.setUrl(ENDPOINT + "/" + BUCKET_NAME + "/" + objectName);
            return CommonResult.success(minioFileUpload);
        } catch (Exception e) {
            LOGGER.info("上传发生错误: {}！", e.getMessage());
        }
        return CommonResult.failed();
    }


}
