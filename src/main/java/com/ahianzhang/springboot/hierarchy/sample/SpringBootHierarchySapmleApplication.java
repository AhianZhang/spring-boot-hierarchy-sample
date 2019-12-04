package com.ahianzhang.springboot.hierarchy.sample;

import com.ahianzhang.springboot.hierarchy.sample.child1.ChildContext1;
import com.ahianzhang.springboot.hierarchy.sample.child2.ChildContext2;
import com.ahianzhang.springboot.hierarchy.sample.root.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


@Slf4j
public class SpringBootHierarchySapmleApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder appBuilder =
                new SpringApplicationBuilder()
                        .parent(RootContext.class)
                        .child(ChildContext1.class)
                        .sibling(ChildContext2.class);

        ConfigurableApplicationContext applicationContext = appBuilder.run();
        applicationContext.setId("child2");
        ((ConfigurableApplicationContext) applicationContext.getParent()).setId("root");

        for (String bdn : applicationContext.getBeanDefinitionNames()) {
            System.out.println("bdn = " + bdn);
        }
    }

}
