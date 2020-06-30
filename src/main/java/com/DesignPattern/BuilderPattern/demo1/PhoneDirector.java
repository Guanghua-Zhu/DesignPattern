package com.DesignPattern.BuilderPattern.demo1;

/**
 * 导演: 负责指定手机建造流程
 */
public class PhoneDirector {

    /**
     * 导演指挥建造者完成手机的建造工作
     * @param phoneBuilder
     */
    public void construct(PhoneBuilder phoneBuilder) {
        phoneBuilder.setBrand();
        phoneBuilder.setOs();
        phoneBuilder.setRamSize();
        phoneBuilder.setPrice();
    }
}
