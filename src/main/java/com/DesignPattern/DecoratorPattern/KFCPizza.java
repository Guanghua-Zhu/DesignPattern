package com.DesignPattern.DecoratorPattern;

/**
 * 具体组件, 被装饰对象: KFC Pizza
 */
public class KFCPizza implements Pizza {
    @Override
    public void cook() {
        System.out.println("肯德基 Pizza");
    }
}