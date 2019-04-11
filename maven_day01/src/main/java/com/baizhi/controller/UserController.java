package com.baizhi.controller;


import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("selectAll")
    public String selectAll(Map map) {
        map.put("users", userService.selectAll());
        return "index";
    }
}
