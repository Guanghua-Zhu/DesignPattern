package com.DesignPattern.AbstractFactoryPattern;

/**
 * 抽象工厂角色：PC工厂
 */
public interface PCFactory {
    /**
     * 提供显示器产品
     * @return
     */
    Monitor getMonitor();

    /**
     * 提供鼠标产品
     * @return
     */
    Mouse getMouse();

    /**
     * 提供键盘产品
     * @return
     */
    Keyboard getKeyboard();
}