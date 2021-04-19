package com.wyett;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/7 18:21
 * @description: TODO
 */

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudOrderService2App {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOrderService2App.class, args);
    }
}
