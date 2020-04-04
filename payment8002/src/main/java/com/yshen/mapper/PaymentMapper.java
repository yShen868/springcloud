package com.yshen.mapper;

import com.yshen.springcloud.model.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 郑悦恺
 * @Classname PaymentMapper
 * @Description TODO
 * @Date 2020/3/20 15:47
 */

@Repository
public interface PaymentMapper {

    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);

}
