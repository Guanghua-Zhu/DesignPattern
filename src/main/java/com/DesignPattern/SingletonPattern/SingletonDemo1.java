package com.DesignPattern.SingletonPattern;

/**
 * 单例模式1，饿汉式
 */
public class SingletonDemo1 {
    private static SingletonDemo1 instance = new SingletonDemo1("我是饿汉式的单例");

    static {
        System.out.println("SingletonDemo1类 完成初始化");
    }

    private String description;

    /**
     * 私有构造器
     * @param description
     */
    private SingletonDemo1(String description) {
        this.description = description;
    }

    public void getInfo() {
        System.out.println(description);
    }

    /**
     * 提供实例的访问接口
     * @return
     */
    public static SingletonDemo1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo1 singletonDemo1 = SingletonDemo1.getInstance();
        singletonDemo1.getInfo();
    }
}
