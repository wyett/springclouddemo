package com.wyett.orderms.controller;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import com.wyett.orderms.entry.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/7 18:34
 * @description: TODO
 */

@RestController("/order")
public class OrderController {

    @Bean
    public IRule createRule() {
        return new RoundRobinRule();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Order Service 1";
    }

    @GetMapping("/get")
    public String printOrder() {
        Order order = new Order();
        order.setOrderId(1L);
        order.setOrderStatus("未完成");
        return order.toString();
    }
}
