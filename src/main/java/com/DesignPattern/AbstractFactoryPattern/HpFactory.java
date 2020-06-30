package com.DesignPattern.AbstractFactoryPattern;

/**
 * 具体工厂角色：HP工厂
 */
public class HpFactory implements PCFactory{
    @Override
    public Monitor getMonitor() {
        return new HpMonitor();
    }

    @Override
    public Mouse getMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new HpKeyboard();
    }
}