package com.controller;

import com.service.ClothingInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author GokouRuri
 */
@RestController("clothingInfo")
@RequestMapping("/clothingInfo")
public class ClothingInfoController {

    @Resource(name = "clothingInfoService")
    private ClothingInfoService clothingInfoService;
}
