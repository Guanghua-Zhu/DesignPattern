package com.DesignPattern.AbstractFactoryPattern;

/**
 * 具体产品角色: HP 显示器
 */
public class HpMonitor implements Monitor {
    @Override
    public void display() {
        System.out.println("HP 显示器正在显示");
    }
}
