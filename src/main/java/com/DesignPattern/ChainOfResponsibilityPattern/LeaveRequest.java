package com.DesignPattern.ChainOfResponsibilityPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 员工的请假申请
 */
@Data
@AllArgsConstructor
public class LeaveRequest {
    /**
     * 员工姓名
     */
    private String name;

    /**
     * 请假天数
     */
    private Integer dayNumber;
}
