package com.kd.ke.action.ResponsibilityChain;

/**
 * @program: max-design-pattern
 * @description: 责任链模式运行类
 * @author: muyuan_ke
 * @create: 2021-09-20 16:58
 */
public class ResponsibilityChainMain {

    public static void main(String[] args) {
        LeaveRequest leaveRequest1 = new LeaveRequest(1,"qianji");
        LeaveRequest leaveRequest2 = new LeaveRequest(3,"chiqian");
        LeaveRequest leaveRequest3 = new LeaveRequest(30,"yunye");

        AbstractLeaveHandler youzai = new DirectLeaderLeaveHandler("youzai");
        AbstractLeaveHandler huaan = new DeptManagerLeaveHandler("huaan");
        AbstractLeaveHandler sangu = new GlobalManagerLeaveHandler("sangu");
        youzai.setNextHandler(huaan);
        huaan.setNextHandler(sangu);

        youzai.handleLeaveRequest(leaveRequest1);
        youzai.handleLeaveRequest(leaveRequest2);
        youzai.handleLeaveRequest(leaveRequest3);
    }
}
