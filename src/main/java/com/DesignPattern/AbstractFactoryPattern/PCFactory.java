package com.DesignPattern.AbstractFactoryPattern;

/**
 * 抽象工厂角色：PC工厂
 */
public interface PCFactory {
    Monitor getMonitor();
    Mouse getMouse();
    Keyboard getKeyboard();
}