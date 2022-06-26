package com.service;

import com.entity.Warehouse;
import com.entity.WarehouseRecord;

import java.util.List;

/**
 * @author GokouRuri
 */
public interface WarehouseRecordService {

    public List<WarehouseRecord> getAll(String type);

    public WarehouseRecord findBySerialNumber(String serialNumber);

    public List<WarehouseRecord> findByUser(String type, String account);

    public void insert(WarehouseRecord warehouseRecord);

    public void update(WarehouseRecord warehouseRecord);

    public void updateIsDelete(String serialNumber, Boolean isDelete);
}
