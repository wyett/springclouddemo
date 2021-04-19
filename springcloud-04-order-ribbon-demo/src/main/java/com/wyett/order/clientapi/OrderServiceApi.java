package com.wyett.order.clientapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/9 10:10
 * @description: TODO
 */

@FeignClient(value = "OrderService")
public interface OrderServiceApi {

    @RequestMapping("/hello")
    public String hi();
}
