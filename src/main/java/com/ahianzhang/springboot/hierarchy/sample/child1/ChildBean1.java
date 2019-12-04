package com.ahianzhang.springboot.hierarchy.sample.child1;

import com.ahianzhang.springboot.hierarchy.sample.root.RootBean;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-28 18:52
 **/
@Slf4j
public class ChildBean1 {

    private final RootBean rootBean;

    public ChildBean1(RootBean rootBean, String fromRoot) {
        log.info("Creating Child Bean! {}", fromRoot);
        this.rootBean = rootBean;
    }


}
