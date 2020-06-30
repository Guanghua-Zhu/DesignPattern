package com.DesignPattern.PrototypePattern;

import lombok.Getter;
import lombok.Setter;

/**
 * 原型的抽象类
 */
@Getter
@Setter
public abstract class Animal implements Cloneable {
    private String description;
    private String type;

    abstract public void getInfo();

    /**
     * 深拷贝，通过Java的克隆机制实现原型模式
     * @return
     */
    public Animal clone() {
        Animal animal = null;
        try{
            animal = (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
        return animal;
    }
}
