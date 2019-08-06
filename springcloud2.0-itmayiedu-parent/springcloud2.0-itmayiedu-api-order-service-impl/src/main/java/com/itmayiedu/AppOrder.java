package com.itmayiedu;

import com.spring4all.swagger.EnableSwagger2Doc;
import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 21:42
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableSwagger2Doc
@Api("订单服务接口")
public class AppOrder {

    public static void main(String[] args) {
        SpringApplication.run(AppOrder.class,args);
    }
}
