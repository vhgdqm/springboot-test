package com.example.springbootexample02.dao;

import com.example.springbootexample02.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    /**
     * 根据用户名查找用户
     * @param userName 用户名
     * @return user对象
     */
    User findByUserName(String userName);
}
