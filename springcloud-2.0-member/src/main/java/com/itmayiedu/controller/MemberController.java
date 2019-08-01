package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author v_liwenyang
 */
@RestController
public class MemberController {

    @Value("${server.port}")
    private String stringPort;

    @RequestMapping("/getMember")
    public String getMember(){
        return  "this is getMember"+stringPort;
    }
}
