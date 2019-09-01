package com.mango.tong.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableDiscoveryClient和@EnableEurekaClient
//共同点：都是能够让注册中心能够发现，扫描到改服务。
//不同点：@EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient可以是其他注册中心。
//从Spring Cloud Edgware开始，@EnableDiscoveryClient或@EnableEurekaClient可省略。只需加上相关依赖，并进行相应配置，即可将微服务注册到服务发现组件上。
public class SpringcloudHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHelloApplication.class, args);
    }

}
