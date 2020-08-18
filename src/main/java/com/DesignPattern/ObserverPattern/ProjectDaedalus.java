package com.DesignPattern.ObserverPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * 具体主题角色：微信公众号 ProjectDaedalus
 */
public class ProjectDaedalus implements WechatOfficialAccount{
    /**
     * 关注该公众号的所有微信用户
     */
    private List<Observer> observerList = new LinkedList<>();

    /**
     * 微信公众号名称
     */
    private final String name = "ProjectDaedalus";

    /**
     * 公众号添加关注者
     * @param observer
     */
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 公众号移除关注者
     * @param observer
     */
    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 向所有关注公众号的微信用户推送文章
     * @param message
     */
    @Override
    public void notify(String message) {
        for(Observer observer : observerList) {
            observer.update(name, message);
        }
    }
}
