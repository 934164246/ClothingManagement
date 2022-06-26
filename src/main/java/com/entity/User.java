package com.entity;

import java.util.List;

/**
 * 对于用户类进行定义处理，并且增加权限类为内部代码
 * @author GokouRuri
 */
public class User {

    private String account;
    private String username;
    private String email;
    private String password;
    private List<Authority> authority;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authority> getAuthority() {
        return authority;
    }

    public void setAuthority(List<Authority> authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", authority=" + authority +
                '}';
    }
}
