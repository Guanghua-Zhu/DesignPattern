package com.DesignPattern.PrototypePattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        System.out.println("----------- Test 1 -----------");
        Cat cat1 = new Cat("我是一只猫", "Cat", 2.0);
        Animal cat2 = cat1.clone();

        cat1.getInfo();
        cat2.getInfo();

        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println("----------- Test 2 -----------");
        Dog dog1 = new Dog("我是一只边牧", "Dog", true);
        Animal dog2 = dog1.clone();

        dog1.getInfo();
        dog2.getInfo();

        System.out.println(dog1);
        System.out.println(dog2);
    }
}
