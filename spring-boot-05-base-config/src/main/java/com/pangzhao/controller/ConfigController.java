package com.pangzhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 747011882@qq.com
 * @Date 2022-3-18 10:13
 */
@Controller
@RequestMapping("config")
public class ConfigController {

    @RequestMapping("demo")
    public void demo() {
        System.out.println("demo");
    }
}
