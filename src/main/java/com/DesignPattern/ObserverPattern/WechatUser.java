package com.DesignPattern.ObserverPattern;

/**
 * 具体观察者角色：微信用户
 */
public class WechatUser implements Observer {

    /**
     * 用户名
     */
    private String username;

    public WechatUser(String username) {
        this.username = username;
    }

    @Override
    public void update(String name, String message) {
        String str = "<" + username + ">: 收到公众号[" + name + "]推送的文章, 内容如下:";
        System.out.println( str );
        System.out.println( message );
    }
}
