package com.kd.ke.collection;

/**
 * @program: max-design-pattern
 * @description: 简单实现一个hashMap，只有put和get方法
 * @author: muyuan_ke
 * @create: 2021-10-08 18:51
 */
public interface MyMap<K,V> {
    //返回map大小
    int size();
    //map插入元素
    V put(K key,V value);
    //map获取元素
    V get(Object key);

    //Entry节点
    interface Entry<K,V>{
        //获取键
        K getKey();
        //获取值
        V getValue();
        //设置值
        V setValue(V value);
    }
}
