package com.itmayiedu.controller;

import com.itmayiedu.feign.MemberApiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 20:42
 */
@RestController
public class FeignController {
    @Autowired
    private MemberApiFeign memberApiFeign;

    @RequestMapping("/feignMember")
    public String feignMember(){
        return memberApiFeign.getMember();
    }
}
