package com.DesignPattern.SingletonPattern;

/**
 * 单例模式2，线程不安全的懒汉式
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance = null;
    private String description;

    private SingletonDemo2(String description) {
        this.description = description;
    }

    public void getInfo() {
        System.out.println(description);
    }

    public static SingletonDemo2 getInstance() {
        if( instance==null ) {
            instance = new SingletonDemo2("我是线程不安全的懒汉式单例");
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo2 singletonDemo2 = SingletonDemo2.getInstance();
        singletonDemo2.getInfo();
    }

}
