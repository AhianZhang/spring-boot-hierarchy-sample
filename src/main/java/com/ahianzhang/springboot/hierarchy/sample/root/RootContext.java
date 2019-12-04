package com.ahianzhang.springboot.hierarchy.sample.root;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-28 18:54
 **/

@Configuration
@PropertySource(name = "rootPropertySource", value = "classpath:/root.properties")
public class RootContext {
    @Bean
    public RootBean rootBean() {
        return new RootBean();
    }
}
