package com.kd.ke.action.observer;

/**
 * @program: max-design-pattern
 * @description: 具体观察者A
 * @author: muyuan_ke
 * @create: 2021-09-20 15:13
 */
public class AObserver implements Observer{
    @Override
    public void update() {
        System.out.println("A receive message ,is processing");
    }
}
