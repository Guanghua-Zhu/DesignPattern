package com.DesignPattern.PrototypePattern;

import lombok.Getter;
import lombok.Setter;

/**
 * 原型的实现类: 狗
 */
@Getter
@Setter
public class Dog extends Animal {
    private Boolean isMale;

    public Dog(String description, String type, Boolean isMale){
        setDescription(description);
        setType(type);
        this.isMale = isMale;
    }

    @Override
    public void getInfo() {
        String info = "["+ getType() +"]: " + getDescription() + ", isMale: " + getIsMale();
        System.out.println(info);
    }

    @Override
    public Dog clone() {
        return (Dog) super.clone();
    }
}
