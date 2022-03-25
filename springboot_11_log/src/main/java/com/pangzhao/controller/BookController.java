package com.pangzhao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    /**
     * @Author pangzhao
     * @Date 2022-3-25 22:06
     * @Description 日志级别
     * 
     * TRACE：运行堆栈信息，使用率低
     * 
     * DEBUG：程序员调试代码使用
     * 
     * INFO：记录运维过程数据
     * 
     * WARN：记录运维过程报警数据
     * 
     * ERROR：记录错误堆栈信息
     * 
     * FATAL：灾难信息，合并计入ERROR
     **/
    @GetMapping
    public String getById() {
        System.out.println("springboot is running...2");

        log.debug("这里是debug...");
        log.info("这里是info...");
        log.warn("这里是warn...");
        log.error("这里是error...");

        return "springboot is running...2";
    }

}
