package com.ahianzhang.springboot.hierarchy.sample.child1;

import com.ahianzhang.springboot.hierarchy.sample.root.RootBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@PropertySource("classpath:/child1.properties")
public class ChildContext1 {

    @Bean
    public ChildBean1 childBean(RootBean rootBean, @Value("${root.property}") String someProperty) {
        return new ChildBean1(rootBean, someProperty);
    }
}
