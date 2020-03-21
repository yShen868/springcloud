package com.yshen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 郑悦恺
 * @Classname Payment8001
 * @Description TODO
 * @Date 2020/3/20 15:33
 */

@SpringBootApplication
@EnableEurekaClient
public class CustomerOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(CustomerOrder80.class,args);
    }
}
