package com.springboot.mall.controller;

import com.springboot.mall.dao.UserMapper;
import com.springboot.mall.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/id")
    public User getUser(@RequestParam("id") Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        //user.setUserName("唐唐");
        System.out.println(user);
        return user;
    }
}
