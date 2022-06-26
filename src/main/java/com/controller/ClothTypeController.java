package com.controller;

import com.entity.ClothType;
import com.service.ClothTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GokouRuri
 */

@RestController("clothType")
@RequestMapping("/clothType")
public class ClothTypeController {

    @Resource(name = "clothTypeService")
    private ClothTypeService clothTypeService;

    @GetMapping("/getAll")
    public List<ClothType> selectAll() {
        return clothTypeService.getAll();
    }

    @PostMapping("/insert")
    public void insert(@RequestBody ClothType clothType) {
        clothTypeService.insert(clothType);
        System.out.println(clothType);
    }

    @PostMapping("/update")
    public void update(@RequestBody ClothType clothType) {
        clothTypeService.update(clothType.getId(), clothType.getName());
        System.out.println(clothType);
    }
}
