package com.DesignPattern.DecoratorPattern;

/**
 * Decorator Pattern 装饰者模式Demo
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Pizza pizza = new KFCPizza();
        pizza.cook();

        // 给Pizza加个牛肉
        Pizza beefPizza = new BeefPizzaDecorator(pizza);
        beefPizza.cook();

        // 给牛肉Pizza加个榴莲
        Pizza superPizza = new DurianPizzaDecorator( beefPizza );
        superPizza.cook();
    }
}
