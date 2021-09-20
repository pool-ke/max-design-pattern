package com.kd.ke.action.ResponsibilityChain;

/**
 * @program: max-design-pattern
 * @description: 员工请假类，1天内直接主管审批，3天内部门经理审批，30天部门总经理审批
 * @author: muyuan_ke
 * @create: 2021-09-20 16:38
 */
public class LeaveRequest {
    private int leaveDays;

    private String name;

    public LeaveRequest(int leaveDays, String name) {
        this.leaveDays = leaveDays;
        this.name = name;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
