package com.itmayiedu.api.service.impl;

import com.itmayiedu.api.entity.UserEntity;
import com.itmayiedu.api.service.IMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 21:17
 */
@RestController
public class MemberService implements IMemberService {


    @Override
    @RequestMapping
    public UserEntity getMember(String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge(22);
        return userEntity;
    }
}
