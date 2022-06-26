package com.service;

import com.entity.ClothType;

import java.util.List;

public interface ClothTypeService {

    public String selectName(int id);

    public List<ClothType> getAll();

    public int selectId(String name);

    public void update(int id, String name);

    public void insert(ClothType clothType);
}
