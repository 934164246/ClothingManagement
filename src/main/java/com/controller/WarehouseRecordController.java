package com.controller;

import com.entity.WarehouseRecord;
import com.service.ClothingService;
import com.service.WarehouseRecordService;
import com.utils.SerialNumberUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GokouRuri
 */
@RestController("warehouseRecord")
@RequestMapping("/warehouseRecord")
public class WarehouseRecordController {

    @Resource(name = "warehouseRecordService")
    private WarehouseRecordService warehouseRecordService;

    @GetMapping("/getAll")
    public List<WarehouseRecord> selectAll(String type) {
        return warehouseRecordService.getAll(type);
    }

    @PostMapping("/save")
    public void save(@RequestParam String type, @RequestBody WarehouseRecord warehouseRecord) {
        warehouseRecord.setSerialNumber(SerialNumberUtils.createSerialNumber(type.charAt(0)));
        warehouseRecordService.insert(warehouseRecord);
    }

    @PostMapping("/update")
    public void update(@RequestBody WarehouseRecord warehouseRecord) {
        warehouseRecordService.update(warehouseRecord);
    }
}
