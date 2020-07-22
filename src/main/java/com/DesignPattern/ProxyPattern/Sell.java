package com.DesignPattern.ProxyPattern;

/**
 * 抽象角色： 卖数码产品
 */
public interface Sell {
    /**
     * 卖手机
     */
    void sellPhone();

    /**
     * 卖电脑
     */
    void sellPc();
}