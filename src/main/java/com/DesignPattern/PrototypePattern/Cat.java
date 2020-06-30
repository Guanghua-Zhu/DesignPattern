package com.DesignPattern.PrototypePattern;

import lombok.Getter;
import lombok.Setter;

/**
 * 原型的实现类: 猫
 */
@Getter
@Setter
public class Cat extends Animal {
    private Double catWeight;

    public Cat(String description, String type, Double catWeight){
        setDescription(description);
        setType(type);
        this.catWeight = catWeight;
    }

    @Override
    public void getInfo() {
        String info = "["+ getType() +"]: " + getDescription() + ", catWeight: " + getCatWeight();
        System.out.println(info);
    }

    @Override
    public Cat clone() {
        return (Cat) super.clone();
    }
}
