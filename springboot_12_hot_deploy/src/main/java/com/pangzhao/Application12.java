package com.pangzhao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author pangzhao
 * @Date 2022-3-25 22:07
 * @Description 热部署
 **/
@SpringBootApplication
public class Application12 {
    public static void main(String[] args) {
        //设置高优先级属性禁用热部署
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(Application12.class);
    }
}
