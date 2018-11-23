package com.baizhi.springboot.controller;

import com.baizhi.springboot.entity.User;
import com.baizhi.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping()
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("queryAll")
    public String queryAll(Map map){
        List<User> userList = userService.queryAll();
        map.put("userList",userList);
        return "index";
    }




}
