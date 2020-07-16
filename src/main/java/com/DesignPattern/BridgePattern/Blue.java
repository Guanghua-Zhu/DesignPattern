package com.DesignPattern.BridgePattern;

/**
 * 具体实现化角色: 蓝色
 */
public class Blue implements Color{
    /**
     * 使用蓝色
     */
    @Override
    public void useColor() {
        System.out.print("蓝色的");
    }
}
