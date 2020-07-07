package com.DesignPattern.FacadePattern;

/**
 * 子系统：空调
 */
public class AirConditioner {
    /**
     * 打开空调
     */
    public void turnOn() {
        System.out.println("打开空调 ... ");
    }

    /**
     * 关闭空调
     */
    public void turnOff() {
        System.out.println("关闭空调");
    }
}