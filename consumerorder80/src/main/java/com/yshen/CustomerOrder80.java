package com.yshen;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 郑悦恺
 * @Classname Payment8001
 * @Description TODO
 * @Date 2020/3/20 15:33
 */

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class CustomerOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(CustomerOrder80.class,args);
    }
}
