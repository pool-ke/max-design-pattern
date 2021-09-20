package com.kd.ke.action.StateMachine;

/**
 * @program: max-design-pattern
 * @description: 运行状态
 * @author: muyuan_ke
 * @create: 2021-09-20 17:55
 */
public class RunState implements LiftState{
    @Override
    public void close() {

    }

    @Override
    public void open() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        System.out.println("the lift is stopping");
    }
}
