package com.DesignPattern.AbstractFactoryPattern;

/**
 * 具体工厂角色：Dell工厂
 */
public class DellFactory implements PCFactory{
    @Override
    public Monitor getMonitor() {
        return new DellMonitor();
    }

    @Override
    public Mouse getMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new DellKeyboard();
    }
}