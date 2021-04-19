package com.wyett.orderhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : wyettLei
 * @date : Created in 2021/4/9 14:25
 * @description:
 * 1. 熔断器框架
 * 2. 通过控制哪些访问远程系统，服务和第三方库的节点
 * 3. 从而对延迟和故障提供更强大的容错能力
 * 4. Fallback，灾备操作，出错以后返回的值
 * 5. Hystrix通过线程池实现资源隔离
 * 6. Hystrix的信号模式(Semapheres)隔离资源
 * 7. Hystrix支持dashboard控制面板监控信息
 * 8. Feign与Hystrixjiehe使用
 * 9. 不维护了, Hoxton版本之后需要特殊处理
 * 10. 防止服务器过载与系统雪崩
 */

@EnableHystrix
@EnableHystrixDashboard
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringCloudHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixApplication.class, args);
    }
}
