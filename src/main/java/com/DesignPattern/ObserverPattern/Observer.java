package com.DesignPattern.ObserverPattern;

/**
 * 抽象观察者
 */
public interface Observer {
    /**
     * 微信用户接受、更新公众号推送的文章
     * @param name 微信公众号名称
     * @param message 微信公众号推送的文章
     */
    void update(String name, String message);
}
