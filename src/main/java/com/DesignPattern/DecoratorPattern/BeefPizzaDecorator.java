package com.DesignPattern.DecoratorPattern;

/**
 * 具体装饰者：给Pizza加牛肉
 */
public class BeefPizzaDecorator extends PizzaDecorator {

    public BeefPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void cook() {
        System.out.print("加牛肉,");
        super.cook();
    }
}