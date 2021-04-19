package com.wyett.orderhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wyett.orderhystrix.clientapi.OrderServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/9 10:17
 * @description: TODO
 */

@RestController
public class TestOrderController {

    @Autowired
    private OrderServiceApi orderServiceApi;

    @HystrixCommand(fallbackMethod = "fallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMillseconds", value = "2000")})
    @RequestMapping("/hi")
    public String hi() {
        return orderServiceApi.hi();
    }

    public String fallbackMethod() {
        return "fallback 熔断降级";
    }
}
