package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author evanYang
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class AppConfigServer {
    //在git环境上创建配置文件名称规范
    public static void main(String[] args) {
        SpringApplication.run(AppConfigServer.class,args);
    }
}
