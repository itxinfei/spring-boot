package com.pangzhao;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//jetcache启用缓存的主开关
@EnableCreateCacheAnnotation
//开启方法注解缓存
@EnableMethodCache(basePackages = "com.itheima")
public class Application20 {

    public static void main(String[] args) {
        SpringApplication.run(Application20.class, args);
    }

}
