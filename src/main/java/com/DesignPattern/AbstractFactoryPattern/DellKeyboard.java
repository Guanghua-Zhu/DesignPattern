package com.DesignPattern.AbstractFactoryPattern;

/**
 * 具体产品角色: DELL 键盘
 */
public class DellKeyboard implements Keyboard {
    @Override
    public void use() {
        System.out.println("DELL 键盘正在使用");
    }
}
