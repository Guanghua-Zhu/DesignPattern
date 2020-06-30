package com.DesignPattern.SingletonPattern;

/**
 * 单例模式3， 线程安全但效率低下的懒汉式
 */
public class SingletonDemo3 {
    private static SingletonDemo3 intance = null;
    private String description;

    private SingletonDemo3(String description) {
        this.description = description;
    }

    public void getInfo() {
        System.out.printf(description);
    }

    public static synchronized SingletonDemo3 getInstance() {
        if( intance==null ) {
            intance = new SingletonDemo3("我是线程安全线程安全但效率低下的懒汉式单例");
        }
        return intance;
    }

    public static void main(String[] args) {
        SingletonDemo3 singletonDemo3 = SingletonDemo3.getInstance();
        singletonDemo3.getInfo();
    }
}
