package com.xuleyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 开启Eureka服务 (仅限注册中心是eureka)
//@EnableDiscoveryClient // 注册中心可以是任意的类型
public class EurekaServer8000 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8000.class, args);
    }

}
