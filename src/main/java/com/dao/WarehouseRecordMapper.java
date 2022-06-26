package com.dao;

import com.entity.WarehouseRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 出入库记录映射
 * @author GokouRuri
 */
@Mapper
public interface WarehouseRecordMapper {

    /**
     * 查询所有出入库记录
     *
     * @return 以数组形式返回
     */
    public List<WarehouseRecord> selectAll();

    /**
     * 查询所有入库记录
     *
     * @return 以数组形式返回
     */
    public List<WarehouseRecord> selectAllOfInput();

    /**
     * 查询所有出库记录
     *
     * @return 以数组形式返回
     */
    public List<WarehouseRecord> selectAllOfOutput();

    /**
     * 根据serialNumber 查询一条对应的出入库信息
     *
     * @param serialNumber 提供的序列号
     * @return 返回对应的记录
     */
    public WarehouseRecord selectOneBySerialNumber(String serialNumber);

    /**
     * 通过操作人查询出入库记录
     *
     * @param account 操作人账号
     * @return 以数组形式返回
     */
    public List<WarehouseRecord> selectAllByAccount(String account);

    /**
     * 通过操作人查询入库记录
     *
     * @param account 操作人账号
     * @return 以数组形式返回
     */
    public List<WarehouseRecord> selectAllByAccountOfInput(String account);

    /**
     * 通过操作人查询出库记录
     *
     * @param account 操作人账号
     * @return 以数组形式返回
     */
    public List<WarehouseRecord> selectAllByAccountOfOutput(String account);

    /**
     * 查询在begin 到 end这段时间内的出入库记录
     *
     * @param begin 开始时间
     * @param end   结束时间
     * @return 以数组形式返回
     */
    public List<WarehouseRecord> selectAllByTime(@Param("begin") String begin, @Param("end") String end);

    /**
     * 查询在begin 到 end这段时间内的入库记录
     *
     * @param begin 开始时间
     * @param end   结束时间
     * @return 以数组形式返回
     */
    public List<WarehouseRecord> selectAllByTimeOfInput(@Param("begin") String begin, @Param("end") String end);

    /**
     * 查询在begin 到 end这段时间内的出入库记录
     *
     * @param begin 开始时间
     * @param end   结束时间
     * @return 以数组形式返回
     */
    public List<WarehouseRecord> selectAllByTimeOfOutput(@Param("begin") String begin, @Param("end") String end);

    /**
     * 新增一条出入库记录
     *
     * @param record 提供的记录信息
     */
    public void insert(WarehouseRecord record);

    /**
     * 更新除isDelete以外的出入库信息
     *
     * @param record 提供的需要修改的记录信息
     */
    public void update(WarehouseRecord record);

    /**
     * 改变订单 删除状态
     *
     * @param serialNumber 提供的序列号
     * @param isDelete     是否删除
     * todo 一个 语句中 进行更新对应的数据更新操作
     */
    public void updateIsDeleteBySerialNumber(@Param("serialNumber") String serialNumber, @Param("isDelete") Boolean isDelete);
}