package com.kd.ke.create.singleton;

/**
 * @ClassName: LazySingleton
 * @Description: 双重检查锁定
 * @author: max
 * @date 2021/9/11下午4:58
 */
public class LazySingleton {

    //由于volatile关键字会屏蔽Java虚拟机所做的一切代码优化,继而可能会导致系统的运行效率降低,因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方法哟~
    private volatile static LazySingleton instance = new LazySingleton();

    private LazySingleton() {
    }

    public static LazySingleton getSingleton() {
        //第一次判断
        if (instance == null){
            //锁定代码块，确保同一个时刻只有一个线程可以执行以下代码块
            synchronized (LazySingleton.class){
                //第二次判断
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
