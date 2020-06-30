package com.DesignPattern.AbstractFactoryPattern;

/**
 * 具体产品角色: HP 鼠标
 */
public class HpMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("HP 鼠标正在移动");
    }
}
