package com.DesignPattern.AdapterPattern;

/**
 * Adapter Pattern 适配器模式 Demo
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {

        ThreePlug pc = new PC();
        pc.use3Plug();

        System.out.println("-------- Test 1: 类适配器 ---------");
        ThreePlug desklamp = new DeskLampAdapter();
        desklamp.use3Plug();

        System.out.println("-------- Test 2: 对象适配器 -------");
        ThreePlug fan = new FanPlugAdapter( new Fan() );
        fan.use3Plug();
    }
}
