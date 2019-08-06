package com.itmayiedu.api.service;

import api.service.IOrderService;
import com.itmayiedu.api.entity.UserEntity;
import com.itmayiedu.base.ResponseBase;
import com.spring4all.swagger.EnableSwagger2Doc;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import com.itmayiedu.api.service.feign.MemberServiceFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 21:17
 */
@RestController
@EnableSwagger2Doc
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private MemberServiceFeigin memberServiceFeigin;

    @PostMapping("/orderToMember")
    @Override
    public String orderToMember(@RequestParam("name") String name) {
        UserEntity user = memberServiceFeigin.getMember(name);
        return user == null ? "没有找到用户信息" : user.toString();
    }

    @GetMapping("/")
    @Override
    @ApiOperation("订单服务")
    @ApiImplicitParam(name = "name" ,value = "用户信息参数" ,required = true ,dataType = "String" )
    public String order() {
        return "我是订单项目...";
    }

    @Override
    public ResponseBase orderToMemberUserInfo() {
        return null;
    }

    @Override
    public ResponseBase orderInfo() {
        return null;
    }
}
