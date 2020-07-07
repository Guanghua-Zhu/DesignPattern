package com.DesignPattern.FacadePattern;

/**
 * 子系统：电视
 */
public class Tv {
    /**
     * 打开电视
     */
    public void turnOn() {
        System.out.println("打开电视 ... ");
    }

    /**
     * 关闭电视
     */
    public void turnOff() {
        System.out.println("关闭电视");
    }
}