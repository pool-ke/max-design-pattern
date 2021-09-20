package com.kd.ke.action.StateMachine;

/**
 * @program: max-design-pattern
 * @description: 开启状态
 * @author: muyuan_ke
 * @create: 2021-09-20 17:54
 */
public class OpenState implements LiftState {

    @Override
    public void close() {
        System.out.println("the lift is closing");
    }

    @Override
    public void open() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
