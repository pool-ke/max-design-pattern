package com.kd.ke.structure.proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @ClassName: CglibProxyMain
 * @Description: TODO
 * @author: max
 * @date 2021/9/19下午3:01
 */
public class CglibProxyMain {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new CglibProxySubject());
        Subject subject = (Subject) enhancer.create();
        subject.visit();
    }
}
