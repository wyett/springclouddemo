package com.wyett.orderms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/9 15:27
 * @description: 自动发现服务
 */

@EnableDiscoveryClient
@SpringBootApplication
public class OrderMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderMSApplication.class, args);
    }
}
