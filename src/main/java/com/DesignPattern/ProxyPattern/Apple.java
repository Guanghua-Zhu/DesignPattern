package com.DesignPattern.ProxyPattern;

/**
 * 真实角色(即被代理角色): 苹果公司
 */
public class Apple implements Sell {
    /**
     * 卖苹果手机
     */
    @Override
    public void sellPhone() {
        System.out.println("Apple: Sell iPhone SE");
    }

    /**
     * 卖苹果电脑
     */
    @Override
    public void sellPc() {
        System.out.println("Apple: Sell MacBook Pro");
    }
}
