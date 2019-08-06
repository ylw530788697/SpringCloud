package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/06 21:02
 */
@SpringBootApplication
public class AppSecurity {

    public static void main(String[] args) {
        SpringApplication.run(AppSecurity.class,args);
    //    Security两种模式 FromLogin表单认证提交 httpBasic 浏览器与服务器做认证授权
    }
}
