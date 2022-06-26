package com.service;

import com.entity.Warehouse;

import java.util.List;

/**
 * @author GokouRuri
 */
public interface WarehouseService {

    public List<Warehouse> getAll();

    public String selectWarehouseName(int id);

    public void insert(Warehouse warehouse);

    public void update(Warehouse warehouse);
}
