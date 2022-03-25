package com.pangzhao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById() {
        System.out.println("springboot is running...");
        return "springboot is running...";
    }

    /**
     * @Author pangzhao
     * @Date 2022-3-25 20:57
     * @Description 返回的是字符串
     * http://localhost:8080/books/index
     **/
    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

}
