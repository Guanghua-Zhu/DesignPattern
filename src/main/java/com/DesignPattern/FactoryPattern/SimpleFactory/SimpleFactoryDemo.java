package com.DesignPattern.FactoryPattern.SimpleFactory;


public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Car bmw = CarFactory.getCar("BMW");
        bmw.drive();

        Car benz = CarFactory.getCar("Benz");
        benz.drive();

        Car rollsRoyce = CarFactory.getCar("RollsRoyce");
        rollsRoyce.drive();
    }
}
