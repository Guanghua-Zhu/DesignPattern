package com.DesignPattern.ChainOfResponsibilityPattern;

/**
 * Chain Of Responsibility Pattern 责任链模式
 */
public class ChainOfResponsibilityPatternDemo {
    public static void main(String[] args) {

        Manager hr = new HR("Tony");
        Manager deptManager = new DeptManager("Amy");
        Manager ceo = new CEO("David");
        // 组装责任链
        hr.setLeader(deptManager);
        deptManager.setLeader(ceo);

        System.out.println("----------- Test 1: 请1天假 -----------");
        LeaveRequest leaveRequest1 = new LeaveRequest("小王", 1);
        hr.approve(leaveRequest1);

        System.out.println("\n----------- Test 2: 请5天假 -----------");
        LeaveRequest leaveRequest2 = new LeaveRequest("小明", 5);
        hr.approve(leaveRequest2);

        System.out.println("\n----------- Test 3: 请8天假 -----------");
        LeaveRequest leaveRequest3 = new LeaveRequest("小红", 8);
        hr.approve(leaveRequest3);

        System.out.println("\n----------- Test 4: 请55天假 -----------");
        LeaveRequest leaveRequest4 = new LeaveRequest("小张", 55);
        hr.approve(leaveRequest4);
    }
}
