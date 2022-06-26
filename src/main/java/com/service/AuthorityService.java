package com.service;

import com.entity.Authority;

import java.util.List;

/**
 * @author GokouRuri
 */
public interface AuthorityService {

    public List<Authority> get(String account);

    public void update(String account, List<Authority> authorities);

    public void save(String account, List<Authority> authorities);
}
