package com.DesignPattern.ObserverPattern;

/**
 * Observer Pattern 观察者模式 Demo
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // 构造微信公众号的实例
        WechatOfficialAccount wechatOfficialAccount = new ProjectDaedalus();

        // 构造微信用户的实例
        WechatUser user1 = new WechatUser("小明");
        WechatUser user2 = new WechatUser("小红");
        WechatUser user3 = new WechatUser("小王");

        // 上述微信用户均关注本公众号
        wechatOfficialAccount.attach(user1);
        wechatOfficialAccount.attach(user2);
        wechatOfficialAccount.attach(user3);

        System.out.println("---------------------- Test 1 ----------------------");
        String msg1 = "关于积极推进新形势下阶级斗争的相关通知, ...";
        wechatOfficialAccount.notify(msg1);

        System.out.println("\n---------------------- Test 2 ----------------------");
        // 小王取关了本公众号
        wechatOfficialAccount.detach(user3);
        String msg2 = "关于恢复以经济建设为中心等若干重大问题的决定, ...";
        wechatOfficialAccount.notify(msg2);
    }
}
