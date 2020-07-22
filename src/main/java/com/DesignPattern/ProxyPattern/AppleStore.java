package com.DesignPattern.ProxyPattern;

/**
 * 代理角色：苹果经销商
 */
public class AppleStore implements Sell{
    /**
     * 内部持有 真实角色(即被代理角色)苹果公司 的 实例，以进行请求转发完成真正的行为
     */
    private Apple apple;

    public AppleStore(Apple apple) {
        this.apple = apple;
    }

    @Override
    public void sellPhone() {
        makeAd();
        apple.sellPhone();
        record();
    }

    @Override
    public void sellPc() {
        makeAd();
        apple.sellPc();
        record();
    }

    /**
     * 售前：宣传、吹牛逼
     */
    private void makeAd() {
        System.out.println("苹果的产品设计优雅、使用便捷");
    }

    /**
     * 售后：记账、更新库存
     */
    private void record() {
        System.out.println("更新销售记录、更新库存数");
    }
}
