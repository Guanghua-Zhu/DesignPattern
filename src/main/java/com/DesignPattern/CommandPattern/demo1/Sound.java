package com.DesignPattern.CommandPattern.demo1;

/**
 * 接收者: 音响
 */
public class Sound {
    public void turnOn() {
        System.out.println("打开音响");
    }

    public void turnOff() {
        System.out.println("关闭音响");
    }
}
