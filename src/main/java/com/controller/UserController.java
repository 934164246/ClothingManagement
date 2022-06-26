package com.controller;


import com.alibaba.fastjson.JSON;
import com.entity.User;
import com.service.AuthorityService;
import com.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户控制类
 * @author GokouRuri
 */

//@CrossOrigin(origins = "http://localhost:8081/")
@RestController("user")
@RequestMapping(value = {"/user"}, produces="application/json;charset=utf-8")
public class UserController {

    @Resource(name="userService")
    private UserService userService;

    @PostMapping(value={"/save"})
    public void save(@RequestBody User user) {
        System.out.println(user);
    }

    @GetMapping(value = {"/login"})
    public List<String> login(String account, String password) {
        System.out.println(account + " " + password);
        return  userService.login(account, password);
    }

    @GetMapping("/getAll")
    public List<User> selectAll() {
        return userService.selectAllUser();
    }

    @PostMapping(value = {"/update"})
    public void update(@RequestParam String account, @RequestBody User user) {
        //todo 用户更新自己的基本信息 和 用户更新别人的基本信息

        System.out.println(account + " " + user);
    }
}
