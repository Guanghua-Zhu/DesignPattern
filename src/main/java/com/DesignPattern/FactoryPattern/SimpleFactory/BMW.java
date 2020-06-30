package com.DesignPattern.FactoryPattern.SimpleFactory;

/**
 * 具体产品角色：宝马 BMW
 */
public class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("司机在驾驶BMW");
    }
}