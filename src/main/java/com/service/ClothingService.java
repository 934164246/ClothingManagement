package com.service;

import com.entity.Clothing;

import java.util.List;

/**
 * @author GokouRuri
 */
public interface ClothingService {

    public List<Clothing> getAll();

    public Clothing selectById(int id);

    public List<Clothing> selectByTypeId(int typeId);

    public List<Clothing> selectByName(String name);

    public void insert(Clothing clothing);

    public void update(Clothing clothing);
}
