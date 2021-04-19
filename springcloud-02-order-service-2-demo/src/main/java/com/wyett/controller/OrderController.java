package com.wyett.controller;

import com.wyett.entry.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/7 18:34
 * @description: TODO
 */

@RestController("/order")
public class OrderController {


    @GetMapping("/hello")
    public String hello() {
        return "Order Service 2";
    }

    @GetMapping("/get")
    public String printOrder() {
        Order order = new Order();
        order.setOrderId(1L);
        order.setOrderStatus("未完成");
        return order.toString();
    }
}
