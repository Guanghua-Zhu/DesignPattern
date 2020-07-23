package com.DesignPattern.ChainOfResponsibilityPattern;

/**
 * 具体处理者：CEO
 */
public class CEO extends Manager {

    public CEO(String name) {
        super.setName(name);
    }

    public void setLeader(Manager manager) {
        super.setLeader(manager);
    }

    /**
     * CEO批准10天以内的请假申请，否则拒绝该请假申请
     * @param leaveRequest
     */
    @Override
    public void approve(LeaveRequest leaveRequest) {
        // 只批准10天以内的请假申请
        if( leaveRequest.getDayNumber()<=10 ) {
            System.out.println("[CEO-"+ getName() +"]: 同意 <"+leaveRequest.getName()+"> 请" +leaveRequest.getDayNumber()+"天假");
        } else {    // 超过10天的请假申请不批准
            System.out.println("[CEO-"+ getName() +"]: 不同意 <"+leaveRequest.getName()+"> 请" +leaveRequest.getDayNumber()+"天假");
        }
    }
}
