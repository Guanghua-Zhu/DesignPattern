package com.DesignPattern.BridgePattern;

/**
 * 修正抽象化角色: Benz 奔驰
 */
public class Benz extends Car {
    public Benz(Color color) {
        super.setColor(color);
    }

    @Override
    public void run() {
        color.useColor();
        System.out.println("Benz奔驰在高速上狂奔 ... ");
    }
}
