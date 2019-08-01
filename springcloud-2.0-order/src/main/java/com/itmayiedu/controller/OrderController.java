package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author v_liwenyang
 */
@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getOrder")
    public String getOrder(){
        String memberUrl="http://app-itmayiedu-member/getMember";
        String result=restTemplate.getForObject(memberUrl,String.class);
        System.out.println("会员服务调用订单服务,result:" + result);
        return result;
    }
}
