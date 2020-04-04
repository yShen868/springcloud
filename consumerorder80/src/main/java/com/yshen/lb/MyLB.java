package com.yshen.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 郑悦恺
 * @Classname MyLB
 * @Description TODO
 * @Date 2020/4/2 14:31
 */

@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println(next+"次数");
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        int index = getAndIncrement()%serviceInstances.size();
        return serviceInstances.get(index);

    }
}