package com.DesignPattern.FactoryPattern.FactoryMethod;


/**
 * 具体工厂角色：Benz工厂
 */
public class BenzFactory implements CarFactory{
    @Override
    public Benz getCar() {
        return new Benz();
    }
}
