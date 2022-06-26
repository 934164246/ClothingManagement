package com.dao;

import com.entity.RecordDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 出入库详细信息映射
 * @author GokouRuri
 */
@Mapper
public interface RecordDetailMapper {

    /**
     * 查询对应订单的详细信息
     *
     * @param serialNumber 提供的序列号
     * @return 以数组形式返回查询结果
     */
    public RecordDetail selectAllBySerialNumber(String serialNumber);

    /**
     * 查询 服装id对应的出入库记录明细
     *
     * @param clothingId 服装id
     * @return 以数组形式返回
     */
    public List<RecordDetail> selectAllByClothingId(int clothingId);

    /**
     * 查询 服装类型id的出入库记录明细
     *
     * @param infoId 服装样式id
     * @return 以数组形式返回
     */
    public List<RecordDetail> selectAllByInfoId(int infoId);

    /**
     * 更新订单详细
     * @param serialNumber 提供的序列号
     * @param oldRecordDetail 旧的订单详细
     * @param newRecordDetail 新的订单详细
     */
    public void update(@Param("serialNumber") String serialNumber, @Param("old") RecordDetail oldRecordDetail, @Param("new") RecordDetail newRecordDetail);

    /**
     * 更新序列号
     *
     * @param oldSerialNumber 旧的序列号
     * @param newSerialNumber 新的序列号
     * @param recordDetail 记录明细
     */
    public void updateSerialNumber(@Param("oldSerialNumber") String oldSerialNumber, @Param("newSerialNumber") String newSerialNumber, @Param("recordDetail") RecordDetail recordDetail);

    /**
     * 更新 仓库id
     *
     * @param serialNumber 序列号
     * @param oldWarehouseId  旧的仓库号
     * @param recordDetail 记录细节
     */
    public void updateWarehouseId(@Param("serialNumber") String serialNumber, @Param("oldWarehouseId") int oldWarehouseId, @Param("recordDetail") RecordDetail recordDetail);

    /**
     * 更新服装id
     *
     * @param serialNumber 序列号
     * @param oldInfoId  服装类别id
     * @param recordDetail 记录细节
     */
    public void updateInfoId(@Param("serialNumber") String serialNumber, @Param("oldInfoId") int oldInfoId, @Param("recordDetail") RecordDetail recordDetail);

    /**
     * 更新服装数量
     *
     * @param count        新数量
     * @param recordDetail 记录细节
     */
    public void updateCount(@Param("count") long count, @Param("recordDetail") RecordDetail recordDetail);

    /**
     * 新增记录明细
     *
     * @param serialNumber 序列号
     * @param recordDetail 记录明细
     */
    public void insert(@Param("serialNumber") String serialNumber, @Param("recordDetail") RecordDetail recordDetail);
}