package com.DesignPattern.ObserverPattern;

/**
 * 抽象主题角色: 微信公众号
 */
public interface WechatOfficialAccount {
    /**
     * 添加观察者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 向所有观察者发送通知消息
     * @param message
     */
    void notify(String message);

}
