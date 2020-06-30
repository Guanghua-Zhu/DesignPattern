package com.DesignPattern.AbstractFactoryPattern;

/**
 * 具体产品角色: DELL 鼠标
 */
public class DellMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("DELL 鼠标正在移动");
    }
}
