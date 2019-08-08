package com.itmayiedu.security;

import com.itmayiedu.entity.Permission;
import com.itmayiedu.entity.User;
import com.itmayiedu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author v_liwenyang
 */
@Component
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //1根据数据库查询，用户是否登陆
        User user = userMapper.findByUsername(userName);
        System.out.println(user.toString());
        //2查询该 用户权限
        if (user!=null) {
            ArrayList<GrantedAuthority> authorities = new ArrayList<>();
            List<Permission> list = userMapper.findPermissionByUsername(userName);
            System.out.println("用户信息权限:" + user.getUsername() + ",权限:" + list.toString());
            list.forEach(permission -> {
                authorities.add(new SimpleGrantedAuthority(permission.getPermTag()));
            });
            user.setAuthorities(authorities);
        }
        return user;
    }
}
