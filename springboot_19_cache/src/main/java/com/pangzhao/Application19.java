package com.pangzhao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//开启缓存功能
@EnableCaching
public class Application19 {

    public static void main(String[] args) {
        SpringApplication.run(Application19.class, args);
    }

}
