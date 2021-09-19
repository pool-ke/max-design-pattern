package com.kd.ke.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: DynamicProxySubject
 * @Description: 动态代理类,实现InvocationHandler接口
 * @author: max
 * @date 2021/9/19下午2:03
 */
public class DynamicProxySubject implements InvocationHandler {
    private Subject subject;

    public DynamicProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(subject, args);
        return result;
    }
}
