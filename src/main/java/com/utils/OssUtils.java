package com.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.*;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.util.Properties;
import java.util.UUID;

/**
 * 图片存储云端工具
 * @author GokouRuri
 */
public class OssUtils {
    private static final String ENDPOINT;
    private static final String ACCESS_KEY_ID;
    private static final String ACCESS_KEY_SECRET;
    private static final String BUCKET_NAME;

    static {
        Properties properties=new Properties();
        try {
            properties.load(new FileReader("src/main/resources/oss.properties"));

            ENDPOINT=properties.getProperty("endpoint");
            ACCESS_KEY_ID=properties.getProperty("accessKeyId");
            ACCESS_KEY_SECRET=properties.getProperty("accessKeySecret");
            BUCKET_NAME=properties.getProperty("bucketName");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static OSS getOssClient() {
        OSS ossClient = new OSSClientBuilder().build(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);

        if (!ossClient.doesBucketExist(BUCKET_NAME)) {
            CreateBucketRequest createBucketRequest = new CreateBucketRequest(BUCKET_NAME);
            createBucketRequest.setStorageClass(StorageClass.Standard);
            createBucketRequest.setDataRedundancyType(DataRedundancyType.LRS);
            createBucketRequest.setCannedACL(CannedAccessControlList.Private);
            ossClient.createBucket(createBucketRequest);
        }
        return ossClient;
    }

    /**
     * 保存文件到oss，并且返回url
     * @param file 提供的文件
     * @return 返回文件链接
     * @throws IOException 排除inputStream导致的错误
     */
    public static String uploadFile(@NotNull MultipartFile file) throws IOException {
        OSS ossClient=getOssClient();

        InputStream inputStream=file.getInputStream();

        //获取32为随机数
        String uid= UUID.randomUUID().toString().replace("-", "");
        String datePath=new DateTime().toString("yyyy/MM/dd");

        //获取文件名 XXX.文件格式
        String originalFilename = file.getOriginalFilename();
        assert originalFilename != null;
        String[] format=originalFilename.split("\\.");

        //获取文件格式，最终格式为：img/yyyy/MM/dd/随机数.文件格式
        originalFilename="img/"+datePath+"/"+uid+"."+format[format.length-1];

        ossClient.putObject(BUCKET_NAME, originalFilename, inputStream);
        ossClient.shutdown();

        return "https://"+BUCKET_NAME+"."+ENDPOINT+"/"+originalFilename ;
    }

    //todo 添加修改文件属性

    public static void main(String[] args) throws IOException {
        File oldFile=new File("D:\\Saved Pictures\\无题_73207166.jpg");
        MultipartFile file=new MockMultipartFile(oldFile.getName(), oldFile.getName(), null,Files.newInputStream(oldFile.toPath()));
        System.out.println(uploadFile(file));
    }
}
