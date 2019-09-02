package com.mango.tong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ribbon是一个基于http和tcp的客户端负载均衡器，它可以在通过客户端中配置的ribbonServerList服务端列表去轮询访问以达到均衡负载的作用。
 * 当ribbon与eureka联合使用时，ribbon的服务实例清单ribbonServerList会被DiscoveryEnabledNIWSServerList重写，
 * 扩展成从eureka注册中心中获取服务端列表。同时它也会用NIWSDiscoveryPing来取代IPing，它将职责委托给eureka来确定服务端是否已经启动。
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonServerApplication.class, args);
    }

}
