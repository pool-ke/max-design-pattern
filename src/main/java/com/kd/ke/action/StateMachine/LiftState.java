package com.kd.ke.action.StateMachine;

/**
 * @program: max-design-pattern
 * @description: 电梯状态抽象类
 * @author: muyuan_ke
 * @create: 2021-09-20 17:52
 */
public interface LiftState {
    void close();

    void open();

    void run();

    void stop();
}
