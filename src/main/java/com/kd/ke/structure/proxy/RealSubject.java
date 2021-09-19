package com.kd.ke.structure.proxy;

/**
 * @ClassName: RealSubject
 * @Description: 真实对象
 * @author: max
 * @date 2021/9/19下午1:46
 */
public class RealSubject implements Subject{
    @Override
    public void visit() {
        System.out.println("the real subject visiting..");
    }
}
