package com.demo.springmvc.service;

import com.demo.springmvc.entity.User;

/**
 * @Description:
 * @Param: [request, response]
 * @return: void
 * @Author: QiangZi
 * @Date: 2018/9/26 15:21
 */
public interface UserService {
    //检验用户登录
    User checkLogin(String username, String password);

//    void Regist(User user);
}
