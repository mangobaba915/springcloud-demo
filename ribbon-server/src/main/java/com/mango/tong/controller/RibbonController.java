package com.mango.tong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    public static final String HELLOSERVER_URL = "http://springcloud-hello";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test() {
        String result = restTemplate.getForEntity(HELLOSERVER_URL + "/hello/test", String.class).getBody();
        return result;
    }

}
