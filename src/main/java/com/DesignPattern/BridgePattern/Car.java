package com.DesignPattern.BridgePattern;

/**
 * 抽象化角色: 汽车
 */
public abstract class Car {
    // 通过组合来桥接其它的行为/维度
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract public void run();
}
