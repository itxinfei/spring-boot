package com.pangzhao.controller;

import com.pangzhao.config.MyAppConfig;
import com.pangzhao.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private Person person;

    @Autowired
    private MyAppConfig myAppConfig;

    /**
     * 入门Hello World
     *
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    /**
     * 获取application.yml配置文件中数据
     *
     * @return
     */
    @RequestMapping("/persion")
    @ResponseBody
    public Person getPersion() {
        return person;
    }

    /**
     * bean
     *
     * @return
     */
    @RequestMapping("/config")
    @ResponseBody
    public String getConfig() {
        return myAppConfig.helloService();
    }
}
