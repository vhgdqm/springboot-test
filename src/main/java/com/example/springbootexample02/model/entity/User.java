package com.example.springbootexample02.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "F_ID")
    private Integer id;
    /**
     * 用户名
     */
    @Column(name = "F_USER_NAME")
    private String userName;
    /**
     * 登录密码
     */
    @Column(name = "F_PASSWORD")
    private String password;
    /**
     * 手机号
     */
    @Column(name = "F_PHONE")
    private String phone;
    /**
     * 真实姓名
     */
    @Column(name = "F_TRUE_NAME")
    private String trueName;
}
