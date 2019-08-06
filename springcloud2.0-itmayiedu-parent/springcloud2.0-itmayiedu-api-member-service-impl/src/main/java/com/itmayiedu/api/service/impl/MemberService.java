package com.itmayiedu.api.service.impl;

import com.itmayiedu.api.entity.UserEntity;
import com.itmayiedu.api.service.IMemberService;
import com.spring4all.swagger.EnableSwagger2Doc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 21:17
 */
@RestController
@EnableSwagger2Doc
@Api("会员服务")
public class MemberService implements IMemberService {


    @Override
    @PostMapping("/name")
    @ApiOperation("获取会员相关信息")
    @ApiImplicitParam(name = "name" ,value = "用户信息参数" ,required = false ,dataType = "String" )
    public UserEntity getMember(String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge(22);
        return userEntity;
    }

    @GetMapping("/")
    @Override
    public String member() {
        return "我是会员项目...";
    }
}
