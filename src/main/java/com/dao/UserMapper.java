package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户映射
 * @author GokouRuri
 */
@Mapper
public interface UserMapper {

    /**
     * 查询全部的user，包括权限
     *
     * @return 以list形式范围查找到合适的值
     */
    public List<User> findAll();

    /**
     * 只返回用户信息，不返回用户对应的权限
     * @return 以list的形式返回
     */
    public List<User> selectUserAll();

    /**
     * 存储user
     *
     * @param user 需要存储的值
     */
    public void save(User user);

    /**
     * 判断用户是否登录
     *
     * @param account  登录账号
     * @param password 密码
     * @return 返回是否登录成功
     */
    public User login(@Param("account") String account, @Param("password") String password);

    /**
     * 根据账号查询用户的所有信息，包括权限
     *
     * @param account 查询的账号
     * @return 返回用户的全部信息
     */
    public User selectOne(String account);

    /**
     * 选择性更新用户信息，不需要修改的属性直接设置为空
     *
     * @param user 需要修改的信息
     */
    public void updateSelective(User user);
}
