package com.wyett.feigndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/9 10:07
 * @description: TODO
 */

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudFeign3Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeign3Application.class, args);

    }
}
