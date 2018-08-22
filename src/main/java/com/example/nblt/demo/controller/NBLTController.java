package com.example.nblt.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nblt")
public class NBLTController {
    @RequestMapping("/addUserApplyInfo")
    @ResponseBody
    public Object addUserApplyInfo(){
        return "测试数据";
    }
}
