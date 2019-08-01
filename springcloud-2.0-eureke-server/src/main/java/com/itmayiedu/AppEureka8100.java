package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author v_liwenyang
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka8100 {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka8100.class,args);
    }
}
