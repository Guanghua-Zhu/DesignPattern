package com.DesignPattern.AbstractFactoryPattern;

/**
 * 具体产品角色: HP 键盘
 */
public class HpKeyboard implements Keyboard {
    @Override
    public void use() {
        System.out.println("HP 键盘正在使用");
    }
}
