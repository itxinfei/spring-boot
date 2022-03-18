package com.pangzhao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 747011882@qq.com
 * @Date 2022-3-18 9:35
 */
@Controller
@RequestMapping("demo")
public class DemoController {

    @Value("${va}")
    private String name;

    @RequestMapping()
    public String getString() {
        System.out.println("name");
        return name;
    }

    @RequestMapping("index")
    public String index() {
        return "首页";
    }
}
