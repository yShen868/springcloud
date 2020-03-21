package com.yshen;

import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan({"com.yshen.mapper"})
@EnableEurekaClient
public class Payment8001 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001.class,args);
    }
}
