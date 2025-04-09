package com.cc.springbootredistest.controller;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "Hello World";
    }
}
