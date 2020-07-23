package com.DesignPattern.ChainOfResponsibilityPattern;

import lombok.Data;

/**
 * 抽象处理者：公司管理层
 */
@Data
public abstract class Manager {
    /**
     * 管理层姓名
     */
    private String name;

    /**
     * 上级领导
     */
    private Manager leader;

    /**
     * 审批员工的请假申请
     * @param leaveRequest
     */
    public abstract void approve(LeaveRequest leaveRequest);
}
