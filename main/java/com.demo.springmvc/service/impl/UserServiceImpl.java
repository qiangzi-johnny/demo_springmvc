package com.demo.springmvc.service.impl;

import com.demo.springmvc.dao.UserDao;
import com.demo.springmvc.entity.User;
import com.demo.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Param: [request, response]
 * @return: void
 * @Author: QiangZi
 * @Date: 2018/9/26 15:20
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 检验用户登录业务
     *
     */

    public User checkLogin(String username, String password) {
        User user = userDao.selectByUsername(username);
        if(user != null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

//    @Override
//    public void Regist(User user) {
//        userDao.registerByUsernameAndPassword(user.getUsername(),user.getPassword());
//    }


}
