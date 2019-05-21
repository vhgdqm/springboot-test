package com.example.springbootexample02.component;

import com.example.springbootexample02.model.entity.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class AopConfig {
    @Before(value = "execution(* com.example.springbootexample02.controller.UserController.login(..))")
    public void beforeTest(JoinPoint point) {
        System.out.println("before login");
    }

    @After(value = "execution(* com.example.springbootexample02.controller.UserController.login(..))")
    public void afterTest(JoinPoint point) {
        User user = (User) point.getArgs()[0];
        System.out.println("--info--"+ LocalDateTime.now().toString() +"--用户--"+user.getUserName()+"--登录--");
        System.out.println("after login");
    }

}
