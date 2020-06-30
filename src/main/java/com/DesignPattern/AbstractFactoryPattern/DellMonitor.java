package com.DesignPattern.AbstractFactoryPattern;

/**
 * 具体产品角色: DELL 显示器
 */
public class DellMonitor implements Monitor {
    @Override
    public void display() {
        System.out.println("DELL 显示器正在显示");
    }
}
