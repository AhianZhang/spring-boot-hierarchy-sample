package com.ahianzhang.springboot.hierarchy.sample.root;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-28 18:50
 **/
@Slf4j
public class RootBean {
    RootBean() {
        log.info("create root bean");
    }
}
