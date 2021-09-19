package com.kd.ke.structure.proxy;

/**
 * @ClassName: ProxySubject
 * @Description: 代理对象
 * @author: max
 * @date 2021/9/19下午1:47
 */
public class ProxySubject implements Subject{
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        // 前置操作。。
        System.out.println("proxy subject pre operate");
        subject.visit();
        // 后置操作。。
        System.out.println("proxy subject post operate");
    }
}
