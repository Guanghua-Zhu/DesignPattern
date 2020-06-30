package com.DesignPattern.FactoryPattern.SimpleFactory;

/**
 * 具体产品角色：劳斯莱斯 Rolls Royce
 */
public class RollsRoyce implements Car {
    @Override
    public void drive() {
        System.out.println("司机在驾驶Rolls Royce");
    }
}