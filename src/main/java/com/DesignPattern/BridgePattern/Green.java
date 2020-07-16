package com.DesignPattern.BridgePattern;

/**
 * 具体实现化角色: 绿色
 */
public class Green implements Color{
    /**
     * 使用绿色
     */
    @Override
    public void useColor() {
        System.out.print("绿色的");
    }
}
