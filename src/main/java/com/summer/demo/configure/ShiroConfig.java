package com.summer.demo.configure;

import com.summer.demo.shiro.UserRealm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {

    @Bean
    public UserRealm userRealm() {
        return new UserRealm();
    }




}
