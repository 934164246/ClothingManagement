package com.dao;

import com.entity.Clothing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 服装映射
 * @author GokouRuris
 */
@Mapper
public interface ClothingMapper {

    /**
     * 查询所有服装信息
     * @return 返回list数组
     */
    public List<Clothing> selectAll();

    /**
     * 根据服装id查询一件衣服
     * @param id 需要查询的id
     * @return 返回id对应的服装信息
     */
    public Clothing selectOneById(int id);

    /**
     * 根据服装类型来查询服装信息
     * @param typeId 提供的服装类型id
     * @return 以list形式返回
     */
    public List<Clothing> selectByTypeId(int typeId);

    /**
     * 根据服装名字模糊查询
     * @param name 提供的关键字
     * @return 以数组形式返回
     */
    public List<Clothing> selectByName(String name);

    /**
     * 新增服装信息，typeName为无用参数
     * @param clothing 提供的服装信息
     */
    public void insert(Clothing clothing);

    /**
     * 更新服装对应的信息，id为必须
     * @param clothing 服装信息
     */
    public void update(Clothing clothing);
}
