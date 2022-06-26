package com.controller;

import com.service.AuthorityService;
import com.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author GokouRuri
 */
@RestController("authority")
@RequestMapping("/authority")
public class AuthorityController {

    @Resource(name = "authorityService")
    private AuthorityService authorityService;
}
