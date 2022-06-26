package com.service;

import com.entity.Clothing;
import com.entity.ClothingInfo;

import java.util.List;

/**
 * @author GokouRuri
 */
public interface ClothingInfoService {

    public List<ClothingInfo> selectByClothId(int clothingId);

    public ClothingInfo selectOneById(int id);

    public int selectClothingIdByInfoId(int infoId);

    public void insert(int clothingId, List<ClothingInfo> clothingInfos);

    public void update(int clothingId, List<ClothingInfo> clothingInfos);
}
