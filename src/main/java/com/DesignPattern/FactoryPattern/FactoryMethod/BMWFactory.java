package com.DesignPattern.FactoryPattern.FactoryMethod;

/**
 * 具体工厂角色：BMW工厂
 */
public class BMWFactory implements CarFactory{
    @Override
    public BMW getCar() {
        return new BMW();
    }
}
