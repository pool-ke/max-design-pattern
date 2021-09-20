package com.kd.ke.action.observer;

/**
 * @program: max-design-pattern
 * @description: 观察者运行类
 * @author: muyuan_ke
 * @create: 2021-09-20 15:14
 */
public class ObserverMain {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observerA = new AObserver();
        Observer observerB = new BObserver();

        subject.addObserver(observerA);
        subject.addObserver(observerB);
        subject.notifyAllObserver();
    }
}
