package com.kd.ke.action.StateMachine;

/**
 * @program: max-design-pattern
 * @description: 状态机上下文环境类
 * @author: muyuan_ke
 * @create: 2021-09-20 17:31
 */
public class StateContext {
    //各个状态
    public static final LiftState closeState = new CloseState();
    public static final LiftState runState = new RunState();
    public static final LiftState stopState = new StopState();
    public static final LiftState openState = new OpenState();

    private LiftState liftState;

    public void open(){
        this.liftState.open();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }

    public void close(){
        this.liftState.close();
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }
}
