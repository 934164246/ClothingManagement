package com.service.impl;

import com.dao.ClothingInfoMapper;
import com.entity.ClothingInfo;
import com.service.ClothingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GokouRuri
 */

@Service("clothingInfoService")
public class ClothingInfoServiceImpl implements ClothingInfoService {

    private ClothingInfoMapper mapper;

    @Autowired
    public void setMapper(ClothingInfoMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<ClothingInfo> selectByClothId(int clothingId) {
        return mapper.selectByClothId(clothingId);
    }

    @Override
    public ClothingInfo selectOneById(int id) {
        return mapper.selectOneById(id);
    }

    @Override
    public int selectClothingIdByInfoId(int infoId) {
        return mapper.selectClothingIdByInfoId(infoId);
    }

    @Override
    public void insert(int clothingId, List<ClothingInfo> clothingInfos) {
        for(ClothingInfo clothingInfo : clothingInfos) {
            mapper.insert(clothingId, clothingInfo);
        }
    }

    @Override
    public void update(int clothingId, List<ClothingInfo> clothingInfos) {
        for(ClothingInfo clothingInfo : clothingInfos) {
            mapper.insert(clothingId, clothingInfo);
        }
    }
}
