package com.controller;

import com.bean.User;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author HUI
 * @create 2020-10-26 15:10
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "login.html",method = RequestMethod.POST)
    public String login(User user){
        System.out.println("执行登录");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        User u = userDao.login(user);
        if(u==null){
            return "index";
        }else {
            return "success";
        }
    }



}
