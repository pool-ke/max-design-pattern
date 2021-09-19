package com.kd.ke.structure.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: CglibProxyMain
 * @Description: 基于Cglib的动态代理实现
 * @author: max
 * @date 2021/9/19下午2:45
 */
public class CglibProxySubject implements MethodInterceptor {

    /**
     * @param o 表示要进行增强的对象
     * @param method 表示拦截的方法
     * @param objects 数组表示参数列表，基本数据类型需要传入其包装类型，如int-->Integer、long-Long、double-->Double
     * @param methodProxy 表示对方法的代理，invokeSuper方法表示对被代理对象方法的调用
     * @return 执行结果
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 前置操作。。
        System.out.println("proxy subject pre operate");
        Object result = methodProxy.invokeSuper(o, objects);
        // 后置操作。。
        System.out.println("proxy subject post operate");
        return result;
    }
}
