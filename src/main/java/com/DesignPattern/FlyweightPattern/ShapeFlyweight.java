package com.DesignPattern.FlyweightPattern;

/**
 * 抽象享元角色：形状享元
 */
public interface ShapeFlyweight {
    /**
     * 设置外部状态：颜色
     */
    void setExtrinsicState(String color);

    /**
     * 获取形状信息
     */
    void getInfo();
}
