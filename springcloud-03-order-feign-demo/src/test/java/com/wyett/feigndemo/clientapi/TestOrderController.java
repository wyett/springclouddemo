package com.wyett.feigndemo.clientapi;

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
    OrderServiceApi orderServiceApi;

    @RequestMapping("/hi")
    public String hi() {
        return orderServiceApi.hi();
    }
}
