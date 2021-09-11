package com.kd.ke.create.singleton;

/**
 * @ClassName: EagerSingleton
 * @Description: 饿汉式单例模式
 * @author: max
 * @date 2021/9/11下午4:53
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getSingleton(){
        return instance;
    }
}
