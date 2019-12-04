package com.ahianzhang.springboot.hierarchy.sample.child1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-29 10:14
 **/
@Configuration
public class ChildInterceptorConfig1 implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor1());
    }

    @Bean
    ChildInterceptor1 interceptor1() {
        return new ChildInterceptor1();
    }

}
