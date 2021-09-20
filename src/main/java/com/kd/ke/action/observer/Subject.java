package com.kd.ke.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: max-design-pattern
 * @description: 抽象目标类
 * @author: muyuan_ke
 * @create: 2021-09-20 14:58
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>(16);

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllObserver(){
        for (Observer observer : observers){
            observer.update();
        }

    }

}
