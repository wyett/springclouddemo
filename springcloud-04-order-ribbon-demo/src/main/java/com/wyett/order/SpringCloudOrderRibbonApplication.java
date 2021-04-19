package com.wyett.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/9 11:54
 * @description: TODO
 */

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudOrderRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOrderRibbonApplication.class, args);
    }
}
