package com.springhealth.account.controller;

import com.springhealth.account.bean.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author 王庆运
 * @Date: 2021/02/27/ 17:09
 * @Description
 */
@RestController
public class HellowController {

    @Autowired
    Cat cat;

    @RequestMapping("/hello")
    public String hellow(){
        return "hello Spring Boot2";
    }

    @RequestMapping("/cat")
    public Cat cat(){
        return cat;
    }
}
