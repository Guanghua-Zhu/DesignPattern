package com.DesignPattern.DecoratorPattern;

/**
 * 抽象装饰者
 */
public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void cook() {
        if( pizza != null ) {
            pizza.cook();
        }
    }
}