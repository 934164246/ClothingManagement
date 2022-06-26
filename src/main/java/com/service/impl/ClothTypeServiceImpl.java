package com.service.impl;

import com.dao.ClothTypeMapper;
import com.entity.ClothType;
import com.service.ClothTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GokouRuri
 */

@Service("clothTypeService")
public class ClothTypeServiceImpl implements ClothTypeService {

    private ClothTypeMapper mapper;

    @Autowired
    public void setMapper(ClothTypeMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String selectName(int id) {
        return mapper.selectNameById(id);
    }

    @Override
    public List<ClothType> getAll() {
        return mapper.selectAll();
    }

    @Override
    public int selectId(String name) {
        return mapper.selectIdByType(name);
    }

    @Override
    public void update(int id, String name) {
        mapper.update(id, name);
    }

    @Override
    public void insert(ClothType clothType) {
        mapper.insert(clothType.getName());
    }
}
