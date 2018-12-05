package com.example.peer1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chuankai
 * @since 2018/11/28
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello " + name + "，this is first messge cloud-one(服务提供者)";
    }


}
