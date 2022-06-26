package com.dao;

import com.entity.ClothingInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 服装信息映射
 * @author GokouRuri
 */
@Mapper
public interface ClothingInfoMapper {

    /**
     * 根据服装id查询服装样式
     *
     * @param clothingId 服装id
     * @return 以数组形式返回
     */
    public List<ClothingInfo> selectByClothId(int clothingId);

    /**
     * 根据id查询一件服装样式
     *
     * @param id 服装样式id
     * @return 返回对应的服装样式
     */
    public ClothingInfo selectOneById(int id);

    /**
     * 根据服装款式id 查询服装id
     * @param infoId 服装款式id
     * @return 返回对应的服装id
     */
    public int selectClothingIdByInfoId(int infoId);

    /**
     * 新增服装样式
     *
     * @param clothingId   服装id
     * @param clothingInfo 服装样式
     */
    public void insert(@Param("clothingId") int clothingId, @Param("clothingInfo") ClothingInfo clothingInfo);

    /**
     * 更新服装信息（id 或者 clothing,color,size。二选一）
     *
     * @param clothingId   服装id
     * @param clothingInfo 服装样式信息
     */
    public void update(@Param("clothingId") int clothingId, @Param("clothingInfo") ClothingInfo clothingInfo);

    public void updateCountById(@Param("id") int id, @Param("count") int count);
}