package com.wyett.orderhystrix.clientapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/9 10:10
 * @description: TODO
 */

@FeignClient(value = "order-ms")
public interface OrderServiceApi {

    @RequestMapping("/hi")
    public String hi();
}
