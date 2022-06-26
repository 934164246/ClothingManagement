package com.controller;

import com.entity.Authority;
import com.entity.Warehouse;
import com.service.WarehouseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GokouRuri
 */

@RestController("warehouse")
@RequestMapping("/warehouse")
public class WarehouseController {

    @Resource(name = "warehouseService")
    private WarehouseService warehouseService;

    @GetMapping("/getAll")
    public List<Warehouse> selectAll(){
        return warehouseService.getAll();
    }

    @PostMapping("/insert")
    public void insert(@RequestBody Warehouse warehouse){
        warehouseService.insert(warehouse);
        System.out.println(warehouse);
    }

    @PostMapping("/update")
    public void update(@RequestBody Warehouse warehouse){
        warehouseService.update(warehouse);
        System.out.println(warehouse);
    }
}
