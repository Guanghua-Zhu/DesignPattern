package com.DesignPattern.BridgePattern;

/**
 * 具体实现化角色: 红色
 */
public class Red implements Color{
    /**
     * 使用红色
     */
    @Override
    public void useColor() {
        System.out.print("红色的");
    }
}
