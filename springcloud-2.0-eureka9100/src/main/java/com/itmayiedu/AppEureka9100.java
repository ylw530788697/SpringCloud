package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author v_liwenyang
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka9100 {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka9100.class,args);
    }
}
