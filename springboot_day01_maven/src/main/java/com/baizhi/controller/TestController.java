package com.baizhi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "welcome to springboot";
    }
}
