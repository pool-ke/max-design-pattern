package com.kd.ke.action.observer;

/**
 * @program: max-design-pattern
 * @description: 具体主题类
 * @author: muyuan_ke
 * @create: 2021-09-20 15:09
 */
public class ConcreteSubject extends Subject {
    public void doSomeThing(){
        super.notifyAllObserver();
    }
}
