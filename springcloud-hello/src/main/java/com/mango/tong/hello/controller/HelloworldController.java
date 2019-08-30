package com.mango.tong.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tong
 * @date 2019/8/30
 * @desc
 */
@RestController
@RequestMapping("/hello")
public class HelloworldController {

    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }

}
