package com.example.springbootexample02.controller;

import com.example.springbootexample02.dao.UserDao;
import com.example.springbootexample02.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user, Map<String,Object> map, HttpSession session) {
        User dbUser = userDao.findByUserName(user.getUserName());
        if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {
            session.setAttribute("loginUser",dbUser);
            return "redirect:index";
        }
        map.put("msg", "用户名密码错误");
        return "login";
    }
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }


}
