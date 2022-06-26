package com.service.impl;


import com.dao.AuthorityMapper;
import com.entity.Authority;
import com.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GokouRuri
 */
@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {

    private AuthorityMapper mapper;

    @Autowired
    public void setMapper(AuthorityMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Authority> get(String account) {
        return mapper.selectByAccount(account);
    }

    @Override
    public void update(String account, List<Authority> authorities) {
        for(Authority authority : authorities) {
            mapper.update(account, authority);
        }
    }

    @Override
    public void save(String account, List<Authority> authorities) {
        for(Authority authority : authorities) {
            mapper.update(account, authority);
        }
    }
}
