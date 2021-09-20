package com.kd.ke.action.ResponsibilityChain;

/**
 * @program: max-design-pattern
 * @description: 总经理请假流程处理类
 * @author: muyuan_ke
 * @create: 2021-09-20 16:54
 */
public class GlobalManagerLeaveHandler extends AbstractLeaveHandler{

    public GlobalManagerLeaveHandler(String name) {
        this.handlerName = name;
    }

    @Override
    protected void handleLeaveRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() <= this.MAX){
            System.out.println("Global Manager:"+handlerName+",已经处理，流程结束。");
            return;
        }
        if (null != this.nextHandler){
            this.nextHandler.handleLeaveRequest(leaveRequest);
        }else{
            System.out.println("审批拒绝");
        }
    }
}
