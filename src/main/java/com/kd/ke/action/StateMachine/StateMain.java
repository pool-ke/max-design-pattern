package com.kd.ke.action.StateMachine;

/**
 * @program: max-design-pattern
 * @description: //状态机模式运行类
 * @author: muyuan_ke
 * @create: 2021-09-20 18:17
 */
public class StateMain {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        stateContext.setLiftState(StateContext.openState);
        stateContext.run();
        stateContext.close();
        stateContext.open();
        stateContext.stop();
        stateContext.setLiftState(StateContext.runState);
        stateContext.run();
        stateContext.close();
        stateContext.open();
        stateContext.stop();
        stateContext.setLiftState(StateContext.closeState);
        stateContext.run();
        stateContext.close();
        stateContext.open();
        stateContext.stop();
        stateContext.setLiftState(StateContext.stopState);
        stateContext.run();
        stateContext.close();
        stateContext.open();
        stateContext.stop();

    }
}
