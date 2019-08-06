package com.itmayiedu.config;

import org.springframework.boot.autoconfigure.security.servlet.SpringBootWebSecurityConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Component;
import sun.plugin2.message.GetAuthenticationMessage;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/06 21:08
 */
//security配置
@Component
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 添加admin账号
        auth.inMemoryAuthentication().withUser("admin").password("123456").
                authorities("showOrder","addOrder","updateOrder","deleteOrder");
        // 添加userAdd账号
        auth.inMemoryAuthentication().withUser("userAdd").password("123456").authorities("showOrder","addOrder");
        // 如果想实现动态账号与数据库关联 在该地方改为查询数据库
    }
    // 配置HttpSecurity 拦截资源
    protected void configure(HttpSecurity http) throws Exception {
        // 如何权限控制 给每一个请求路径 分配一个权限名称 让后账号只要关联该名称，就可以有访问权限
        http.authorizeRequests()
                // 配置查询订单权限
                .antMatchers("/showOrder").hasAnyAuthority("showOrder")
                .antMatchers("/addOrder").hasAnyAuthority("addOrder")
                .antMatchers("/login").permitAll()
                .antMatchers("/updateOrder").hasAnyAuthority("updateOrder")
                .antMatchers("/deleteOrder").hasAnyAuthority("deleteOrder")
                .antMatchers("/**").fullyAuthenticated().and().formLogin().loginPage("/login")
                .and().csrf().disable();
    }
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

}
