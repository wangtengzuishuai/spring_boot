package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController2 {
    @Value("${name}")
    private String name;


    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2(){
        return  name;
    }
}
