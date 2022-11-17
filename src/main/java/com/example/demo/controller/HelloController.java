package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Darling yu
 * @version 1.0
 * @date 2022/11/17 23:35
 */

@RestController
public class HelloController {

    @PostMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
