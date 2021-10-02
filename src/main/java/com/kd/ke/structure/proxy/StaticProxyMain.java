package com.kd.ke.structure.proxy;

import java.util.HashMap;

/**
 * @ClassName: StaticProxyMain
 * @Description: 静态代理运行类
 * @author: max
 * @date 2021/9/19下午1:48
 */
public class StaticProxyMain {

    public static void main(String[] args) {
//        Subject subject = new ProxySubject(new RealSubject());
//        subject.visit();
        HashMap<Integer, Integer> objectObjectHashMap = new HashMap<>(16);
        int size = objectObjectHashMap.size();
        System.out.println(size);
    }
}
