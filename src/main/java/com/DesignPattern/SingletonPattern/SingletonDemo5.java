package com.DesignPattern.SingletonPattern;

import lombok.Getter;
import lombok.Setter;

/**
 * 单例模式5，静态内部类
 */
@Getter
@Setter
public class SingletonDemo5 {
    private String description;

    private SingletonDemo5(String description) {
        this.description = description;
    }

    public void getInfo() {
        System.out.println(description);
    }

    private static class SingletonDemo5Holder{
        private static final SingletonDemo5 instance = new SingletonDemo5("我是基于静态内部类的懒汉式单例");
    }

    public static SingletonDemo5 getInstance() {
        return SingletonDemo5Holder.instance;
    }

    public static void main(String[] args) {
        SingletonDemo5 singletonDemo5 = SingletonDemo5.getInstance();
        singletonDemo5.getInfo();
    }
}
