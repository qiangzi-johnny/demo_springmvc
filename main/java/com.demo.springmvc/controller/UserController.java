package com.demo.springmvc.controller;

import com.demo.springmvc.entity.User;
import com.demo.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Param: [request, response]
 * @return: void
 * @Author: QiangZi
 * @Date: 2018/9/26 15:17
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //正常访问login页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(User user, Model model){
        //调用service方法
        user = userService.checkLogin(user.getUsername(), user.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            return "success";
        }
        return "fail";
    }

    //测试超链接跳转到另一个页面是否可以取到session值
    @RequestMapping("/anotherPage")
    public String hrefpage(){
        return "anotherpage";
    }

    //注销方法
    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        return "login";
    }

//    @RequestMapping("/regist")
//    public String regist(){
//        return "regist";
//    }

//    @RequestMapping("/doRegist")
//    public String doRegist(User user,Model model){
//        System.out.println(user.getUsername());
//        userServivce.Regist(user);
//        return "success";
//    }
}
