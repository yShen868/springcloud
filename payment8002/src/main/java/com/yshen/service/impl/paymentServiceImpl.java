package com.yshen.service.impl;

import com.yshen.mapper.PaymentMapper;
import com.yshen.service.PaymentService;
import com.yshen.springcloud.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 郑悦恺
 * @Classname paymentServiceImpl
 * @Description TODO
 * @Date 2020/3/20 16:00
 */

@Service
public class paymentServiceImpl implements PaymentService {

    @Autowired
    PaymentMapper paymentMapper;


    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
