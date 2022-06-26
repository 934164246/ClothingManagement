package com.dao;

import com.entity.Authority;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 权限映射
 * @author GokouRuri
 */
@Mapper
public interface AuthorityMapper {

    /**
     * 根据传递的账号查询权限
     *
     * @param account 目标用户账号
     * @return 返回权限数组
     */
    public List<Authority> selectByAccount(String account);

    /**
     * 更新用户的权限表
     *
     * @param account   用户提供的账号
     * @param authority 提供用户权限表的基本信息
     */
    public void update(@Param("account") String account, @Param("authority") Authority authority);

    /**
     * 新增用户权限信息
     * @param account 用户账号
     * @param authority 用户权限
     */
    public void insert(@Param("account") String account, @Param("authority") Authority authority);

    /**
     * 查询用户对应的权限
     *
     * @param account 账号名称
     * @param type    权限类型
     * @return 返回此用户的type类型权限
     */
    public Authority selectOne(@Param("account") String account, @Param("type") String type);

    /**
     * 根据提供的账号和类型删除用户的权限
     *
     * @param account 账号
     * @param type    类型
     * @return 返回影响的行数
     */
    public int delete(@Param("account") String account, @Param("type") String type);
}