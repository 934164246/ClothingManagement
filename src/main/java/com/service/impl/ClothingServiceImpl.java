package com.service.impl;

import com.dao.ClothingMapper;
import com.entity.Clothing;
import com.service.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GokouRuri
 */

@Service("clothingService")
public class ClothingServiceImpl implements ClothingService {

    private ClothingMapper mapper;


    @Autowired
    public void setMapper(ClothingMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Clothing> getAll() {
        return mapper.selectAll();
    }

    @Override
    public Clothing selectById(int id) {
        return mapper.selectOneById(id);
    }

    @Override
    public List<Clothing> selectByTypeId(int typeId) {
        return mapper.selectByTypeId(typeId);
    }

    @Override
    public List<Clothing> selectByName(String name) {
        return mapper.selectByName(name);
    }

    @Override
    public void insert(Clothing clothing) {
        mapper.insert(clothing);
    }

    @Override
    public void update(Clothing clothing) {
        mapper.update(clothing);
    }
}
