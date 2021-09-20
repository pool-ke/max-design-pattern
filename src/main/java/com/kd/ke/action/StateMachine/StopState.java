package com.kd.ke.action.StateMachine;

/**
 * @program: max-design-pattern
 * @description: 停止状态
 * @author: muyuan_ke
 * @create: 2021-09-20 17:58
 */
public class StopState implements LiftState{
    @Override
    public void close() {

    }

    @Override
    public void open() {
        System.out.println("the lift is opening");
    }

    @Override
    public void run() {
        System.out.println("the lift is running");
    }

    @Override
    public void stop() {

    }
}
