package com.itmayiedu.controller;

import com.alibaba.fastjson.JSONObject;
import com.itmayiedu.dao.UserDao;
import com.itmayiedu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author evanYang
 * @version 1.0
 * @date 08/20/2019 17:03
 */
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/getUser")
    public List<User> index(){
        List<User> users = userDao.selectAll();
        System.out.println(JSONObject.toJSONString(users));
        return users;
    }

    @GetMapping("/getUser1")
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setUserName("evanddd");
        User user1 = userDao.selectOne(user);
        return user1;
    }
}
