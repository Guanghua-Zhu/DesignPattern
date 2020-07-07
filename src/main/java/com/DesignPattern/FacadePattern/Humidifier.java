package com.DesignPattern.FacadePattern;

/**
 * 子系统：加湿器
 */
public class Humidifier {
    /**
     * 打开加湿器
     */
    public void turnOn() {
        System.out.println("打开加湿器 ... ");
    }

    /**
     * 关闭加湿器
     */
    public void turnOff() {
        System.out.println("关闭加湿器");
    }
}