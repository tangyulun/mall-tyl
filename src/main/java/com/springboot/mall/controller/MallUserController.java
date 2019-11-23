package com.springboot.mall.controller;

import com.springboot.mall.dao.MallUserMapper;
import com.springboot.mall.model.MallUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * MallUserController
 */
@Api(tags = "MallUserController", description = "测试")
@RequestMapping("/mall")
@RestController
public class MallUserController {
    @Autowired
    private MallUserMapper mallUserMapper;

    @ApiOperation("根据ID查询")
    @GetMapping("/id")
    public MallUser getUser(@RequestParam("id") BigDecimal id) {
        MallUser mallUser = mallUserMapper.selectByPrimaryKey(id);
        //user.setUserName("唐唐");
        System.out.println(mallUser);
        return mallUser;
    }
    @GetMapping("/doLogin")
    public String Login() {
        return "doLogin";
    }
    @GetMapping("/doRegister")
    public String register() {
        return "doRegister";
    }
}
