package com.DesignPattern.FlyweightPattern;

import lombok.EqualsAndHashCode;

/**
 * 具体享元角色：形状
 */
@EqualsAndHashCode  // Override hashCode Method By Lombok
public class Shape implements ShapeFlyweight{
    /**
     * 内部状态：形状类型
     */
    private String type;

    /**
     * 外部状态：颜色
     */
    private String color;

    public Shape(String type) {
        this.type = type;
    }

    /**
     * 设置外部状态：颜色
     * @param color
     */
    @Override
    public void setExtrinsicState(String color) {
        this.color = color;
    }

    @Override
    public void getInfo() {
        String info = "[形状] Type:" + type + ", Color: " + color;
        System.out.println(info);
    }
}
