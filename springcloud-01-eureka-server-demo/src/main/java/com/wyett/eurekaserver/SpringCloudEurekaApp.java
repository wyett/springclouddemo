package com.wyett.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/7 15:47
 * @description: TODO
 */

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApp.class, args);
    }
}
