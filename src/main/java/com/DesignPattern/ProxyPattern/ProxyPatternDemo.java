package com.DesignPattern.ProxyPattern;

/**
 * Proxy Pattern 代理模式 Demo
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        // 创建 真实角色(即被代理角色) 苹果公司 实例
        Apple apple = new Apple();

        // 创建 代理角色 实例
        Sell appleStore = new AppleStore(apple);

        // 通过代理角色 调用方法
        appleStore.sellPhone();
        // 通过代理角色 调用方法
        appleStore.sellPc();
    }
}
