package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author v_liwenyang
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class AppConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigClient.class,args);
    }
}
