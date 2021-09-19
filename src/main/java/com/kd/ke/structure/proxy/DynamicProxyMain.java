package com.kd.ke.structure.proxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName: DynamicProxyMain
 * @Description: TODO
 * @author: max
 * @date 2021/9/19下午2:11
 */
public class DynamicProxyMain {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        DynamicProxySubject proxySubject = new DynamicProxySubject(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();

        Subject subject = (Subject) Proxy.newProxyInstance(classLoader, new  Class[]{Subject.class}, proxySubject);
        subject.visit();
    }


}
