package com.itmayiedu.api.service;

import com.itmayiedu.api.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 21:07
 */
public interface IMemberService {
    @RequestMapping("/getMember")
    public UserEntity getMember(String name);
}
