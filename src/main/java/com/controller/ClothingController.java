package com.controller;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.internal.OSSUtils;
import com.entity.Clothing;
import com.service.ClothingService;
import com.utils.OssUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 服装控制层
 * @author GokouRuri
 */
@RestController("clothing")
@RequestMapping("/cloth")
public class ClothingController {

    @Resource(name = "clothingService")
    private ClothingService clothingService;

    @PostMapping("/uploadFile")
    public String uploadFile(MultipartFile multipartFile) throws IOException {
        return OssUtils.uploadFile(multipartFile);
    }

    @PostMapping("/save")
    public void save(@RequestBody Clothing clothing) {
        clothingService.insert(clothing);
        System.out.println(clothing);
    }

    @PostMapping("/update")
    public void update(@RequestBody Clothing clothing) {
        clothingService.update(clothing);
        System.out.println(clothing);
    }

    @GetMapping("/getAll")
    public List<Clothing> selectAll(){
        return clothingService.getAll();
    }
}
