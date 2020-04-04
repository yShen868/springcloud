package com.yshen.controller;

import com.yshen.service.PaymentFeignService;
import com.yshen.springcloud.model.CommonResult;
import com.yshen.springcloud.model.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @author 郑悦恺
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/3/20 16:03
 */

@RestController
@Slf4j
public class OrderController {

    @Resource
    private PaymentFeignService paymentFeignService;



    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentByID(@PathVariable("id") Long id){

        return paymentFeignService.getPaymentById(id);
    }



}
