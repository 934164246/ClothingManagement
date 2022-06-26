package com.service.impl;

import com.dao.WarehouseMapper;
import com.entity.Warehouse;
import com.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GokouRuri
 */

@Service("warehouseService")
public class WarehouseServiceImpl implements WarehouseService {

    private WarehouseMapper mapper;

    @Autowired
    public void setMapper(WarehouseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Warehouse> getAll() {
        return mapper.findAllWarehouseMapper();
    }

    @Override
    public String selectWarehouseName(int id) {
        return mapper.selectOneById(id);
    }

    @Override
    public void insert(Warehouse warehouse) {
        mapper.insert(warehouse);
    }

    @Override
    public void update(Warehouse warehouse) {
        mapper.update(warehouse);
    }
}
