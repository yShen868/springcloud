package com.yshen.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 郑悦恺
 * @Classname FengnConfig
 * @Description TODO
 * @Date 2020/4/3 11:19
 */

@Configuration
public class FengnConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return  Logger.Level.FULL;
    }

}
