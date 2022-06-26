package com.service;

import com.entity.User;

import java.util.List;

public interface UserService {

    public void save(User user);

    public List<User> selectAllUser();

    public List<String> login(String account, String password);

    public User selectOne(String account);

    public void updateSelective(User user);
}
