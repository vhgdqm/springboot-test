package com.example.springbootexample02.utils;

import org.springframework.util.StringUtils;

/**
 * String 工具类
 */
public class StrUtils {
    public static final Integer PHONE_NUMBER_COUNT = 11;
    /**
     * 判断一个字符串是否是手机号
     * @param str 手机号
     * @return Boolean
     */
    public static Boolean isPhoneNumber(String str){
        //11位数字
        if(!StringUtils.isEmpty(str) && str.length()==PHONE_NUMBER_COUNT){
            return true;
        }
        return false;
    }


}
