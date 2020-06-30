package com.DesignPattern.FactoryPattern.FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        CarFactory factory = new BenzFactory();
        Car benz = factory.getCar();
        benz.drive();

        factory = new BMWFactory();
        Car bmw = factory.getCar();
        bmw.drive();

        factory = new RollsRoyceFactory();
        Car rollsRoyce = factory.getCar();
        rollsRoyce.drive();
    }
}
