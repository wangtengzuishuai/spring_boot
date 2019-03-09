package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController2 {
    @Value("${student[0].name}")
    private String name;

    @Value("${person.age}")
    private String age;

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2(){
        return "name:"+name+",age:"+age;
    }


}
