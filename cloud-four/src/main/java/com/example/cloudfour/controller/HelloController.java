package com.example.cloudfour.controller;

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
        return "hello " + name + "，this is first messge cloud-four 负载均衡";
    }


}
