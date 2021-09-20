package com.kd.ke.action.ResponsibilityChain;

/**
 * @program: max-design-pattern
 * @description: 请假流程责任链抽象处理类
 * @author: muyuan_ke
 * @create: 2021-09-20 16:42
 */
public class AbstractLeaveHandler {
    //1天内直接主管审批
    protected  int MIN = 1;
    //3天内部门经理审批
    protected  int MIDDLE = 3;
    //30天部门总经理审批
    protected  int MAX = 30;
    //处理人姓名
    protected String handlerName;
    //责任链下一个处理节点
    protected AbstractLeaveHandler nextHandler;
    //设置责任链下一处理节点
    protected void setNextHandler(AbstractLeaveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    //处理请假请求，具体由子类实现
    protected void handleLeaveRequest(LeaveRequest leaveRequest){

    }
}
