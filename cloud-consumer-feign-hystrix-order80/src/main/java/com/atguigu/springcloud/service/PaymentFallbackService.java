package com.atguigu.springcloud.service;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "service----PaymentFallbackService fall back-paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Error(Integer id) {
        return "service----PaymentFallbackService fall back-paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}