package com.demo.springmvc.controller;

import com.demo.springmvc.common.ServerConfig;
import com.demo.springmvc.entity.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestController
 *
 * @author WuYuxiang
 * @date 2018/5/18
 */
@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    ServerConfig serverConfig;

    private UserVO userVO;

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("index")
    public String index() {
        userVO = new UserVO();
        userVO.setIdentityCode("123456789");
        return "login";
    }


}

