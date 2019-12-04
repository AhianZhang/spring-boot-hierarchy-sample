package com.ahianzhang.springboot.hierarchy.sample.child2;

import com.ahianzhang.springboot.hierarchy.sample.root.RootBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-28 18:56
 **/
@SpringBootApplication
@PropertySource("classpath:/child2.properties")
public class ChildContext2 {

    @Bean
    public ChildBean2 childBean(RootBean rootBean, @Value("${root.property}") String someProperty) {
        return new ChildBean2(rootBean, someProperty);
    }
}
