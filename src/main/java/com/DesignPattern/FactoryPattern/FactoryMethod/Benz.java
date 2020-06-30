package com.DesignPattern.FactoryPattern.FactoryMethod;

/**
 * 具体产品角色：奔驰 Benz
 */
public class Benz implements Car {
    @Override
    public void drive() {
        System.out.println("司机在驾驶Benz");
    }
}
