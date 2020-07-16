package com.DesignPattern.BridgePattern;

/**
 * 修正抽象化角色: BMW 宝马
 */
public class BMW extends Car{
    public BMW(Color color) {
        super.setColor(color);
    }

    @Override
    public void run() {
        color.useColor();
        System.out.println("BMW宝马在路上缓慢行驶 ...");
    }
}
