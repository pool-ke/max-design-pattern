package com.kd.ke.action.ResponsibilityChain;

/**
 * @program: max-design-pattern
 * @description: 部门经理请假流程处理类
 * @author: muyuan_ke
 * @create: 2021-09-20 16:52
 */
public class DeptManagerLeaveHandler extends AbstractLeaveHandler{
    public DeptManagerLeaveHandler(String name) {
        this.handlerName = name;
    }

    @Override
    protected void handleLeaveRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() <= this.MIDDLE){
            System.out.println("Dept Manager:"+handlerName+",已经处理，流程结束。");
            return;
        }
        if (null != this.nextHandler){
            this.nextHandler.handleLeaveRequest(leaveRequest);
        }else{
            System.out.println("审批拒绝");
        }
    }
}
