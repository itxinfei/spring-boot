package com.pangzhao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author pangzhao
 * @Date 2022-3-25 21:53
 * @Description 1.
 * SpringBoot中4级配置文件
 * 1级： file ：config/application.yml
 * 【最高】
 * 2级： file ：application.yml
 * 3级：classpath：config/application.yml
 * 4级：classpath：application.yml
 * 【最低】
 * 2.
 * 作用：
 * 
 * 1级与2级留做系统打包后设置通用属性，1级常用于运维经理进行线上整体项目部署方案调控
 * 
 * 3级与4级用于系统开发阶段设置通用属性，3级常用于项目经理进行整体项目属性调控
 **/
@SpringBootApplication
public class Application09 {
    public static void main(String[] args) {
        SpringApplication.run(Application09.class, args);
    }
}
