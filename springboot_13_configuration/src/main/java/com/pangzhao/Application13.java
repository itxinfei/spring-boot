package com.pangzhao;

import com.alibaba.druid.pool.DruidDataSource;
import config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ServerConfig.class)
public class Application13 {
    /**
     * @Author pangzhao
     * @Date 2022-3-25 22:10
     * @Description 使用@ConfigurationProperties为第三方bean绑定属性
     **/
    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DruidDataSource datasource() {
        DruidDataSource ds = new DruidDataSource();
        // ds.setDriverClassName("com.mysql.jdbc.Driver123");
        return ds;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application13.class, args);
        ServerConfig bean = ctx.getBean(ServerConfig.class);
        System.out.println("服务器配置：" + bean);
        DruidDataSource ds = ctx.getBean(DruidDataSource.class);
        System.out.println(ds.getDriverClassName());
    }

}
