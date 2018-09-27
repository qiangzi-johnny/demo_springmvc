package com.demo.springmvc.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * ServerConfig
 *
 * @author WuYuxiang
 * @date 2015/10/12
 */
@Configuration
@PropertySource("classpath:config.properties")
public class ServerConfig {

    //微信验证token
    @Value("${server.demo.text}")
    public String text;

}
