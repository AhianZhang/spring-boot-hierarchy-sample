package com.ahianzhang.springboot.hierarchy.sample.child1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-29 10:08
 **/

@Slf4j
public class ChildInterceptor1 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("child one interceptor work!!");
        return true;
    }
}
