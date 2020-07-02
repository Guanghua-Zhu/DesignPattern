package com.DesignPattern.DecoratorPattern;

/**
 * 具体装饰者：给Pizza加榴莲
 */
public class DurianPizzaDecorator extends PizzaDecorator {

    public DurianPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void cook() {
        System.out.print("加榴莲,");
        super.cook();
    }
}