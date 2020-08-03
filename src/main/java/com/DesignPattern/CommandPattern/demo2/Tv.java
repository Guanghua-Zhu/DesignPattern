package com.DesignPattern.CommandPattern.demo2;

/**
 * 接收者: 电视
 */
public class Tv {
    public void turnOn() {
        System.out.println("打开电视");
    }

    public void turnOff() {
        System.out.println("关闭电视");
    }
}
