package com.dao;

import com.entity.Authority;
import com.entity.Warehouse;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * WarehouseMapper
 * @author GokouRuri
 */
@Mapper
public interface WarehouseMapper {

    /**
     * 查询所有的仓库
     * @return 以list形式返回所有的仓库信息
     */
    public List<Warehouse> findAllWarehouseMapper();

    /**
     * 根据id查询仓库名字
     * @param id 仓库id
     * @return 返回对应id的名字
     */
    public String selectOneById(int id);

    /**
     * 新增仓库，可以不用提供id，新增的一个id储存在warehouse.id里面
     * @param warehouse 为需要插入的信息，其中id可以不用显示
     */
    /*@Insert("insert into warehouse (name, capacity) values (#{name}, #{capacity})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")*/
    public void insert(Warehouse warehouse);


    /**
     * 修改仓库的信息，名称或者容量
     * @param warehouse 仓库信息
     */
    public void update(Warehouse warehouse);
}
