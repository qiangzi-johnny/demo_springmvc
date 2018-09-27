package com.demo.springmvc.dao;


import com.demo.springmvc.entity.User;

/**
 * @Description:查找用户名和密码，完成登录功能
 * @Param: username，password
 * @return: void
 * @Author: QiangZi
 * @Date: 2018/9/26 9:25
 */
public interface UserDao {

    /**
     * 登录
     * @param username
     * @return User
     */
    User selectByUsername(String username);

    /**
     * 注册用户和密码
     */
//    void registerByUsernameAndPassword(@Param("username")String username,
//                                       @Param("password")String password);
}
