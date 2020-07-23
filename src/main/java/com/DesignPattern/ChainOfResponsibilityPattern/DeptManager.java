package com.DesignPattern.ChainOfResponsibilityPattern;

/**
 * 具体处理者：部门经理
 */
public class DeptManager extends Manager {

    public DeptManager(String name) {
        super.setName(name);
    }

    public void setLeader(Manager manager) {
        super.setLeader(manager);
    }

    /**
     * 部门经理只能审批7天以内的请假申请，否则需要交由上级领导处理
     * @param leaveRequest
     */
    @Override
    public void approve(LeaveRequest leaveRequest) {
        // 权限范围内,直接自行审批
        if( leaveRequest.getDayNumber()<=7 ) {
            System.out.println("[DeptManager-"+ getName() +"]: 同意 <"+leaveRequest.getName()+"> 请" +leaveRequest.getDayNumber()+"天假");
            return;
        }

        // 如果有上级领导，交给上级领导审批
        Manager leader = getLeader();
        if( leader!=null ) {
            System.out.println("[DeptManager-"+ getName() +"]: 没权限批准，交给 "+leader.getName()+" 审批");
            leader.approve(leaveRequest);
        }
    }
}
