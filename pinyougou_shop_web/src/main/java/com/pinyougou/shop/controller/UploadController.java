package com.pinyougou.shop.controller;


import com.pinyougou.entity.Result;
import com.pinyougou.util.FastDFSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传
 */
@RestController
public class UploadController {

    @Value("${IMAGE_SERVER_URL}")//spel
    private String IMAGE_SERVER_URL;

    @RequestMapping("/upload")
    public Result uploadFile(MultipartFile file){
        try {
            byte[] bytes = file.getBytes();//文件内容。
            String originalFilename = file.getOriginalFilename();//原文件的名称包括扩展名
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".")+1);
            FastDFSClient client = new FastDFSClient("classpath:config/fastdfs_client.conf");
            String uploadFilepath = client.uploadFile(bytes, extName);// group1/M00/00/04/wKgZhVsreouAACzBAAvqH_kipG8363.jpg
            //拼接URL
            String realpath = IMAGE_SERVER_URL+ uploadFilepath;

            return new Result(true,realpath);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"上传失败");
        }

    }

}
