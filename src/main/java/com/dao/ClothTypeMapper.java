package com.dao;

import com.entity.ClothType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author GokouRuri
 */
@Mapper
public interface ClothTypeMapper {

    /**
     * 根据提供的id查找对应类型的名称
     * @param id id
     * @return 返回找到的
     */
    public String selectNameById(int id);

    /**
     * 查询所有的类型
     * @return 返回所有的类型
     */
    public List<ClothType> selectAll();

    /**
     * 通过type查询id
     * @param name type name
     * @return 返回type对应的id
     */
    public int selectIdByType(String name);

    /**
     * 更新类型名称
     * @param id 提供的id
     * @param name 提供的name
     */
    public void update(@Param("id") int id, @Param("name") String name);

    /**
     * 新增仓库
     * @param name 仓库名字
     */
    public void insert(String name);
}
