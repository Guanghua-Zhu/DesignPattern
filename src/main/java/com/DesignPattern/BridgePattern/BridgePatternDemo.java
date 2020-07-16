package com.DesignPattern.BridgePattern;

/**
 * Bridge Pattern 桥接模式Demo
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        BMW greenBmw = new BMW( new Green() );
        greenBmw.run();

        BMW blueBmw = new BMW( new Blue() );
        blueBmw.run();

        Benz redBenz = new Benz( new Red() );
        redBenz.run();
    }
}
