package com.kd.ke.action.observer;

/**
 * @program: max-design-pattern
 * @description: //TODO
 * @author: muyuan_ke
 * @create: 2021-09-20 15:14
 */
public class BObserver implements Observer{
    @Override
    public void update() {
        System.out.println("B receive message ,is processing");
    }
}
