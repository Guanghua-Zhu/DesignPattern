package com.DesignPattern.FactoryPattern.FactoryMethod;

/**
 * 具体工厂角色：Rolls Royce 工厂
 */
public class RollsRoyceFactory implements CarFactory{
    @Override
    public RollsRoyce getCar() {
        return new RollsRoyce();
    }
}
