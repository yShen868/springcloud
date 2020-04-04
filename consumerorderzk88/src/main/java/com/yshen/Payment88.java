package com.yshen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 郑悦恺
 * @Classname Payment88
 * @Description TODO
 * @Date 2020/3/22 15:32
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Payment88 {
    public static void main(String[] args) {
        SpringApplication.run(Payment88.class,args);
    }
}
