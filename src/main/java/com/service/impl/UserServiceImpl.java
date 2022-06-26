package com.service.impl;

import com.dao.AuthorityMapper;
import com.dao.UserMapper;
import com.entity.Authority;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * 用户服务类
 * @author GokouRuri
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;
    private AuthorityMapper authorityMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Autowired
    public void setAuthorityMapper(AuthorityMapper authorityMapper) {
        this.authorityMapper = authorityMapper;
    }

    @Override
    public void save(User user) {
        userMapper.save(user);

        for(Authority authority : user.getAuthority()) {
            authorityMapper.insert(user.getAccount(), authority);
        }
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectUserAll();
    }

    @Override
    public List<String> login(String account, String password) {
        List<String> authorities=new LinkedList<>();
        User user=userMapper.login(account, password);

        //判断是否由返回结果
        if( user != null) {
            for(Authority authority : user.getAuthority()) {
                authorities.add(authority.getType());
            }
        }

        return authorities;
    }

    @Override
    public User selectOne(String account) {

        return userMapper.selectOne(account);
    }

    @Override
    public void updateSelective(User user) {
        userMapper.updateSelective(user);
    }
}
