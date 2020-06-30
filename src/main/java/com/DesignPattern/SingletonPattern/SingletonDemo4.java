package com.DesignPattern.SingletonPattern;

/**
 * 单例模式4，基于DCL线程安全的懒汉式
 */
public class SingletonDemo4 {
    // 此处必须要使用volatile修饰!
    private static volatile SingletonDemo4 instance = null;
    private String description;

    private SingletonDemo4(String description) {
        this.description = description;
    }

    public void getInfo() {
        System.out.println(description);
    }

    public static SingletonDemo4 getInstance() {
        if( instance==null ) {  // 如果实例已经构造完成则直接取，避免每次取之前需要获取锁
               synchronized (SingletonDemo4.class) {
                    if(instance==null) {    // 避免构造出多个实例
                        instance = new SingletonDemo4("我是基于DCL线程安全的懒汉式单例");
                    }
               }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo4 singletonDemo4 = SingletonDemo4.getInstance();
        singletonDemo4.getInfo();
    }

}
